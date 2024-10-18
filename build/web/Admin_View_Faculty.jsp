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
        <title>Admin View Faculty</title>
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
  
    
    width: 68%;
    
}

table th{
    background-color:yellow;
    
}

table td{
    background-color:lightyellow;
   
   padding-left: 1%;
}

a{
    color:black;
}
        </style>
    </head>
    <body>
        <div class="Title">
            <h1 style="margin-top: 0px;padding-top: 10px"><b>Faculty Details</b></h1>
           
        </div>
        <h2><b>Faculty list:</b></h2>
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_Add_Faculty.jsp'"><br>
        <table border="1">
            <tr>
                <th>Faculty ID</th>
                <th>Name</th>
                <th>Phone no.</th>
                <th>Subject</th>
                <th>Category</th>
               
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
           String sql="Select * from add_faculty";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
               <tr>
                   <form action="Servlet_Admin_Add_Faculty" method="post">
                   <td><%=rs.getString("Faculty_id")%> </td>
                   <input type="hidden" name="txt_id" value="<%=rs.getString("Faculty_id")%> "/>
                   <td><%=rs.getString("name")%></td>
                    <td><%=rs.getString("contact")%></td>
                  
                   <td><%=rs.getString("subject")%></td>
                
                   <td><%=rs.getString("category")%></td>
                   
            
                  
                    <td><input type='submit' name="btn" value="DELETE"  class="btn btn-block "  style="background-color: red; color:white; font-weight: bold;cursor:pointer"  />
                    </td>
                   </form>
            <form action="Admin_Faculty_Profile.jsp" method="GET">
                <input type="hidden" name="txt_id" value="<%=rs.getString("Faculty_id")%> "/>
                     <td><input type='submit' name="btn" value="VIEW"  class="btn btn-block "  style="background-color: red; color:white; font-weight: bold;cursor:pointer"  />
                    </td> 
                  
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
