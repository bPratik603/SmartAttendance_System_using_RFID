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
public class Servlet_Student_Recover_Password extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      PrintWriter out = resp.getWriter();
        
        String new_Pass = req.getParameter("txt_N_Password");
        String old_Pass = req.getParameter("txt_O_Password");
    
        out.println(new_Pass);
        out.println(old_Pass);
        
        Database db = new Database();
        
        out.println(db.ConnectDB());
    }

    
}
