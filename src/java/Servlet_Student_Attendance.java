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
public class Servlet_Student_Attendance extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       PrintWriter out = resp.getWriter();
       
       String Name = req.getParameter("txt_Name");
       String Date = req.getParameter("txt_Date");
       String InTime = req.getParameter("txt_InTime");
       String OutTime = req.getParameter("txt_OutTime");
       String Status = req.getParameter("txt_Status");
               
       out.println(Name);
       out.println(Date);
       out.println(InTime);
       out.println(OutTime);
       out.println(Status);
       
       Database db = new Database();
       out.println(db.ConnectDB());
       
       
    }

}
