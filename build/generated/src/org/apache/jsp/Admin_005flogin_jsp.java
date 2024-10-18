package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005flogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Login</title>\n");
      out.write("        <script src=\"validation.js\"></script>\n");
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
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tbox-shadow: 0 0 40px skyblue;\n");
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
      out.write("\twidth: 450px;\n");
      out.write("\theight: 400px;\n");
      out.write("\tbackground-color: blue;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("        padding: 20px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container h2{\n");
      out.write("\tmargin-top: 2.5rem;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container form{\n");
      out.write("\twidth: 80%;\n");
      out.write("\tmargin-top: 2rem;\n");
      out.write("        line-height: 2%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container form label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tmargin-top: 1rem;\n");
      out.write("\tmargin-left: 0.3rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control{\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 80%;\n");
      out.write("\theight: 2.5rem;\n");
      out.write("\tpadding: 0 .5rem;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 18px;\n");
      out.write("\tcolor: orange;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn{\n");
      out.write("\tmargin-top: 1.5rem;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 40%;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbox-shadow: 0 5px 5px black;\n");
      out.write("\tbackground-color: gold;\n");
      out.write("\ttransition: .3s;\n");
      out.write("\tcursor: pointer;\n");
      out.write("        margin-bottom: 2%;\n");
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
      out.write(".ancher{\n");
      out.write("    color:white;\n");
      out.write("    line-height: 150%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Back{\n");
      out.write("    \n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 25%;\n");
      out.write("\tborder: none;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbox-shadow: 0 5px 5px black;\n");
      out.write("\tbackground-color: gold;\n");
      out.write("\ttransition: .3s;\n");
      out.write("\tcursor: pointer;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("\n");
      out.write(".Back:hover{\n");
      out.write("\tbackground-color: yellow;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("        <form action='Servlet_Admin_Login' method=\"post\">\n");
      out.write("\t<div class=\"container\">\n");
      out.write("\t\t<div class=\"banner\">\n");
      out.write("\t\t\t<img src=\"web_images/A_1.webp\">\n");
      out.write("                          \n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"form-container\">\n");
      out.write("\t\t\t<h2>Admin Login</h2>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\t<label>Email:</label>\n");
      out.write("                                <input type=\"email\" id=\"password\" class=\"form-control\"  name=\"txt_email\" onkeypress=\"javascript:return isAlphanumric(event) \">\n");
      out.write("\t\t\t\t<label>Password:</label>\n");
      out.write("                                <input type=\"password\" id=\"password\" class=\"form-control\" name=\"password\">\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t <input type=\"submit\" class=\"btn\" value=\"Login\" name=\"btn\"><br>\n");
      out.write("                         <input type =\"button\" class='Back' value=\"Back\" onclick=\"window.window.location.href='Login.jsp'\">\n");
      out.write("        <a class=\"ancher\" href=\"Student_Forgot_Password.jsp\"/>for-got password</a>\t\t\t\n");
      out.write("\t <a class=\"ancher\" href =\"Admin_signup.jsp\">Don't have account?</a>\t\n");
      out.write("       \n");
      out.write("                </div>\n");
      out.write("            \n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("   \n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
