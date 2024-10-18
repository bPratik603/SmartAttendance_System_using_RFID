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
        <title>Login</title>
        <style>
            *{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body{
	background-image:  url(web_images/bg.jpg);
	background-size:100% 750px;
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
        margin-left: 7%;
}

.banner{
	height: 400px;
	width: 200px;
	background-color: lightyellow;
	display: flex;
	
}

.banner2{
	height: 400px;
	width: 200px;
	background-color:lightyellow;
	display: flex;
	justify-content: center;
        float:bottom;
}

.banner2 img{
        width: 120%;
	height: 80%;
        padding-top: 80%;
      
        padding-right: 40%;
        
}
.banner img{
	width: 130%;
	height: 60%;
        margin-left: -30%;
        
       
}

.form-container{
	width: 200px;
	height: 400px;
	background-color: lightyellow;
	display: flex;
	flex-direction: column;
	align-items: center;
	color: white;
        padding-bottom: 10px;
}
.btn{
	margin-top: 5rem;
	height: 3.0rem;
	width: 70%;
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
        </style>
    </head>
    <body>
        
       
            <div class="container">
		<div class="banner">
                    <img src="web_images/login_Admin1.png">
                    
		</div>
            
            
		<div class="form-container">
			<button class="btn"onclick="window.window.location.href='Admin_login.jsp'">Admin</button><br>
                        <button class="btn"onclick="window.window.location.href='Student_login.jsp'">Student</button>
                </div>
            <div class="banner2">
                <img src="web_images/User_login_image1.webp">
            </div>
		
	</div>
                
        
        
    </body>
</html>


