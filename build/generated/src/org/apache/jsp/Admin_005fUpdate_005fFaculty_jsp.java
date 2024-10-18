package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fUpdate_005fFaculty_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Update Faculty</title>\n");
      out.write("        <script src='validation.js'></script>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground: url(web_images/bg.jpg);\n");
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
      out.write("\tbox-shadow: 0 0 40px skyblue;\n");
      out.write("        height: 665px;\n");
      out.write("        width: 600px;\n");
      out.write("        margin-left: 73%;\n");
      out.write("        margin-top:3%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner{\n");
      out.write("\theight: 400px;\n");
      out.write("\twidth: 450px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner img{\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container{\n");
      out.write("\twidth: 600px;\n");
      out.write("\theight: 665px;\n");
      out.write("\tbackground-color: lightyellow;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        line-height: 0.3rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container h2{\n");
      out.write("\tmargin-top: 1.0rem;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-size: 28px;\n");
      out.write("        color: black;\n");
      out.write("        padding-left: 7%;\n");
      out.write("        padding-bottom: 2%;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container form{\n");
      out.write("\twidth: 80%;\n");
      out.write("\tmargin-top: 2rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tmargin-top: 1rem;\n");
      out.write("\tmargin-left: 0.3rem;\n");
      out.write("        color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control{\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 70%;\n");
      out.write("\theight: 2.3rem;\n");
      out.write("\tpadding: 0 .5rem;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: orange;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".select1{\n");
      out.write("    display: block;\n");
      out.write("\twidth: 60%;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\tpadding: 0 .5rem;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: orange;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: solid;\n");
      out.write("}\n");
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
      out.write("textarea{\n");
      out.write("    display: block;\n");
      out.write("\twidth: 70%;\n");
      out.write("\t\n");
      out.write("\tpadding: 0 .5rem;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: orange;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: solid;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Servlet_Admin_Add_Faculty\" method=\"post\">\n");
      out.write("             <input type=\"button\" class=\"btn\" style=\"width:15%;\" value=\"Back\" onclick=\"window.window.location.href='Admin_Add_Faculty.jsp'\"/>\n");
      out.write("        <div class=\"container\">\n");
      out.write("        <div class=\"form-container\">\n");
      out.write("        <form action=\"Login.html\">\n");
      out.write("        <h2><b>Update Teacher</b></h2>\n");
      out.write("        <label>Faculty_id</label>\n");
      out.write("       <input type=\"text\" name=\"txt_id\">\n");
      out.write("       <label>Name: </label>\n");
      out.write("        <input type=\"text\" name='txt_Name'class='form-control' onkeypress='javascript:return isString(event)' /><br>\n");
      out.write("        \n");
      out.write("        <label>DOB: </label>\n");
      out.write("        <input type='date' name='txt_DOB'class='form-control'/><br>\n");
      out.write("        <label>Contact: </label>\n");
      out.write("        <input type='tel' name='txt_Contact' class='form-control'onkeypress='javascript:return isContactno(event)'/><br>\n");
      out.write("        <label>Email: </label>\n");
      out.write("        <input type='email' name='txt_Email'class='form-control'/><br>\n");
      out.write("        <label>Gender:</label>\n");
      out.write("        <select class='select1' name=\"txt_Gender\">\n");
      out.write("            <option>Male</option>\n");
      out.write("            <option>Female</option>\n");
      out.write("            <option>Other</option>    \n");
      out.write("        </select><br>\n");
      out.write("        <label>Subject:</label>\n");
      out.write("        <select class='select1' name='txt_Subject'>\n");
      out.write("            <option>Core Java</option>\n");
      out.write("            <option>Advance Java</option>\n");
      out.write("            <option>Software Engineering</option>\n");
      out.write("            <option>Machin Learing</option>\n");
      out.write("            <option>English</option>   \n");
      out.write("        </select><br>\n");
      out.write("        <label>Category:</label>\n");
      out.write("        <select class='select1' name='txt_Category'>\n");
      out.write("            <option>Theory</option>\n");
      out.write("            <option>Practical</option>\n");
      out.write("            <option>Theory + Practical</option>    \n");
      out.write("        </select><br>\n");
      out.write("        <label style=\"margin-bottom: 1%\">Address: </label>\n");
      out.write("        <textarea name='txt_Address'  rows='3' cols='60' onkeypress='javascript:return isAlphanumric(event)'></textarea><br>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("            \n");
      out.write("            <input type=\"Submit\"class=\"btn\" name='btn' value=\"Update\" />\n");
      out.write("       \n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("            </div>\n");
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
