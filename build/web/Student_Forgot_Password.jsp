<%-- 
    Document   : Student_Forgot_Password
    Created on : 8 Dec, 2023, 9:28:12 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Forgot Password</title>
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
	justify-content: center;
	align-items: center;
}

.container{
	display: flex;
	box-shadow: 0 0 40px skyblue;
        height: 400px;
        width: 400px;
}

.banner{
	height: 400px;
	width: 450px;
	background-color: white;
	display: flex;
	justify-content: center;
}



.form-container{
	width: 450px;
	height: 400px;
	background-color: lightyellow;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        padding-bottom: 10px;
}



.form-container form{
	width: 80%;
	margin-top: 2rem;
}

.btn{
	margin-top: 1rem;
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
.ancher{
    color:white;
}
        </style>
    </head>
    <body>
        <form action='Servlet_Student_Forgot_Password' method="post">
        <div class="container">
            
        <div class="form-container">
        
            <h2 style="display: block;
	font-size: 25px;
	margin-top: 2rem;
	margin-left: 0.3rem;
        color: black;"><b>Forgot Password</b></h2>
        
        <label style="
        display: block;
	font-size: 16px;
	margin-top: 1rem;
	margin-left: 0.3rem;
        color: black;
        padding-right: 46%;
        ">Contact Number:</label>
        
        <input style="
        display: block;
	width: 80%;
	height: 2.5rem;
	padding: 0 .5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: solid"type='tel' name='txt_Contact'onkeypress='javascript:return isContactno(event)'/><br>
        <input class="btn" style="width:25%;"type="button" value="Send OTP" />
        <label style="display: block;
	font-size: 16px;
	margin-top: 1rem;
	margin-left: 0.3rem;
        color: black;
        padding-right: 65%;
        ">OTP: </label>
        
        <input style="display: block;
	width: 80%;
	height: 2.5rem;
	padding: 0 .5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: solid"type='number' name='txt_OTP'onkeypress='javascript:return isContactno(event)'/><br>
        <input class="btn"type="submit" value="Done" />
        <input class="btn" style="width:25%;"type="button" value="Cansel" onclick="window.window.location.href='Student_login.jsp'"/>
        </div>
        

            </div>
                    </form>
    </body>
</html>
