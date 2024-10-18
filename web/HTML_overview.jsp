<%-- 
    Document   : HTML_overview
    Created on : 8 Dec, 2023, 9:23:47 PM
    Author     : bhosa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HTML overview</title>
    </head>
    <body>
        <form action ="index.html" method="get">
        <h1>Hello</h1>
        <h2>hello</h2>
        <h3>hello</h3>
        <h4>hello</h4>
        <h5>hello</h5>
        <h6>hello</h6>
        <p>; If you miss selective download files - that's OK
2b2c4609b01fea4803b5864137c34dd5 *..\fg-01.bin
3c970ff040f4ac24d6c2d7dbeed1bd56 *..\fg-02.bin
1ee214f361d068b325dd915f6ea0384e *..\fg-03.bin
7322a623e09da6b9182a02775f35777b *..\fg-04.bin
0590b4ae586de8986ef9fd9a4e4184f6 *..\fg-05.bin
f77df1697c2322bd6ed2fef605965e62 *..\fg-optional-arabic.bin
c9a02ddc6debfe40b4ab920383654e59 *..\fg-optional-bonus-soundtracks.bin
02e5b6bfca84dd2ff8ac2894bb9d1631 *..\fg-optional-brazilian.bin
021732c58bef2cecf778baf738ae8427 *..\fg-optional-dutch.bin
7733d172b693368ea753498f23907e00 *..\fg-optional-french.bin
698c50acafa10d48fa928fff05092aed *..\fg-optional-german.bin
dc2cbc54e7fc93e29d5fd171cd354fd1 *..\fg-optional-italian.bin
5a39cd64075e3191cb3632b5f52dc4af *..\fg-optional-mexican.bin
f8c5896b4929a66e784c8f527db8920f *..\fg-optional-polish.bin
64ff174457723a33d940d7e67db02e0b *..\fg-optional-portuguese.bin</p>
        
        <a href ="www.google.com">Spiderman</a><br>
        <img src ="Luffy.jpeg" width="250" height="500"><br>
        <label>full name</label>
        <input type ="text"><br>
        <label>password</label>
        <input type ="password" name ="txt_password" placeholder="Enter Password" /><br>
        <label>Email:</label>
        <input type ="email" name="txt_Email" placeholder="Enter Email"/><br>
        <label>Date:</label>
        <input type="date" name="txt_dob" max="2023-11-15" min="2023-11-10" /><br>
        <input type="submit" value="login here"/><br>
        <input type="button" value="signup"/><br>
        
        <label>check box:</label>
        <input type="checkbox" name="sub" value="HTML"/>HTML
        <input type="checkbox" name="sub" value="CSS"/>CSS
        <input type="checkbox" name="sub" value="JS"/>JS  <br>
        
        <label>radio button:</label>
        <input type="radio" name="sub" value="male"/>Male
        <input type="radio" name="sub" value="female"/>Female<br>
        
        <select name="city">
            <option>Gadhinglaj</option>
            <option>Ajara</option>
            <option>Chandgad</option>
            <option selected>Nipani</option>
        </select><br>
        
        <label>TextArea</label>
        <textarea name="address" rows="5" cols="10"></textarea><br>
        
        <input type="hidden" name="txt_username" value="abc@gmail.com"/><br>
        </form>
        
    </body>
</html>
