<%-- 
    Document   : Admin_signup
    Created on : 8 Dec, 2023, 9:21:22 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin signup</title>
        <script src="validation.js"></script>
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
	justify-content: center;
	align-items: center;
}

.container{
	display: flex;
	box-shadow: 0 0 40px skyblue;
}

.banner{
	height: 630px;
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
	width: 450px;
	height: 630px;
	background-color: blue;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        line-height: 80%;
       
}

.form-container h2{
	margin-top: 1rem;
	text-transform: uppercase;
	font-size: 20px;
        padding-left: 6%;
        padding-bottom: 3%;

}

.form-container form{
	width: 80%;
        
	margin-top: 0.0rem;
}

.form-container label{
	display: block;
	font-size: 16px;
	margin-top: 0.3rem;
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
}

.btn{
	margin-top: 0.1rem;
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

select{
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

textarea{
    display: block;
	width: 90%;
	height: 2.5rem;
	padding: 0 .0rem;
	border-radius: 10px;
	font-size: 15px;
	color: black;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: none;
}
.Back:hover{
	background-color: yellow;
	color: black;
}
        </style>
    </head>
    <body>
        <form action="Servlet_Admin_Signup" method="post">
        <div class ="container">
            <div class="banner">
                <img src="web_images/A_1.webp">
            </div>
        
        <div class="form-container">
           
       <h2><b>Admin Signup</b></h2>
        
       
        <label>Name: </label>
        <input type="text"  class='form-control' name='txt_Name'onkeypress="javascript:return isString(event)" required=""/><br>
        <label>Password: </label>
        <input type='password'  class='form-control'name='txt_Password' required=""/><br>
        <label>Gender:</label>
        <select   name='txt_Gender'required="">
            <option>Male</option>
            <option>Female</option>
            <option>Other</option>    
        </select><br>
        <label>Address: </label>
        <textarea   rows='5' cols='50' name='txt_Address'onkeypress='javascript:return isAlphaNumric(event)' required=""></textarea><br>
        <label>DOB: </label>
        <input type='date'class='form-control' name='txt_DOB'required=""/><br>
        <label>Contact: </label>
        <input type='tel' class='form-control' name='txt_Contact' onkeypress='javascript:return isContactno(event)' required=""/><br>
        <label>Email: </label>
        <input type='email' class='form-control' name='txt_Email' required=""/><br>
            
        <input type='submit' class="btn"  name='btn' value="Signup" />
        <input type='button' class='Back' value='Back' onclick="window.window.location.href='Admin_login.jsp'">
        </div>
            </div>
        </form>
    </body>
</html>
