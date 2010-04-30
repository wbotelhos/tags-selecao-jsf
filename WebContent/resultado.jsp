<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<%@taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@taglib uri="http://java.sun.com/jsf/html" prefix="h" %>

<html>
	<f:view>
		<head>
			<title>http://wbotelhos.com</title>
		</head>
		<body>
			<table>
				<tr>
					<td width="20%"><h:outputText value="Ativo"/></td>
					<td width="80%"><h:outputText value="#{bean.ativo}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Matérias:"/></td>
					<td><h:outputText value="#{bean.materiasDisplay}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Sexo"/></td>
					<td><h:outputText value="#{bean.sexo}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Ano"/></td>
					<td><h:outputText value="#{bean.ano}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Dia da Semana:"/></td>
					<td><h:outputText value="#{bean.diasSemanaDisplay}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Aprovado:"/></td>
					<td><h:outputText value="#{bean.aprovado}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Requisitos:"/></td>
					<td><h:outputText value="#{bean.requisitosDisplay}"/></td>
				</tr>
				<tr>
					<td><h:outputText value="Currículo:"/></td>
					<td><h:outputText value="#{bean.curriculoDisplay}"/></td>
				</tr>
			</table>
		</body>
	</f:view>
</html>