package servlets;

import java.sql.*;

public class ConnectionManager {
	
	static Connection con;
	
	public static Connection getConnection()
	{
		try
		{
			String url = "jdbc:mysql://arlia.computing.dundee.ac.uk/";
			String dbName = "candicestewart";
			String uname = "CandiceStewart";
			String pwd = "ac31004";
			
			Class.forName("com.mysql.jbdc.Driver");
			try
			{
				con = DriverManager.getConnection(url+dbName,uname,pwd);
			}
			catch (SQLException ex)
			{
				ex.printStackTrace();
			}
		}
		catch(ClassNotFoundException e)
		{
			System.out.println(e);
		}
		return con;
	}

}
