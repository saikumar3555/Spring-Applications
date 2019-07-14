<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

	<div class="navbar navbar-fixed-left">
		<form action="register">
			<button type="submit"
				style="background-color: #428bca; color: black; padding: 6px; text-align: center; float: right; margin-top: 15px;">Register</button>
		</form>

		<form action="login">
			<button type="submit"
				style="background-color: #428bca; padding: 6px; text-align: center; color: black; float: right; margin-top: 15px;">Login</button>
		</form>
	</div>
	<%@ include file="header.jsp"%>


	<table width="98%" height="20" border="0">
		<tr>
			<td align="center"><marquee onmouseout=this.start()
					scrollamount=5 scrolldelay=50 direction=left>
					<font color="red">
						<p>
							<b>Welcome to National Book Store</b>
						</p> <br>

					</font>
				</marquee></td>
		</tr>
	</table>

	<p>JustBooks CLC is a new generation community library chain that
		provides a unique reading experience with access to a network of 75
		neighborhood libraries, spread across 12 cities in India and access to
		a combined collection of over 9,00,000 books. Our unique features are:
		Access to over 9 Lakh Titles 39 categories to choose from - One
		membership for entire Family Door Delivery Facility Available No Late
		Fees Fees starts at Rs 300 per month Book issue/return using RFID
		Technology</p>


	<table width="98%" height="80" border="0">
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>

			<td align="center"><marquee onmouseout=this.start()
					onmouseover=this.stop() scrollamount=4 scrolldelay=80
					direction=left>

					<img alt="" src='<%=contextPath + "/resources/images/9.jpg"%>'
						height="200"> <img alt=""
						src='<%=contextPath + "/resources/images/14.jpg"%>' height="200">

					<img alt="" src='<%=contextPath + "/resources/images/11.jpg"%>'
						height="240"> <img alt=""
						src='<%=contextPath + "/resources/images/7.jpg"%>' height="240">

					<img alt="" src='<%=contextPath + "/resources/images/6.jpg"%>'
						height="240"> <img alt=""
						src='<%=contextPath + "/resources/images/4.jpg"%>' height="240">

					<img alt="" src='<%=contextPath + "/resources/images/13.jpg"%>'
						height="200">

				</marquee></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
	</table>


	<table width="98%" height="50" border="0">
		<tr>
			<td>&nbsp;</td>
		</tr>
		<tr>
			<td align="center"><marquee onmouseover=this.stop()
					onmouseout=this.start() scrollamount=5 scrolldelay=50
					direction=left>
					<font color="red">
						<p></p> <br>
					</font>
				</marquee></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
		</tr>
	</table>
</body>
</html>

<%@ include file="footer.jsp"%>