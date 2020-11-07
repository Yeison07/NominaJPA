package co.ufps.edu.controller;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.ufps.edu.model.Empleado;
import co.ufps.edu.model.EmpleadoDAO;


/**
 * Servlet implementation class EmpleadoServlet
 */
@WebServlet(name="EmpleadoServlet", urlPatterns= {"/Empleado.do"})
public class EmpleadoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	EmpleadoDAO empleadoD;
       
    
    public EmpleadoServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		
		this.empleadoD=new EmpleadoDAO();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action= (request.getParameter("action") != null) ? request.getParameter("action"):"list";
		System.out.println(action);
		
		switch (action) {
		case "vistaRegistro":
			vistaRegistrar(request,response);
			break;
		case "registrar":
			registrar(request,response);
			break;
		case "volver":
			volver(request,response);
			break;
		case "vistaBuscar":
			vistaBuscar(request,response);
			break;
		case "buscar":
			buscar(request,response);
			break;
		default:
			volver(request,response);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	private void volver(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RequestDispatcher dispatcher= request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
	
	private void vistaRegistrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RequestDispatcher dispatcher= request.getRequestDispatcher("registrar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void vistaBuscar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		RequestDispatcher dispatcher= request.getRequestDispatcher("buscar.jsp");
		dispatcher.forward(request, response);
	}
	
	private void registrar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String codigo=request.getParameter("codigo");
		String cedula=request.getParameter("cedula");
		String nombre=request.getParameter("nombre");
		String fechaN=request.getParameter("fechaNac");
		String fechaI=request.getParameter("fechaIngre");
		String fechaR=request.getParameter("fechaRet");
		Date date1= null;
		Date date2= null;
		Date date3= null;
		
		try {
			 date1= new SimpleDateFormat("yyyy-MM-dd").parse(fechaN);
			 date2= new SimpleDateFormat("yyyy-MM-dd").parse(fechaI);
			 date3= new SimpleDateFormat("yyyy-MM-dd").parse(fechaR);
			System.out.println(date1);
			System.out.println(date2);
			System.out.println(date3);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Empleado empleado= new Empleado(codigo,cedula,nombre,date1,date2,date3);
		empleadoD.insert(empleado);
		response.sendRedirect(request.getContextPath()); 
	}
	
	
	private void buscar(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
		String codigo=request.getParameter("codigo");
		System.out.println(codigo);
		Empleado empleado = empleadoD.selectById(codigo);
		request.setAttribute("empleado", empleado);
		RequestDispatcher dispatcher= request.getRequestDispatcher("registrar.jsp");
		dispatcher.forward(request, response);
	}

}
