package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.IOException.*;

public final class session2_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static java.util.List _jspx_dependants;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    JspFactory _jspxFactory = null;
    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
 
String text3=request.getParameter("t3");
session.setAttribute("sessionvalue3", text3);
String text4=request.getParameter("t4");
session.setAttribute("sessionvalue4", text4);
String text5=request.getParameter("t5");
session.setAttribute("sessionvalue5", text5);
String text6=request.getParameter("t6");
session.setAttribute("sessionvalue6", text6);
String text9=request.getParameter("cname");
session.setAttribute("sessionvalue9", text9);
String text10=request.getParameter("cno");
session.setAttribute("sessionvalue10", text10);
String text11=request.getParameter("exp");
session.setAttribute("sessionvalue11", text11);
String text12=request.getParameter("cvvno");
session.setAttribute("sessionvalue12", text12);

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <body>\n");
      out.write("        <a href=\"session3.jsp\">Click to generate Innvoice</a>\n");
      out.write("           </body>\n");
      out.write("</html> ");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      if (_jspxFactory != null) _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
