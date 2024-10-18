<%-- 
    Document   : Student_signup
    Created on : 8 Dec, 2023, 9:33:25 PM
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
        <title>Student_signup</title>
        <script src='validation.js'></script>
        <style>
            *{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body{
	background: url(web_images/bg.jpg);
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
	
	display: flex;
	justify-content: center;
	align-items: center;
}

.container{
	display: flex;
	box-shadow: 0 0 40px skyblue;
        background-color: white;
}

.banner{
	height: 400px;
	width: 450px;
	background-color: white;
        margin-top: 20%;
	
	
}

.banner img{
	width: 100%;
	height: 100%;
        
}

.form-container{
	width: 500px;
	height: 800px;
	background-color: blue;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        margin-top:5%;
       
}

.form-container h2{
	margin-top: 1rem;
	text-transform: uppercase;
	font-size: 20px;
        padding-left: 7%;
        padding-bottom: 2%;

}

.form-container form{
	width: 80%;
        
	margin-top: 0.0rem;
}

.form-container form label{
	display: block;
	font-size: 16px;
	margin-top: 0.2rem;
	margin-left: 0.3rem;
}

.form-control{
	display: block;
	width: 80%;
	height: 2.0rem;
	padding: 0 .0rem;
	border-radius: 20px;
	font-size: 15px;
	color: black;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: none;
        color:black;
}

.btn{
	margin-top: 0.5rem;
	height: 2.0rem;
	width: 30%;
	border: none;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	box-shadow: 0 5px 5px black;
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
.ancher{
    color:white;
}

.Back{
        margin-top:0.5rem;
	height: 1.6rem;
	width: 20%;
	border: none;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	box-shadow: 0 5px 5px black;
	background-color: gold;
	transition: .3s;
	cursor: pointer;
}

.Back:hover{
	background-color: yellow;
	color: black;
}

select{
    display: block;
	width: 60%;
	height: 1.7rem;
	padding: 0 .0rem;
	border-radius: 20px;
	font-size: 15px;
	color: black;
	
	outline: none;
	background-color: white;
	border: none;
}

textarea{
    display: block;
	width: 80%;
	height: 2.0rem;
	padding: 0 .0rem;
	border-radius: 10px;
	font-size: 15px;
	color: black;
	
	outline: none;
	background-color: white;
	border: none;
}

.bGroup{
    display: block;
	width: 70%;
	height: 2.0rem;
	padding: 0 .0rem;
	border-radius: 20px;
	font-size: 15px;
	color: black;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: none;
}
        </style>
    </head>
    <body>
        <form action='Servlet_Student_Signup' method="post">
        <div class="container">
            <div class="banner">
                <img src="web_images/login.svg">
            </div>
    
        <div class="form-container">
       
           
        <h2><b>Student signup</b></h2>
        <label>Student_id</label>
       <input type="text" name="txt_id">
        <h4>Full Name:</h4> 
        <input type="text" name='txt_Name'class='form-control' onkeypress='javascript:return isString(event)' required=""/>
       
        <label>Password: </label>
        <input type="password" name='txt_Password'class='form-control' required=""/>
        <label>Address: </label>
        <textarea name="txt_Address" rows="2" cols="40" onkeypress='javascript:return isAlphaNumric(event)' required=""></textarea>
        <label>Student phone number: </label>
        <input type="tel" name='txt_S_Contact'class='form-control'onkeypress='javascript:return isContactno(event)' required=""/>
        <label>Parents phone number: </label>
        <input type="tel" name='txt_P_Contact'class='form-control'onkeypress='javascript:return isContactno(event)'/>
        <label>DOB: </label>
        <input type="date" name='txt_DOB'class='bGroup' required=""/>
        <label>Gender:</label>
        <select  name="txt_Gender" required="">
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>    
        </select><br>
        <label>Student Email: </label>
        <input type="email" name='txt_S_Email'class='form-control' required=""/>
        <label>Parents Email: </label>
        <input type='email' name='txt_P_Email'class='form-control'required=""/>
        <label>Blood Group:</label>
        <input type='text'name='txt_BGroup' class='form-control' onkeypress='javascript:return isAlphaNumric(event)' required=""/>
        <label>Branch:</label>
        <select name='txt_Branch' required="">
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
        <label>Year: </label>
        <select name='txt_Year' required="">
            <option>first year</option>
            <option>second year</option>
            <option>Third year</option>
        </select>
        <label>Division: </label>
        <select name='txt_Division' required="">
            <option>A</option>
            <option>B</option>
            <option>C</option>
            <option>D</option>
        </select>
        
        
        <input type='submit' class="btn"  name='btn'value='Signup'/>
        <input class="Back" type='button' value='Back' onclick="window.window.location.href='Student_login.jsp'"/>
         
               </div>
        </div>
        </form>
    </body>
</html>
