package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Viewlist
 */
@WebServlet("/Viewlist")
public class Viewlist extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='#f6567' background='images/apply.png'>");
	     String qry = "select employeeid,status,review from adminstatus";
	     try (
					Connection conn=Dbutils.buildConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(qry);
	    		
	    		 )
				{
	    	while(rs.next())
			{
	
				 String empid3=rs.getString(1);
		     		String status3=rs.getString(2);
		     		String comnt=rs.getString(3);
		     		out.println("<font align='center'>");
		   	  
		   	  out.println("<table align='center' border='1' cellspacing='1' cellpadding=2' width='500'>");
		   	  
		   	  out.println("<tr>");
		   	  out.println("<td><h2>"+"Emp Id:"+"</h2>"+"<h3>"+empid3+"</h3></td>");
		   	  out.println("<td><h2>"+"Emp Status:"+"</h2>"+"<h3>"+status3+"</h3></td>");
		   	  out.println("<td><h2>"+"Emp Review:"+"</h2>"+"<h3>"+comnt+"</h3></td>");
		   	  out.println("</tr>");
		   	  out.println("</table>");
	          out.print("</h2>");
              out.println("</font>");
              		out.println("</body></html>");

}


}
catch(Exception e) {
out.println("Error here: " + e.getMessage());
}
	}

	
}
