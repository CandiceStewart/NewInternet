package servlets;


import java.sql.*;

public class Iquery {
	static Connection currentConn = null;
	public static Bean register(Bean bean)
	{
	Statement st = null;
	String username = bean.getUsername();
	String password = bean.getPassword();
	String lastname = bean.getLastName();
	String firstname = bean.getFirstName();
	String inputQuery = "insert into users(uname, password, firstName, lastName) values('"+username+"','"+password+"','"+firstname+"','"+lastname+"')";
	
	try
	{
		currentConn = ConnectionManager.getConnection();
		st = currentConn.createStatement();
				
	    int i = st.executeUpdate(inputQuery);  
	    if(i!=0){  
	    	System.out.println("Record has been inserted");  
        

	    }  
	    else
	    {  
	    	System.out.println("failed to insert the data");  
     }  
  }  
	catch (Exception e){  
    System.out.println(e);  
  } 
return bean;	
}
}
