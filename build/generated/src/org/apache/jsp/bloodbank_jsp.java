package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class bloodbank_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Random ra=new Random();
int rm;

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background:rgb(250,160,160);\n");
      out.write("           \n");
      out.write("            }\n");
      out.write("             img\n");
      out.write("            {\n");
      out.write("                background-attachment:fixed;\n");
      out.write("            }\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("             padding:5px;  \n");
      out.write("             margin-top:3%;\n");
      out.write("            }\n");
      out.write("            td{\n");
      out.write("                font-size:1em;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("           \n");
      out.write("           \n");
      out.write("            function aa()\n");
      out.write("            {\n");
      out.write("                var nn=document.getElementById(\"h\").value;\n");
      out.write("              var kk=document.getElementById(\"hh\").value;\n");
      out.write("               if(nn!=kk)\n");
      out.write("              {\n");
      out.write("                  alert(\"Captcha did not match\");\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Donar Registration</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <img src=\"blood.png\" width=\"1550\" height=\"250\">\n");
      out.write("    <center>\n");
      out.write("        <form action=\"http://localhost:8080/WebApplication3/donar.jsp\" onsubmit=\"return aa()\">\n");
      out.write("            <table cellspacing=\"20px\">\n");
      out.write("                <tr>\n");
      out.write("                <td>Name<td><input type=\"text\" name=\"a\">\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Blood group<td>\n");
      out.write("                            <select name=\"b\">\n");
      out.write("                                <option >AB+</option> \n");
      out.write("                               <option >AB-</option> \n");
      out.write("                                <option >A+</option> \n");
      out.write("                                <option>A-</option> \n");
      out.write("                                <option>B+</option> \n");
      out.write("                                <option >B-</option> \n");
      out.write("                                <option >O+</option> \n");
      out.write("                                <option>O-</option>\n");
      out.write("                            </select>\n");
      out.write("                  \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>MobiteNo.<td><input type=\"number\" name=\"c\">\n");
      out.write("                            \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Email<td><input type=\"email\" name=\"d\">\n");
      out.write("                            \n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Age<td><input type=\"text\" name=\"e\">\n");
      out.write("                    </tr>\n");
      out.write("                       <tr>\n");
      out.write("                        <td>City<td><input type=\"text\" name=\"f\">\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>Medical History<td><input type=\"text\" name=\"g\">\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                          ");
rm=ra.nextInt(1000);
      out.write("\n");
      out.write("                        <td>Captcha<td><input type=\"text\"   value=");
      out.print( rm);
      out.write(" id=\"h\">\n");
      out.write("                    </tr>\n");
      out.write("                     <tr>\n");
      out.write("                        <td>Enter Captcha<td><input type=\"text\" id=\"hh\">\n");
      out.write("                    </tr>\n");
      out.write("                                \n");
      out.write("            </table>\n");
      out.write("            <input type=\"submit\" value=\"Register\">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp\n");
      out.write("            <input type=\"Reset\">\n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </center>\n");
      out.write("    <script>\n");
      out.write("            var y=Math.floor(Math.random()*5+1);\n");
      out.write("            var yy=document.getElementById(\"h\");\n");
      out.write("             if(y==1)\n");
      out.write("            {\n");
      out.write("            yy.style.background=\"yellow\";\n");
      out.write("            yy.style.fontFamily=\"Courier New\";\n");
      out.write("            yy.style.fontSize=\"1em\";\n");
      out.write("            yy.style.border=\"none\";\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("        if(y==2)\n");
      out.write("        {\n");
      out.write("          yy.style.background=\"pink\";\n");
      out.write("            yy.style.fontFamily=\"Georgia\";\n");
      out.write("           \n");
      out.write("            yy.style.border=\"none\";   \n");
      out.write("        }\n");
      out.write("        if(y==3)\n");
      out.write("        {\n");
      out.write("          yy.style.background=\"cyan\";\n");
      out.write("            yy.style.fontFamily=\"Cursive\";\n");
      out.write("            yy.style.border=\"none\";  \n");
      out.write("        }\n");
      out.write("         if(y==4)\n");
      out.write("        {\n");
      out.write("          yy.style.background=\"rgb(147,197,114)\";\n");
      out.write("            yy.style.fontFamily=\"Lucida Handwriting\";\n");
      out.write("            yy.style.border=\"none\";  \n");
      out.write("        }\n");
      out.write("         if(y==5)\n");
      out.write("        {\n");
      out.write("          yy.style.background=\"rgb(204,204,255)\";\n");
      out.write("            yy.style.fontFamily=\"Roman\";\n");
      out.write("            yy.style.border=\"none\";  \n");
      out.write("        }\n");
      out.write("    </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
