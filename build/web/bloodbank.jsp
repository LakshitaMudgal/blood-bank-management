<%-- 
    Document   : bloodbank
    Created on : 8 Mar, 2025, 9:35:21 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%!Random ra=new Random();
int rm;
%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background:rgb(250,160,160);
           
            }
             img
            {
                background-attachment:fixed;
            }
            table
            {
             padding:5px;  
             margin-top:3%;
            }
            td{
                font-size:1em;
            }
            
        </style>
        <script>
           
           
            function aa()
            {
                var nn=document.getElementById("h").value;
              var kk=document.getElementById("hh").value;
               if(nn!=kk)
              {
                  alert("Captcha did not match");
                  return false;
              }
            }
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donar Registration</title>
    </head>
    <body>
         <img src="blood.png" width="1550" height="250">
    <center>
        <form action="http://localhost:8080/WebApplication3/donar.jsp" onsubmit="return aa()">
            <table cellspacing="20px">
                <tr>
                <td>Name<td><input type="text" name="a">
                    </tr>
                    <tr>
                        <td>Blood group<td>
                            <select name="b">
                                <option >AB+</option> 
                               <option >AB-</option> 
                                <option >A+</option> 
                                <option>A-</option> 
                                <option>B+</option> 
                                <option >B-</option> 
                                <option >O+</option> 
                                <option>O-</option>
                            </select>
                  
                    </tr>
                    <tr>
                        <td>MobiteNo.<td><input type="number" name="c">
                            
                    </tr>
                    <tr>
                        <td>Email<td><input type="email" name="d">
                            
                    </tr>
                    <tr>
                        <td>Age<td><input type="text" name="e">
                    </tr>
                       <tr>
                        <td>City<td><input type="text" name="f">
                    </tr>
                     <tr>
                        <td>Medical History<td><input type="text" name="g">
                    </tr>
                     <tr>
                          <%rm=ra.nextInt(1000);%>
                        <td>Captcha<td><input type="text"   value=<%= rm%> id="h">
                    </tr>
                     <tr>
                        <td>Enter Captcha<td><input type="text" id="hh">
                    </tr>
                                
            </table>
            <input type="submit" value="Register">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp
            <input type="Reset">
            
        </form>
    </center>
    <script>
            var y=Math.floor(Math.random()*5+1);
            var yy=document.getElementById("h");
             if(y==1)
            {
            yy.style.background="yellow";
            yy.style.fontFamily="Courier New";
            yy.style.fontSize="1em";
            yy.style.border="none";
        }
            
        if(y==2)
        {
          yy.style.background="pink";
            yy.style.fontFamily="Georgia";
           
            yy.style.border="none";   
        }
        if(y==3)
        {
          yy.style.background="cyan";
            yy.style.fontFamily="Cursive";
            yy.style.border="none";  
        }
         if(y==4)
        {
          yy.style.background="rgb(147,197,114)";
            yy.style.fontFamily="Lucida Handwriting";
            yy.style.border="none";  
        }
         if(y==5)
        {
          yy.style.background="rgb(204,204,255)";
            yy.style.fontFamily="Roman";
            yy.style.border="none";  
        }
    </script>
    </body>
</html>
