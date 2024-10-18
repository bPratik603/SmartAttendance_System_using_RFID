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
public class Servlet_Admin_Select_Student_Attendance extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter out = resp.getWriter();
        
        String Branch = req.getParameter("txt_Branch");
        String Year = req.getParameter("txt_Year");
        String Division = req.getParameter("txt_Division");
        String event = req.getParameter("btn");   
        HttpSession session = req.getSession();
        
        out.println(Branch);
        out.println(Year);
        out.println(Division);
        
        Database db = new Database();
        out.println(db.ConnectDB());
        
      
        if(event.equals("View"))
        {
             session.setAttribute("Branch", Branch);
             session.setAttribute("Year",Year);
             session.setAttribute("Division", Division);
             resp.sendRedirect("Student_Attendance.jsp");
        }
    }
   
}