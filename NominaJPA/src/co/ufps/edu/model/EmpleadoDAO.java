package co.ufps.edu.model;

import java.util.List;

import co.ufps.edu.conexion.Conexion;

public class EmpleadoDAO {

	Conexion con=null;
	
	public EmpleadoDAO(){
		con= new Conexion();
		con.setC(Empleado.class);
	}
	
	public Empleado selectById(String id) {
		Empleado e = (Empleado) con.find(id);		
		return e;
	}

	
	public List<Empleado> selectAll() {
		
		List<Empleado> contactos = con.list();

		return contactos;
	}

	
	public void insert(Empleado objeto) {
		
		con.insert(objeto);

	}

	
	public void update(Empleado objeto) {

		con.update(objeto);

	}

	
	public void delete(Empleado objeto) {
		
		con.delete(objeto);

	}
}
