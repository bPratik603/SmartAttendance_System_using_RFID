<%-- 
    Document   : Admin_send_email
    Created on : 8 Dec, 2023, 9:19:19 PM
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
        <title>Admin send email</title>
        <style>
            body{
                background-image: url(web_images/E_5.png);
                background-size: cover;
            }
            
            a{
                color:black;
            }
            

         


.Title{
    widht:100%;
    height: 70px;
   
    background-color: graytext;
    
    align-items: center;
    font-size: 20px;
    padding-left: 40%;
    
}

.email{
    height: 400px;
    width: 70%;
    background-color: transparent;
  
    
}

.btn{
	margin-top: 11.0rem;
        
	height: 2.0rem;
	width: 15%;
	border: none;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	box-shadow: 0 5px 5px black;
	background-color: gold;
	transition: .3s;
	cursor: pointer;
        margin-left: 10%;
}

.btn:hover{
	background-color: yellow;
	color: black;
        
}

a{
    font-size: 17px;
    font-family: Arial;
    line-height: 1.8rem;
    color:blue;
}

table{
  margin-top: 5%;
  width: 40%;  
   
    
}

table th{
    background-color:yellow;
}

table td{
    background-color:silver;
   
   
}

        </style>
    </head>
    <body>
        <form action ="mailto:" method="Post">
            <div class="Title">
             <h1 style="margin-top: 0px;padding-top: 10px;"><b>Students Email</b></h1>
             <input class="btn"type="submit" value="Send To" />
             <input class="btn"type="button" value="back" onclick="window.window.location.href='Admin_Select_Email.jsp'"><br>
            </div>
            
            
                <table border="1">
            <tr>
                <th>Student ID</th>
                <th>Name</th>
                <th>Select</th>
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
           String sql="Select * from Student_Signup";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
               <tr>
                   <td><%=rs.getString("Student_Signup_id")%> </td>
                   <td> <input type="text" name="txt_Name" value="<%=rs.getString("name")%>"/> </td>
                   
                   <td><input type='submit' name="btn" value="Send"    style="background-color: transparent; color:black; font-weight: bold"  /></td>  
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
