<html>

<head>
<style type="text/css">
#footer {
	position: absolute;
	bottom: 0;
	width: 100%;
	height: 60px; /* Height of the footer */
	background: #6cf;
}
</style>

</head>

<script
	src="<%=request.getContextPath()
					+ "/resources/js/jquery-1.11.1.min.js"%>"></script>
<script
	src="<%=request.getContextPath()
					+ "/resources/js/bootstrap.min.js"%>"></script>
<body>
	<div class="navbar navbar-inverse navbar-fixed-left footer">
		<div class="container-fluid">
			<div class="footer-LftLogo footer" style="padding-center: 10px;" align="justify">
				&copy;
				<%=year%> National Book Store
			</div>
		</div>
	</div>
</body>

<%@page import="java.util.Calendar"%>
<%!Calendar cal = Calendar.getInstance();
	int year = cal.get(Calendar.YEAR);%>
</html>