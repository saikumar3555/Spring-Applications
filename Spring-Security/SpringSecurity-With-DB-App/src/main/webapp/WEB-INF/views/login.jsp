<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<html>
<body>
	<h1 id="banner">Spring Security - Custom Login Form with DB credentials </h1>
	<form name="f" action="<c:url value='j_spring_security_check'/>"
		method="POST">
		<table>
			<tr>
				<td>Username:</td>
				<td><input type='text' name='username' /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password'></td>
			</tr>
			<tr>
				<td colspan="2">&nbsp;</td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit" value="Login">&nbsp;<input
					name="reset" type="reset"></td>
			</tr>
		</table>
	</form>
</body>
</html>