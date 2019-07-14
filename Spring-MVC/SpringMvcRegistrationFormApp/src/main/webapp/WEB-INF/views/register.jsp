<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>

<style type="text/css">
.errMsg {
	color: red;
}
</style>

</head>
<body>

	<form:form action="regUser" method="POST" modelAttribute="user">
		<table>
			<tr>
				<td>Username :</td>
				<td><form:input path="uname" /></td>
				<td><form:errors path="uname" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><form:password path="pwd" /></td>
				<td><form:errors path="pwd" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><form:input path="email" /></td>
				<td><form:errors path="email" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><form:radiobuttons path="gender" items="${genders}" /></td>
				<td><form:errors path="gender" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td>Preferrable Timings:</td>
				<td><form:checkboxes path="timings" items="${timings}" /></td>
				<td><form:errors path="timings" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td>Intrested Course(s):</td>
				<td><form:select path="courses" items="${courses}" /></td>
				<td><form:errors path="courses" cssClass="errMsg" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="Submit" value="Register" /></td>
			</tr>
		</table>
	</form:form>

</body>
</html>