<%@ page isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form"  prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

 <!DOCTYPE html>
 <html>
 	<head>
 		<title>Form</title>
 		
 		<script type="text/javascript" src="<c:url value="/resources/js/custFormValidation.js"/>">
 		</script>
 		
 		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.css"/>" />
 		
 	</head>
 	
 	<body>
 		
 		<noscript>
 			<h1 class="font-weight-bold text-center text-danger" >Enable JavaScript</h1>
 		</noscript>
 		
 	
	  <div class="container"> 		
		<h1 style="color:green;text-align:center">Customer Registration Form </h1>
		
		<hr>
		
		<form:form action="register"  modelAttribute="customer" onsubmit="return validate(this)">
		   <table class="table table-borderless">
		     <tr>
		        <td>Customer name::       </td>
		        <td><form:input path="cname"/>  </td>
		        <td><form:errors path="cname"/> <span id="cname"></span> </td>
		     </tr>
		     <tr>
		        <td>Customer address::       </td>
		        <td><form:input path="cadd"/>  </td>
		        <td><form:errors path="cadd"/> <span id="cadd"></span> </td>
		     </tr>
		     <tr>
		        <td>Customer billAmt::       </td>
		        <td><form:input path="billAmt"/>  </td>
		        <td><form:errors path="billAmt"/> <span id="billAmt"></span> </td>
		     </tr>
		     <tr>
		     	<td colspan="3"><form:hidden path="vflag" id="vflag" /></td>
		     </tr>
		     <tr>
		        <td colspan="2"><input type="submit" value="Register">  </td>
		     </tr>
		     
		     
		     
		   </table>
		</form:form>
	  </div>
		
 	</body>
 </html>