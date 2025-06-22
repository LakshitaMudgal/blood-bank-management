<%-- 
    Document   : available
    Created on : 11 Mar, 2025, 10:00:37 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="java.sql.*"%>
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
        <title>AVAILABLE</title>
    </head>
    <body>
       
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
                 <th>Name</th>
                <th>Blood GROUP</th>
                 <th>MOBILE NUMBER</th>
                <th>EMAIL</th>
                <th>AGE</th>
                <th>CITY</th>
             
            </tr>
        <%
        try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
            PreparedStatement s=c.prepareStatement("select * from donar");
              ResultSet r=s.executeQuery();
             //out.println("valid");
            while(r.next())
            {
             %>
            
             <tr>
                 <td><%= r.getString(1)%>
                     
                <td><%= r.getString(2)%>
                <td><%= r.getString(3)%>
                <td><%= r.getString(4)%>
                 <td><%= r.getString(5)%>
                 <td><%= r.getString(6)%>
              
                
             </tr>
             <%
            }
  
            }
         catch(Exception e){}
            %>
            </table>
            
    </body>
</html>
