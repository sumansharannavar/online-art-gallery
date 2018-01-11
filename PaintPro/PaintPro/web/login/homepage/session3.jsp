<%@ page import="java.io.IOException.*"  %>
<%@ page import="javax.servlet.ServletException.*"%>
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
		#reviewed .payment {
                    width: 100%;
                    margin-bottom: 30px;
                    margin-top: 20px;
		}
		#reviewed .payment .payment_reviewed{
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
                #reviewed .Title,h1{
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
        <h1>Your Online payment is Succesfull</h1>
             <div class="left" id="reviewed">
				<div class="payment">
                                    <span class="title">Payment:</span>
                                    <div class="payment_reviewed">
                                        <h2>CardHolder's Name:<span class="CardHolder's Name"><%= session.getAttribute( "sessionvalue9" ) %> </span><h2>
                                       <h2>Card Number: <span class="Card Number "> <%= session.getAttribute( "sessionvalue10" ) %> </span><h2>
                                        <h2>Expiry Date:<span class="Expiry Date"> <%= session.getAttribute( "sessionvalue11" ) %> </span><h2>
                                       <h2>Cvv:<span class="cvv"> <%= session.getAttribute( "sessionvalue12" ) %> </span><h2>
                                        
                                        </div>
                                </div>
                               <br>
                               <br>
                               <br>
                                <br>
                                <br>
                                <br>
                                <br>
                                <div id="complete">
                                    <a class="big_button" id="complete" href="#">Complete Order</a><br><br>
                                </div>
                                
             </div>
             
    </body>
</html>