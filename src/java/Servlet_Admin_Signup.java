/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author bhosa
 */
public class Servlet_Admin_Signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
     PrintWriter out = resp.getWriter();
        
        String Name = req.getParameter("txt_Name");
        String Password = req.getParameter("txt_Password");
        String Gender = req.getParameter("txt_Gender");
        String Address = req.getParameter("txt_Address");
        String DOB = req.getParameter("txt_DOB");
        String Contact = req.getParameter("txt_Contact");
        String Email = req.getParameter("txt_Email");
        String event = req.getParameter("btn");
        String Admin_id = req.getParameter("txt_id");
        
        out.println(Name);
        out.println(Password);
        out.println(Gender);
        out.println(Address);
        out.println(DOB);
        out.println(Contact);
        out.println(Email);
                
        Database db = new Database();
        out.println(db.ConnectDB());
        
        if(event.equals("Signup"))
        {
            String insert = db.Query("insert into Admin_Signup(Name,Password,Gender,Address,DOB,Contact_Number,Email_Address)values('"+Name+"','"+Password+"','"+Gender+"','"+Address+"','"+DOB+"','"+Contact+"','"+Email+"')", "Record Inserted");
            out.println(insert);
            
             resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_login.jsp';");
            out.println("</script>");
        }
        
       
        
        if(event.equals("Login"))
        {
          String insert = db.Query("select * from Student_Signup where Student_Signup_id='"+Admin_id+"'", "Record Selected");
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Student_options.jsp';");
            out.println("</script>");
        }
       
    }

   
}
