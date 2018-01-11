package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;

public final class deleterecord_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
String s1; 

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

      out.write(" \n");
      out.write(" \n");
      out.write(' ');
      out.write('\n');
      out.write(' ');
      out.write('\n');
 
//the below statements request.getParameter() is used to fetch the data from html form 
s1=request.getParameter("uname"); 
//The below statement is used to load the Jdbc Driver 
Class.forName("com.mysql.jdbc.Driver"); 
//The below statement establishes the database connection 
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root"); 
//The below statement is used to create variable of Statement, to execute SQL statmen11111ts 
Statement st=con.createStatement(); 
ResultSet rs; 
String ss="select * from members where uname="+"'"+s1+"'"; 
rs=st.executeQuery(ss); 
if (rs.next()) 
{ 
int k=st.executeUpdate("delete from members where uname="+"'"+s1+"'"); 

      out.write(" \n");
      out.write("<script> \n");
      out.write("window.alert(\" Record deleted\"); \n");
      out.write("window.location=\"mdeletion.html\"; \n");
      out.write("</script> \n");
 
} 
else 
{ 

      out.write(" \n");
      out.write("<script> \n");
      out.write("window.alert(\" Record does not Exist\"); \n");
      out.write("window.location=\"mdeletion.html\"; \n");
      out.write("</script> \n");
 
} 

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
