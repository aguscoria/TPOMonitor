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
<title>Ventas de Portal</title>
</head>

<body style="background-color: gray;">
	<form action="../SVReporteVentasPorPortal" id="formulario1" method="post">
		<div class="ui-grid-solo" style="background-color: gray;">
			<div class="ui-block-a" style="background-color: gray;"></div>
			<div class="ui-block-a" style="background-color: gray;">
				<div class="ui-grid-c" style="background-color: gray;">
					<div class="ui-block-a"
						style="background-color: gray; color:orange;">
						<a href="#popupHelp" data-role="button"
							data-inline="true" data-transition="flip" data-rel="popup"
							data-icon="info" data-iconpos="notext" data-theme="e">
							Información
						</a>
						<div data-role="popup" id="popupHelp"
							data-theme="e" class="ui-content" data-overlay-theme="e">
							<a href="#" data-rel="back"
								data-role="button" data-theme="a" data-icon="delete"
								data-iconpos="notext" class="ui-btn-right">
								Cerrar
							</a>
							<p>Ingrese el nombre de portal</p>
						</div>
					</div>
					<div class="ui-block-b">
						<label for="imputVenta"  style="background-color: gray; color:orange;">Nombre de portal:</label>
						<input name="imputVenta" id="imputVenta"
							data-clear-btn="true" value="" autofocus="true" required="true"
							data-theme="e" type="text" />
					</div>
					<div class="ui-block-c" style="background-color: gray;">
						<button id="botonBuscarOrdenDespacho"
							type="submit"
							data-role="button" data-icon="search" data-iconpos="notext"
							data-mini="true" data-inline="true" data-theme="e">
						</button>
					</div>
				</div>
			</div>
			<div class="ui-block-a" style="background-color: gray; width: 100%;">
				<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonVolver" data-role="button"
					data-icon="home" data-iconpos="left" data-mini="true"
					data-inline="true" data-theme="e">
					Menú principal
				</a>
			</div>
			<div class="ui-block-a" style="background-color: gray; width: 100%; height: 100%;">
			</div>
		</div>
	</form>	
</body>
</html>