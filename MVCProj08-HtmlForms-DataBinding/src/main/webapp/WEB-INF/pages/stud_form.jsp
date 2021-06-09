<%@page isELIgnored="false" %>

<html>
	<head>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
		<title>Form</title>
	</head>
	
	<body class="container">
		
		<h3>Student Marks Submission form</h3>
		
		<div class="table table-hover">
			<form action="register" method="post">
				<table>
				<tr>
					<td>Student No::</td> <td> <input type="text" name="sno"/> </td>
				</tr>
				<tr>
					<td>Student Name::</td> <td> <input type="text" name="sname"/> </td>
				</tr>
				<tr>
					<td>Student Address::</td> <td> <input type="text" name="addrs"/> </td>
				</tr>
				<tr>
					<td>Average Marks::</td> <td> <input type="text" name="avg"/> </td>
				</tr>
				<tr>
					<td colspan="2"> <input type="submit" value="Register"> </td>
				</tr>
				</table>
			</form>
		</div>
	
	</body>
	
</html>