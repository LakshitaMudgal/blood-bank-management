<%-- 
    Document   : donarr1
    Created on : 10 Mar, 2025, 10:55:55 PM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <style>
            body
            {
                margin:3%;
                background:rgb(250,160,160);
            }
            #a{
                color:red;
            }
        </style>
       
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! String nm,bl,mbn,el,a,cc,mhh;%>
        <%
            nm=(String)session.getAttribute("na");
            bl=(String)session.getAttribute("bg");
            mbn=(String)session.getAttribute("mbn");
            el=(String)session.getAttribute("em");
            a=(String)session.getAttribute("ag");
            cc=(String)session.getAttribute("ci");
            mhh=(String)session.getAttribute("mh");
             
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
             PreparedStatement ss=c.prepareStatement("insert into donar values(?,?,?,?,?,?,?)");
            ss.setString(1,nm);
            ss.setString(2,bl);
            ss.setString(3,mbn);
            ss.setString(4,el);
           
            ss.setString(5,a);
             ss.setString(6,cc);
              ss.setString(7,mhh);
            ss.executeUpdate();
            
            ss.close();
            }
            catch(Exception e){}
            %>
    <center> <h1 id="a">SUCCESSFULLY REGISTERED</h1> </center>
       
   <%@include file='login.jsp' %>
    </body>
</html>
