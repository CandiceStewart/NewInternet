package servlets;

import java.sql.*;

public class Rquery {
	static Connection currentCon = null;
	public static Bean2 report(Bean2 bean)
	{
		Statement st = null;
		String f_type = bean.getFaultType();
		String f_title = bean.getFaultTitle();
		String f_detail = bean.getFaultDetail();
		String enterQ = "insert into faults(f_type, f_title, f_detail) values ('"+f_type+"','"+f_title+"','"+f_detail+"')";
	
		try
		{
			currentCon = ConnectionManager.getConnection();
			st = currentCon.createStatement();
			
			int i = st.executeUpdate(enterQ);
			if(i!=0)
			{
				System.out.println("Record has been added");
			}
			else
			{
				System.out.println("failed to add data");
			}
		}
		catch (Exception e){  
		    System.out.println(e);  
		  } 
		return bean;
	}

}
