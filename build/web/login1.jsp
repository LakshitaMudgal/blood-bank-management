<%-- 
    Document   : login1
    Created on : 21 Mar, 2025, 2:10:36 PM
    Author     : DR. Nidhi Sharma
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       <%! String v,vv;%>
       <%
           v=request.getParameter("w");
           vv=request.getParameter("ww");
           try
           {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
             PreparedStatement s=c.prepareStatement("select * from donar where mn=? and email=?");
             s.setString(1,v);
             s.setString(2,vv);
            // out.println("valid");
             ResultSet r=s.executeQuery();
             //out.println("valid");
             //out.print(r.next());
            if(r.next())
                     {
                       response.sendRedirect("available.jsp");
                     
                     }
             else
             {
                response.sendRedirect("bloodbank.jsp");
             }
             
           }
           catch(Exception e){}
           %>
       
    </body>
</html>
