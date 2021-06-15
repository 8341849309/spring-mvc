<%@page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:forEach var="emp" items="${listEmps}">
	<tr>
		<td> ${emp.eno} </td>
	   	<td> ${emp.ename} </td>
		<td> ${emp.addrs} </td>
		<td> ${emp.salary} </td>
	</tr>
	
	<br>
</c:forEach>

<a href="welcome">Home</a>