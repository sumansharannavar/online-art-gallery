<%@page import="java.lang.*"%>
<%!
  String x,y;
%>
<%
     x=request.getParameter("uname");
     y=request.getParameter("pwd");
    
     if(x.equals("mcaadmin")&&y.equals("12345"))
     {
      %>
     <script>
      window.location="homepage.html";
</script>
<%
}
else
{
%>
<script>
window.alert("INVALID USERNAME OR PASSWORD");
window.location="adminlogin1.html";
</script>
<%
}
%>      