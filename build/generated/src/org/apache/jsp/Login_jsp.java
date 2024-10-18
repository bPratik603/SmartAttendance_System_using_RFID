package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Login</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("\tpadding: 0;\n");
      out.write("\tmargin: 0;\n");
      out.write("\tbox-sizing: border-box;\n");
      out.write("}\n");
      out.write("\n");
      out.write("body{\n");
      out.write("\tbackground-image:  url(web_images/bg.jpg);\n");
      out.write("\tbackground-size:100% 750px;\n");
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
      out.write("        margin-left: 7%;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner{\n");
      out.write("\theight: 400px;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tbackground-color: lightyellow;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner2{\n");
      out.write("\theight: 400px;\n");
      out.write("\twidth: 200px;\n");
      out.write("\tbackground-color:lightyellow;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("        float:bottom;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner2 img{\n");
      out.write("        width: 120%;\n");
      out.write("\theight: 80%;\n");
      out.write("        padding-top: 80%;\n");
      out.write("      \n");
      out.write("        padding-right: 40%;\n");
      out.write("        \n");
      out.write("}\n");
      out.write(".banner img{\n");
      out.write("\twidth: 130%;\n");
      out.write("\theight: 60%;\n");
      out.write("        margin-left: -30%;\n");
      out.write("        \n");
      out.write("       \n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container{\n");
      out.write("\twidth: 200px;\n");
      out.write("\theight: 400px;\n");
      out.write("\tbackground-color: lightyellow;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("        padding-bottom: 10px;\n");
      out.write("}\n");
      out.write(".btn{\n");
      out.write("\tmargin-top: 5rem;\n");
      out.write("\theight: 3.0rem;\n");
      out.write("\twidth: 70%;\n");
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
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("            <div class=\"container\">\n");
      out.write("\t\t<div class=\"banner\">\n");
      out.write("                    <img src=\"web_images/login_Admin1.png\">\n");
      out.write("                    \n");
      out.write("\t\t</div>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("\t\t<div class=\"form-container\">\n");
      out.write("\t\t\t<button class=\"btn\"onclick=\"window.window.location.href='Admin_login.jsp'\">Admin</button><br>\n");
      out.write("                        <button class=\"btn\"onclick=\"window.window.location.href='Student_login.jsp'\">Student</button>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"banner2\">\n");
      out.write("                <img src=\"web_images/User_login_image1.webp\">\n");
      out.write("            </div>\n");
      out.write("\t\t\n");
      out.write("\t</div>\n");
      out.write("                \n");
      out.write("        \n");
      out.write("        \n");
      out.write("    </body>\n");
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
