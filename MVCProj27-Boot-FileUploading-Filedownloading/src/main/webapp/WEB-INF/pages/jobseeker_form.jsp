<%@ page isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>File Uploading</h1>

<form:form action="upload" modelAttribute="jobSeeker" enctype="multipart/form-data" method="POST">
	<table>
		<tr>
			<td> Job Seeker Name:: </td>
			<td> <form:input path="jsName" type="text" placeholder="Name"/> </td>
		</tr>
		<tr>
			<td> Job Seeker Qualification:: </td>
			<td> <form:input path="jsQlfy" type="text" placeholder="Qualification"/> </td>
		</tr>
		<tr>
			<td> Photo:: </td>
			<td> <form:input path="photo" type="file" placeholder="Choose Photo"/> </td>
		</tr>
		<tr>
			<td> Resume:: </td>
			<td> <form:input path="resume" type="file" placeholder="Choose Resume"/> </td>
		</tr>
		<tr>
			<td colspan="2"> <input type="submit" value="Upload & Register"/> </td>
		</tr>
	</table>
</form:form>

