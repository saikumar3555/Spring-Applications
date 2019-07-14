<%@page session="true" isELIgnored="false"%>
<html>
<body>
	<h1>Title : ${title}</h1>
	<h1>Message : ${message}</h1>

	<a href="<c:url value="/logout" />"> Logout</a>

</body>
</html>