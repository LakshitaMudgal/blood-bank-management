<%-- 
    Document   : require
    Created on : 17 Mar, 2025, 8:25:13 PM
    Author     : DR. Nidhi Sharma
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Random"%>
<%!Random rr=new Random();
int ra;
%>



<!DOCTYPE html>
<html>
    <head>
        <style>
            body{
                background-image:url('bldd1.png');
                 background-size:cover;
            }
            table
            {
             margin:10%;
             
            }
            p{
                margin:2%;
            }
           
        </style>
        <script>

            
            
            function mm()
            {
                var mn=document.getElementById("z").value;
              var n=document.getElementById("zz").value;
              var k=document.getElementById("cc").value;
              if(n!=k)
              {
                  alert("Captcha did not match");
                  return false;
              }
              if(mn=="")
              {
                  alert("Mobile no. cannot be empty");
                  return false;
              }
             
            }
            
        </script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Require</title>
    </head>
    <body>
        
       
       <center>

        <form action="require1.jsp" onsubmit="return mm()">
            
            <table cellspacing="10px">
                <tr>
                    <td>Name<td><input type="text" id="x" name="w">
                        
                </tr>
                <tr>
                <td> Blood Group<td> <input type="text" id="y" name="v">
                </tr>
                <tr>
                    <td>Mobile No.<td><input type="number" id="z" name="ww">
                </tr>
                 <tr>
                    <td>Units Required<td><input type="text" id="yy" name="vv">
                </tr>
                 <tr>
                     <td>For whom do you require Blood<td>
                </tr>
                <tr>
                    <td><input type="radio" value="Yourself" name="a">Yourself
                    <input type="radio" value="Someone you know" name="a">Someone You Know
                    <input type="radio" value="Others"name="a">OTHERS
                    <td>
                </tr>
                <tr>
                   <%ra=rr.nextInt(1000);%>
                    <td>Captcha<td><input type="text" value=<%= ra%> id="zz">
                </tr>
                <tr>
                    <td>Enter Captcha<td><input type="text" name="xx" id="cc">
                </tr>
                <tr>
                    <td>   <td><input type="submit" value="NEXT">
                </tr>
            </table>
               
                
        </form>
        </center>
    <script>
        
                     
   
			var x=Math.floor(Math.random()*3+1);
		
	
            var p=document.getElementById("zz");
             if(x==1)
            {
            p.style.background="yellow";
            p.style.fontFamily="Verdana";
            p.style.fontSize="1em";
            p.style.border="none";
        }
            
        if(x==2)
        {
          p.style.background="pink";
            p.style.fontFamily="Georgia";
            
            p.style.border="none";   
        }
        if(x==3)
        {
          p.style.background="cyan";
            p.style.fontFamily="Cursive";
            p.style.border="none";  
        }
    </script>
    </body>
</html>
