<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
	<h1>${message}</h1>
	<spring:message code="language.change"/> :
	<a href="?lang=en">English</a> |
	<a href="?lang=de"><spring:message code="lang.de"/></a> |
	<a href="?lang=fr"><spring:message code="lang.fr"/></a> |
	<a href="?lang=zh">Chinese</a>
</body>
</html>