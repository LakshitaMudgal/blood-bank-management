<%-- 
    Document   : index
    Created on : 24 Mar, 2025, 10:02:37 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
       
    #b
    {
      text-align:center; 
       padding: 14px 20px;
       background:rgb(250,128,114);
    }
    a{
        text-decoration:none;
        padding: 30px;
        font-size: 2em;
    }
    

        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%!Integer x;%>
         <%
           x=(Integer)application.getAttribute("cu");
           if(x==null || x==0)
           {
           out.print("Welcome to the site first time");
           x=1;
           }
           else
           {
           out.print("Welcome Again");
           x++;
           }
           application.setAttribute("cu",x);
           
         %>
         visitor  Number <%= x%>
                    <img src="blood.png" width="1550" height="300">
        <div id="b">
        <a href="http://localhost:8080/WebApplication3/blood.html">Home</a>
        <a href="http://localhost:8080/WebApplication3/bloodbank.jsp">Donar registeration</a>
        <a href=" login.jsp">Login</a>
        <a href="avv.jsp">Availablity</a>
        <a href="http://localhost:8080/WebApplication3/require.jsp">Requirement</a>
        </div>
        <div>
            <marquee><<img src="bld3.png" width="400" height="300"><img src="bld4.png" width="400" height="300">
                <img src="bld.png" width="400" height="300"><img src="bld6.png" width="400" height="300"></marquee>
        </div>
     
    </body>
</html>
