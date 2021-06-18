<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

	<h2>Employee Creation Form</h2> <br>
	
	<a href="welcome">Home</a>
	
	<form action="createEmp" method="POST">
		<table>
			<tr>
				<td> Name:: </td>
				<td> <input name="ename" type="text" placeholder="Name" /> </td>
			</tr>
			<tr>
				<td> Address:: </td>
				<td> <input name="addrs" type="text" placeholder="Address" /> </td>
			</tr>
			<tr>
				<td> Salary:: </td>
				<td> <input name="esal" type="text" placeholder="Salary" /> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="Create" />
			</tr>
		</table>
	</form>
	
</body>
</html>