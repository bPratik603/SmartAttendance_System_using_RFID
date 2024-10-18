/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.org.apache.bcel.internal.generic.GOTO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author bhosa
 */
public class Servlet_Student_Login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        PrintWriter out = resp.getWriter();
        
        String email = req.getParameter("txt_Email");
        String password = req.getParameter("txt_Password");
        String event = req.getParameter("btn");
        HttpSession session=req.getSession();
      out.println(email);
      out.println(password);
      
       Database db = new Database();
        out.println(db.ConnectDB());
        
      
      	Connection cn=null;
        Statement st = null;
        if(event.equals("Login"))
        {
            try
            {
                Class.forName("com.mysql.jdbc.Driver");
                cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
                st=cn.createStatement();
                String sql="select * from student_Signup where Student_Email_id='"+email+"' and Password='"+password+"'";
                ResultSet rs=st.executeQuery(sql);
                if(rs.next())
                {
                    
                    session.setAttribute("stud_id", rs.getString("Student_Signup_id"));
                    session.setAttribute("stud_Name", rs.getString("Name"));
                    session.setAttribute("stud_Address", rs.getString("Address"));
                    session.setAttribute("stud_Contact_Number",rs.getString("Student_Contact_Number"));
                    session.setAttribute("stud_Parants_Number",rs.getString("Parants_Contact_Number"));
                    session.setAttribute("stud_DOB", rs.getString("DOB"));
                    session.setAttribute("stud_Gender",rs.getString("Gender"));
                    session.setAttribute("stud_Email",rs.getString("Student_Email_id"));
                    session.setAttribute("stud_Parants_Email",rs.getString("Parants_Email_id"));
                    session.setAttribute("stud_Blood_Group",rs.getString("Blood_Group"));
                    session.setAttribute("stud_Branch",rs.getString("Branch"));
                    session.setAttribute("stud_Year", rs.getString("Year"));
                    session.setAttribute("stud_Division",rs.getString("Division"));
                    session.setAttribute("stud_barcode_id",rs.getString("stud_barcode_id"));
                    resp.sendRedirect("Student_options.jsp");
                }
                else
                {
                  String insert = "Login Failed";
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Student_login.jsp';");
            out.println("</script>");
                }
                
            }catch(Exception ex)
            {
                out.println(ex.toString());
            }
        }
      
    }

    
}
