<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Entered information</h2>

	<table>
		<tr>
			<td>Student ID : ${student.sid}
		</tr>
		<tr>
			<td>Student Name : ${sname}
		</tr>
		<tr>
			<td>Student Email : ${semail}
		</tr>
		<tr>
			<td>Student Gender : ${sgender}
		</tr>
		<tr>
			<td>Courses : ${courses}
		</tr>
	</table>
</body>
</html>