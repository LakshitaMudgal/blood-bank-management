package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class donar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

String m,n,o,p,q,r,rr;
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
      out.write("            table\n");
      out.write("            {\n");
      out.write("             padding:5px;  \n");
      out.write("             margin-top:5%;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            a{\n");
      out.write("               background:rgb(229,228,226);\n");
      out.write("                text-decoration: none;\n");
      out.write("                border:1px solid black;\n");
      out.write("                padding:2px;\n");
      out.write("                color:black;\n");
      out.write("                \n");
      out.write("           \n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Donar</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("        ");
      out.write("\n");
      out.write("        ");

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
           
      out.write("\n");
      out.write("    <center>\n");
      out.write("        <h3>Check Your Details</h3>\n");
      out.write("        \n");
      out.write("           <table>\n");
      out.write("               <tr>\n");
      out.write("               <td>your name is <td>");
      out.print( m);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>your Blood Group is <td>");
      out.print( n);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>your Mobile No. is <td>");
      out.print( o);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>your Email is <td>");
      out.print( p);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>your Age is <td>");
      out.print( q);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("                <tr>\n");
      out.write("               <td>your City is <td>");
      out.print( r);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("               <tr>\n");
      out.write("               <td>your Medical History is <td>");
      out.print( rr);
      out.write("\n");
      out.write("               </tr>\n");
      out.write("           </table>\n");
      out.write("               <button onclick=\"history.back()\">back</button>&nbsp&nbsp&nbsp&nbsp\n");
      out.write("               <a href=\"donarr1.jsp\">final submit</a>\n");
      out.write("                              </center>\n");
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
