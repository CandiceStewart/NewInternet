package servlets;

import java.io.*;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;

/**
 * Servlet implementation class Fault
 */
@WebServlet("/Fault")
public class Fault extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static java.sql.Connection currentCon = null;
	static ResultSet rs = null;
	static Statement st = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fault() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
			doPost(request, response);		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  String query = "select (f_type, f_title, f_detail, f_status, f_fix_detail) from faults";
		  try {
			  currentCon = ConnectionManager.getConnection();
			  st=currentCon.createStatement();
			  rs = st.executeQuery(query);		 
		  }
			catch (Throwable exc)
			{
				System.out.println(exc);
			}
		   
		 }
	}

}
