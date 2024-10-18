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
        <title>Attendance</title>
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
	
}

.container{
	display: flex;
	box-shadow: 0 0 40px skyblue;
        height: 400px;
	width: 450px;
        margin-left:27%;
        margin-top:10%;
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
	background-color: lightyellow;
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

.btn2{
    width: 5%;
    margin-left: 1%;
    background-color: gold;
    margin-top: 0.2rem;
    margin-bottom: 1rem;
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
@media only screen and (max-width: 700px){

	body{
		height: 100%;
	}
	.container{
		margin: 2rem;
		flex-direction: column;

	}

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

.txt{
	height:10%;
        width: 30%;
        margin-top:35%;
        border-radius: 10%;
}
        </style>
    </head>
    <body>
        <input type="button" class='btn2' value="Back" onclick="window.window.location.href='Student_options.jsp'"/><br>
        <div class="container">
		<div class="form-container">
	            
                    <input type="text" class="txt" name="txt_Attendance" id="barcodeInput"/>
                    <input type="button" value="View Attendance" class="btn" onclick="window.window.location.href='Tushar.jsp'"/>
                </div>
        </div>
                         
        <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
        
        <script>
$(document).ready(function(){
    $('#barcodeInput').on('keyup', function(event) {
        var barcode = $(this).val().trim();
        if (barcode.length === 6) { // Assuming only the first number of the barcode is scanned
            $.ajax({
                type: "POST",
                url: "Add_Attendance.jsp",
                data: { barcode: barcode },
                success: function(response) {
                    alert('Barcode scanned successfully: ' + response);
                },
                error: function(xhr, status, error) {
                    alert('Error scanning barcode: ' + error);
                }
            });
            $(this).val(''); // Clear the input field after scanning
        }
    });
});
</script>

    
    </body>
   
</html>


