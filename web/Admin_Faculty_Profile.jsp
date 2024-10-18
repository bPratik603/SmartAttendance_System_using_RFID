<%-- 
    Document   : Abhishek
    Created on : 8 Dec, 2023, 9:12:08 PM
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
        <title>Admin Faculty Profile</title>
        <link rel='stylesheet' href='Student_Style.css'>
        <link rel="stylesheet" href="bootstrap.css">
    </head>
    <style>
         .Title{
            width:100%;
        }
        table{
  
    margin-left:700px;
    width: 100%;
    
}

table th{
    background-color:yellow;
}

table td{
    background-color:lightyellow;
   
}

.back{
    margin-left: 37%;
    margin-top:7%;
    height: 500px;
    width: 430px;
    background-color: transparent;
}
.col{
    font-size: 18px;
    font-family:bold italic;
}

.btn{
    width: 18%;
    margin-left:5%;
    margin-top:5%;
    background-color: gold;
    align-items: center;
    height: 2.0rem;
	
        
	border: solid;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
        font-family:fantasy;
	line-height: 2%;
	background-color: gold;
	transition: .3s;
	cursor: pointer;
        margin-left:20%;
	
}

.btn:hover{
        background-color: yellow;
}



    </style>
    <body>
        <div class='Title'>
        <h1 style="margin-top: 0px;padding-top: 10px"><b>Faculty Details</b></h1>
        </div>
        <div class='back'>
                <%
      Connection cn=null;
      Statement st=null;
      try
      {
           Class.forName("com.mysql.jdbc.Driver");
           cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/new_smart_attendance","root","root");
           st=cn.createStatement();
           String sql="Select * from add_faculty where Faculty_id='"+request.getParameter("txt_id")+"'";
           java.sql.ResultSet rs=st.executeQuery(sql);
           while(rs.next())
           {
               %>
                <form action="Servlet_Admin_Add_Faculty" method="post">
               <div class="container">
    <div class="row">
        <div class="col"><b>Faculty id:</b></div>
    <div class="col"><%=rs.getString("Faculty_id")%></div>
    <input type="hidden" name="txt_id" value="<%=rs.getString("Faculty_id")%>"/>
    <div class="w-100"></div>
    <div class="col"><b>Name:</b></div>
    <div class="col"><input type="text" name="txt_Name" value="<%=rs.getString("name")%>"/></div>
    <div class="w-100"></div>
    <div class="col"><b>DOB:</b></div>
    <div class="col"><input type="text" name="txt_DOB" value="<%=rs.getString("DOB")%>"/></div>
    <div class="w-100"></div>
    <div class="col"><b>Contact:</b></div>
    <div class="col"> <input type="text" name="txt_Contact" value="<%=rs.getString("Contact")%>"/> </div>
    <div class="w-100"></div>
    <div class="col"><b>Email:</b></div>
    <div class="col"><input type="text" name="txt_Email" value="<%=rs.getString("Email")%>"/></div>
    <div class="w-100"></div>
    <div class="col"><b>Gender:</b></div>
    <div class="col"><input type="text" name="txt_Gender" value="<%=rs.getString("Gender")%>"/> </div>
    <div class="w-100"></div>
    <div class="col"><b>Subject:</b></div>
    <div class="col"><input type="text" name="txt_Subject" value="<%=rs.getString("Subject")%>"/></div>
    <div class="w-100"></div>
    <div class="col"><b>Category:</b></div>
    <div class="col"><input type="text" name="txt_Category" value="<%=rs.getString("Category")%>"/></div>
    <div class="w-100"></div>
    <div class="col"><b>Address:</b></div>
    <div class="col"><input type="text" name="txt_Address" value="<%=rs.getString("Address")%>"/></div>
    </div>
</div>
               <%
           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      %>
           
        <input type='submit' class='btn' name='btn' value='UPDATE'/>
        <input type="button" class='btn' name='btn'value="BACK" onclick="window.window.location.href='Admin_View_Faculty.jsp'"><br>
        </div>
                </form>
    </body>
</html>
