package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fAdd_005fTimeTable_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Admin Add TimeTable</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap.css\">\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image: url(web_images/A_21.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("            }\n");
      out.write("            .form-row{\n");
      out.write("                margin-top:17%;\n");
      out.write("                margin-left:20%;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("            button{\n");
      out.write("                margin-left:60%;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("\tmargin-top: 1rem;\n");
      out.write("\tmargin-right:4rem;\n");
      out.write("        color: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn{\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 7%;\n");
      out.write("\tborder: solid;\n");
      out.write("\toutline: none;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tfont-family: Arial;\n");
      out.write("        \n");
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
      out.write(".btn2{\n");
      out.write("    width: 5%;\n");
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
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action=\"Servlet_Admin_Add_TimeTable\" method=\"post\">\n");
      out.write("        <input type=\"button\" class='btn2' value=\"Back\" onclick=\"window.window.location.href='Admin_Choose_Time_Table.jsp'\"><br>\n");
      out.write("        \n");
      out.write(" \n");
      out.write("  <div class=\"form-row\">\n");
      out.write("    <div class=\"form-group col-md-2\">\n");
      out.write("        <label>Branch_id</label>\n");
      out.write("               <input type=\"text\" name=\"txt_id\">\n");
      out.write("      <label for=\"inputCity\">Time</label>\n");
      out.write("      <input type=\"text\" name='txt_Time'class=\"form-control\" id=\"inputCity\" onkeypress='javascript:return isfloat(event)'>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Mon</label>\n");
      out.write("      <input type=\"text\" name='txt_Mon'class=\"form-control\" id=\"inputCity\" onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("     <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Tue</label>\n");
      out.write("      <input type=\"text\" name='txt_Tue'class=\"form-control\" id=\"inputCity\"onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Wed</label>\n");
      out.write("      <input type=\"text\" name='txt_Wed'class=\"form-control\" id=\"inputCity\"onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Thur</label>\n");
      out.write("      <input type=\"text\" name='txt_Thu'class=\"form-control\" id=\"inputCity\"onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("       <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Fri</label>\n");
      out.write("      <input type=\"text\" name='txt_Fri'class=\"form-control\" id=\"inputCity\"onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("      <div class=\"form-group col-md-1\">\n");
      out.write("      <label for=\"inputCity\">Sat</label>\n");
      out.write("      <input type=\"text\" name='txt_Sat'class=\"form-control\" id=\"inputCity\"onkeypress='javascript:return isAplphanumric(event)'>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write(" \n");
      out.write("  <button type=\"submit\" name='btn' value='Add'class=\"btn\">ADD</button>\n");
      out.write("  <button type=\"submit\" name=\"btn\" value=\"Update\" class=\"btn\">Update</button>\n");
      out.write("  <button type=\"submit\" name=\"btn\" value=\"Delete\" class=\"btn\">Delete</button>\n");
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
