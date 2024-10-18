<%-- 
    Document   : Student_details
    Created on : 8 Dec, 2023, 9:29:16 PM
    Author     : bhosa
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student_details</title>
        <style>
            body{
                background-image: url(web_images/Admin_options_img.png);
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

.Branch_Name{
    width:20%;
    height: 70px;
    
   
    background-color: white;
    
    align-items: center;
    font-size: 20px;
    padding-left: 10%;
    
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

.btn2:hover{
	
        background-color: yellow;
}

table{
  
 
    width: 50%;
    
}

table th{
    background-color:yellow;
}

table td{
    background-color:lightyellow;
     padding-left: 3%;
}


        </style>
    </head>
    <body>
        <div class="Title">
            <h1 style="margin-top: 0px;padding-top: 10px"><b>Student Details</b></h1>
           
        </div>
        
        <h2><b>Student list:</b></h2>
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_Select_Student_Details.jsp'"><br>
        <div class="Branch_Name">
            <h2 style="margin-top: 0px;padding-top: 10px"><%=session.getAttribute("Branch")%> <%=session.getAttribute("Year")%> <%=session.getAttribute("Division")%></h2>   
        </div>
        <table border="1">
            <tr>
                <th>Student ID</th>
                <th>Student Name</th>
                <th>Phone no.</th>
                
                <th colspan="2">Select</th>
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
           String sql="Select * from Student_signup where branch='"+session.getAttribute("Branch")+"' and year='"+session.getAttribute("Year")+"' and division='"+session.getAttribute("Division")+"'";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
               <tr>
             <form action="Servlet_Student_Signup" method="post">
                   <td><%=rs.getString("Student_Signup_id")%> </td>
                   <input type="hidden" name="txt_id" value="<%=rs.getString("Student_Signup_id")%> "/>
                   <td><%=rs.getString("name")%></td>
                   <td><%=rs.getString("Student_Contact_Number")%></td>
                   
                    
                   <td><input type='submit' name="btn" value="DELETE"  class="btn btn-block "  style="background-color: red; color:white; font-weight: bold;cursor: pointer"  /></td>
                    </form>  
                   
                   <form action="Admin_Student_Profile.jsp" method="GET">
                       <input type="hidden" name="txt_id" value="<%=rs.getString("Student_Signup_id")%> "/>
                   <td><input type="submit" name="btn" value="VIEW" class="btn btn-block"  style="background-color: red; color:white; font-weight: bold;cursor: pointer" </td>
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
