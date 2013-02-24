<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,java.util.*"%>
<table>
<%
String fname=request.getParameter("fname");
String lname=request.getParameter("lname");
String uname=request.getParameter("uname");
String pass=request.getParameter("pass");
System.out.println(fname+lname+uname+pass);
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://arlia.computing.dundee.ac.uk/candicestewart", "CandiceStewart", "ac31004");
        Statement st=con.createStatement();       
        int i=st.executeUpdate("insert into login(uname, password, firstName, lastName) values('"+uname+"','"+pass+"','"+fname+"','"+lname+"')");

        out.println("Data is successfully inserted into database.");
        }
        catch(Exception e){
        System.out.println(e);
        }
        %>
        </table>
</body>
</html>