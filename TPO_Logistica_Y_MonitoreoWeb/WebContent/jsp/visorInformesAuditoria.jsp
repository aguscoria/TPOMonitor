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
<title>Informes de Auditoria</title>
</head>

<jsp:useBean id="visorInformesAuditoriaBean" class="controladores.COVisorInformesAuditoria"/>
	
	<jsp:setProperty name="visorInformesAuditoriaBean"
 					property="descInformes" 
 					param="descInformes" />
 	<jsp:setProperty name="visorInformesAuditoriaBean"
 					property="fechaInformes" 
 					param="fechaInformes" />

	<body>
		<div class="ui-grid-solo" align="center" style="background: gray; width: 100%;">
			<div class="ui-block-a" align="center" style="background: gray; width: 100%;">
				<label id="labelInformesAuditoria" style="background-color: gray; color:orange; text-decoration: !important; font-size: 50; font-weight: bold; font-family: sans-serif; text-align: center;">
					Informes Auditoría
				</label>
			</div>
			<div class="ui-block-a" align="center" style="background: gray; width: 100%;">
				<table data-role="table" id="tablaRankingBestSeller"
					data-mode="columntoggle"
					class="ui-body-e ui-responsive table-stripe">
					<thead>
						<tr class="ui-bar-e">
							<th>Fecha</th>
							<th data-priority="1">Evento</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[0]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[0]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[1]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[1]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[2]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[2]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[3]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[3]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[4]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[4]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[5]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[5]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[6]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[6]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[7]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[7]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[8]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[8]);%>
							</td>
						</tr>
						<tr>
							<td>
							<%out.print(visorInformesAuditoriaBean.getFechaInformes()[9]);%>
							</td>
							<td>
							<%out.print(visorInformesAuditoriaBean.getDescInformes()[9]);%>
							</td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="ui-block-a" style="background: gray; width: 100%;">
				<a href="/TPO_Logistica_Y_MonitoreoWeb/" id="botonVolver" data-role="button"
					data-icon="home" data-iconpos="left" data-mini="true"
					data-inline="true" data-theme="e">
					Menú principal
				</a>
			</div>
		</div>
	</body>
</html>