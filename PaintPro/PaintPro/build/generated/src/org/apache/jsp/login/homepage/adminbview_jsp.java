package org.apache.jsp.login.homepage;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.lang.*;
import java.sql.*;
import java.io.IOException.*;

public final class adminbview_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write(' ');
      out.write('\n');
 
s1=request.getParameter("id"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root"); 
Statement st=con.createStatement(); 
ResultSet rs; 
String ss="select * from billing";
rs=st.executeQuery(ss); 
if (rs.next()) 
{ 
    rs.previous();
    while(rs.next())
    { 
out.println("<html>"); 
out.println("<body bgcolor="#ffffcc">"); 
out.println("<form>"); 
out.println("<center>"); 
out.println("<table width=200 border=1 style=border-color: blueviolet; font-family: cursive;font-color: blue;>"); 
out.println("<br><br><br><caption>Details of billing</caption>"); 
out.println("<td width=200>Name</td><td width=500>mobile no</td><td width=200>emailid</td><td width=200>city</td><td width=200>country</td><td width=200>pincode</td>"); 
out.println("<tr><td>"+rs.getString("billid")+"</td>"); 
out.println("<td>"+rs.getString("name")+"</td>"); 
out.println("<td>"+rs.getString("address")+"</td>"); 
out.println("<td>"+rs.getString("email")+"</td>"); 
out.println("<td>"+rs.getString("mobile")+"</td>"); 
out.println("<td>"+rs.getString("bookdate")+"</td>");
out.println("<td>"+rs.getString("booktime")+"</td></tr>"); 
out.println("</table>"); 
out.println("</center>"); 
out.println("</form>"); 
out.println("</body>"); 
out.println("</html>"); 
}
} 
else 
{ 

      out.write(" \n");
      out.write("<script>  \n");
      out.write("window.location=\"databaseview.html\"; \n");
      out.write("</script> \n");
 
} 

      out.write(' ');
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
