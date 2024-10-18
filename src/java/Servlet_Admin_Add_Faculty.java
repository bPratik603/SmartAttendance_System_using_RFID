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
public class Servlet_Admin_Add_Faculty extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String Faculty_id = req.getParameter("txt_id");
        String Name = req.getParameter("txt_Name");
        String DOB = req.getParameter("txt_DOB");
        String Contact = req.getParameter("txt_Contact");
        String Email = req.getParameter("txt_Email");
        String Gender = req.getParameter("txt_Gender");
        String Subject = req.getParameter("txt_Subject");
        String Category = req.getParameter("txt_Category");
        String Address = req.getParameter("txt_Address");
        String event = req.getParameter("btn");
       
        
        out.println(Name);
        out.println(DOB);
        out.println(Contact);
        out.println(Email);
        out.println(Gender);
        out.println(Subject);
        out.println(Category);
        out.println(Address);
        
        Database db = new Database();
        out.println(db.ConnectDB());
        
        if(event.equals("ADD"))
        {
            String insert = db.Query("insert into Add_Faculty(Name,DOB,Contact,Email,Gender,Subject,Category,Address)values('"+Name+"','"+DOB+"','"+Contact+"','"+Email+"','"+Gender+"','"+Subject+"','"+Category+"','"+Address+"')", "Faculty Record Inserted");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_View_Faculty.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("VIEW"))
        {
            
           String insert = db.Query("select * from Add_Faculty where Faculty_id='"+Faculty_id+"'", "Record Selected");
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Admin_Faculty_Profile.jsp';");
            out.println("</script>");
        }
        
         if(event.equals("View"))
        {
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Admin_View_Faculty.jsp';");
            out.println("</script>");
        }
        if(event.equals("UPDATE"))
        {
            
            
            String insert = db.Query("update add_faculty set Name='"+Name+"',DOB='"+DOB+"',Contact='"+Contact+"',Email='"+Email+"',Gender='"+Gender+"',Subject='"+Subject+"',Category='"+Category+"',Address='"+Address+"'  where Faculty_id='"+Faculty_id+"'", "Faculty Details Updated Successfully...");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_View_Faculty.jsp';");
            out.println("</script>");
        
        }   
        
        
        
        if(event.equals("DELETE"))
        {
            
            
            String insert = db.Query("delete from add_faculty where Faculty_id='"+Faculty_id+"'", "Faculty Deleted Successfully");
            out.println(insert);
            
             resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_View_Faculty.jsp';");
            out.println("</script>");
            
        }
    }
   
}