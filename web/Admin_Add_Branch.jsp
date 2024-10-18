<%-- 
    Document   : Admin_Select_TimeTable
    Created on : 22 Dec, 2023, 10:43:01 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Add Branch</title>
        <script src='validation.js'></script>
         <style>
            *{
	padding: 0;
	margin: 0;
	box-sizing: border-box;
}

body{
	background: url(web_images/A_16.jpg);
	background-size: cover;
	background-repeat: no-repeat;
	background-position: center;
	height: 100vh;
	display: flex;
	
	
}

.container{
	display: flex;
	margin-left: 500px;
        margin-bottom: 12%;
        height: 400px;
        width: 400px;
}

.banner{
	height: 400px;
	width: 450px;
	background-color: white;
	display: flex;
	
}

.banner img{
	width: 100%;
	height: 100%;
}

.form-container{
	width: 600px;
	height: 400px;
	background-color: transparent;
	display: flex;
        margin-right: 20%;
	flex-direction: column;
        margin-top:30%;
        margin-bottom: 5rem;
	align-items: center;
	color: white;
        padding-bottom: 10px;
        line-height: 0.5rem;
}



.form-container form{
	width: 80%;
	margin-top: 2rem;
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
	border-radius: 5px;
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

input{
    margin-top: 1rem;
	height: 2.5rem;
	width: 70%;
	border: solid;
	outline: none;
	border-radius: 5px;
	font-size: 16px;
        font-family: Rockwell;
	
	background-color: wheat;
	transition: .3s;

        
	
}

        </style>
    </head>
    <body>
        <form action="Servlet_Admin_Add_Branch" method="post">
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_options.jsp'"><br>
        <div class="container">
           <div class='form-container'> 
               
               
               <label><b>Branch Name:</b></label>
               <input type="textbox" name='txt_Branch'onkeypress='javascript:return isString(event)'>
               
        </select><br>
        <label><b>HOD Name: </b></label>
        <input type="textbox" name='txt_HOD_Name'onkeypress="javascript:return isString(event)">
        <label><b>Branch Full Form: </b></label>
        <input type="textbox" name='txt_Branch_Full_Form'onkeypress='javascript:return isAlphanumric(event)'>
        
        
        <input type="submit" class='btn' name='btn' value="Add">
        <input type="submit" class="btn" name="btn" value="View">
        
        </div>
        </div>
        </form> 
    </body>
</html>
