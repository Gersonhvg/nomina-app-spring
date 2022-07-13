<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/incluido.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="es">
<!-- HEAD -->
<head>
	<meta charset="UTF-8">
	<title>DON LUCHO</title>
	<link rel="stylesheet" href="https://christopher-carrasco.ga/donlucho/login.css" />
	<link rel="icon" href="https://christopher-carrasco.ga/donlucho/don-lucho-logo.png" />
	<link rel="stylesheet" href="https://christopher-carrasco.ga/donlucho/styles.css" />
	<link rel="preconnect" href="https://fonts.googleapis.com">
	<link rel="preconnect" href="https://fonts.gstatic.com">
	<link href="https://fonts.googleapis.com/css2?family=Prompt:wght@100&family=Rambla&display=swap" rel="stylesheet">
</head>

<!-- BODY -->
<body>
	<div class="contenedor">
		<div class="row">
			<div class="col-8">
				<div class="grid1">
					<div id="carouselExampleIndicators" class="carousel carousel-dark slide" data-bs-ride="carousel">
						<div class="carousel-indicators">
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
							<button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
						</div>
						<div class="carousel-inner">
							<div class="carousel-item active">
								<img src="https://christopher-carrasco.ga/donlucho/img/p2.jpeg" class="d-block w-100" alt="Don Lucho 1">
							</div>
							<div class="carousel-item">
								<img src="https://christopher-carrasco.ga/donlucho/img/p4.jpeg" class="d-block w-100" alt="Don Lucho 2">
							</div>
							<div class="carousel-item">
								<img src="https://christopher-carrasco.ga/donlucho/img/p3.jpeg" class="d-block w-100" alt="Don Lucho 3">
							</div>
						</div>
						<button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
							<span class="carousel-control-prev-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Previous</span>
						</button>
						<button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
							<span class="carousel-control-next-icon" aria-hidden="true"></span>
							<span class="visually-hidden">Next</span>
						</button>
					</div>
				</div>
			</div>
			<div class="col-4">
				<div class=" grid2">
					<form action="inicio.htm">
						<h2 class="frame1 fw-normal color ">Bienvenido a Don Lucho</h2>
						<fieldset class="field_cont">
							<legend class="text-white">Iniciar sesión</legend>
							<div>
								<label class="text" for="email"><strong>Email</strong></label><br>
								<input class="text1 fw-bolder form-control" type="email" id="email" name="email" title="Es obligatorio que ingreses tu email" placeholder="Ingresa tu email" required>
								<br><br>
							</div>
							<div>
								<label class="text" for="contrasenia"><strong>Contraseña</strong></label><br>
								<input class="text1 fw-bolder form-control" type="password" id="contrasenia" name="contrasenia" minlength="6" title="Es ogligatorio que ingreses tu contraseña" placeholder="Ingresa tu contraseña" required>
								<br><br>
							</div>
							<input type="submit" class="btn btn-danger" value="Login">
							<br><br>
							<h5 class="text-danger">${ msg }</h5>
						</fieldset>
					</form>
				</div>
			</div>
		</div>
	</div>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
