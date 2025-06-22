package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class available_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            #x\n");
      out.write("            {\n");
      out.write("                padding:5px;\n");
      out.write("            }\n");
      out.write("            body\n");
      out.write("            {\n");
      out.write("            background:rgb(250,160,160);\n");
      out.write("            }\n");
      out.write("            a{\n");
      out.write("                margin:3%;\n");
      out.write("\n");
      out.write("                text-decoration:none;\n");
      out.write("            }\n");
      out.write("            #aa\n");
      out.write("            {\n");
      out.write("                \n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            table\n");
      out.write("            {\n");
      out.write("                margin:3%;\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            td\n");
      out.write("            {\n");
      out.write("                padding:5px;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>AVAILABLE</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        <form action=\"avail1.jsp\">\n");
      out.write("             <table  id=\"x\" >\n");
      out.write("                 <th> SEARCH&nbsp&nbsp</th>\n");
      out.write("                 <tr>\n");
      out.write("                     <td>\n");
      out.write("                 </tr>\n");
      out.write("                \n");
      out.write("             </tr>\n");
      out.write("                <tr>\n");
      out.write("                <td>City<td><input type=\"text\" name=\"x\">\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Blood group<td><input type=\"text\" name=\"y\">\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td> <input type=\"submit\" value=\"Go\"><td>\n");
      out.write("                    </tr>\n");
      out.write("                   \n");
      out.write("             </table>\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("        <table border=\"1\" >\n");
      out.write("            <tr>\n");
      out.write("                 <th>Name</th>\n");
      out.write("                <th>Blood GROUP</th>\n");
      out.write("                 <th>MOBILE NUMBER</th>\n");
      out.write("                <th>EMAIL</th>\n");
      out.write("                <th>AGE</th>\n");
      out.write("                <th>CITY</th>\n");
      out.write("             \n");
      out.write("            </tr>\n");
      out.write("        ");

        try
            {
             Class.forName("com.mysql.jdbc.Driver");
             Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood","root","1234");
            PreparedStatement s=c.prepareStatement("select * from donar");
              ResultSet r=s.executeQuery();
             //out.println("valid");
            while(r.next())
            {
             
      out.write("\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("                 <td>");
      out.print( r.getString(1));
      out.write("\n");
      out.write("                     \n");
      out.write("                <td>");
      out.print( r.getString(2));
      out.write("\n");
      out.write("                <td>");
      out.print( r.getString(3));
      out.write("\n");
      out.write("                <td>");
      out.print( r.getString(4));
      out.write("\n");
      out.write("                 <td>");
      out.print( r.getString(5));
      out.write("\n");
      out.write("                 <td>");
      out.print( r.getString(6));
      out.write("\n");
      out.write("              \n");
      out.write("                \n");
      out.write("             </tr>\n");
      out.write("             ");

            }
  
            }
         catch(Exception e){}
            
      out.write("\n");
      out.write("            </table>\n");
      out.write("            \n");
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
