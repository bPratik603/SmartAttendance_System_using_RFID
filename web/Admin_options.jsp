<%-- 
    Document   : Admin_options
    Created on : 8 Dec, 2023, 9:17:54 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Admin options</title>
        <style>
           body{
  font-family: 'Nunito', sans-serif;
  padding: 50px;
  background-image:url(web_images/A_4.jpg);
  background-size: cover;
background-repeat: no-repeat;
}
.card{
    border-radius: 4px;
    background: #fff;
    box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);
      transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);
  padding: 14px 80px 80px 36px;
  cursor: pointer;
  width: 10%;
  
  float: left;
  margin-left: 10%;
  margin-top:10%;
  
}


.card:hover{
     transform: scale(1.05);
  box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);
}

.card h3{
  font-weight: 600;
}

.card img{
  position: absolute;
  top: 20px;
  right: 15px;
  max-height: 120px;
}


.card1{
    border-radius: 4px;
    background: #fff;
    box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);
      transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);
  padding: 14px 80px 80px 36px;
  cursor: pointer;
  width: 10%;
  
  float: left;
  margin-left: 10%;
  margin-top:10%;
  
}

.card1:hover{
     transform: scale(1.05);
  box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);
}
.card-1{
  background-image: url(web_images/L_1.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 150px;
     height: 70px;
    
    
}


.card-2{
   background-image: url(web_images/L_2.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 100px;
     height: 70px;
}

.card-3{
   background-image: url(https://ionicframework.com/img/getting-started/theming-card.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 80px;
     height: 70px;
}

.card1-4{
   background-image: url(web_images/L_3.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 150px;
     height: 70px;
}

.card1-5{
   background-image: url(web_images/L_6.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 90px;
     height: 70px;
}

.card1-6{
   background-image: url(web_images/L_7.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 170px;
     height: 70px;
}
@media(max-width: 990px){
  .card{
    margin: 20px;
  }
} 

a{
    color:black;
}

.card2{
    border-radius: 4px;
    background: #fff;
    box-shadow: 0 6px 10px rgba(0,0,0,.08), 0 0 6px rgba(0,0,0,.05);
      transition: .3s transform cubic-bezier(.155,1.105,.295,1.12),.3s box-shadow,.3s -webkit-transform cubic-bezier(.155,1.105,.295,1.12);
  padding: 14px 80px 80px 36px;
  cursor: pointer;
  width: 10%;
  
  float: left;
  margin-left: 20%;
  margin-top:6%;
  
}

.card2:hover{
     transform: scale(1.05);
  box-shadow: 0 10px 20px rgba(0,0,0,.12), 0 4px 8px rgba(0,0,0,.06);
}

.card2-1{
   background-image: url(web_images/L_11.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 100px;
    height: 60px;
    margin-left: 10%;
    margin-top:10%;
    height: 70px;
}

.card2-2{
   background-image: url(web_images/L_4.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 110px;
     height: 60px;
}

.card2-3{
   background-image: url(web_images/L_13.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 120px;
    height: 60px;
    margin-left: 38%;
    margin-top:10%;
    height: 70px;
}
.btn2{
    width: 7%;
    margin-left: 0%;
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
         <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Admin_login.jsp'"><br>
        <div class="container">
  <div class="row">
    <div class="col-md-4">
       <a href="Admin_Select_Student_Details.jsp">
      <div class="card card-1">
          <img href='url(web_images/L_1.png)'>
        <h2>Student Details</h2>
        
      </div>
       </a>
    </div>
      
      <div class="col-md-4">
        <a href='Admin_Select_Student_Attendance.jsp'>
      <div class="card card-3">
        <h2>Student Attendance</h2>
      </div>
        </a>
    </div>
      
    <div class="col-md-4">
       <a href='Admin_Add_Faculty.jsp'>
      <div class="card1 card1-4">
          <img href='url(web_images/L_1.png)'>
        <h2>Faculty</h2>
      </div>
        </a>
    </div>
    
  </div>
</div>
        
   <div class="container">
  <div class="row">
    
    <div class="col-md-4">
        <a href='Admin_Choose_Time_Table.jsp'>
      <div class="card1 card1-5">
          <h2>Time Table</h2>
      </div>
          </a>
    </div>
    
      <div class="col-md-4">
        <a href='Admin_Add_Branch.jsp'>
      <div class="card1 card1-6">
          <h2>ADD Branch  </h2>
      </div>
          </a>
    </div>
      
      <div class="col-md-4">
        <a href='Admin_Select_TimeTable.jsp'>
      <div class="card2 card2-1">
          <h2>Set TimeTable</h2>
      </div>
          </a>
  </div>
</div>     
       <div class="container">
           <div class="row">
               <div class="col-md-4" style="">
        <a href='Select_Reports.jsp'>
      <div class="card2 card2-3">
          <h2>Reports</h2>
      </div>
          </a>
  </div>
           </div>
       </div>
    </body>
</html>
