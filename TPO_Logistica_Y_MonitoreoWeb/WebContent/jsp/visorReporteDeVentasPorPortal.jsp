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
<title>Insert title here</title>
</head>

<body style="background: gray;">
		<div class="ui-grid-solo" style="background-color: gray; width:100%" align="left">
			<div class="ui-block-a" style="background-color: gray; width:100%" align="left">
			</div>
			<div class="ui-block-a" style="background-color: gray; width:100%" align="left">
				<div class="ui-grid-b" style="background-color: gray; width:100%" align="left">
					<div class="ui-block-b" style="background-color: gray;" align="left">
						<div data-role="fieldcontain">
							<label for="comboPortales">Portal:</label>
							${nombrePortal}
						</div>
					</div>
					<div class="ui-block-b" style="background-color: gray; width:100%" align="center"></div>
				</div>
			</div>
			<div class="ui-block-a" style="background-color: gray; width:100%" align="center">
				<table data-role="table" id="tablaVentas"
					data-mode="columntoggle"
					class="ui-body-e ui-responsive table-stripe">
					<thead>
						<tr class="ui-bar-e">
							<th>Codigo de Venta</th>
							<th data-priority="1">
								Estado de Orden de Despacho
							</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>${codVenta1}</td>
							<td>${estado1}</td>
						</tr>
						<tr>
							<td>${codVenta2}</td>
							<td>${estado2}</td>
						</tr>
						<tr>
							<td>${codVenta3}</td>
							<td>${estado3}</td>
						</tr>
						<tr>
							<td>${codVenta4}</td>
							<td>${estado4}</td>
						</tr>
						<tr>
							<td>${codVenta5}</td>
							<td>${estado5}</td>
						</tr>
						<tr>
							<td>${codVenta6}</td>
							<td>${estado6}</td>
						</tr>
						<tr>
							<td>${codVenta7}</td>
							<td>${estado7}</td>
						</tr>
						<tr>
							<td>${codVenta8}</td>
							<td>${estado8}</td>
						</tr>
						<tr>
							<td>${codVenta9}</td>
							<td>${estado9}</td>
						</tr>
						<tr>
							<td>${codVenta10}</td>
							<td>${estado10}</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="ui-block-a" style="background-color: gray; width:100%" align="left">
				<label id="labelMontoTotal">
					Monto Total de portal:
				</label><td>${montoTotal}</td>
			</div>
			<div class="ui-block-a" style="background-color: gray; width:100%" align="left">
				<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonVolver" data-rel="back"
					data-role="button" data-icon="home" data-iconpos="notext"
					data-mini="true" data-inline="true" data-theme="e">
				</a>
			</div>
			<div class="ui-block-a" style="background-color: gray; width:100%; height: 100%;">
			</div>
		</div>
</body>
</html>