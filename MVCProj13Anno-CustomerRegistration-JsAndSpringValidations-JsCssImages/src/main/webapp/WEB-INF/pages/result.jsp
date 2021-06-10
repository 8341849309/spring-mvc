<%@page isELIgnored="false" %>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
 <html>
 	<head>
 		<title>Form</title>
 		
 		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>" />
 		
 	</head>
 	
 	<body>
	
	   <div class="container">
	   
		<a href="cust_form" class="rounded">
			<img alt="Home" src="<c:url value="/resources/images/home.jpg"/>" height="50px" width="50px"/>
		</a>
		
		<h4>Registration Details are::</h4> <br>
		<hr>
		
		<pre class="text-success">
			
			<b> ${cust}   ${msg}  </b>
			
		</pre>

 		
 	   </div>	
 	</body>
 	
</html>