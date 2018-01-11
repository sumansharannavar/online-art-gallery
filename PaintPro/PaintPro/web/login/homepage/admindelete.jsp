<%@page contentType="text/html"%>
<%@page pageEncoding="UTF-8"%>
<%--
The taglib directive below imports the JSTL library. If you uncomment it,
you must also add the JSTL library to the project. The Add Library... action
on Libraries node in Projects view can be used to add the JSTL 1.1 library.
--%>
<%--
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
--%>


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
		#reviewed .Admin {
                    width: 100%;
                    margin-bottom: 30px;
                    margin-top: 20px;
		}
		#reviewed .admin .address_reviewed{
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
			background:#80c0ff;
			text-align:center;
			border-bottom: 3px solid #4da7ff;
			border-radius: 5px;
			margin-bottom:20px;
			margin-top:20px;
                        }
		#reviewed #complete .sub{
			color:#aaa;
			display:block;
			text-align:center;
			margin-top:15px;
			width:80%;
			margin:5px auto;
		}
#reviewed .Title{
			clear:both;
			display:block;
			width:100%;
			color:#fff;
			font-size:2em;
			text-decoration: none;
			background:#80c0ff;
			text-align:center;
                        }
    </style>
<body>

        
        <div class="right" id="reviewed">
				<div class="admin">
					<span class="title">ADMIN:</span><div id="complete">
                                    <a class="big_button" id="complete" href="mdeletion.html">Remove Member</a><br>
                                   
                                </div>
				</div>
				
</body>
</html>
    
