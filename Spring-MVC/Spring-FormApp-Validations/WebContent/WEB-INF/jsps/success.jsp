<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<br /> Hi ${user.username}, your registration is successfull.. Please review your details
	<hr />

	<table>
		<tr>
			<td>Username : ${user.username}</td>
		</tr>
		<tr>
			<td>Password : ${user.password}</td>
		</tr>
		<tr>
			<td>Email : ${user.email}</td>
		</tr>
		<tr>
			<td>Mobile No : ${user.mobileNo}</td>
		</tr>
		<tr>
			<td>Gender : ${user.gender}</td>
		</tr>
		<tr>
			<td>Intrested Courses : ${user.intrestedCourses}</td>
		</tr>

		<tr>
			<td>Preferrable Timings : ${user.preferrableTimings}</td>
		</tr>

	</table>

</body>
</html>