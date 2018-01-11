package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.IOException.*;

public final class billing_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write('\n');

    String Name=request.getParameter("t3");
String addr=request.getParameter("t4");
 String email=request.getParameter("t5");
 String mob=request.getParameter("t6");
String text7=request.getParameter("t7");
String text8=request.getParameter("t8");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into billing(Name, address, email,mobile,bookdate,booktime) values ('" + Name + "','" + addr + "','" + email + "'," + mob + ", CURDATE(),CURTIME())");
   
    if (i > 0) {
        //session.setAttribute("userid", user);
       // response.sendRedirect("payment.jsp");
        out.print("Billing Successfull!");
    } else {
        response.sendRedirect("billing.html");
    }

      out.write('\n');


   
   session.setAttribute( "sessionvalue3", Name);
   session.setAttribute( "sessionvalue4", addr ); 
    //String text5 = request.getParameter( "t5" ); 
   session.setAttribute( "sessionvalue5", email ); 
   // String text6 = request.getParameter( "t6" ); 
   session.setAttribute( "sessionvalue6", mob ); 
   session.setAttribute( "sessionvalue7", text7 );  
   session.setAttribute( "sessionvalue8", text8 );

      out.write("  \n");
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
      out.write("\t\t#reviewed .billing {\n");
      out.write("                    width: 100%;\n");
      out.write("                    margin-bottom: 30px;\n");
      out.write("                    margin-top: 20px;\n");
      out.write("\t\t}\n");
      out.write("\t\t#reviewed .billing .address_reviewed{\n");
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
      out.write("\t\t\tbackground:  #ff5c33;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("\t\t\tborder-bottom: 3px solid  #ffad99;\n");
      out.write("\t\t\tborder-radius: 5px;\n");
      out.write("\t\t\tmargin-bottom:20px;\n");
      out.write("\t\t\tmargin-top:20px;\n");
      out.write("\t\t}\n");
      out.write("                #reviewed .Title{\n");
      out.write("\t\t\tclear:both;\n");
      out.write("\t\t\tdisplay:block;\n");
      out.write("\t\t\twidth:100%;\n");
      out.write("\t\t\tcolor:#fff;\n");
      out.write("\t\t\tfont-size:2em;\n");
      out.write("\t\t\ttext-decoration: none;\n");
      out.write("\t\t\tbackground:#e62e00;\n");
      out.write("\t\t\ttext-align:center;\n");
      out.write("                        }\n");
      out.write("    </style>\n");
      out.write(" <body>\n");
      out.write("\n");
      out.write("        <h1>Your Billing information is Succesfull</h1>\n");
      out.write("        <div class=\"right\" id=\"reviewed\">\n");
      out.write("\t\t\t\t<div class=\"billing\">\n");
      out.write("\t\t\t\t\t<span class=\"title\">Billing:</span>\n");
      out.write("\t\t\t\t\t<div class=\"address_reviewed\">\n");
      out.write("\t\t\t\t\t\t<h3>Name:<span class=\"Name\">");
      out.print( session.getAttribute( "sessionvalue3" ) );
      out.write("</span></h3>\n");
      out.write("\t\t\t\t\t\t<h3>Address:<span class=\"address\"> ");
      out.print( session.getAttribute( "sessionvalue4" ) );
      out.write(" </span></h3>\n");
      out.write("\t\t\t\t\t\t<h3>Email:<span class=\"email\"> ");
      out.print( session.getAttribute( "sessionvalue5" ) );
      out.write(" </span></h3>\n");
      out.write("\t\t\t\t\t\t<h3>MobileNumber<span class=\"moblie\"> ");
      out.print( session.getAttribute( "sessionvalue6" ) );
      out.write(" </span></h3>\n");
      out.write("                                                <h3>BillingDate:<span class=\"date\"> ");
      out.print( session.getAttribute( "sessionvalue7" ) );
      out.write(" </span></h3>\n");
      out.write("                                                <h3>BillingTime:<span class=\"time\"> ");
      out.print( session.getAttribute( "sessionvalue8" ) );
      out.write(" </span></h3>\n");
      out.write("<h3> Amount= <input type=\"text\"  value=\"1500\" name=\"t9\"  ></h3>\n");
      out.write("\t\t\t\t\t</div><br><br><br><br><br><br><br><br><br>\n");
      out.write("<br>\n");
      out.write("                                       <br><br><br><br><br><br><br>\n");
      out.write(" <div id=\"complete\">\n");
      out.write("                                    <a class=\"big_button\" id=\"complete\" href=\"#\">Cash on Delivery</a><br><a class=\"big_button\" id=\"complete\" href=\"payment.jsp\">Online Payment</a>\n");
      out.write("                                </div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t\n");
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
