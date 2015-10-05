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
<title>Ranking Best Sellers</title>
</head>

<jsp:useBean id="ranquingBestSellerBean" class="controladores.CORankingBestSellers"/>
	
	<jsp:setProperty name="ranquingBestSellerBean"
 					property="productos" 
 					param="productos" />
 	<jsp:setProperty name="ranquingBestSellerBean"
 					property="cantidadVentas" 
 					param="cantidadVentas" />

<body style="background-color: gray; height: 100%">
	<form action="../SVRanquingBestSeller" id="formulario1" method="post">
		<div class="ui-grid-solo" style="background-color: gray; height: 100%">
			<div class="ui-block-a"
				style="background-color: gray;" align="center">
				<div class="ui-grid-b" style="background-color: gray; border:medium; border-color:orange; width: 100%; align="center">
					<div class="ui-block-b" style="background-color: gray ; border:medium; border-color:orange;" align="center">
						<label id="labelRankingBestSellers" style="background-color: gray; color:orange; text-decoration: !important; font-size: 50; font-weight: bold; font-family: sans-serif; text-align: center;">
							Ranking best sellers
						</label>
					</div>
				</div>
			</div>
			<div class="ui-block-a"style="padding: 20px; style="background-color: gray;" align="center">
				<table data-role="table" id="tablaRankingBestSeller"
					data-mode="columntoggle"
					class="ui-body-e ui-responsive table-stripe">
					<thead>
						<tr class="ui-bar-e">
							<th>Ranking</th>
							<th data-priority="1">Producto</th>
							<th data-priority="2">Cantidad de ventas</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[0]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[0]);%>
							</td>
						</tr>
						<tr>
							<td>2</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[1]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[1]);%>
							</td>
						</tr>
						<tr>
							<td>3</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[2]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[2]);%>
							</td>
						</tr>
						<tr>
							<td>4</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[3]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[3]);%>
							</td>
						</tr>
						<tr>
							<td>5</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[4]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[4]);%>
							</td>
						</tr>
						<tr>
							<td>6</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[5]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[5]);%>
							</td>
						</tr>
						<tr>
							<td>7</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[6]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[6]);%>
							</td>
						</tr>
						<tr>
							<td>8</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[7]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[7]);%>
							</td>
						</tr>
						<tr>
							<td>9</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[8]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[8]);%>
							</td>
						</tr>
						<tr>
							<td>10</td>
							<td>
							<%out.print(ranquingBestSellerBean.getProductos()[9]);%>
							</td>
							<td>
							<%out.print(ranquingBestSellerBean.getCantidadVentas()[9]);%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="ui-block-a"
				style="background-color: gray; width: 100%" align="left">
				<div class="ui-block-b" style="background-color: gray;" align="left">
					<div class="ui-block-a"
						style="background-color: gray; width: 100%" align="left">
						<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonVolver" data-role="button"
							data-icon="home" data-iconpos="left" data-mini="true"
							data-inline="true" data-theme="e">
							Menú principal
						</a>
					</div>
					<div class="ui-block-c"
						style="background-color: gray; width:100%" align="left">
						<a href="" id="botonEnviarRanking"
							onclick="document.forms['formulario1'].submit();"
							data-role="button" data-icon="forward" data-iconpos="left"
							data-mini="true" data-inline="true" data-theme="e">
							Enviar a portales
						</a>
					</div>
				</div>
			</div>
		</div>
	</form>
</body>
</html>