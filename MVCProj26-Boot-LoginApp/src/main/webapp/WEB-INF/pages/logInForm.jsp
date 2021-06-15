<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LogIn</title>
</head>
<body>
	
	<form:form action="validate" modelAttribute="logIn" method="POST" >
		<table>
			<tr>
				<td> Username::  </td>
				<td> <input type="text" placeholder="Username" name="username"> </td>
			</tr>
			<tr>
				<td> Password::  </td>
				<td> <input type="text" placeholder="Password" name="password"> </td>
			</tr>
			<tr>
				<td colspan="2"> <input type="submit" value="Submit"> </td>
			</tr>
		</table>
		
		<h3>${result}</h3>
		
	</form:form>
	
</body>
</html>