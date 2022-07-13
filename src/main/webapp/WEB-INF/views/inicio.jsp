<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ include file="/WEB-INF/views/incluido.jsp" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="es">
<!-- HEAD -->
<head>
	<meta charset="UTF-8">
	<title>DON LUCHO</title>
	<link rel="icon" href="https://christopher-carrasco.ga/donlucho/don-lucho-logo.png" />
	<link rel="stylesheet" href="https://christopher-carrasco.ga/donlucho/styles.css" />
</head>

<!-- BODY -->
<body>
	<!-- HEADER -->
	<%@ include file="/WEB-INF/views/header.jsp" %>

	<!-- INICIO -->
	<main class="container p-5">
		<div class="row justify-content-center">
			<div class="col-md-12">
				<div class="card mb-3">
					<div class="row g-0">
						<div class="col-md-4">
							<img src="https://christopher-carrasco.ga/donlucho/trabajador.jpg" class="img-fluid rounded-start align-items-center" alt="nomina" />
						</div>
						<div class="col-md-8">
							<div class="card-body">
								<h5 class="card-title">BIENVENID@</h5>
								<p class="card-text">Aplicación web para el control de nóminas de los empleados de "Don Lucho".</p>
								<a class="btn btn-primary" href="nomina.htm" role="button">NÓMINA</a>
								<hr>
								<h5 class="card-title">FUNCIONES:</h5>
								<p class="card-text">Registro de empleados, bonificaciones y deducciones.</p>
								<p class="card-text">Cálculo de nóminas.</p>
								<a href="bonificaciones.htm">Bonificaciones</a>
								<a href="deducciones.htm">Deducciones</a>
							</div>
						</div>
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
