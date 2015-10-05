<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/jquery.mobile-1.3.2.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/jquery.mobile-1.3.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sistema de logística y monitoreo</title>
</head>
<head>
<title>Sistema de logística y monitoreo</title>
</head>
	<body style="background-color: gray;">
		<div class="ui-grid-solo" style="background-color: gray;">
<!-- 			<div class="ui-block-a" align="center" id="tituloSistema" style="background-color: gray; color:orange; text-decoration: !important;  text-decoration: underline; font-size: 25; font-weight: bold; font-family: sans-serif;"> -->
<!-- 				Sistema de logística y monitoreo -->
<!-- 			</div> -->
			<div class="ui-block-a" align="center" id="tituloSistema"
				style="background-color: gray;">
				<img id="imagenTituloSistema" alt=""
					src="../TPO_Logistica_Y_MonitoreoWeb/TituloSistema.jpg" width="100%" height="100px" />
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/crearOrdenesDespacho.jsp" id="botonGenerarOrdenesDespacho"
					data-role="button" data-icon="bars" data-iconpos="left"
					data-theme="e">
					Genear órdenes de despacho
				</a>
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/ordenesDespacho.jsp" id="botonVerOrdenesDespacho"
					data-role="button" data-icon="bars" data-iconpos="left"
					data-theme="e">
					Ver órdenes de despacho
				</a>
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/rankingBestSellers.jsp" id="botonRankingBestSellers"
					data-role="button" data-icon="bars" data-iconpos="left"
					data-theme="e">
					Ranking Best-Selletrs
				</a>
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/reporteDeVentas.jsp" id="botonReporteVentas" data-role="button"
					data-icon="bars" data-iconpos="left" data-theme="e">
					Reporte de ventas
				</a>
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/reporteDeVentasPorPortal.jsp" id="botonVentasPortales" data-role="button"
					data-icon="bars" data-iconpos="left" data-theme="e">
					Ver ventas de portales
				</a>
			</div>
			<div class="ui-block-a" style="padding: 20px; background-color: gray;">
				<a href="jsp/visorInformesAuditoria.jsp" id="botonInformesAuditoria"
					data-role="button" data-icon="bars" data-iconpos="left"
					data-theme="e">
					Informes de auditoría
				</a>
			</div>
		</div>
	</body>
</html>