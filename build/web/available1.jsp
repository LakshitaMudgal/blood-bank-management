<%-- 
    Document   : available1
    Created on : 12 Mar, 2025, 9:37:33 AM
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
         <%! String x,y,z,x1,y1,z1;%>
        <%
           x=request.getParameter("a");
           y=request.getParameter("b");
           z=request.getParameter("c");
           x1=request.getParameter("d");
           y1=request.getParameter("e");
           z1=request.getParameter("f");
           
        try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
            PreparedStatement s=c.prepareStatement("select * from donar");
             s.setString(1,x);
             s.setString(2,y);
             s.setString(3,z);
             s.setString(4,x1);
             s.setString(5,y1);
             s.setString(6,z1);
              ResultSet r=s.executeQuery();
             //out.println("valid");
             if(r.next())
                     {
                      out.println(r);
                     
                     }
             else
             {
               out.println("");
             }
            
            }
            catch(Exception e){}
            %>
    </body>
</html>
