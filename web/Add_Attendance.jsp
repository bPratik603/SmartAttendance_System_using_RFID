<%-- 
    Document   : Add_Attendance
    Created on : 8 Mar, 2024, 12:39:38 PM
    Author     : bhosa
--%>

<%@page import="java.time.LocalTime"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

         <%
              String barcode = request.getParameter("barcode");

    // Process the barcode value (you can perform any required operations here)

    // Generate the response
    String responseMessage = "Barcode received: " + barcode;
         
    
    
     Connection cn=null;
      Statement st=null;
      Date date=new Date();
      SimpleDateFormat formate=new SimpleDateFormat("yyyy-MM-dd");
      String attend_date=formate.format(date);
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from student_signup where stud_barcode_id='"+barcode+"'";
           java.sql.ResultSet rs=st.executeQuery(sql);
           if(rs.next())
           {
             String insert="insert into attendance(Attendance_id,Name,Date,In_Time,Status,Branch,Year,Division) values('"+barcode+"','"+rs.getString("Name")+"','"+attend_date+"','"+LocalTime .now()+"','Present','"+rs.getString("Branch")+"','"+rs.getString("Year")+"','"+rs.getString("Division")+"')"; 
             st.executeUpdate(insert);
             response.setContentType("text/plain");

    // Write the response message
            response.getWriter().write("Attendance Added Successfully");
           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }

         %> 
  
