<%-- 
    Document   : Student_timetable
    Created on : 8 Dec, 2023, 9:34:22 PM
    Author     : bhosa
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student_timetable</title>
        <style>
            body{
                background-image: url(web_images/Admin_options_img.png);
                background-size:100% 850px;
            }
            
.Title{
    width:60.5%;
    height: 70px;
    
   
    background-color: lightcoral;
    
    align-items: center;
    font-size: 20px;
    padding-left: 40%;
    
}

h2{
    margin-left: 38%;
    color:navy;   
}

table{
   
    width:600px;
    margin-top:5%;
    
}



table th{
    background-color:yellow;
}

table td{
    background-color:lightyellow;
}

.btn2{
    width: 5%;
    margin-left: 1%;
    background-color: gold;
    margin-top: 0.2rem;
   
	height: 2.0rem;
	
	border: solid;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	
	background-color: gold;
	transition: .3s;
	cursor: pointer;
	
}

.btn2:hover{
	
        background-color: yellow;
}
        </style>
    </head>
    <body>
        <div class="Title">
        <h1 style="margin-top: 0px;padding-top: 10px"><b>Student Time Table</b></h1>
        </div>
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Student_options.jsp'"><br>
        
        <table border="3">
            <tr>
                <th>TimeTable ID</th>
                <th>Time</th>
                <th>Monday</th>
                <th>Tuesday</th>
                <th>Wednesday</th>
                <th>Thursday</th>
                <th>Friday</th>
                <th>Saturday</th>
                
            </tr>
           <tbody>
                <%
      Connection cn=null;
      Statement st=null;
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from add_timetable where branch='"+session.getAttribute("stud_Branch")+"' and year='"+session.getAttribute("stud_Year")+"' and division='"+session.getAttribute("stud_Division")+"'";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
               <tr>
           <form action="Servlet_Admin_Add_TimeTable" method="post"/>
                   <td><%=rs.getString("Add_TimeTable_id")%> </td>
                    <input type="hidden" name="txt_id" value="<%=rs.getString("Add_TimeTable_id")%> "/>
                   <td> <input type="text" name="txt_Time" value="<%=rs.getString("Time")%>"/> </td>
                    <td> <input type="text" name="txt_Mon" value="<%=rs.getString("Mon")%>"/> </td>
                  
                   <td> <input type="text" name="txt_Tue" value="<%=rs.getString("Tue")%>"/> </td>
                 <td> <input type="text" name="txt_Wed" value="<%=rs.getString("Wed")%>"/> </td>
                 <td> <input type="text" name="txt_Thu" value="<%=rs.getString("Thu")%>"/> </td>
                 <td> <input type="text" name="txt_Fri" value="<%=rs.getString("Fri")%>"/> </td>
                 <td> <input type="text" name="txt_Sat" value="<%=rs.getString("Sat")%>"/> </td>
                    
                    
                  
        </form>    
               </tr>
               
               <%
           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      %>
            </tbody>
        </table>
        
    </body>
</html>
