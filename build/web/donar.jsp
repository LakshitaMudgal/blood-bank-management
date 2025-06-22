<%-- 
    Document   : donar
    Created on : 10 Mar, 2025, 9:44:19 AM
    Author     : DR. Nidhi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
         <style>
            table
            {
             padding:5px;  
             margin-top:5%;
            }
            
            a{
               background:rgb(229,228,226);
                text-decoration: none;
                border:1px solid black;
                padding:2px;
                color:black;
                
           
            }
        </style>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Donar</title>
    </head>
    <body>
       
        <%!String m,n,o,p,q,r,rr;%>
        <%
            m=request.getParameter("a");
             n=request.getParameter("b");
            o=request.getParameter("c");
           p=request.getParameter("d");
           q=request.getParameter("e");
           r=request.getParameter("f");
            rr=request.getParameter("g");
          
           session.setAttribute("na",m);
           session.setAttribute("bg",n);
           session.setAttribute("mbn",o);
           session.setAttribute("em",p);
           session.setAttribute("ag",q);
            session.setAttribute("ci",r);
            session.setAttribute("mh",rr);
           %>
    <center>
        <h3>Check Your Details</h3>
        
           <table>
               <tr>
               <td>your name is <td><%= m%>
               </tr>
               <tr>
               <td>your Blood Group is <td><%= n%>
               </tr>
               <tr>
               <td>your Mobile No. is <td><%= o%>
               </tr>
               <tr>
               <td>your Email is <td><%= p%>
               </tr>
               <tr>
               <td>your Age is <td><%= q%>
               </tr>
                <tr>
               <td>your City is <td><%= r%>
               </tr>
               <tr>
               <td>your Medical History is <td><%= rr%>
               </tr>
           </table>
               <button onclick="history.back()">back</button>&nbsp&nbsp&nbsp&nbsp
               <a href="donarr1.jsp">final submit</a>
                              </center>
    </body>
</html>
