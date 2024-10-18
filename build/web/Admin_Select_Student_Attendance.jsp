<%-- 
    Document   : Admin_Select_TimeTable
    Created on : 22 Dec, 2023, 10:43:01 PM
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
        <title>Admin Select TimeTable</title>
         <style>
            *{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body{
	background: url(web_images/A_13.webp);
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
	height: 100vh;
	display: flex;
	
	
}

.container{
	display: flex;
	margin-left: 600px;
    
        height: 400px;
        width: 400px;
}

.banner{
	height: 400px;
	width: 450px;
	background-color: white;
	display: flex;
	
}


.form-container{
	width: 450px;
	height: 400px;
	background-color: transparent;
	display: flex;
        margin-right: 30%;
	flex-direction: column;
        margin-top:20%;
        margin-bottom: 5rem;
	align-items: center;
	color: white;
        padding-bottom: 10px;
        line-height: 0.5rem;
}





label{
	display: block;
	font-size: 20px;
	margin-top: 1rem;
	margin-right:4rem;
        color: black;
}

select{
        margin-top: 1rem;
	height: 2.5rem;
	width: 70%;
	border: solid;
	outline: none;
	border-radius: 50px;
	font-size: 16px;
        font-family: Rockwell;
	
	background-color: pink;
	transition: .3s;
	cursor: pointer;
        text-align: center;
	
}


.btn{margin-top: 1rem;
	height: 2.0rem;
	width: 30%;
	border: solid;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	
	background-color: gold;
	transition: .3s;
	cursor: pointer;
	
}

.btn:hover{
	background-color: yellow;
	color: black;
}

@media only screen and (max-width: 700px){

	body{
		height: 100%;
	}
	.container{
		margin: 2rem 0;
		flex-direction: column;

	}

}

.btn2{
    width: 10%;
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
        <form action="Servlet_Admin_Select_Student_Attendance" method="post">
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_options.jsp'"><br>
        <div class="container">
           <div class='form-container'> 
               <label><b>Branch:</b></label>
         <select name='txt_Branch' >
            <%
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
               %>
               <option><%=rs.getString("Branch_Name")%></option>
               
               <%
           }
      }catch(Exception ex)
      {
          out.println(ex.toString());
      }
      
      %>
        </select>
        <label><b>Year: </b></label>
        <select name='txt_Year'>
            <option>First year</option>
            <option>Second year</option>
            <option>Third year</option>
        </select>
        <label><b>Division: </b></label>
        <select name='txt_Division'>
            <option>A</option>
            <option>B</option>
            <option>C</option>
            <option>D</option>
        </select>
        
        
        <input type="submit" class='btn' value="View" name="btn">
        </div>
        </div>
        </form>
    </body>
</html>
