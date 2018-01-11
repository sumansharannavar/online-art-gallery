package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class profile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\n');
      out.write('\n');
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("     <link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\" />\n");
      out.write("    \n");
      out.write("    <script src=\"//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js\"></script>\n");
      out.write("\t\n");
      out.write("     <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,600' rel='stylesheet' type='text/css'>\n");
      out.write("    <style>\n");
      out.write("        #reviewed .title{\n");
      out.write("\t\t\twidth:49%;\n");
      out.write("\t\t\tfont-size:1.8em;\n");
      out.write("\t\t\tfloat:left;\n");
      out.write("\t\t}\n");
      out.write("\t\t#reviewed .Admin {\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-bottom: 30px;\n");
      out.write("                    margin-top: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#reviewed .admin .address_reviewed{\n");
      out.write("\t\t\tcolor:#aaa;\n");
      out.write("\t\t\tfont-size:1.2em;\n");
      out.write("\t\t\theight:80px;\n");
      out.write("\t\t\twidth:48%;\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t#reviewed #complete{\n");
      out.write("\t\t\tfloat:left;\n");
      out.write("                        padding-top:2px;\n");
      out.write("                        width:50%;\n");
      out.write("\t\t\n");
      out.write("\t\t}\n");
      out.write("\t\t#reviewed .big_button{\n");
      out.write("\t\t\tclear:both;\n");
      out.write("\t\t\tdisplay:block;\n");
      out.write("\t\t\twidth:70%;\n");
      out.write("\t\t\tcolor:#fff;\n");
      out.write("\t\t\tfont-size:2em;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tbackground:#80c0ff;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t\tborder-bottom: 3px solid #4da7ff;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tmargin-bottom:20px;\n");
      out.write("\t\t\tmargin-top:20px;\n");
      out.write("                        }\n");
      out.write("\t\t#reviewed #complete .sub{\n");
      out.write("\t\t\tcolor:#aaa;\n");
      out.write("\t\t\tdisplay:block;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t\tmargin-top:15px;\n");
      out.write("\t\t\twidth:80%;\n");
      out.write("\t\t\tmargin:5px auto;\n");
      out.write("\t\t}\n");
      out.write("#reviewed .Title{\n");
      out.write("\t\t\tclear:both;\n");
      out.write("\t\t\tdisplay:block;\n");
      out.write("\t\t\twidth:100%;\n");
      out.write("\t\t\tcolor:#fff;\n");
      out.write("\t\t\tfont-size:2em;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tbackground:#80c0ff;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("                        }\n");
      out.write("    </style>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("        \n");
      out.write("        <div class=\"right\" id=\"reviewed\">\n");
      out.write("\t\t\t\t<div class=\"admin\">\n");
      out.write("\t\t\t\t\t<span class=\"title\">USER:</span><div id=\"complete\">\n");
      out.write("                                    <a class=\"big_button\" id=\"complete\" href=\"billingview.html\">view booking</a><br>\n");
      out.write("                                    <a class=\"big_button\" id=\"complete\" href=\"bdeletion.html\">Cancel the Booking</a><br>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("    \n");
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
