<%@ page import ="java.sql.*" %>
<%@ page import="java.io.IOException.*" %>
<%
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
%>
<%

   
   session.setAttribute( "sessionvalue3", Name);
   session.setAttribute( "sessionvalue4", addr ); 
    //String text5 = request.getParameter( "t5" ); 
   session.setAttribute( "sessionvalue5", email ); 
   // String text6 = request.getParameter( "t6" ); 
   session.setAttribute( "sessionvalue6", mob ); 
   session.setAttribute( "sessionvalue7", text7 );  
   session.setAttribute( "sessionvalue8", text8 );
%>  


<html>
     <link rel="stylesheet" type="text/css" href="style.css" />
    
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.0/jquery.min.js"></script>
	
     <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700,600' rel='stylesheet' type='text/css'>
    <style>
        #reviewed .title{
			width:49%;
			font-size:1.8em;
			float:left;
		}
		#reviewed .billing {
                    width: 100%;
                    margin-bottom: 30px;
                    margin-top: 20px;
		}
		#reviewed .billing .address_reviewed{
			color:#aaa;
			font-size:1.2em;
			height:80px;
			width:48%;
		
		}
		#reviewed #complete{
			float:left;
                        padding-top:2px;
                        width:50%;
		
		}
		#reviewed .big_button{
			clear:both;
			display:block;
			width:70%;
			color:#fff;
			font-size:2em;
			text-decoration: none;
			background:  #ff5c33;
			text-align:center;
			border-bottom: 3px solid  #ffad99;
			border-radius: 5px;
			margin-bottom:20px;
			margin-top:20px;
		}
                #reviewed .Title{
			clear:both;
			display:block;
			width:100%;
			color:#fff;
			font-size:2em;
			text-decoration: none;
			background:#e62e00;
			text-align:center;
                        }
    </style>
 <body>

        <h1>Your Billing information is Succesfull</h1>
        <div class="right" id="reviewed">
				<div class="billing">
					<span class="title">Billing:</span>
					<div class="address_reviewed">
						<h3>Name:<span class="Name"><%= session.getAttribute( "sessionvalue3" ) %></span></h3>
						<h3>Address:<span class="address"> <%= session.getAttribute( "sessionvalue4" ) %> </span></h3>
						<h3>Email:<span class="email"> <%= session.getAttribute( "sessionvalue5" ) %> </span></h3>
						<h3>MobileNumber<span class="moblie"> <%= session.getAttribute( "sessionvalue6" ) %> </span></h3>
                                                <h3>BillingDate:<span class="date"> <%= session.getAttribute( "sessionvalue7" ) %> </span></h3>
                                                <h3>BillingTime:<span class="time"> <%= session.getAttribute( "sessionvalue8" ) %> </span></h3>
<h3> Amount= <input type="text"  value="1500" name="t9"  ></h3>
					</div><br><br><br><br><br><br><br><br><br>
<br>
                                       <br><br><br><br><br><br><br>
 <div id="complete">
                                    <a class="big_button" id="complete" href="#">Cash on Delivery</a><br><a class="big_button" id="complete" href="payment.jsp">Online Payment</a>
                                </div>
				</div>
				
</body>
</html>