<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/incluido.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="es">
<!-- HEAD -->
<head>
	<meta charset="UTF-8" />
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
						<li class="nav-item"><a class="nav-link" href="empleados.htm">Empleados</a></li>
						<li class="nav-item"><a class="nav-link" href="bonificaciones.htm">Bonificaciones</a></li>
						<li class="nav-item"><a class="nav-link active" href="deducciones.htm">Deducciones</a></li>
						<li class="nav-item"><a class="nav-link" href="nomina.htm">Nómina</a></li>
					</ul>
					<form class="d-flex" action="login.htm">
						<button class="btn btn-outline-danger" type="submit">Cerrar sesión</button>
					</form>
				</div>
			</div>
		</nav>
	</header>

	<!-- REGISTRAR DEDUCCIÓN -->
	<main class="container p-5">
		<div class="container">
			<div class="row justify-content-center mt">
				<div class="card " style="width: 40rem;">
					<div class="card-body">
						<div class="row justify-content-center register">
							<div class="col-md-10">
								<h2 class="text-center">REGISTRAR DEDUCCIÓN</h2>
							</div>
						</div>
						<form action="deduccion/add" class="form formu" object="${ deducciones }" method="post">
							<!--Motivo-->
							<div class="row form-group">
								<label for="motivo" class="col-form-label col-md-4">Motivo</label>
								<div class="col-md-8">
									<input type="text" class="form-control"  id="motivo" name="motivo" required />
								</div>
							</div>
							<!--Monto-->
							<div class="row form-group">
								<label for="monto" class="col-form-label col-md-4">Monto (S/.)</label>
								<div class="col-md-8">
									<input type="number" class="form-control" id="monto" name="monto" min="0.01" max="999999999.99" step="0.01" required />
								</div>
							</div>
							<!--Fecha-->
							<div class="row form-group">
								<label for="fecha" class="col-form-label col-md-4">Fecha</label>
								<div class="col-md-8">
									<input type="date" class="form-control" id="fecha" name="fecha" required readonly />
								</div>
							</div>
							<!--ID empleado-->
							<div class="row form-group">
								<label for="empleado.id" class="col-form-label col-md-4">ID empleado</label>
								<div class="col-md-8">
									<input type="number" class="form-control" id="empleado.id" name="empleado.id"  min="1" max="999999" required />
								</div>
							</div>
							<!--ID planilla-->
							<div class="row form-group">
								<label for="planilla.id" class="col-form-label col-md-4">Planilla</label>
								<div class="col-md-8">
									<select class="form-select" id="planilla.id" name="planilla.id" required>
										<option value="1" selected>JULIO - 2022</option>
									</select>
								</div>
							</div>
							<!--BOTONES-->
							<div class="form-group">
								<label class="col-sm-3 control-label">&nbsp;</label>
								<div class="col-sm-6">
									<input type="submit" name="add" class="btn btn-primary" value="Registrar">
									<a href="deducciones.htm" class="btn btn-danger">Cancelar</a>
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
	<script>document.getElementById('fecha').value = new Date().toISOString().substring(0, 10);</script>
</body>
</html>
