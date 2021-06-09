<%@ page isELIgnored="false" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<h2>All Employees are</h2>	<br><br>

<head>
  <link  rel="stylesheet"  href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>

<body>

	<div class="container-flux">
	
		<c:choose>
			<c:when test="${!empty listBO}">
				<div>
					<table class="table table-striped table-hover">
						<tr class="text-danger">
							<th>EmpNo </th> <th> EmpName </th> <th>Designation</th> <th>Salary</th>
						</tr>
						
						<c:forEach var="bo" items="${listBO}">
                		<tr class="bg-">
                    		<td>${bo.empId}  </td>
                    		<td>${bo.ename}  </td>
                    		<td>${bo.salary}  </td>
                    		<td>${bo.addrs}  </td>
                 		</tr>
               			</c:forEach>
						
					</table>
				</div>
			</c:when>
			
			<c:otherwise>
				<h1 class="bg-warning text-white">No Records found</h1>
			</c:otherwise>
		
		</c:choose>
		<br><br>
     	<h3 > <a href="home">home</a></h3> 
		
	</div>


</body>

