package servlets;

import java.sql.*;

public class Dquery {
	static Connection currentCon = null;
	static ResultSet rs = null;
	public static Bean login(Bean bean)
	{
	Statement stmt = null;
	String username = bean.getUsername();
	String password = bean.getPassword();
	String searchQuery = "select * from users where uname='" + username + "' AND password='" + password + "'";
	 
	try
	{
	//connecting to the DB
	currentCon = ConnectionManager.getConnection();
	stmt=currentCon.createStatement();
	rs = stmt.executeQuery(searchQuery);
	boolean userExists = rs.next();
	 
	if (!userExists)
	{
	System.out.println("Username/Password entered is Incorrect or User does not Exists.");
	bean.setValid(false);
	}
	else if (userExists)
	{
	String firstName = rs.getString("FirstName");
	String lastName = rs.getString("LastName");
	System.out.println("Welcome " + firstName);
	bean.setFirstName(firstName);
	bean.setLastName(lastName);
	bean.setValid(true);
	}
	 
	}
	catch (Exception ex)
	{
	System.out.println("Log In failed: An Exception has occurred! " + ex);
	}
	return bean;
	}

}
