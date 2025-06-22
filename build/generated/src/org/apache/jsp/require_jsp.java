package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;

public final class require_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Random rr=new Random();
int ra;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body{\n");
      out.write("                background-image:url('bldd1.png');\n");
      out.write("                 background-size:cover;\n");
      out.write("            }\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("             margin:10%;\n");
      out.write("             \n");
      out.write("            }\n");
      out.write("            p{\n");
      out.write("                margin:2%;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("        </style>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            function mm()\n");
      out.write("            {\n");
      out.write("                var mn=document.getElementById(\"z\").value;\n");
      out.write("              var n=document.getElementById(\"zz\").value;\n");
      out.write("              var k=document.getElementById(\"cc\").value;\n");
      out.write("              if(n!=k)\n");
      out.write("              {\n");
      out.write("                  alert(\"Captcha did not match\");\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("              if(mn==\"\")\n");
      out.write("              {\n");
      out.write("                  alert(\"Mobile no. cannot be empty\");\n");
      out.write("                  return false;\n");
      out.write("              }\n");
      out.write("             \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Require</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("       <center>\n");
      out.write("\n");
      out.write("        <form action=\"require1.jsp\" onsubmit=\"return mm()\">\n");
      out.write("            \n");
      out.write("            <table cellspacing=\"10px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name<td><input type=\"text\" id=\"x\" name=\"w\">\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td> Blood Group<td> <input type=\"text\" id=\"y\" name=\"v\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Mobile No.<td><input type=\"number\" id=\"z\" name=\"ww\">\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                    <td>Units Required<td><input type=\"text\" id=\"yy\" name=\"vv\">\n");
      out.write("                </tr>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>For whom do you require Blood<td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td><input type=\"radio\" value=\"Yourself\" name=\"a\">Yourself\n");
      out.write("                    <input type=\"radio\" value=\"Someone you know\" name=\"a\">Someone You Know\n");
      out.write("                    <input type=\"radio\" value=\"Others\"name=\"a\">OTHERS\n");
      out.write("                    <td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                   ");
ra=rr.nextInt(3);
      out.write("\n");
      out.write("                    <td>Captcha<td><input type=\"text\" value=");
      out.print( ra);
      out.write(" id=\"zz\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Enter Captcha<td><input type=\"text\" name=\"xx\" id=\"cc\">\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>   <td><input type=\"submit\" value=\"NEXT\">\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("               \n");
      out.write("                \n");
      out.write("        </form>\n");
      out.write("        </center>\n");
      out.write("    <script>\n");
      out.write("        \n");
      out.write("            \n");
      out.write("            var x=Math.random(3);\n");
      out.write("            alert(x);\n");
      out.write("            var p=document.getElementById(\"zz\");\n");
      out.write("             if(p==0)\n");
      out.write("            {\n");
      out.write("            p.style.background=\"grey\";\n");
      out.write("            p.style.fontFamily=\"Verdana\";\n");
      out.write("            p.style.font-size=\"1em\";\n");
      out.write("            p.style.border=\"none\";\n");
      out.write("        }\n");
      out.write("            \n");
      out.write("            if(p==1)\n");
      out.write("            {\n");
      out.write("            p.style.background=\"yellow\";\n");
      out.write("            p.style.fontFamily=\"Arial\";\n");
      out.write("            p.style.border=\"none\";\n");
      out.write("        }\n");
      out.write("        if(p==2)\n");
      out.write("        {\n");
      out.write("          p.style.background=\"pink\";\n");
      out.write("            p.style.fontFamily=\"Georgia\";\n");
      out.write("            \n");
      out.write("            p.style.border=\"none\";   \n");
      out.write("        }\n");
      out.write("        if(p==3)\n");
      out.write("        {\n");
      out.write("          p.style.background=\"cyan\";\n");
      out.write("            p.style.fontFamily=\"Cursive\";\n");
      out.write("            p.style.border=\"none\";  \n");
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
