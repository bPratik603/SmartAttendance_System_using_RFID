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
public class Servlet_Admin_Add_Branch extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String Branch_id = req.getParameter("txt_id");
        String Branch_Name = req.getParameter("txt_Branch");
        String HOD_Name = req.getParameter("txt_HOD_Name");
        String Branch_Full_Form = req.getParameter("txt_Branch_Full_Form");
        String event = req.getParameter("btn");
        
        out.println(Branch_Name);
        out.println(HOD_Name);
        out.println(Branch_Full_Form);
        
        Database db = new Database();
        out.println(db.ConnectDB());
        
        if(event.equals("Add"))
        {
            String insert = db.Query("insert into Add_Branch(Branch_Name,Branch_HOD_Name,Branch_Full_Form)values('"+Branch_Name+"','"+HOD_Name+"','"+Branch_Full_Form+"')", "Branch Record Inserted");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_Add_Branch.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("View"))
        {
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
           
            out.println("location='Admin_View_Branch.jsp';");
            out.println("</script>");
        }
        if(event.equals("UPDATE"))
        {
           
           String insert = db.Query("update add_branch set Branch_Name='"+Branch_Name+"',Branch_HOD_Name='"+HOD_Name+"',Branch_Full_Form='"+Branch_Full_Form+"' where Branch_id='"+Branch_id+"'","Branch Record Updated Successfully..." );
           out.println(insert);
           
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_View_Branch.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("DELETE"))
        {
            
            
            String insert = db.Query("delete from add_branch where Branch_id='"+Branch_id+"'","Branch Record Deleted Successfully..." );
             out.println(insert);
            
           out.println(insert);
             resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_View_Branch.jsp';");
            out.println("</script>");
        }
    }

    
}