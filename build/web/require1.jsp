<%-- 
    Document   : require1
    Created on : 19 Mar, 2025, 9:39:21 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="java.sql.*"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <style>
            body
            {
                background:url('bldd1.png');
                background-size:cover;
            }
            table
            {
                margin:10%;
                border:none;
            }
            td{
                padding:10px;
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
 
    <body>
        <%! String g,h,i,j,k; %>
        <%
          g=request.getParameter("w");
          h=request.getParameter("v");
          i=request.getParameter("ww");
          j=request.getParameter("vv");
          k=request.getParameter("a");
            try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
             PreparedStatement ss=c.prepareStatement("insert into rqre values(?,?,?,?,?)");
            ss.setString(1,g);
            ss.setString(2,h);
            ss.setString(3,i);
            ss.setString(4,j);
           
            ss.setString(5,k);
             
            ss.executeUpdate();
            
            ss.close();
            }
            catch(Exception e){}
        %>
    <center>
        <table cellspacing="30px" border="1">
               <tr>
               <td>Name is  <td><%= g%>
               </tr>
               <tr>
               <td>Blood Group is  <td><%= h%>
               </tr>
               <tr>
               <td>Mobile No. is <td><%= i%>
               </tr>
               <tr>
               <td>Units Required <td><%= j%>
               </tr>
               <tr>
               <td>For Whom <td><%= k%>
               </tr>
               
           </table>
    </center>
    </body>
</html>
