<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/incluido.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="es">
<!-- HEAD -->
<head>
	<meta charset="UTF-8">
	<title>DON LUCHO</title>
	<link rel="stylesheet" href="https://christopher-carrasco.ga/donlucho/estilos.css" />
	<link rel="icon" href="https://christopher-carrasco.ga/donlucho/don-lucho-logo.png" />
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

	<!-- REGISTRAR EMPLEADO -->
	<main class="container p-5">
		<div class="container">
			<div class="row justify-content-center mt">
				<div class="card " style="width: 40rem;">
					<div class="card-body">
						<div class="row justify-content-center register">
							<div class="col-md-8">
								<h2 class="text-center">REGISTRAR EMPLEADO</h2>
							</div>
						</div>
						<form action="empleado/add" class="form formu" object="${ empleados }" method="post">
							<!--DNI-->
							<div class="row form-group">
								<label for="dni" class="col-form-label col-md-4">DNI</label>
								<div class="col-md-8">
									<input type="number" class="form-control" id="dni" name="dni" min="10000000" max="99999999" required />
								</div>
							</div>
							<!--Nombre-->
							<div class="row form-group">
								<label for="nombre" class="col-form-label col-md-4">Nombres</label>
								<div class="col-md-8">
									<input type="text" class="form-control" id="nombre" name="nombre" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ]{1, 255}" required />
								</div>
							</div>
							<!--Apellido-->
							<div class="row form-group">
								<label for="apellidos" class="col-form-label col-md-4">Apellido</label>
								<div class="col-md-8">
									<input type="text" class="form-control" id="apellido" name="apellido" pattern="[a-zA-ZáéíóúÁÉÍÓÚñÑ]{1, 255}" required />
								</div>
							</div>
							<!--correo-->
							<div class="row form-group">
								<label for="correo" class="col-form-label col-md-4">Correo</label>
								<div class="col-md-8">
									<input type="email" class="form-control" id="correo" name="correo" required />
								</div>
							</div>
							<!--Dirección-->
							<div class="row form-group">
								<label for="direccion" class="col-form-label col-md-4">Dirección</label>
								<div class="col-md-8">
									<input type="text" class="form-control" id="direccion" name="direccion" required />
								</div>
							</div>
							<!--Nacimiento-->
							<div class="row form-group">
								<label for="nacimiento" class="col-form-label col-md-4">Nacimiento</label>
								<div class="col-md-8">
									<input type="date" class="form-control" id="nacimiento" name="nacimiento" value="yyyy-mm-dd" max="2004-07-31" required />
								</div>
							</div>
							<!--Género-->
							<div class="row form-group">
								<label for="genero" class="col-form-label col-md-4">Género</label>
								<div class="col-md-8">
									<select class="form-select" id="genero" name="genero" required>
										<option disabled selected>Seleccione...</option>
										<option value="MASCULINO">MASCULINO</option>
										<option value="FEMENINO">FEMENINO</option>
									</select>
								</div>
							</div>
							<!--Ocupacion ID-->
							<div class="row form-group">
								<label for="ocupacion.id" class="col-form-label col-md-4">Ocupación</label>
								<div class="col-md-8">
									<select class="form-select" id="ocupacion.id" name="ocupacion.id" required>
										<option disabled selected>Seleccione...</option>
										<option value="4">Transportista</option>
										<option value="5">Soldador</option>
										<option value="6">Almacenero</option>
										<option value="7">Vendedor</option>
									</select>
								</div>
							</div>
							<!--BOTONES-->
							<div class="form-group">
								<label class="col-sm-3 control-label">&nbsp;</label>
								<div class="col-sm-6">
									<input type="submit" class="btn btn-primary" value="Registrar" />
									<a href="empleados.htm" class="btn btn-danger">Cancelar</a>
								</div>
							</div>
						</form>
						<br>
					</div>
				</div>
			</div>
		</div>
	</main>

	<!-- FOOTER -->
	<%@ include file="/WEB-INF/views/footer.jsp" %>

	<!-- JS -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
