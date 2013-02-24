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
<jsp:include page="Nav.jsp"/>
<div id="main">
<form name="actionform" action="Report" method="POST">
<table>
<tr><td><u>FAULT FORM</u></td></tr>
<tr><td>Type of fault: </td><td><input type="text" name="f_type"></td></tr>
<tr><td>Fault: </td><td><input type="text" name="f_title" style="width:250px;"></td></tr>
<tr><td>Fault details: </td><td><input type="text" name="f_detail" style="width:250px; height:250px;"></td></tr>
<tr><td></td><td><input type="submit" value="SUBMIT" name="button"></td></tr>
</table>
</form>
</div>
</body>
</html>