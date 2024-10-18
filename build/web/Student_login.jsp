<%-- 
    Document   : asach
    Created on : 9 Dec, 2023, 12:10:09 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Login</title>
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
	height: 400px;
	width: 450px;
	background-color: white;
	display: flex;
	justify-content: center;
}

.banner img{
	width: 80%;
	height: 100%;
}

.form-container{
	width: 450px;
	height: 400px;
	background-color: blue;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
}

.form-container h2{
	margin-top: 1rem;
	text-transform: uppercase;
	font-size: 20px;

}

.form-container form{
	width: 80%;
	margin-top: 2rem;
}

.form-container form label{
	display: block;
	font-size: 16px;
	margin-top: 2rem;
	margin-left: 0.3rem;
}

.form-container form input{
	display: block;
	width: 100%;
	height: 2.5rem;
	padding: 0.5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: none;
}

.btn{
	margin-top: 1.5rem;
	height: 2.0rem;
	width: 40%;
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
		margin: 2rem;
		flex-direction: column;

	}

}
.ancher{
    color:white;
    
}

.Back{
    
	height: 1.6rem;
	width: 25%;
	border: none;
	outline: none;
	border-radius: 20px;
	font-size: 16px;
	box-shadow: 0 5px 5px black;
	background-color: gold;
	transition: .3s;
	cursor: pointer;
        margin-bottom: 2%;
}

.Back:hover{
	background-color: yellow;
	color: black;
}
.title{
    padding-top: 20px;
}
        </style>
    </head>
    <body>
        <form action='Servlet_Student_Login' method="Post">
	<div class="container">
		<div class="banner">
			<img src="web_images/login.svg">			
		</div>
		<div class="form-container">
                    <h2 class="title">Student Login</h2>
			
				<label style="margin-right:230px; margin-top: 2rem;">Email:      </label>
        <input style="display: block;
	width: 70%;
	height: 2.5rem;
	padding: 0.5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
        margin-bottom: 5px;
	outline: none;
	background-color: white;
	border: none"
        type="email" id="password"  name='txt_Email' required="">
                <label style="margin-right:230px">Password:      </label>
        <input style="display: block;
	width: 70%;
	height: 2.5rem;
	padding: 0.5rem;
	border-radius: 20px;
	font-size: 18px;
	color: orange;
	margin-top: 0.5rem;
	outline: none;
	background-color: white;
	border: none"
        type="password" id="password"  name="txt_Password" required="">
			
			 <input class="btn"type="submit" value="Login" name="btn"><br>
                         <input type='button' class='Back'value="Back" onclick="window.window.location.href='index.html'">
                        
                        <a class="ancher" href ="Student_signup.jsp">Don't have account?</a>	
		</div>
		
	</div>
        </form>
    </body>
</html>
