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
        <title>Admin Login</title>
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
	width: 450px;
	height: 400px;
	background-color: blue;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        padding-bottom: 10px;
        padding: 20px;
}

.form-container h2{
	margin-top: 2.5rem;
	text-transform: uppercase;
	font-size: 20px;

}

.form-container form{
	width: 80%;
	margin-top: 2rem;
        line-height: 2%;
}

.form-container form label{
	display: block;
	font-size: 16px;
	margin-top: 1rem;
	margin-left: 0.3rem;
}

.form-control{
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
        margin-bottom: 2%;
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
    line-height: 150%;
}

.Back{
    
	height: 2.0rem;
	width: 25%;
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
        </style>
    </head>
    <body>
        
        <form action='Servlet_Admin_Login' method="post">
	<div class="container">
		<div class="banner">
			<img src="web_images/A_1.webp">
                          
		</div>
		<div class="form-container">
			<h2>Admin Login</h2>
			
				<label>Email:</label>
                                <input type="email" id="password" class="form-control"  name="txt_email" required="">
				<label>Password:</label>
                                <input type="password" id="password" class="form-control" name="password"required="">
			
			 <input type="submit" class="btn" value="Login" name="btn"><br>
                         <input type ="button" class='Back' value="Back" onclick="window.window.location.href='index.html'">
       		
	 <a class="ancher" href ="Admin_signup.jsp">Don't have account?</a>	
       
                </div>
            
		
	</div>
        </form>
    </body>
   
</html>


