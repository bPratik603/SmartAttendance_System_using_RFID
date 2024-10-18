package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fSelect_005fStudent_005fAttendance_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Select TimeTable</title>\n");
      out.write("         <style>\n");
      out.write("            *{\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground: url(web_images/A_13.webp);\n");
      out.write("\tbackground-size: cover;\n");
      out.write("\tbackground-repeat: no-repeat;\n");
      out.write("\tbackground-position: center;\n");
      out.write("\theight: 100vh;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tmargin-left: 600px;\n");
      out.write("    \n");
      out.write("        height: 400px;\n");
      out.write("        width: 400px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner{\n");
      out.write("\theight: 400px;\n");
      out.write("\twidth: 450px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".form-container{\n");
      out.write("\twidth: 450px;\n");
      out.write("\theight: 400px;\n");
      out.write("\tbackground-color: transparent;\n");
      out.write("\tdisplay: flex;\n");
      out.write("        margin-right: 30%;\n");
      out.write("\tflex-direction: column;\n");
      out.write("        margin-top:20%;\n");
      out.write("        margin-bottom: 5rem;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        line-height: 0.5rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tmargin-top: 1rem;\n");
      out.write("\tmargin-right:4rem;\n");
      out.write("        color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("select{\n");
      out.write("        margin-top: 1rem;\n");
      out.write("\theight: 2.5rem;\n");
      out.write("\twidth: 70%;\n");
      out.write("\tborder: solid;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 50px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("        font-family: Rockwell;\n");
      out.write("\t\n");
      out.write("\tbackground-color: pink;\n");
      out.write("\ttransition: .3s;\n");
      out.write("\tcursor: pointer;\n");
      out.write("        text-align: center;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(".btn{margin-top: 1rem;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 30%;\n");
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
      out.write(".btn:hover{\n");
      out.write("\tbackground-color: yellow;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("@media only screen and (max-width: 700px){\n");
      out.write("\n");
      out.write("\tbody{\n");
      out.write("\t\theight: 100%;\n");
      out.write("\t}\n");
      out.write("\t.container{\n");
      out.write("\t\tmargin: 2rem 0;\n");
      out.write("\t\tflex-direction: column;\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn2{\n");
      out.write("    width: 10%;\n");
      out.write("    margin-left: 1%;\n");
      out.write("    background-color: gold;\n");
      out.write("    margin-top: 0.2rem;\n");
      out.write("   \n");
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
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Servlet_Admin_Select_Student_Attendance\" method=\"post\">\n");
      out.write("        <input type=\"button\" class='btn2' value=\"Back\" onclick=\"window.window.location.href='Admin_options.jsp'\"><br>\n");
      out.write("        <div class=\"container\">\n");
      out.write("           <div class='form-container'> \n");
      out.write("               <label><b>Branch:</b></label>\n");
      out.write("        <select name='txt_Branch' >\n");
      out.write("            <option>Bsc Chemistry</option>\n");
      out.write("            <option>Bsc CS</option>\n");
      out.write("            <option>Bsc CS Entire</option>\n");
      out.write("            <option>BA</option>\n");
      out.write("            <option>BCom</option>\n");
      out.write("            <option>BBA</option>\n");
      out.write("            <option>BCA</option>\n");
      out.write("        </select><br>\n");
      out.write("        <label><b>Year: </b></label>\n");
      out.write("        <select name='txt_Year'>\n");
      out.write("            <option>First year</option>\n");
      out.write("            <option>Second year</option>\n");
      out.write("            <option>Third year</option>\n");
      out.write("        </select>\n");
      out.write("        <label><b>Division: </b></label>\n");
      out.write("        <select name='txt_Division'>\n");
      out.write("            <option>A</option>\n");
      out.write("            <option>B</option>\n");
      out.write("            <option>C</option>\n");
      out.write("            <option>D</option>\n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input type=\"submit\" class='btn' value=\"view\" name=\"btn\">\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
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
