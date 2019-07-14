<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style>
.color {
	font: bold;
	color: red;
}
</style>
</head>
<body>
	<h2>Registration Form</h2>
	<form:form action="register" method="post" modelAttribute="user">
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="username" /></td>
				<td><form:errors path="username" cssClass="color" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" maxlength="5" /></td>
				<td><form:errors path="password" cssClass="color" /></td>

			</tr>
			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="color" /></td>

			</tr>
			<tr>
				<td>MobileNo</td>
				<td><form:input path="mobileNo" /></td>
				<td><form:errors path="mobileNo" cssClass="color" /></td>
			</tr>
			<tr>
				<td>Gender</td>
				<td><form:radiobuttons path="gender" items="${genders}" />
				<td><form:errors path="gender" cssClass="color" /></td>
			</tr>
			<tr>
				<td>Intrested Courses</td>
				<td><form:select path="intrestedCourses" items="${courses}" /></td>
				<td><form:errors path="intrestedCourses" cssClass="color" /></td>
			</tr>
			<tr>
				<td>Preferrable Timings</td>
				<td><form:checkboxes path="preferrableTimings"
						items="${timings}" /></td>
				<td><form:errors path="preferrableTimings" cssClass="color" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="submit" value="Register" /></td>
			</tr>

		</table>

	</form:form>



</body>
</html>