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
<title>Reporte de ventas</title>
</head>

<jsp:useBean id="reporteVentasBean" class="controladores.COReporteDeVentas"/>
	
	<jsp:setProperty name="reporteVentasBean"
 					property="fechas" 
 					param="fechas" />
 	<jsp:setProperty name="reporteVentasBean"
 					property="nVentas" 
 					param="nVentas" />
	<jsp:setProperty name="reporteVentasBean"
 					property="montos" 
 					param="montos" />
 	<jsp:setProperty name="reporteVentasBean"
 					property="portales" 
 					param="portales" />
 	<jsp:setProperty name="reporteVentasBean"
 					property="clientes" 
 					param="clientes" />
 	<jsp:setProperty name="reporteVentasBean"
 					property="estados" 
 					param="estados" /> 	
 					
<body  style="background-color: gray;">
	<form action="" id="formulario1" method="post">
		<div class="ui-grid-solo" style="background-color: gray;">
			<div class="ui-block-a" id="gridTitulo" style="background-color: gray; color:orange; text-decoration: !important; font-size: 50; font-weight: bold; font-family: sans-serif; text-align: center;">
				<label id="labelTitulo">Reporte de ventas</label>
			</div>
			<div class="ui-block-a" id="gridReporte">
				<div class="ui-grid-solo">
					<div class="ui-block-a" style=" background-color: gray; height: 20px;">
					</div>
					<div class="ui-block-a" align="center" style="background-color: gray;">
						<table data-role="table" id="TablaVentaas"
							data-mode="columntoggle"
							class="ui-body-e ui-responsive table-stripe">
							<thead>
								<tr class="ui-bar-e">
									<th>Venta</th>
									<th data-priority="1">Fecha</th>
									<th data-priority="2">Monto</th>
									<th data-priority="3">Portal</th>
									<th data-priority="4">Cliente</th>
									<th data-priority="5">Estado</th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[0]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[0]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[0]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[0]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[0]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[0]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[1]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[1]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[1]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[1]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[1]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[1]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[2]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[2]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[2]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[2]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[2]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[2]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[3]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[3]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[3]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[3]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[3]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[3]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[4]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[4]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[4]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[4]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[4]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[4]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[5]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[5]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[5]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[5]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[5]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[5]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[6]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[6]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[6]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[6]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[6]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[6]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[7]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[7]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[7]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[7]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[7]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[7]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[8]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[8]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[8]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[8]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[8]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[8]);%>
									</td>
								</tr>
								<tr>
									<td>
									<%out.print(reporteVentasBean.getnVentas()[9]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getFechas()[9]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getMontos()[9]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getPortales()[9]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getClientes()[9]);%>
									</td>
									<td>
									<%out.print(reporteVentasBean.getEstados()[9]);%>
									</td>
								</tr>
							</tbody>
						</table>
					</div>
					<div class="ui-block-a" style="height: 20px; background-color: gray;">
					</div>
				</div>
			</div>
			<div class="ui-block-a" id="gridBotonVolver" style="background-color: gray; width: 100%">
				<div class="ui-grid-b" align="center" style="background-color: gray;">
					<div class="ui-block-a" style="background-color: gray;"></div>
					<div class="ui-block-b" align="center" style="background-color: gray;">
						<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonVolverMenu"
							data-role="button" data-icon="home" data-iconpos="left"
							data-theme="e">
							Volver al menú
						</a>
					</div>
					<div class="ui-block-c" style="background-color: gray;"></div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>