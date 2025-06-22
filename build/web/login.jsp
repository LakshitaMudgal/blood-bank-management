<%-- 
    Document   : login
    Created on : 20 Mar, 2025, 11:17:13 PM
    Author     : DR. Nidhi Sharma
--%>
<html>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
    <head>
        <style>
            body
            {
                background:url('bldd1.png');
                background-size:cover;
            }
            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
    <center>
        <div><h1>BLOOD BANK USER LOGIN</h1></div>
        </center>
    <div></div>
        <div> <marquee><img src="bld3.png" width="400" height="200"><img src="bld4.png" width="400" height="200">
            <img src="bld.png" width="400" height="200"><img src="bld6.png" width="400" height="200"></marquee></div>
    <center>
        <form action=" login1.jsp">
            
        <table cellspacing="30px">
            <tr>
                <th>LOGIN</th>
            </tr>
            <tr>
                <td>Mobile number<td><input type="number" name="w">
                
            </tr>
            <tr>
                <td>Email<td><input type="email" name="ww">
            </tr>
            <tr>
                <td> <input type="submit" value="Login">
                <td><input type="submit" value="Register">
            </tr>
        </table>
        </form>
        </center>
    </body>
</html>
