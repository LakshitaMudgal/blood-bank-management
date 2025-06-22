<%-- 
    Document   : avv
    Created on : 24 Mar, 2025, 9:38:10 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <style>
            #x
            {
                padding:5px;
            }
            body
            {
            background:rgb(250,160,160);
            }
            a{
                margin:3%;

                text-decoration:none;
            }
            #aa
            {
                
                
            }
            table
            {
                margin:3%;
               
            }
            td
            {
                padding:5px;
                
            }
            
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%response.setIntHeader("refresh",5);%>
         <form action="avail1.jsp">
             <table  id="x" >
                 <th> SEARCH&nbsp&nbsp</th>
                 <tr>
                     <td>
                 </tr>
                
             </tr>
                <tr>
                <td>City<td><input type="text" name="x">
                    </tr>
                    <tr>
                        <td>Blood group<td><input type="text" name="y">
                    </tr>
                    <tr>
                        <td>
                    </tr>
                    <tr>
                        <td> <input type="submit" value="Go"><td>
                    </tr>
                   
             </table>
        </form>
        
        <table border="1" >
            <tr>
                 
                <th>Blood GROUP</th>
                
                <th>UNITS</th>
               
             
            </tr>
        <%
        try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
            PreparedStatement s=c.prepareStatement("select bldgrp,count(*) from donar group by bldgrp");
              ResultSet r=s.executeQuery();
             //out.println("valid");
            while(r.next())
            {
             %>
            
             <tr>
                 <td><%= r.getString(1)%>
                     
                <td><%= r.getString(2)%>
                 
             </tr>
             <%
            }
  
            }
         catch(Exception e){}
            %>
            </table>
            
    </body>
</html>
