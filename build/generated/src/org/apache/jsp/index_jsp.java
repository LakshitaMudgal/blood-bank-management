package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

Integer x;
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <style>\n");
      out.write("            body{\n");
      out.write("                 background:rgb(250,160,160);\n");
      out.write("            }\n");
      out.write("            img\n");
      out.write("            {\n");
      out.write("                background-attachment:fixed;\n");
      out.write("            }\n");
      out.write("       \n");
      out.write("    #b\n");
      out.write("    {\n");
      out.write("      text-align:center; \n");
      out.write("       padding: 14px 20px;\n");
      out.write("       background:rgb(250,128,114);\n");
      out.write("    }\n");
      out.write("    a{\n");
      out.write("        text-decoration:none;\n");
      out.write("        padding: 30px;\n");
      out.write("        font-size: 2em;\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
      out.write("\n");
      out.write("         ");

           x=(Integer)application.getAttribute("cu");
           if(x==null || x==0)
           {
           out.print("Welcome to the site first time");
           x=1;
           }
           else
           {
           out.print("Welcome Again");
           x++;
           }
           application.setAttribute("cu",x);
           
         
      out.write("\n");
      out.write("         visitor  Number ");
      out.print( x);
      out.write("\n");
      out.write("                    <img src=\"blood.png\" width=\"1550\" height=\"300\">\n");
      out.write("        <div id=\"b\">\n");
      out.write("        <a href=\"http://localhost:8080/WebApplication3/blood.html\">Home</a>\n");
      out.write("        <a href=\"http://localhost:8080/WebApplication3/bloodbank.jsp\">Donar registeration</a>\n");
      out.write("        <a href=\" login.jsp\">Login</a>\n");
      out.write("        <a href=\"avv.jsp\">Availablity</a>\n");
      out.write("        <a href=\"http://localhost:8080/WebApplication3/require.jsp\">Requirement</a>\n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <marquee><<img src=\"bld3.png\" width=\"400\" height=\"300\"><img src=\"bld4.png\" width=\"400\" height=\"300\">\n");
      out.write("                <img src=\"bld.png\" width=\"400\" height=\"300\"><img src=\"bld6.png\" width=\"400\" height=\"300\"></marquee>\n");
      out.write("        </div>\n");
      out.write("     \n");
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
