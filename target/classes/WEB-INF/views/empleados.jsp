<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/incluido.jsp" %>
<%@ taglib prefix="fomr" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<!-- HEAD -->
<head>
	<meta charset="UTF-8">
	<title>DON LUCHO</title>
	<link rel="icon" href="https://christopher-carrasco.ga/donlucho/don-lucho-logo.png" />
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css" />
	<link rel="stylesheet" href="https://christopher-carrasco.ga/donlucho/styles.css" />
</head>

<!-- BODY -->
<body>
	<!-- HEADER -->
	<header class="container-flex">
		<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
			<div class="container">
				<a class="navbar-brand">
					<img src="https://christopher-carrasco.ga/donlucho/don-lucho.png" class="rounded-circle" alt="" width="69" height="69" />DON LUCHO
				</a>
				<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active" href="empleados.htm">Empleados</a></li>
						<li class="nav-item"><a class="nav-link" href="bonificaciones.htm">Bonificaciones</a></li>
						<li class="nav-item"><a class="nav-link" href="deducciones.htm">Deducciones</a></li>
						<li class="nav-item"><a class="nav-link" href="nomina.htm">Nómina</a></li>
					</ul>
					<form class="d-flex" action="login.htm">
						<button class="btn btn-outline-danger" type="submit">Cerrar sesión</button>
					</form>
				</div>
			</div>
		</nav>
	</header>

	<!-- EMPLEADOS -->
	<main class="container p-5">
		<div class="row justify-content-center">
			<div class="col-md-12">
				<h1 class="text-center">EMPLEADOS</h1>
				<a class="btn btn-danger" href="empleado.htm" role="button">Nuevo</a><br /><br />
				<table class="table table-striped table-hover table-bordered text-center">
					<thead>
						<tr>
							<th scope="col">ID</th>
							<th scope="col">DNI</th>
							<th scope="col">Nombre</th>
							<th scope="col">Apellido</th>
							<th scope="col">Ocupación</th>
							<th scope="col">Sueldo (S/.)</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${ model.empleados }" var="emp">
							<tr>
								<th scope="row"><c:out value="${ emp.id }" /></th>
								<td><c:out value="${ emp.dni }" /></td>
								<td><c:out value="${ emp.nombre }" /></td>
								<td><c:out value="${ emp.apellido }" /></td>
								<td><c:out value="${ emp.ocupacion.ocupacion }" /></td>
								<td><c:out value="${ emp.ocupacion.sueldo }" /></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</main>

	<!-- FOOTER -->
	<%@ include file="/WEB-INF/views/footer.jsp"%>

	<!-- JS -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>