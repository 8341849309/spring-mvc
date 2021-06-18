<%@ page isELIgnored="false" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees</title>
</head>
<body>
	
	<h2>All Employees List</h2>
<c:choose>
	<c:when test="${empty empList}">
		<h4>No Records Found</h4>
	</c:when>
	
	<c:otherwise>
		<table>
			<tr>
					<td> No </td>
					<td> Name </td>
					<td> Address </td>
					<td> Salary </td>
			</tr>
			
			<c:forEach var="emp" items="${empList}">
				<tr>
					<td> ${emp.eno} </td>
					<td> ${emp.ename} </td>
					<td> ${emp.addrs} </td>
					<td> ${emp.esal} </td>
					<td> <a href="edit_emp?eno=${emp.eno}">Edit</a> </td>
					<td> <a href="delete?eno=${emp.eno}" 
							onclick="return confirm(' Do u want to delete?')">Delete</a> 
					</td>
				</tr>
			</c:forEach>
		</table>
	</c:otherwise>
</c:choose>
	<br>
	
	<a href="createEmp">Create Employee</a>
	
	<a href="welcome">Home</a>
	
	
	
</body>
</html>