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
			<h:form>
				<table>
					<tr>
						<td width="20%"><h:outputText value="Ativo?:"/></td>
						<td width="80%"><h:selectBooleanCheckbox value="#{bean.ativo}"/></td>
					</tr>
					<tr>
						<td><h:outputText value="Matérias:"/></td>
						<td>
							<h:selectManyCheckbox value="#{bean.materias}" layout="lineDirection" border="1">
								<f:selectItems value="#{bean.materiasItems}"/>
							</h:selectManyCheckbox>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Sexo:"/></td>
						<td>
							<h:selectOneRadio value="#{bean.sexo}" layout="pageDirection">
								<f:selectItem itemLabel="Masculino" itemValue="M"/>
								<f:selectItem value="#{bean.femininoItem}"/>
							</h:selectOneRadio>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Ano:"/></td>
						<td>
							<h:selectOneListbox value="#{bean.ano}" size="7">
								<f:selectItems value="#{bean.anosItems}"/> <!-- Collection -->
							</h:selectOneListbox>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Dias:"/></td>
						<td>
							<h:selectManyListbox value="#{bean.diasSemana}">
								<f:selectItems value="#{bean.diasSemanaItems}"/>
							</h:selectManyListbox>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Aprovado:"/></td>
						<td>
							<h:selectOneMenu value="#{bean.aprovado}">
								<f:selectItems value="#{bean.aprovadoItems}"/>
							</h:selectOneMenu>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Requisitos:"/></td>
						<td>
							<h:selectManyMenu value="#{bean.requisitos}">
								<f:selectItems value="#{bean.requisitosItems}"/>
							</h:selectManyMenu>
						</td>
					</tr>
					<tr>
						<td><h:outputText value="Currículo:"/></td>
						<td>
							<h:selectManyListbox value="#{bean.curriculo}">
								<f:selectItems value="#{bean.curriculoItems}"/>
							</h:selectManyListbox>
						</td>
					</tr>
				</table>
				<h:commandButton value="Visualizar" action="resultado"/>
			</h:form>
		</body>
	</f:view>
</html>