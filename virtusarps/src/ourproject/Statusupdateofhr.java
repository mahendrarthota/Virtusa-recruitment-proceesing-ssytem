package ourproject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Statusupdateofhr")
public class Statusupdateofhr extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher disp=null;
		PrintWriter out=response.getWriter();
		int rowsaffected=0;
		String emphrstatus=request.getParameter("hrstatus");
		String empidhr=request.getParameter("adminsubmittedid");
		String hrcomments=request.getParameter("hrcomment");
		String sql="insert into adminstatus values where employeeid=?";
		try (
				Connection conn=Dbutils.buildConnection();
				PreparedStatement pst=conn.prepareStatement(sql);	
				
			)

		{
				pst.setString(1, empidhr);
				pst.setString(2,emphrstatus);
				
				rowsaffected=pst.executeUpdate();
				out.println("<h2 style='align:center;'> succesfully Submitted</h2>");
		}
		catch(Exception e)
		{
			out.println(rowsaffected  +"You cannot do this action    "+e);
			
		
		
	}


	}

	
}
