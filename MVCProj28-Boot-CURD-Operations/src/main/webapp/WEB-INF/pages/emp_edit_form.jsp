<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Form</title>
</head>
<body>

	<h2>Employee Edit Form</h2> <br>
	
	<a href="welcome">Home</a>
	
	
	<form:form action="update" modelAttribute="employee" method="POST">
		<table>
			<tr>
				<td> Employee Number:: </td>
				<td> <form:input path="eno" readonly="true" /> </td>
			</tr>
			<tr>
				<td> Employee Name:: </td>
				<td> <form:input path="ename" /> </td>
			</tr>
			<tr>
				<td> Employee Address:: </td>
				<td> <form:input path="addrs" /> </td>
			</tr>
			<tr>
				<td> Employee Salary:: </td>
				<td> <form:input path="esal" /> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="Update" /> </td>
			</tr>
		</table>
	</form:form>
	
</body>
</html>