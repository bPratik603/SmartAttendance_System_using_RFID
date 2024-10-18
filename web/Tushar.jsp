<%-- 
    Document   : Student_details
    Created on : 8 Dec, 2023, 9:29:16 PM
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
        <title>Student_</title>
        <style>
            body{
                
                background-size: cover;
            }
            
.Title{
    width:60.5%;
    height: 70px;
    
   
    background-color: lightcoral;
    
    align-items: center;
    font-size: 20px;
    padding-left: 40%;
    
}


    a{
    font-size: 17px;
    font-family: Arial;
    line-height: 1.5rem;
    color:blue;
    padding-left: 3%;
    line-height: 1.5;
    }
    
.btn2{
    width: 5%;
    margin-left: 1%;
    background-color: gold;
    margin-top: 0.2rem;
    margin-bottom: 1rem;
	height: 2.0rem;
	
	border: solid;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	
	background-color: gold;
	transition: .3s;
	cursor: pointer;
	
}

.Branch_Name{
    width:20%;
    height: 70px;
    
   
    background-color: white;
    
    align-items: center;
    font-size: 20px;
    padding-left: 10%;
    
}

.btn2:hover{
	
        background-color: yellow;
}

table{
    width: 100%;
}

table th{
    background-color:yellow;
}

table td{
    background-color:lightyellow;
    padding-left: 5%;
}


        </style>
    </head>
    <body>
        <form>
        <div class="Title">
            <h1 style="margin-top: 0px;padding-top: 10px"><b>Student Attendance</b></h1>
           
        </div>
        <h2><b>Student list:</b></h2>
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Attendance.jsp'"/><br>
        
       
                    
        <table border="1">
            <tr>
                <th>Student ID.</th>
                <th>Name</th>
                <th>Date</th>
                <th>In Time</th>
               
                <th>Status</th>
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
           String sql="Select * from attendance where attendance_id='"+session.getAttribute("stud_barcode_id")+"'";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
               <tr>
                   <td><%=rs.getString("Attendance_id")%> </td>
                   <td><%=rs.getString("name")%></td>
                   <td><%=rs.getString("Date")%></td>
                   <td><%=rs.getString("In_Time")%></td>
                  
                   <td><%=rs.getString("Status")%></td>
                    
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
        </form>
    </body>
</html>
