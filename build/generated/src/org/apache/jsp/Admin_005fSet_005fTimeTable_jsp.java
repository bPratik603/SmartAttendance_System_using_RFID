package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fSet_005fTimeTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(web_images/Admin_options_img.png);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .form-row{\n");
      out.write("                margin-top:8%;\n");
      out.write("                margin-left:8%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write(" \n");
      out.write("  <div class=\"form-row\">\n");
      out.write("    <div class=\"form-group col-md-2\">\n");
      out.write("      <label for=\"inputCity\">Time</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Monday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Tusday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Wendsday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Thursday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Friday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Saturday</label>\n");
      out.write("      <input type=\"text\" class=\"form-control\" id=\"inputCity\">\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  <button type=\"submit\" class=\"btn btn-primary\">ADD</button>\n");
      out.write("</form>\n");
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
