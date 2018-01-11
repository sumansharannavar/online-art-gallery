package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.IOException.*;

public final class land_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\"\n");
      out.write("   \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\" dir=\"ltr\">\n");
      out.write("<head>\n");
      out.write("<title>Gallery</title>\n");
      out.write("<meta charset=\"iso-8859-1\">\n");
      out.write("<link rel=\"stylesheet\" href=\"styles/layout.css\" type=\"text/css\">\n");
      out.write("<!--[if lt IE 9]><script src=\"scripts/html5shiv.js\"></script><![endif]-->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"wrapper row1\">\n");
      out.write("  <header id=\"header\" class=\"clear\">\n");
      out.write("    <div id=\"hgroup\">\n");
      out.write("      <h1><a href=\"index.html\">FRAME 'R' WALL</a></h1>\n");
      out.write("      <h2>Just Frame it.....!</h2>\n");
      out.write("    </div>\n");
      out.write("    <nav>\n");
      out.write("      <ul>\n");
      out.write("        <li><a href=\"index.html\">Home</a></li>\n");
      out.write("        <li><a href=\"category.html\">Category</a></li>\n");
      out.write("        <li><a href=\"contact.html\">Contact Us</a></li>\n");
      out.write("        <li class=\"last\"><a href=\"profile.jsp\">Profile</a></li>\n");
      out.write("      </ul>\n");
      out.write("    </nav>\n");
      out.write("  </header>\n");
      out.write("</div>\n");
      out.write("<!-- content -->\n");
      out.write("<div class=\"wrapper row2\">\n");
      out.write("  <div id=\"container\" class=\"clear\">\n");
      out.write("    <!-- main content -->\n");
      out.write("    <div id=\"homepage\">\n");
      out.write("      <!-- Services -->\n");
      out.write("<figcaption>\n");
      out.write("              <h2><b><u>Landscape Paintings</u></b></h2>\n");
      out.write("              <h2>A landscape is an outdoor scene. A landscape artist uses paint to create not only land, water, and clouds but air, wind, and sunlight.</h2>\n");
      out.write("          \n");
      out.write("            </figcaption>\n");
      out.write("      <section id=\"services\" class=\"clear\">\n");
      out.write("        <article class=\"one_third\">\n");
      out.write("\n");
      out.write("            <div>  <a href=\"land1.jsp\">  <figure><img src=\"images/landscape/land1.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u><input type=\"text\" value=\"2500\" name=\"t1\">rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land2.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>3500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land24.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>4500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land4.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>5500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land26.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>1500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land6.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("            \n");
      out.write("          </figure>\n");
      out.write("        </article>\n");
      out.write("        \n");
      out.write("        <article class=\"one_third\">\n");
      out.write("         <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land7.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>1800/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land8.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>700/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land9.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>2100/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land10.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>3100/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land11.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>1400/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land12.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>6600/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("   \n");
      out.write("          </figure>\n");
      out.write("\n");
      out.write("        </article>\n");
      out.write("        <article class=\"one_third lastbox\">\n");
      out.write("         <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land13.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>10000/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land25.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>1500/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land15.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>4000/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land16.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>3200/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land17.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>2000/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\t  <div>  <a href=\"billing.html\">  <figure><img src=\"images/landscape/land18.jpg\" width=\"290\" height=\"180\" >\n");
      out.write("                   <u>2700/- rs<u>  <br> BUY NOW </a>   </div>\n");
      out.write("\n");
      out.write("          </figure>\n");
      out.write("        </article>\n");
      out.write("  \n");
      out.write("  \n");
      out.write("                      <!-- Introduction -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- / content body -->\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Footer -->\n");
      out.write("<div class=\"wrapper row3\">\n");
      out.write("  <div id=\"footer\" class=\"clear\">\n");
      out.write("    <!-- Section One -->\n");
      out.write("    <section class=\"one_quarter\">\n");
      out.write("      <h2 class=\"title\">Pages</h2>\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"index.html\">Home</a></li>\n");
      out.write("          <li><a href=\"category.html\">Category</a></li>\n");
      out.write("          <li><a href=\"sell.html\">Sell Painting</a></li>\n");
      out.write("          <li><a href=\"about.html\">About Us</a></li>\n");
      out.write("          \n");
      out.write("          <li class=\"last\"><a href=\"Contact.html\">Contact Us</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section Two -->\n");
      out.write("    <section class=\"one_quarter\">\n");
      out.write("      <h2 class=\"title\">User Section</h2>\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("         \n");
      out.write("          <li><a href=\"login.html\">Login</a></li>\n");
      out.write("          <li class=\"last\"><a href=\"register.html\">Register</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </section>\n");
      out.write("    <!-- Section Three -->\n");
      out.write("    <section class=\"one_quarter\">\n");
      out.write("      <h2 class=\"title\">Category</h2>\n");
      out.write("      <nav>\n");
      out.write("        <ul>\n");
      out.write("          <li><a href=\"land.html\">LandScape</a></li>\n");
      out.write("          <li><a href=\"port.html\">Portrait</a></li>\n");
      out.write("          <li><a href=\"real.html\">Real Life</a></li>\n");
      out.write("          <li><a href=\"still.html\">Still Life</a></li>\n");
      out.write("           <li><a href=\"religious.html\">Religious</a></li>\n");
      out.write("          <li class=\"last\"><a href=\"diff.html\">Different Types</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </nav>\n");
      out.write("    </section>\n");
      out.write("   \n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("<!-- Copyright -->\n");
      out.write("<div class=\"wrapper row4\">\n");
      out.write("  <footer id=\"copyright\" class=\"clear\">\n");
      out.write("    <p class=\"fl_left\">Copyright &copy; 2012 - All Rights Reserved - <a href=\"contact.html\">Gallery@group</a></p>\n");
      out.write("      </footer>\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write("</html>");
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
