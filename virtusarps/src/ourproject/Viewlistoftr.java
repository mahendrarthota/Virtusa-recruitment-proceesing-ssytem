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


@WebServlet("/Viewlistoftr")
public class Viewlistoftr extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		
		out.println("<html><head><title></title></head>");
	     out.println("<body bgcolor='#j784y' background='images/apply.png'>");
	    out.println("<form action='Statusupdateoftr'>");
	     String qry = "SELECT * from adminstatus";
	     try (
					Connection conn=Dbutils.buildConnection();
					Statement stmt = conn.createStatement();
					ResultSet rs = stmt.executeQuery(qry);
	    		 )
				{
			while(rs.next())
			{
				
				 String empid2=rs.getString(1);
		     		String status2=rs.getString(2);
		     		String comments2=rs.getString(3);
		     		out.println("<font align='center'>");
		   	    out.println("<table border=' ' border='1' cellspacing='1' cellpadding=2' width='1350'>");
		   	    out.println("<tr>");
		   	 
		   	 out.println("<td>" +empid2+  "</td>");
		   	 out.println("<td>"+status2+"</td>");
		   	out.println("<td>"+comments2+"</td>");

out.println("<td>");

 out.println("<input type='radio' name='trstatus' value='tohr' checked/>"+"forward to nextlevel");
 out.println("</td>");

out.println("<td>");
 out.println("<input type='radio' name='trstatus' value='canceled'/>applicant cancled");
 out.println("</td>");
 out.println("<td>");
 out.println(" Employee Id:  <input type='text' name='adminsubmittedid' required  value="+empid2+" / >");
 out.println("</td>");
 out.println("<td>");
 out.println("<textarea rows='5' cols='50' name='trcomment' placeholder='Comments please'></textarea>");
 out.println("</td >");
 out.println("<td>"); 
 
 out.println("<input type='submit' value='submit' />");
 
 out.println("</td>");
 
              out.println("</font>");
              out.println("</form>");
out.println("</body>");
out.println("<html>");
}


}
catch(Exception e) {
out.println("Error here: " + e.getMessage());
}

	}


	}


