<%@ page isELIgnored="false" import="java.util.*"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<hr>
<br>
<b>Collection Data</b>	<br>

${fruits}	<br>
${phoneNums}	<br>
${subMarks}	<br>

<hr>

<b>String Array Data</b>
	
<%
	String[] favColors=(String[])request.getAttribute("favColors"); 
	
	for(int i=0;i<favColors.length;i++){
			out.print(favColors[i]+" ");
	}
%>
	
<br>

<hr>

<b>Employees Details</b>	<br>
<c:forEach var="emp" items="${listBo}">
	<c:out value="${emp}"></c:out>	<br>
</c:forEach>

<hr>