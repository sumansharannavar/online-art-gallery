<%@ page import ="java.sql.*" %>

<%
    String user = request.getParameter("t1");    
    String pwd = request.getParameter("t2");
    String fname = request.getParameter("t3");
    String addr = request.getParameter("t4");
    String email = request.getParameter("t5");
    String mob = request.getParameter("t6");
    Class.forName("com.mysql.jdbc.Driver");
    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/projectdb","root", "root");
    Statement st = con.createStatement();
    //ResultSet rs;
    int i = st.executeUpdate("insert into members(first_name, address, email, uname, pass, regdate,mobile) values ('" + fname + "','" + addr + "','" + email + "','" + user + "','" + pwd + "', CURDATE(),'" + mob + "')");
    if (i > 0) {
        //session.setAttribute("userid", user);
        response.sendRedirect("index.html");
       // out.print("Registration Successfull!"+"<a href='index.jsp'>Go to Login</a>");
    } else {
        response.sendRedirect("registration.html");
    }
%>
