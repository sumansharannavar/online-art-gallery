<%@page import="java.sql.*"%> 
<%@page import="java.lang.*"%> 
<%! 
String s1; 
%> 
<% 
s1=request.getParameter("id"); 
Class.forName("com.mysql.jdbc.Driver"); 
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root"); 
Statement st=con.createStatement(); 
ResultSet rs; 
String ss="select * from billing where billid="+"'"+s1+"'"; 
rs=st.executeQuery(ss); 
if (rs.next()) 
{ 
out.println("<html>"); 
out.println("<body>"); 
out.println("<form>"); 
out.println("<center>"); 
out.println("<table width=200 border=1 style=border-color: blueviolet; font-family: cursive;font-color: blue;>"); 
out.println("<br><br><br><caption>Details of Student</caption>"); 
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
else 
{ 
%> 
<script> 
window.alert("Student Roll Number not Exists"); 
window.location="databaseview.html"; 
</script> 
<% 
} 
%> 