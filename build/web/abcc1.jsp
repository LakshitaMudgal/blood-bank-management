<%-- 
    Document   : abcc1
    Created on : 25 Mar, 2025, 9:59:13 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <jsp:useBean id="x" scope="session" class="abcd.my"></jsp:useBean>
       <jsp:setProperty name="x" property="*"/>
       <jsp:getProperty name="x" property="na"/>
    </body>
</html>
