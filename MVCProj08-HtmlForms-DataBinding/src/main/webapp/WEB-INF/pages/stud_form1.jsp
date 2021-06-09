<%@page isELIgnored="false" %>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<title>Form</title>
	</head>
	
	<body class="container">
		
		<h3>Student Marks Submission form</h3>
		
		<div class="table table-hover">
			<form:form action="register" method="POST" modelAttribute="student">
				<tr>
					<td>Student No::</td> <td> <form:input path="sno"/> </td>
				</tr>
				<tr>
					<td>Student Name::</td> <td> <form:input path="sname"/> </td>
				</tr>
				<tr>
					<td>Student No::</td> <td> <form:input path="addrs"/> </td>
				</tr>
				<tr>
					<td>Student No::</td> <td> <form:input path="avg"/> </td>
				</tr>
				<tr>
					<td colspan="2"> <input type="submit" value="Register"> </td>
				</tr>
			</form:form>
		</div>
	
	</body>
	
</html>