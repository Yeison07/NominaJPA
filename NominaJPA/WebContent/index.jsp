<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
 <link rel="stylesheet" href="css/style.css">
<title>Pagina de inicio</title>
</head>
<body>

 

<header>
<div class="container">

<nav class="navbar navbar-light"> 
          <h4>Inicio</h4>
        </nav>

</div>
</header>

<div class="container pt-5">
  <div class="row pt-5">  
	<div class="col-sm-12 col-md-6 col-lg-6 text-center ">
	<img src="img/buscar.png" class="img-fluid rounded float-left" alt="Responsive image"><br>
	 <a href="${pageContext.request.contextPath}/Empleado.do?action=vistaBuscar" class="btn btn-primary">Buscar empleado</a>
	</div>
	<div class="col-sm-12 col-md-6 col-lg-6 text-center">
	<img src="img/registrar.png" class="img-fluid rounded float-left" alt="Responsive image"><br>
	<a href="${pageContext.request.contextPath}/Empleado.do?action=vistaRegistro" class="btn btn-success">Registrar empleado</a>
	</div>
  	</div>
  	</div>
  	
  <footer class="pt-5">
  <div class="container mt-5"></div>
  </footer>
  	


<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</body>
</html>