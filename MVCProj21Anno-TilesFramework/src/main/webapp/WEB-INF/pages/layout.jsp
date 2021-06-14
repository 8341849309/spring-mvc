<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html>
<html>
<head>
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.0/dist/css/bootstrap.min.css"/>
	<title> <tiles:insertAttribute name="title" ignore="true"/> </title>
</head>
<body class="container">

	<div class="row">

	<table class="table">
	
	
		<tr>
			<td> <tiles:insertAttribute name="header"/> </td>
		</tr>
		
		<tr>
		
			<td class="col-sm-3"> <tiles:insertAttribute name="menu"/> </td>
			<td  class="col-sm-8"> <tiles:insertAttribute name="body"/> </td>
		
		</tr>
		
		<tr>
			<td> <tiles:insertAttribute name="footer"/> </td>
		</tr>
		
	</table>
	
	</div>
	
</body>
</html>