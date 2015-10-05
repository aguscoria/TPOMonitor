<%@ page language="java" contentType="text/html; charset=ISO-8859-1"pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="css/jquery.mobile-1.3.2.min.css">
<script src="js/jquery-1.9.1.min.js"></script>
<script src="js/jquery.mobile-1.3.2.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Generar órdenes de despacho</title>
</head>
<jsp:useBean id="crearOrdenesDespachoBean" class="controladores.COCrearOrdenesDespacho"/>
	
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos1" 
 					param="comboDespachos1" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos2" 
 					param="comboDespachos2" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos3" 
 					param="comboDespachos3" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos4" 
 					param="comboDespachos4" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos5" 
 					param="comboDespachos5" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos6" 
 					param="comboDespachos6" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos7" 
 					param="comboDespachos7" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos8" 
 					param="comboDespachos8" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos9" 
 					param="comboDespachos9" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos10" 
 					param="comboDespachos10" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos10" 
 					param="comboDespachos10" />
 	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboDespachos10" 
 					param="comboDespachos10" />
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboNombresDespachos1" 
 					param="comboNombresDespachos1" /> 					
	<jsp:setProperty name="crearOrdenesDespachoBean"
 					property="comboNombresDespachos2" 
 					param="comboNombresDespachos2" /> 					 					 
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos3" 
 					param="comboNombresDespachos3" /> 
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos4"
 					param="comboNombresDespachos4" /> 
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos5"
 					param="comboNombresDespachos5" /> 
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos6"
 					param="comboNombresDespachos6" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos6"
 					param="comboNombresDespachos6" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos7"
 					param="comboNombresDespachos7" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos8"
 					param="comboNombresDespachos8" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos9"
 					param="comboNombresDespachos9" />					
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="comboNombresDespachos10"
 					param="comboNombresDespachos10" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta1"
 					param="idVenta1" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta2"
 					param="idVenta2" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta3"
 					param="idVenta3" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta4"
 					param="idVenta4" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta5"
 					param="idVenta5" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta6"
 					param="idVenta6" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta7"
 					param="idVenta7" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta8"
 					param="idVenta8" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta9"
 					param="idVenta9" />
	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idVenta9"
 					param="idVenta9" />
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="nombreDespachosAsociadosAVentas"
 					param="nombreDespachosAsociadosAVentas" />	
 	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="idsDespachosAsociadosAVentas"
 					param="idsDespachosAsociadosAVentas" />	 					
	<jsp:setProperty name="crearOrdenesDespachoBean" 
 					property="codigosVentas"
 					param="codigosVentas" />
<body style="background-color: gray; height: 100%">
	<form action="../SVCrearOrdenesDespacho" id="formulario1" method="post">
		<input type="hidden" name="idVta1" value="<%= crearOrdenesDespachoBean.getIdVenta1() %>" />
		<input type="hidden" name="idVta2" value="<%= crearOrdenesDespachoBean.getIdVenta2() %>" />
		<input type="hidden" name="idVta3" value="<%= crearOrdenesDespachoBean.getIdVenta3() %>" />
		<input type="hidden" name="idVta4" value="<%= crearOrdenesDespachoBean.getIdVenta4() %>" />
		<input type="hidden" name="idVta5" value="<%= crearOrdenesDespachoBean.getIdVenta5() %>" />
		<input type="hidden" name="idVta6" value="<%= crearOrdenesDespachoBean.getIdVenta6() %>" />
		<input type="hidden" name="idVta7" value="<%= crearOrdenesDespachoBean.getIdVenta7() %>" />
		<input type="hidden" name="idVta8" value="<%= crearOrdenesDespachoBean.getIdVenta8() %>" />
		<input type="hidden" name="idVta9" value="<%= crearOrdenesDespachoBean.getIdVenta9() %>" />
		<input type="hidden" name="idVta10" value="<%= crearOrdenesDespachoBean.getIdVenta10() %>" />
		<div class="ui-grid-solo" style="background-color: gray; width: 100%;">
			<div class="ui-block-a" style="background-color: gray;" align="center">
				<label id="labetTitulo" style="background-color: gray; color:orange; text-decoration: !important; font-size: 50; font-weight: bold; font-family: sans-serif; text-align: center;">
					Generar órdenes de despacho
				</label>
			</div>
			<div class="ui-block-a" style="background-color: gray;" align="center">
				<table data-role="table" id="tableVentasDespachos"
					data-mode="columntoggle"
					class="ui-body-e ui-responsive table-stripe">
					<thead>
						<tr class="ui-bar-e" align="center">
							<th>Ventas</th>
							<th data-priority="1" align="center">Despachos</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td >
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[0]);%>
							</td>
							<td>
								<div data-role="fieldcontain">
									<label for="comboDesp1"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp1"
										id="comboDesp1" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos1().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos1().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos1().get(i));%>
										</option>
<!-- 										<option value="B">B</option> -->
										<%}%>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[1]);%>
							</td>
							<td>
								<div data-role="fieldcontain">
									<label for="comboDesp2"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp2"
										id="comboDesp2" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos2().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos2().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos2().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[2]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp3"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp3"
										id="comboDesp3" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos3().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos3().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos3().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[3]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp4"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp4"
										id="comboDesp4" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos4().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos4().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos4().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[4]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp5"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp5"
										id="comboDesp5" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos5().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos5().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos5().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[5]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp6"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp6"
										id="comboDesp6" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos6().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos6().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos6().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[6]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp7"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp7"
										id="comboDesp7" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos7().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos7().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos7().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[7]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp8"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp8"
										id="comboDesp8" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos8().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos8().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos8().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[8]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp9"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp9"
										id="comboDesp9" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos9().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos9().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos9().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(crearOrdenesDespachoBean.getCodigosVentas()[9]);%>
							</td>
							<td>
							<div data-role="fieldcontain">
									<label for="comboDesp10"
										class="ui-hidden-accessible">
									</label>
									<select name="comboDesp10"
										id="comboDesp10" data-mini="true" data-theme="e">
										<% for(int i=0;i<crearOrdenesDespachoBean.getComboDespachos10().size();i++){%> 
										<option value="<%= crearOrdenesDespachoBean.getComboDespachos10().get(i) %>"  >
										<%out.print(crearOrdenesDespachoBean.getComboNombresDespachos10().get(i));%>
										<%}%>
										</option>
									</select>
								</div>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="ui-block-a" style="background-color: gray; width: 100%"
				align="left">
				<a href="" id="botonGenerarOrdenesDespacho"
					onclick="document.forms['formulario1'].submit();"	
					data-role="button" data-icon="arrow-r" data-iconpos="left"
					data-mini="true" data-inline="true" data-theme="e">
					Generar órdenes de despacho
				</a>
			</div>
		</div>
	</form>
</body>
</html>