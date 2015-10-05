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
<title>Visor Orden de Despacho</title>
</head>

<%-- <jsp:useBean id="visorOrdenDespachoBean" class="controladores.COVisorOrdenDespacho"/> --%>
	
<%-- 	<jsp:setProperty name="visorOrdenDespachoBean" --%>
<%--  					property="enviada"  --%>
<%--  					param="enviada" /> --%>
<%--  	<jsp:setProperty name="visorOrdenDespachoBean" --%>
<%--  					property="fecha"  --%>
<%--  					param="fecha" /> --%>
<%-- 	<jsp:setProperty name="visorOrdenDespachoBean" --%>
<%--  					property="despacho"  --%>
<%--  					param="despacho" /> --%>
<%-- 	<jsp:setProperty name="visorOrdenDespachoBean" --%>
<%--  					property="codVenta"  --%>
<%--  					param="codVenta" /> 					 					 							 --%>

	<body>
		<div class="ui-grid-solo" style="background: gray; width: 100%;">
			<div class="ui-block-a" style="background: gray; width: 100%;" align="center">
				<label id="labelRankingBestSellers" style="background-color: gray; color:orange; text-decoration: !important; font-size: 50; font-weight: bold; font-family: sans-serif; text-align: center;">
							Orden de Despacho
				</label>
			</div>
			<div class="ui-block-a" style="background: gray; width: 100%;" align="center">
				<table data-role="table" id="tablaOrdenDespacho"
					data-mode="columntoggle"
					class="ui-body-e ui-responsive table-stripe">
					<thead>
						<tr class="ui-bar-e">
							<th>Código de venta</th>
							<th data-priority="1">Fecha</th>
							<th data-priority="2">Estado</th>
							<th data-priority="3">Despacho</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
							${codVenta}
<%-- 							<%out.print(visorOrdenDespachoBean.getCodVenta());%> --%>
							</td>
							<td>
							${fecha}
<%-- 							<%out.print(visorOrdenDespachoBean.getFecha());%> --%>
							</td>
							<td>
							${enviada}
<%-- 							<%out.print(visorOrdenDespachoBean.getEnviada());%> --%>
							</td>
							<td>
							${despacho}
<%-- 							<%out.print(visorOrdenDespachoBean.getDespacho());%> --%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="ui-block-a" style="background: gray; width: 100%;">
			
			</div>
			<div class="ui-block-a"
				style="background: gray; width: 100%;">
				<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonHome" data-role="button"
					data-icon="home" data-mini="true" data-inline="true"
					data-theme="e">
					Menú
				</a>
			</div>
		</div>
	</body>
</html>