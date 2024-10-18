/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bhosa
 */
public class Servlet_Admin_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter out=resp.getWriter();
      
      String email=req.getParameter("txt_email");
      String password=req.getParameter("password");
      String event=req.getParameter("btn");
      
      
      out.println(email);
      out.println(password);
      
      	 Connection cn=null;
        Statement st=null;
        if(event.equals("Login"))
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
                st=cn.createStatement();
                String sql="select * from admin_signup where email_address='"+email+"' and password='"+password+"'";
                ResultSet rs=st.executeQuery(sql);
                if(rs.next())
                {
                    resp.sendRedirect("Admin_options.jsp");
                }
                else
                {
                    String insert = "Login Failed";
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_login.jsp';");
            out.println("</script>");
                }
                
            }catch(Exception ex)
            {
                out.println(ex.toString());
            }
        }
     
     
    }
  
}