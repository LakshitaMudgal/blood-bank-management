<%-- 
    Document   : avail1
    Created on : 17 Mar, 2025, 9:26:13 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body
            {
            background:rgb(250,160,160);
            }
            table{
                margin:3%;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Availablity</title>
    </head>
    <body>
          <table border="1" >
            <tr>
                <th>CITY</th>
                <th>BLOOD GROUP</th>
                
            </tr>
       <%! String m,n; %>
       <% 
         m=request.getParameter("x");
         n=request.getParameter("y");
         try
         {
           Class.forName("com.mysql.jdbc.Driver");
           Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
           PreparedStatement s=c.prepareStatement("select * from donar where city=? and bldgrp=?");
           s.setString(1, m);
           s.setString(2,n);
           ResultSet r=s.executeQuery();
           while(r.next())
           {
            %>
               
                <tr>
                    <td><%= r.getString(6)%></td>
                     <td><%= r.getString(2)%></td>
                    
                </tr>
            </table>
          <% 
           }
          
         }
          
            catch(Exception e){}
          %>       
        
  
    </body>
</html>
