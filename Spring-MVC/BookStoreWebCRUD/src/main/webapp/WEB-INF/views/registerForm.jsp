<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<jsp:include page="header.jsp"></jsp:include>
<body>
	<font color='green'>${succMsg}</font>
	<font color='red'>${errMsg}</font>
	<form:form action="registerUser" modelAttribute="ub">
		<table>
			<tr>
				<td>Username</td>
				<td><form:input path="userName" /></td>
			</tr>

			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>
			</tr>

			<tr>
				<td>Email</td>
				<td><form:input path="email" /></td>
			</tr>

			<tr>
				<td>Gender</td>
				<td><form:radiobutton path="gender" value="M" />Male <form:radiobutton
						path="gender" value="F" />Fe-Male</td>
			</tr>

			<tr>
				<td><input type="reset" value="Reset" /> <input type="submit"
					value="Register" /></td>
			</tr>
		</table>
	</form:form>
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>