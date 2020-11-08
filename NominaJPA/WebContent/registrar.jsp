<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
<link rel="stylesheet" href="css/style.css">
<title>Registrar empleado</title>
</head>
<body>
<header>
<div class="container">

<nav class="navbar navbar-light"> 
          <h4>Registrar empleado</h4>
        </nav>

</div>
</header>
<div class="container pt-5">

	<p class="h1">Registro de empleado</p>
	<form name="form" action="${pageContext.request.contextPath}/Empleado.do" method="get">
	<input type="hidden" name="action" value="registrar"/>
  <div class="form-group">
    <label for="inputCodigo">Codigo</label>
    <input type="text" class="form-control"  value="<c:out value='${empleado.codigo}'/>" name="codigo" id="inputCodigo">
  </div>
  <div class="form-group">
    <label for="inputCedula">Cedula</label>
    <input type="text" class="form-control" value="<c:out value='${empleado.cedula}'/>" name="cedula"id="inputCedula">
  </div>
    <div class="form-group">
    <label for="inputCedula">Nombre</label>
    <input type="text" class="form-control" value="<c:out value='${empleado.nombre}'/>" name="nombre"id="inputCedula">
  </div>
  <div class="form-group">
  <label for="fechaNac">Fecha de Nacimiento:</label>
	<input type="date" id="fechaNac"class="form-control" value="<fmt:formatDate pattern='yyyy-MM-dd' value='${empleado.fechaNac}' />" name="fechaNac">
  </div>
   <div class="form-group">
  <label for="fechaNac">Fecha de ingreso:</label>
	<input type="date" id="fechaIngre"class="form-control" value="<fmt:formatDate pattern='yyyy-MM-dd' value='${empleado.fechaIngre}' />" name="fechaIngre">
  </div>
   <div class="form-group">
  <label for="fechaNac">Fecha de retiro:</label>
	<input type="date" id="fechaRet" class="form-control" value="<fmt:formatDate pattern='yyyy-MM-dd' value='${empleado.fechaRetir}' />" name="fechaRet">
  </div>
  <button type="submit" class="btn btn-success">Enviar</button>
    <a href="${pageContext.request.contextPath}/Empleado.do?action=volver" class="btn btn-primary">Volver</a>
</form>
</div>

  <footer class="pt-5">
  <div class="container "></div>
  </footer>
</body>
</html>