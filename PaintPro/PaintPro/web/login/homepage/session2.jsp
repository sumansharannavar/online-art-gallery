<%@ page import="java.io.IOException.*"  %>
<% 
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
%>
<%@ page import ="java.sql.*" %>
<%
    String cardnum = request.getParameter("cno");    
    String cvvnum = request.getParameter("cvvno");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb",
            "root", "root");
    Statement st = con.createStatement();
    ResultSet rs;
    rs = st.executeQuery("select * from Cbank where Cardnum='" + cardnum + "' and cvvnum='" +cvvnum + "'");
    if (rs.next()) {
        session.setAttribute("cardnum", cardnum);
        //out.println("welcome " + userid);
        //out.println("<a href='logout.jsp'>Log out</a>");
        response.sendRedirect("session3.jsp");
    } else {
        out.println("Invalid Bank detalis <a href='payment.jsp'>try again</a>");
    }
%>
