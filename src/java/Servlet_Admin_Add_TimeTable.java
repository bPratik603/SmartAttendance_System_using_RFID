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
import javax.servlet.http.HttpSession;

/**
 *
 * @author bhosa
 */
public class Servlet_Admin_Add_TimeTable extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        String TimeTable_id= req.getParameter("txt_id");
        String Time = req.getParameter("txt_Time");
        String Mon = req.getParameter("txt_Mon");
        String Tue = req.getParameter("txt_Tue");
        String Wed = req.getParameter("txt_Wed");
        String Thu = req.getParameter("txt_Thu");
        String Fri = req.getParameter("txt_Fri");
        String Sat = req.getParameter("txt_Sat");
        String event = req.getParameter("btn");
        
        out.println(Time);
        out.println(Mon);
        out.println(Tue);
        out.println(Wed);
        out.println(Thu);
        out.println(Fri);
        out.println(Sat);
        HttpSession session=req.getSession();
        Database db = new Database();
        out.println(db.ConnectDB()); 
       
         
        if(event.equals("Add"))
        {
            String insert = db.Query("insert into add_timetable(Time,Mon,Tue,Wed,Thu,Fri,Sat,Branch,Year,Division)values('"+Time+"','"+Mon+"','"+Tue+"','"+Wed+"','"+Thu+"','"+Fri+"','"+Sat+"','"+session.getAttribute("Branch")+"','"+session.getAttribute("Year")+"','"+session.getAttribute("Division")+"')", "Record Inserted");
            out.println(insert);
            
             resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_Add_TimeTable.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("UPDATE"))
        {
           
            
            String insert = db.Query("update add_timetable set Time='"+Time+"',Mon='"+Mon+"',Tue='"+Tue+"',Wed='"+Wed+"',Thu='"+Thu+"',Fri='"+Fri+"',Sat='"+Sat+"' where Add_timetable_id='"+TimeTable_id+"'", "TimeTable Updated Successfully");
          out.println(insert);
           resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_view_timetable.jsp';");
            out.println("</script>");
        }
        
        if(event.equals("DELETE"))
        {
           
            
            String insert = db.Query("delete from add_timetable where add_timetable_id='"+TimeTable_id+"'", "Record Deleted Successfully");
            out.println(insert);
            
            resp.setContentType("text/html");
            out.println("<script type=\"text/javascript\">");
            out.println("alert('"+insert+"');");
            out.println("location='Admin_view_timetable.jsp';");
            out.println("</script>");
        }
        }
    }

    
