<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	

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
					<td>Customer Number::</td>
					<td> <form:input path="cno"/> </td>
				</tr>
				<tr>
					<td>Customer Name::</td>
					<td> <form:input path="cname"/> </td>
				</tr>
				<tr>
					<td>Date Of Birth::</td>
					<td> <form:input type="date" path="dob"/> </td>
				</tr>
				<tr>
					<td>Date Of Joining::</td>
					<td> <form:input type="date" path="doj"/> </td>
				</tr>
				<tr>
					<td colspan="2"> <input type="submit" value="Register"/> </td>
				</tr>
			</table>
			
			
		</form:form>
	
</body>
</html>