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
public class Servlet_Student_Signup extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String Student_id = req.getParameter("txt_id");
        String Name = req.getParameter("txt_Name");
        String Password = req.getParameter("txt_Password");
        String Address = req.getParameter("txt_Address");
        String S_Contact = req.getParameter("txt_S_Contact");
        String P_Contact = req.getParameter("txt_P_Contact");
         String DOB = req.getParameter("txt_DOB");
        String Gender = req.getParameter("txt_Gender");
        String S_Email = req.getParameter("txt_S_Email");
        String P_Email = req.getParameter("txt_P_Email");
        String BGroup = req.getParameter("txt_BGroup");
        String Branch = req.getParameter("txt_Branch");
        String Year = req.getParameter("txt_Year");
        String Division = req.getParameter("txt_Division");
        String event = req.getParameter("btn");
        
        //String event1 = req.getParameter("btn1");
       
        
        out.println(Name);
        out.println(Password);
        out.println(Address);
         out.println(S_Contact);
         out.println(P_Contact);
         out.println(DOB);
         out.println(Gender);
         out.println(S_Email);
         out.println(P_Email);
         out.println(BGroup);
         out.println(Branch);
         out.println(Year);
         out.println(Division);
      
        
        
              
        Database db = new Database();
        out.println(db.ConnectDB());
        
        if(event.equals("Signup"))
        {
            
               String insert = db.Query("insert into Student_Signup(Name,Password,Address,Student_Contact_Number,Parants_Contact_Number,DOB,Gender,Student_Email_id,Parants_Email_id,Blood_Group,Branch,Year,Division,stud_barcode_id)values('"+Name+"','"+Password+"','"+Address+"','"+S_Contact+"','"+P_Contact+"','"+DOB+"','"+Gender+"','"+S_Email+"','"+P_Email+"','"+BGroup+"','"+Branch+"','"+Year+"','"+Division+"','"+Student_id+"')","Record Inserted");
               out.println(insert);
               
              resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Student_login.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("Login"))
        {
          String insert = db.Query("select * from Student_Signup where Student_Signup_id='"+Student_id+"'", "Record Selected");
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Student_options.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("DELETE"))
        {
            
            
            String insert = db.Query("delete from Student_signup where Student_Signup_id='"+Student_id+"'", "Record Deleted Successfully...");
            out.println(insert);
            
             resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_view_Student_Details.jsp';");
            out.println("</script>");
            
        }
        
        if(event.equals("VIEW"))
        {
            
          String insert = db.Query("select * from Student_Signup where Student_Signup_id='"+Student_id+"'", "Record Selected");
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Admin_Student_Profile.jsp';");
            out.println("</script>");
        }
        if(event.equals("UPDATE"))
        {
            
            String insert = db.Query("update  Student_Signup set Name='"+Name+"',Address='"+Address+"',Student_Contact_Number='"+S_Contact+"',Parants_Contact_Number='"+P_Contact+"',DOB='"+DOB+"',Gender='"+Gender+"',Student_Email_id='"+S_Email+"',Parants_Email_id='"+P_Email+"',Blood_Group='"+BGroup+"',Branch='"+Branch+"',Year='"+Year+"',Division='"+Division+"'  where Student_Signup_id='"+Student_id+"'", "Record Updated Successfully...");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_view_Student_Details.jsp';");
            out.println("</script>");
            
        
        }   
        
         if(event.equals("UPGRADE"))
        {
            
            
            String insert = db.Query("update  Student_Signup set Name='"+Name+"',Address='"+Address+"',Student_Contact_Number='"+S_Contact+"',Parants_Contact_Number='"+P_Contact+"',DOB='"+DOB+"',Gender='"+Gender+"',Student_Email_id='"+S_Email+"',Parants_Email_id='"+P_Email+"',Blood_Group='"+BGroup+"',Branch='"+Branch+"',Year='"+Year+"',Division='"+Division+"'  where Student_Signup_id='"+Student_id+"'", "Record Updated Successfully...");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Student_options.jsp';");
            out.println("</script>");
        
        }   
        
        
        
        
        
        
    }
}
