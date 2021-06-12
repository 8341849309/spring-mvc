<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form</title>
</head>
<body>
		
		<form:form action="register" modelAttribute="customer" method="POST" >
			
			<table>
				<tr>
					<td> <spring:message code="customer.name" /> </td>
					<td> <form:input path="cname"/> </td>
				</tr>
				<tr>
					<td> <spring:message code="customer.addrs" /> </td>
					<td> <form:input path="addrs"/> </td>
				</tr>
				<tr>
					<td> <spring:message code="customer.billAmt" /> </td>
					<td> <form:input path="billAmt"/> </td>
				</tr>
				<tr>
					<td colspan="2"> <input type="submit" value="Register"/> </td>
				</tr>
			</table>
			
		</form:form>
		
		<a href="?lang=de_DE">German</a> &nbsp;&nbsp;
		<a href="?lang=fr_FR">French</a> &nbsp;&nbsp;
		<a href="?lang=hi_IN">Hindi</a> &nbsp;&nbsp;
		<a href="?lang=en_US">English</a> &nbsp;&nbsp;
		
	
</body>
</html>