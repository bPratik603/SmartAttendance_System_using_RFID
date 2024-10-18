package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Student_005foptions_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Admin options</title>\n");
      out.write("        <style>\n");
      out.write("           body{\n");
      out.write("  font-family: 'Nunito', sans-serif;\n");
      out.write("  padding: 50px;\n");
      out.write("  background-image:url(web_images/A_4.jpg);\n");
      out.write("  background-size: cover;\n");
      out.write("background-repeat: no-repeat;\n");
      out.write("}\n");
      out.write(".card{\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);\n");
      out.write("      transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);\n");
      out.write("  padding: 14px 80px 80px 36px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 10%;\n");
      out.write("  \n");
      out.write("  float: left;\n");
      out.write("  margin-left: 10%;\n");
      out.write("  margin-top:15%;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card:hover{\n");
      out.write("     transform: scale(1.05);\n");
      out.write("  box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card h3{\n");
      out.write("  font-weight: 600;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card img{\n");
      out.write("  position: absolute;\n");
      out.write("  top: 20px;\n");
      out.write("  right: 15px;\n");
      out.write("  max-height: 120px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".card1{\n");
      out.write("    border-radius: 4px;\n");
      out.write("    background: #fff;\n");
      out.write("    box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);\n");
      out.write("      transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);\n");
      out.write("  padding: 14px 80px 80px 36px;\n");
      out.write("  cursor: pointer;\n");
      out.write("  width: 10%;\n");
      out.write("  \n");
      out.write("  float: left;\n");
      out.write("  margin-left: 38%;\n");
      out.write("  margin-top:10%;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("\n");
      out.write(".card1:hover{\n");
      out.write("     transform: scale(1.05);\n");
      out.write("  box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);\n");
      out.write("}\n");
      out.write(".card-1{\n");
      out.write("  background-image: url(web_images/L_1.png);\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("    background-position: right;\n");
      out.write("    background-size: 150px;\n");
      out.write("    \n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".card-2{\n");
      out.write("   background-image: url(https://ionicframework.com/img/getting-started/theming-card.png);\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("    background-position: right;\n");
      out.write("    background-size: 80px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write(".card-3{\n");
      out.write("   background-image: url(web_images/L_6.png);\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("    background-position: right;\n");
      out.write("    background-size: 100px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".card1-1{\n");
      out.write("   background-image: url(web_images/L_4.png);\n");
      out.write("      background-repeat: no-repeat;\n");
      out.write("    background-position: right;\n");
      out.write("    background-size: 100px;\n");
      out.write("}\n");
      out.write("@media(max-width: 990px){\n");
      out.write("  .card{\n");
      out.write("    margin: 20px;\n");
      out.write("  }\n");
      out.write("} \n");
      out.write("\n");
      out.write("a{\n");
      out.write("    color:black;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("  <div class=\"row\">\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("       <a href=\"Admin_Select_Student_Details.jsp\">\n");
      out.write("      <div class=\"card card-1\">\n");
      out.write("          <img href='url(web_images/L_1.png)'>\n");
      out.write("        <h2>Profile</h2>\n");
      out.write("        \n");
      out.write("      </div>\n");
      out.write("       </a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("       </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("        \n");
      out.write("      <div class=\"card card-2\">\n");
      out.write("        <h2>Attendance</h2>\n");
      out.write("      </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("   <div class=\"col-md-4\">\n");
      out.write("        <a href='Student_view_timetable.jsp'>\n");
      out.write("      <div class=\"card card-3\">\n");
      out.write("          <h2>Time Table  </h2>\n");
      out.write("      </div>\n");
      out.write("          </a>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"col-md-4\">\n");
      out.write("        <a href='Student_login.jsp'>\n");
      out.write("      <div class=\"card1 card1-1\">\n");
      out.write("          <h2>Back  </h2>\n");
      out.write("      </div>\n");
      out.write("          </a>\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("  </div>\n");
      out.write("</div>     \n");
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
