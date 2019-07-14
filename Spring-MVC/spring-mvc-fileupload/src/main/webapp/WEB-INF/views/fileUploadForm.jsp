<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ashok IT School</title>
</head>
<body>

	<h1>Spring MVC - File(s) Upload</h1>
	<hr />

	<h3>Single file Upload</h3>
	<b><span style="color: green; font-size: 14px;">${smsg}</span></b>
	<form action="singleFileUpload" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>Select File</td>
				<td><input type="file" name="file"></td>
				<td><button type="submit">Upload</button></td>
			</tr>
		</table>
	</form>
	<br />
	<hr />
	<h3>Multiple file Upload</h3>
	<b><span style="color: green; font-size: 14px;">${mmsg}</span></b>

	<form action="multipleFileUpload" method="post"
		enctype="multipart/form-data">
		<table>
			<tr>
				<td>Select Files</td>
				<td><input type="file" name="file" multiple="multiple"></td>
				<td><button type="submit">Upload</button></td>
			</tr>
		</table>
	</form>
	<br>
	<hr />
</body>
</html>