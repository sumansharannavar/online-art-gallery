<%@page import="java.sql.*"%> 
<%@page import="java.lang.*"%> 
<%@ page import ="java.sql.*" %>
<%@ page import="java.io.IOException.*" %>
<%! 
String s1; 
%> 
<% 
s1=request.getParameter("fname"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root"); 
Statement st=con.createStatement(); 
ResultSet rs; 
String ss="select * from members";
rs=st.executeQuery(ss); 
if (rs.next()) 
{
    rs.previous();

    out.println("<html>"); 
out.println("<body bgcolor=#ffffcc>"); 
out.println("<form>"); 
out.println("<center>"); 
out.println("<table width=200 border=1 style=border-color: blueviolet; font-family: cursive;font-color: blue;>"); 
out.println("<br><br><br><caption>Details of Customer</caption>"); 
out.println("<td width=200>FirstName</td><td width=500>address</td><td width=200>emailid</td><td width=200>username</td><td width=200>password</td><td width=200>regdate</td><td width=200>mobile</td>"); 
    while(rs.next())
    { 

out.println("<tr><td>"+rs.getString("first_name")+"</td>"); 
out.println("<td>"+rs.getString("address")+"</td>"); 
out.println("<td>"+rs.getString("email")+"</td>"); 
out.println("<td>"+rs.getString("uname")+"</td>"); 
out.println("<td>"+rs.getString("pass")+"</td>"); 
out.println("<td>"+rs.getString("regdate")+"</td>"); 
out.println("<td>"+rs.getString("mobile")+"</td></tr>"); 
}
out.println("</table>"); 
out.println("</center>"); 
out.println("</form>"); 
out.println("</body>"); 
out.println("</html>"); 

}
else 
{ 
%> 
<script> 
window.location="databaseview.html"; 
</script> 
<% 
} 
%> 