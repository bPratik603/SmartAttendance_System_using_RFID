<%-- 
    Document   : Admin_Set_TimeTable
    Created on : 21 Jan, 2024, 11:59:42 AM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin Add TimeTable</title>
        <link rel="stylesheet" href="bootstrap.css">
        <style>
            body{
                background-image: url(web_images/A_21.jpg);
                background-size: cover;
            }
            .form-row{
                margin-top:17%;
                margin-left:20%;
            }
           
            button{
                margin-left:60%;
            }
            label{
	display: block;
	font-size: 20px;
	margin-top: 1rem;
	margin-right:4rem;
        color: black;
}

.Branch_Name{
    width:30%;
    height: 70px;
    
   
    background-color: transparent;
    
    align-items: center;
    font-size: 20px;
    padding-left: 10%;
    
}
.btn{
	height: 2.0rem;
	width: 7%;
	border: solid;
	outline: none;
	border-radius: 20px;
	font-size: 15px;
	font-family: Arial;
        
	background-color: gold;
	transition: .3s;
	cursor: pointer;
	
}

.btn:hover{
	background-color: yellow;
	color: black;
}

.btn2{
    width: 5%;
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
        <form action="Servlet_Admin_Add_TimeTable" method="post">
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_Select_TimeTable.jsp'"><br>
        
        <div class="Branch_Name">
           <h2 style="margin-top:0px;padding-top:10px;"><%=session.getAttribute("Branch")%> <%=session.getAttribute("Year")%> <%=session.getAttribute("Division")%> </h2>
        </div>
  <div class="form-row">
    <div class="form-group col-md-2">
      
      <label for="inputCity">Time</label>
      <input type="text" name='txt_Time'class="form-control" id="inputCity" onkeypress='javascript:return isfloat(event)' required="">
    </div>
     <div class="form-group col-md-1">
      <label for="inputCity">Mon</label>
      <input type="text" name='txt_Mon'class="form-control" id="inputCity" onkeypress='javascript:return isAplphanumric(event)'required="">
    </div>
     <div class="form-group col-md-1">
      <label for="inputCity">Tue</label>
      <input type="text" name='txt_Tue'class="form-control" id="inputCity"onkeypress='javascript:return isAplphanumric(event)' required="">
    </div>
       <div class="form-group col-md-1">
      <label for="inputCity">Wed</label>
      <input type="text" name='txt_Wed'class="form-control" id="inputCity"onkeypress='javascript:return isAplphanumric(event)' required="">
    </div>
       <div class="form-group col-md-1">
      <label for="inputCity">Thur</label>
      <input type="text" name='txt_Thu'class="form-control" id="inputCity"onkeypress='javascript:return isAplphanumric(event)'required="">
    </div>
       <div class="form-group col-md-1">
      <label for="inputCity">Fri</label>
      <input type="text" name='txt_Fri'class="form-control" id="inputCity"onkeypress='javascript:return isAplphanumric(event)'required="">
    </div>
      <div class="form-group col-md-1">
      <label for="inputCity">Sat</label>
      <input type="text" name='txt_Sat'class="form-control" id="inputCity"onkeypress='javascript:return isAplphanumric(event)'required="">
    </div>
  </div>
 
  <button type="submit" name='btn' value='Add'class="btn">ADD</button>
  
        </form>
    </body>
</html>
