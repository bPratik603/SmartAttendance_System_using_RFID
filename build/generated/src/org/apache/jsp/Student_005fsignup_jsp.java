package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;

public final class Student_005fsignup_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Student_signup</title>\n");
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
      out.write("\t\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tjustify-content: center;\n");
      out.write("\talign-items: center;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".container{\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tbox-shadow: 0 0 40px skyblue;\n");
      out.write("        background-color: white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner{\n");
      out.write("\theight: 400px;\n");
      out.write("\twidth: 450px;\n");
      out.write("\tbackground-color: white;\n");
      out.write("        margin-top: 20%;\n");
      out.write("\t\n");
      out.write("\t\n");
      out.write("}\n");
      out.write("\n");
      out.write(".banner img{\n");
      out.write("\twidth: 100%;\n");
      out.write("\theight: 100%;\n");
      out.write("        \n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container{\n");
      out.write("\twidth: 500px;\n");
      out.write("\theight: 800px;\n");
      out.write("\tbackground-color: blue;\n");
      out.write("\tdisplay: flex;\n");
      out.write("\tflex-direction: column;\n");
      out.write("\talign-items: center;\n");
      out.write("\tcolor: white;\n");
      out.write("        margin-top:5%;\n");
      out.write("       \n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container h2{\n");
      out.write("\tmargin-top: 1rem;\n");
      out.write("\ttext-transform: uppercase;\n");
      out.write("\tfont-size: 20px;\n");
      out.write("        padding-left: 7%;\n");
      out.write("        padding-bottom: 2%;\n");
      out.write("\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container form{\n");
      out.write("\twidth: 80%;\n");
      out.write("        \n");
      out.write("\tmargin-top: 0.0rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-container form label{\n");
      out.write("\tdisplay: block;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tmargin-top: 0.2rem;\n");
      out.write("\tmargin-left: 0.3rem;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".form-control{\n");
      out.write("\tdisplay: block;\n");
      out.write("\twidth: 80%;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\tpadding: 0 .0rem;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: black;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: none;\n");
      out.write("        color:black;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".btn{\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\twidth: 30%;\n");
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
      out.write("\n");
      out.write("\t}\n");
      out.write("}\n");
      out.write(".ancher{\n");
      out.write("    color:white;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".Back{\n");
      out.write("        margin-top:0.5rem;\n");
      out.write("\theight: 1.6rem;\n");
      out.write("\twidth: 20%;\n");
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
      out.write(".Back:hover{\n");
      out.write("\tbackground-color: yellow;\n");
      out.write("\tcolor: black;\n");
      out.write("}\n");
      out.write("\n");
      out.write("select{\n");
      out.write("    display: block;\n");
      out.write("\twidth: 60%;\n");
      out.write("\theight: 1.7rem;\n");
      out.write("\tpadding: 0 .0rem;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: black;\n");
      out.write("\t\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write("textarea{\n");
      out.write("    display: block;\n");
      out.write("\twidth: 80%;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\tpadding: 0 .0rem;\n");
      out.write("\tborder-radius: 10px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: black;\n");
      out.write("\t\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".bGroup{\n");
      out.write("    display: block;\n");
      out.write("\twidth: 70%;\n");
      out.write("\theight: 2.0rem;\n");
      out.write("\tpadding: 0 .0rem;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("\tfont-size: 15px;\n");
      out.write("\tcolor: black;\n");
      out.write("\tmargin-top: 0.5rem;\n");
      out.write("\toutline: none;\n");
      out.write("\tbackground-color: white;\n");
      out.write("\tborder: none;\n");
      out.write("}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form action='Servlet_Student_Signup' method=\"post\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"banner\">\n");
      out.write("                <img src=\"web_images/login.svg\">\n");
      out.write("            </div>\n");
      out.write("    \n");
      out.write("        <div class=\"form-container\">\n");
      out.write("       \n");
      out.write("           \n");
      out.write("        <h2><b>Student signup</b></h2>\n");
      out.write("        <label>Student_id</label>\n");
      out.write("       <input type=\"text\" name=\"txt_id\">\n");
      out.write("        <h4>Full Name:</h4> \n");
      out.write("        <input type=\"text\" name='txt_Name'class='form-control' onkeypress='javascript:return isString(event)' required=\"\"/>\n");
      out.write("       \n");
      out.write("        <label>Password: </label>\n");
      out.write("        <input type=\"password\" name='txt_Password'class='form-control' required=\"\"/>\n");
      out.write("        <label>Address: </label>\n");
      out.write("        <textarea name=\"txt_Address\" rows=\"2\" cols=\"40\" onkeypress='javascript:return isAlphaNumric(event)' required=\"\"></textarea>\n");
      out.write("        <label>Student phone number: </label>\n");
      out.write("        <input type=\"tel\" name='txt_S_Contact'class='form-control'onkeypress='javascript:return isContactno(event)' required=\"\"/>\n");
      out.write("        <label>Parents phone number: </label>\n");
      out.write("        <input type=\"tel\" name='txt_P_Contact'class='form-control'onkeypress='javascript:return isContactno(event)'/>\n");
      out.write("        <label>DOB: </label>\n");
      out.write("        <input type=\"date\" name='txt_DOB'class='bGroup' required=\"\"/>\n");
      out.write("        <label>Gender:</label>\n");
      out.write("        <select  name=\"txt_Gender\" required=\"\">\n");
      out.write("            <option>Male</option>\n");
      out.write("            <option>Female</option>\n");
      out.write("            <option>Other</option>    \n");
      out.write("        </select><br>\n");
      out.write("        <label>Student Email: </label>\n");
      out.write("        <input type=\"email\" name='txt_S_Email'class='form-control' required=\"\"/>\n");
      out.write("        <label>Parents Email: </label>\n");
      out.write("        <input type='email' name='txt_P_Email'class='form-control'required=\"\"/>\n");
      out.write("        <label>Blood Group:</label>\n");
      out.write("        <input type='text'name='txt_BGroup' class='form-control' onkeypress='javascript:return isAlphaNumric(event)' required=\"\"/>\n");
      out.write("        <label>Branch:</label>\n");
      out.write("        <select name='txt_Branch' required=\"\">\n");
      out.write("            ");

      Connection cn=null;
      Statement st=null;
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from add_branch";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               
      out.write("\n");
      out.write("               <option>");
      out.print(rs.getString("Branch_Name"));
      out.write("</option>\n");
      out.write("               \n");
      out.write("               ");

           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      
      out.write("\n");
      out.write("        </select>\n");
      out.write("        <label>Year: </label>\n");
      out.write("        <select name='txt_Year' required=\"\">\n");
      out.write("            <option>first year</option>\n");
      out.write("            <option>second year</option>\n");
      out.write("            <option>Third year</option>\n");
      out.write("        </select>\n");
      out.write("        <label>Division: </label>\n");
      out.write("        <select name='txt_Division' required=\"\">\n");
      out.write("            <option>A</option>\n");
      out.write("            <option>B</option>\n");
      out.write("            <option>C</option>\n");
      out.write("            <option>D</option>\n");
      out.write("        </select>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <input type='submit' class=\"btn\"  name='btn'value='Signup'/>\n");
      out.write("        <input class=\"Back\" type='button' value='Back' onclick=\"window.window.location.href='Student_login.jsp'\"/>\n");
      out.write("         \n");
      out.write("               </div>\n");
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
