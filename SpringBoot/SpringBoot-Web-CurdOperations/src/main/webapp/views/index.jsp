<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Book Store</title>
</head>
<body>
	<h3>Store Book Info</h3>

	<font color="red">${eMsg}</font>
	<font color="green">${sMsg}</font>

	<form:form action="store" method="POST" modelAttribute="book">
		<table>
			<tr>
				<td>Book Name :</td>
				<td><form:input path="bname" /></td>
			</tr>
			<tr>
				<td>Book Isbn:</td>
				<td><form:input path="isbn" /></td>
			</tr>
			<tr>
				<td>Book Price:</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr>
				<td><input type="reset" value="Reset" /></td>
				<td><input type="Submit" value="Submit" /></td>
			</tr>
		</table>

	</form:form>


	<a href="retriveBooks">View All Books</a>
</body>
</html>