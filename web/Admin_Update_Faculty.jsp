<%-- 
    Document   : Student_recover_password
    Created on : 8 Dec, 2023, 9:32:36 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Update Faculty</title>
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
	height: 100vh;
	display: flex;
	
	
}

.container{
	display: flex;
	box-shadow: 0 0 40px skyblue;
        height: 665px;
        width: 600px;
        margin-left: 73%;
        margin-top:3%;
}

.banner{
	height: 400px;
	width: 450px;
	background-color: white;
	display: flex;
	justify-content: center;
}

.banner img{
	width: 100%;
	height: 100%;
}

.form-container{
	width: 600px;
	height: 665px;
	background-color: lightyellow;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        padding-bottom: 10px;
        line-height: 0.3rem;
}

.form-container h2{
	margin-top: 1.0rem;
	text-transform: uppercase;
	font-size: 28px;
        color: black;
        padding-left: 7%;
        padding-bottom: 2%;

}

.form-container form{
	width: 80%;
	margin-top: 2rem;
}

.form-container label{
	display: block;
	font-size: 16px;
	margin-top: 1rem;
	margin-left: 0.3rem;
        color: black;
}

.form-control{
	display: block;
	width: 70%;
	height: 2.3rem;
	padding: 0 .5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: solid;
}

.select1{
    display: block;
	width: 60%;
	height: 2.0rem;
	padding: 0 .5rem;
	border-radius: 10px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: solid;
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

textarea{
    display: block;
	width: 70%;
	
	padding: 0 .5rem;
	border-radius: 10px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: solid;
}


        </style>
    </head>
    <body>
        <form action="Servlet_Admin_Update_Faculty" method="post">
             <input type="button" class="btn" style="width:15%;" value="Back" onclick="window.window.location.href='Admin_Add_Faculty.jsp'"/>
        <div class="container">
        <div class="form-container">
        <form action="Login.html">
        <h2><b>Update Teacher</b></h2>
        <label>Faculty_id</label>
       <input type="text" name="txt_id">
       <label>Name: </label>
        <input type="text" name='txt_Name'class='form-control' onkeypress='javascript:return isString(event)' /><br>
        
        <label>DOB: </label>
        <input type='date' name='txt_DOB'class='form-control'/><br>
        <label>Contact: </label>
        <input type='tel' name='txt_Contact' class='form-control'onkeypress='javascript:return isContactno(event)'/><br>
        <label>Email: </label>
        <input type='email' name='txt_Email'class='form-control'/><br>
        <label>Gender:</label>
        <select class='select1' name="txt_Gender">
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>    
        </select><br>
        <label>Subject:</label>
        <select class='select1' name='txt_Subject'>
            <option>Core Java</option>
            <option>Advance Java</option>
            <option>Software Engineering</option>
            <option>Machin Learing</option>
            <option>English</option>   
        </select><br>
        <label>Category:</label>
        <select class='select1' name='txt_Category'>
            <option>Theory</option>
            <option>Practical</option>
            <option>Theory + Practical</option>    
        </select><br>
        <label style="margin-bottom: 1%">Address: </label>
        <textarea name='txt_Address'  rows='3' cols='60' onkeypress='javascript:return isAlphanumric(event)'></textarea><br>
        
        
            
            <input type="Submit"class="btn" name='btn_Update' value="Update" />
       
            </div>
        
            </div>
        </form>
    </body>
</html>
