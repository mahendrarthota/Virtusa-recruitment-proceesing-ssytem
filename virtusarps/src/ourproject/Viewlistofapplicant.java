package ourproject;

import java.sql.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewlistofapplicant
 */
@WebServlet("/Viewlistofapplicant")
public class Viewlistofapplicant extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='#f6567'background='images/apply.png'>");
	    out.println("<form action='Emprecordview'>");
	     String qry = "SELECT employeeid,Firstname,Lastname from applicationtable";
	     try (
					Connection conn=Dbutils.buildConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(qry);
	    		 )
				{
			while(rs.next())
			{
				
				 String empid=rs.getString(1);
		     		String fname=rs.getString(2);
		     		String lname=rs.getString(3);
		     		out.println("<font align='center'>");
		     		out.println("<table align='center' border='1' cellpadding='15' width='500'>");
		     		out.println("<tr>");
		   	     out.println("<h2>");
		   	  out.println("<td>" +"<h3>"+ empid +"       "+fname+"        "+lname+"</h3> </td>");
	  out.print("<td><button type='submit' name='wanted' value="+empid+">Click to UpdateStatus</botton></td>");
	             out.print("</h2>");
		     		out.println("</tr>");
		     		out.println("</table>");
              out.println("</font>");
              out.println("</form>");
out.println("</body>");
}


}
catch(Exception e) {
out.println("Error here: " + e.getMessage());
}

	}

}
