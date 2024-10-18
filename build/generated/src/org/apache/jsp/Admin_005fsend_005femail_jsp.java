package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Admin_005fsend_005femail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin send email</title>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(web_images/E_5.png);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("                color:black;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("\n");
      out.write("         \n");
      out.write("\n");
      out.write("\n");
      out.write(".Title{\n");
      out.write("    widht:100%;\n");
      out.write("    height: 70px;\n");
      out.write("   \n");
      out.write("    background-color: graytext;\n");
      out.write("    \n");
      out.write("    align-items: center;\n");
      out.write("    font-size: 20px;\n");
      out.write("    padding-left: 40%;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".email{\n");
      out.write("    height: 400px;\n");
      out.write("    width: 70%;\n");
      out.write("    background-color: transparent;\n");
      out.write("  \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn{\n");
      out.write("\tmargin-top: 11.0rem;\n");
      out.write("        \n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 15%;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbox-shadow: 0 5px 5px black;\n");
      out.write("\tbackground-color: gold;\n");
      out.write("\ttransition: .3s;\n");
      out.write("\tcursor: pointer;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn:hover{\n");
      out.write("\tbackground-color: yellow;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("a{\n");
      out.write("    font-size: 17px;\n");
      out.write("    font-family: Arial;\n");
      out.write("    line-height: 1.8rem;\n");
      out.write("    color:blue;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table{\n");
      out.write("  margin-top: 5%;\n");
      out.write("    \n");
      out.write("   \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("table th{\n");
      out.write("    background-color:yellow;\n");
      out.write("}\n");
      out.write("\n");
      out.write("table td{\n");
      out.write("    background-color:silver;\n");
      out.write("   \n");
      out.write("   \n");
      out.write("}\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action =\"mailto:\" method=\"Post\">\n");
      out.write("            <div class=\"Title\">\n");
      out.write("             <h1 style=\"margin-top: 0px;padding-top: 10px;\"><b>Students Email</b></h1>\n");
      out.write("             <input class=\"btn\"type=\"submit\" value=\"Send To\" />\n");
      out.write("             <input class=\"btn\"type=\"button\" value=\"back\" onclick=\"window.window.location.href='Admin_Select_Email.jsp'\"><br>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"email\">\n");
      out.write("                <table border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Student ID</th>\n");
      out.write("                <th>Name</th>\n");
      out.write("                <th colspan=\"2\">Select</th>\n");
      out.write("            </tr>\n");
      out.write("            <tbody>\n");
      out.write("                ");

      Connection cn=null;
      Statement st=null;
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from Student_Signup";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                   <td>");
      out.print(rs.getString("Student_Signup_id"));
      out.write(" </td>\n");
      out.write("                   <td> <input type=\"text\" name=\"txt_Name\" value=\"");
      out.print(rs.getString("name"));
      out.write("\"/> </td>\n");
      out.write("                   \n");
      out.write("                   <td><input type='submit' name=\"btn\" value=\"DELETE\"  class=\"btn btn-block \"  style=\"background-color: red; color:white; font-weight: bold\"  /></td>  \n");
      out.write("               </tr>\n");
      out.write("               \n");
      out.write("               ");

           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      
      out.write("\n");
      out.write("            </tbody>   \n");
      out.write("            \n");
      out.write("        </table>         \n");
      out.write("            </div\n");
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
