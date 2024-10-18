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
        <title>Student options</title>
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
  margin-top:15%;
  
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
  margin-left: 38%;
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
    
    
}



.card-2{
   background-image: url(https://ionicframework.com/img/getting-started/theming-card.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 80px;
}



.card-3{
   background-image: url(web_images/L_6.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 100px;
}

.card1-1{
   background-image: url(web_images/L_4.png);
      background-repeat: no-repeat;
    background-position: right;
    background-size: 100px;
}
@media(max-width: 990px){
  .card{
    margin: 20px;
  }
} 

a{
    color:black;
}
</style>
    </head>
    <body>
        
        <div class="container">
  <div class="row">
    <div class="col-md-4">
       <a href="Student_Profile.jsp">
      <div class="card card-1">
          <img href='url(web_images/L_1.png)'>
        <h2>Profile</h2>
        
      </div>
       </a>
    </div>
    
       </a>
    </div>
    <div class="col-md-4">
        <a href="Attendance.jsp">
      <div class="card card-2">
          
        <h2>Attendance</h2>
          
      </div>
        </a>
    </div>
  </div>
</div>
        
   <div class="col-md-4">
        <a href='Student_view_timetable.jsp'>
      <div class="card card-3">
          <h2>Time Table  </h2>
      </div>
          </a>
    </div>
    <div class="col-md-4">
        <a href='Student_login.jsp'>
      <div class="card1 card1-1">
          <h2>Back  </h2>
      </div>
          </a>
    </div>
    

    
  </div>
</div>     
    </body>
</html>
