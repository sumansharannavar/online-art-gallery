<%@page import="java.sql.*"%> 
<%@page import="java.lang.*"%> 
<%--These are the string variables used to fetch the details from html form--%> 
<%! 
String s1; 
%> 
<% 
//the below statements request.getParameter() is used to fetch the data from html form 
s1=request.getParameter("bid"); 
//The below statement is used to load the Jdbc Driver 
Class.forName("com.mysql.jdbc.Driver"); 
//The below statement establishes the database connection 
java.sql.Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root","root"); 
//The below statement is used to create variable of Statement, to execute SQL statmen11111ts 
Statement st=con.createStatement(); 
ResultSet rs; 
String ss="select * from billing where billid="+"'"+s1+"'"; 
rs=st.executeQuery(ss); 
if (rs.next()) 
{ 
int k=st.executeUpdate("delete from billing where billid="+"'"+s1+"'"); 
%> 
<script> 
window.alert(" Record deleted"); 
window.location="bdeletion.html"; 
</script> 
<% 
} 
else 
{ 
%> 
<script> 
window.alert(" Record does not Exist"); 
window.location="bdeletion.html"; 
</script> 
<% 
} 
%>