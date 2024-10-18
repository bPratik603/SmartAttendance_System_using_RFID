package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Student_005fAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Student_details</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                \n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write(".Title{\n");
      out.write("    width:60.5%;\n");
      out.write("    height: 70px;\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    background-color: lightcoral;\n");
      out.write("    \n");
      out.write("    align-items: center;\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding-left: 40%;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    a{\n");
      out.write("    font-size: 17px;\n");
      out.write("    font-family: Arial;\n");
      out.write("    line-height: 1.5rem;\n");
      out.write("    color:blue;\n");
      out.write("    padding-left: 3%;\n");
      out.write("    line-height: 1.5;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write(".btn2{\n");
      out.write("    width: 5%;\n");
      out.write("    margin-left: 1%;\n");
      out.write("    background-color: gold;\n");
      out.write("    margin-top: 0.2rem;\n");
      out.write("    margin-bottom: 1rem;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\t\n");
      out.write("\tborder: solid;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\t\n");
      out.write("\tbackground-color: gold;\n");
      out.write("\ttransition: .3s;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn2:hover{\n");
      out.write("\t\n");
      out.write("        background-color: yellow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{\n");
      out.write("  \n");
      out.write("    height: 300px;\n");
      out.write("    width: 100%;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("table th{\n");
      out.write("    background-color:yellow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td{\n");
      out.write("    background-color:lightyellow;\n");
      out.write("    padding-left: 5%;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("        <div class=\"Title\">\n");
      out.write("            <h1 style=\"margin-top: 0px;padding-top: 10px\"><b>Student Attendance</b></h1>\n");
      out.write("           \n");
      out.write("        </div>\n");
      out.write("        <h2><b>Student list:</b></h2>\n");
      out.write("        <input type=\"button\" class='btn2' value=\"Back\" onclick=\"window.window.location.href='Admin_Select_Student_Attendance.jsp'\"><br>\n");
      out.write("        <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Roll.no.</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Date</th>\n");
      out.write("                <th>In Time</th>\n");
      out.write("                <th>Out Time</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("           ");

      Connection cn=null;
      Statement st=null;
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_Student_Attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from Attendance";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(rs.getString("Attendance_id"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString("Name"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString("Date"));
      out.write("</td>\n");
      out.write("                  \n");
      out.write("                   <td>");
      out.print(rs.getString("In_Time"));
      out.write("</td>\n");
      out.write("                   <td>");
      out.print(rs.getString("out_Time"));
      out.write("</td>\n");
      out.write("                   \n");
      out.write("                   <td>");
      out.print(rs.getString("Status"));
      out.write("</td>\n");
      out.write("                    \n");
      out.write("                  \n");
      out.write("                     \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               ");

           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      
      out.write("\n");
      out.write("            \n");
      out.write("        </table>   \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
