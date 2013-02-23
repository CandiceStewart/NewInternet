<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link rel="stylesheet" type="text/css" href="Static/css/stylesheet.css" ></link>
</head>
<body>
Sorry, there seems to be a problem with your details.
Please try again or <a href = "Index.jsp">return to homepage!</a>
<div id="main">
<form name="actionForm" action="Login" method="GET">
<table>
<tr><td>Enter your Username: </td><td><input type="text" name="uname"/></td></tr>
<tr><td>Enter your Password: </td><td><input type="password" name="password"/></td></tr>
<tr><td colspan="2" align="left"><input type="submit" value="submit"> </td></tr>
</table>
</form>
</div>
</body>
</html>