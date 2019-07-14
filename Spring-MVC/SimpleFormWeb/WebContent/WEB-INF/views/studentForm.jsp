<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h2>Enter Student Information</h2>

	<form:form action="addStudent.htm" modelAttribute="s" method="POST">
		<table>
			<tr>
				<td>Student ID</td>
				<td><form:input path="sid" /></td>
			</tr>
			<tr>
				<td>Student Name</td>
				<td><form:input path="sname" /></td>
			</tr>
			<tr>
				<td>Student Email</td>
				<td><form:input path="semail" /></td>
			</tr>
			<tr>
				<td>Student Gender</td>
				<td><form:radiobutton path="sgender" label="Male" value="M" />
					<form:radiobutton path="sgender" label="Fe-Male" value="F" /></td>
			</tr>
			<tr>
				<td>Interested Courses</td>
				<td><form:select path="courses">
						<form:option value="C">C</form:option>
						<form:option value="Java">Java</form:option>
						<form:option value="Oracle">Oralce</form:option>
						<form:option value="Testing Tools">Testing Tools</form:option>
					</form:select></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /> <input type="submit"
					value="Submit" /></td>
			</tr>

		</table>

	</form:form>

</body>
</html>