<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="appPath" value="${pageContext.request.contextPath}" />
<%
	String contextPath = request.getContextPath();
%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href='<%=contextPath + "/resources/css/bootstrap.min.css"%>'
	rel="stylesheet">
<link href='<%=contextPath + "/resources/css/font-awesome.min.css"%>'
	rel="stylesheet">
<link href='<%=contextPath + "/resources/css/books.css"%>'
	rel="stylesheet">
</head>
<body>
	<div class="navbar navbar-inverse navbar-fixed-left">
		<div class="container-fluid">
			<div class="collapse navbar-collapse" id="myNavbar">
				<img src='<%=contextPath + "/resources/images/nbstore.jpg"%>'
					width="200" height="55" style="margin-left: -31px;" />
				<ul class="nav navbar-nav navbar-right">
					<li><a href="<%=contextPath%>/">Add Book</a></li>
					<li><a href="<%=contextPath%>/">View Books</a></li>
					<li><a href="<%=contextPath%>/">Need Assistance?</a></li>
					<li><a href="<%=contextPath%>/">Discount Prices</a></li>
					<li><a href="<%=contextPath%>/">Logout</a></li>
				</ul>
			</div>
		</div>
	</div>