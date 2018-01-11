<%@ page import="java.io.IOException.*"  %>
<%@ page import="java.lang.*" %>
<%@ page import ="java.sql.*" %>
<%@ page import="javax.servlet.ServletException"%>
 
   
<!DOCTYPE HTML>
<html>
<body>
	
<head>
<style>
table, th, td {
    
   
}
table {
    border-spacing: 5px;
}
</style>
<script>
<!--
function x()
    {
    var currentTime = new Date()
var month = currentTime.getMonth() + 1
var day = currentTime.getDate()
var year = currentTime.getFullYear()
f1.exp.value=month + "-" + day + "-" + year;    
    var currentTime1 = new Date();

if(h>12)
{
f1.t8.value=h + "-" + m + "-" + s+" "+"PM" ;
      }
	  else
	  {
	  f1.t8.value=h + "-" + m + "-" + s+" "+"AM" ;
	  }
	  }
	  function Captcha(){
	  var currentTime = new Date()
var month = currentTime.getMonth() + 1
var day = currentTime.getDate()
var year = currentTime.getFullYear()
f1.exp.value=month + "-" + day + "-" + year;    
    var currentTime1 = new Date();
var h = currentTime1.getHours();
var m = currentTime1.getMinutes();
var s = currentTime1.getSeconds();
if(h>12)
{
f1.t8.value=h + "-" + m + "-" + s+" "+"PM" ;
      }
	  else
	  {
	  f1.t8.value=h + "-" + m + "-" + s+" "+"AM" ;
	  }
                     var alpha = new Array('A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','@','#','$','%','&','*','1','2','3','4','5','6','7','8','9','0');
                     var i;
                     for (i=0;i<6;i++){
                       var a = alpha[Math.floor(Math.random() * alpha.length)];
                       var b = alpha[Math.floor(Math.random() * alpha.length)];
                       var c = alpha[Math.floor(Math.random() * alpha.length)];
                       var d = alpha[Math.floor(Math.random() * alpha.length)];
                       var e = alpha[Math.floor(Math.random() * alpha.length)];
                       var f = alpha[Math.floor(Math.random() * alpha.length)];
                       var g = alpha[Math.floor(Math.random() * alpha.length)];
                      }
                    var code = a + ' ' + b + ' ' + ' ' + c + ' ' + d + ' ' + e + ' '+ f + ' ' + g;
                    document.getElementById("mainCaptcha").value = code
                  }
                  function ValidCaptcha(){
                      var string1 = removeSpaces(document.getElementById('mainCaptcha').value);
                      var string2 = removeSpaces(document.getElementById('txtInput').value);
                      if (string1 == string2){
                        return true;
                      }
                      else{        
                        return false;
                      }
                  }
                  function removeSpaces(string){
                    return string.split(' ').join('');
                  }
	function e()
{
var x=f1.t5.value;
var atpos=x.indexOf("@");
var dotpos=x.lastIndexOf(".");
if (atpos<1 || dotpos<atpos+2 || dotpos+2>=x.length)
  {
  alert("Not a valid e-mail address");
  f1.t5.focus();
  }
  else
  {
  f1.cvvno.focus();
  }
}   
function a()
{
var a=f1.t1.value;
var c=/^[A-Za-z0-9]{5,}$/;
var b=/^[A-Za-z0-9]{5,}[_][A-Za-z0-9]{3,}$/;
if(b.test(a) | c.test(a))
{
f1.t2.focus();
}
else
{
alert("USERNAME MUST BE OF MIN 5 CHARACTERS & MUST BE ALPHANUMERIC");
f1.t1.focus();
}
}
function pwd()
{
var a=f1.t2.value;
var c=/^[A-Za-z0-9]{5,}$/;
var b=/^[A-Za-z0-9]{5,}[_][A-Za-z0-9]{5,}$/;
if(b.test(a) | c.test(a))
{
f1.cname.focus();
}
else
{
alert("PASSWORD MUST BE OF MIN 5 CHARACTERS & MUST BE ALPHANUMERIC");
f1.t2.focus();
}
}
function ageverify()
{
var a=f1.age.value;
var c=/^[0-9]{2}$/;
if(c.test(a))
{

}
else
{
alert("ENTER VALID AGE");
f1.age.focus();
}
}
function cmp()
{
var b=f1.t2.value;
var d=f1.cpwd.value;
if(b==d)
{
f1.cname.focus();
}
else 
{
alert("PASSWORD AND RE ENTERED PASSWORD ARE NOT SAME");
f1.cpwd.focus();
}
}
function c()
{
var a=f1.cname.value;
var c=/^[A-Za-z]{3,}$/;
var d=/^([A-Za-z]{1,}).([A-Za-z]{1,})$/;
var e=/^([A-Za-z]{1,}).([A-Za-z]{1,}).([A-Za-z]{1,})$/;
if(c.test(a)|d.test(a)|e.test(a))
{
f1.age.focus();
}
else 
{
alert("ENTER VALID NAME");
f1.cname.focus();
}
}

function z()
{
var a=f1.t12.value;
if(a=="")
{
alert("ENTER ANSWER");
f1.t12.focus();
}
else
{

}
}

function valid()
{
var a=f1.dspec.value;
if (a=="")
{
alert("ENTER VALID SPECIALIZATION");
}
else
{
f1.cno.focus();
}
}
function addressvalid()
{
var a=f1.cno.value;
if (a=="")
{
alert("ENTER VALID ADDRESS");
f1.cno.focus();
}
else
{

}
}
function agevalid()
{
var x=f1.age.value;
x=parseInt(x);
if(x<1 || x>100)
{
alert("INVALID AGE");
f1.age.focus();
}
else
{
}
}
function f()
{
var a=f1.cno.value;
var c=/^[0-9]{16}$/;

if(c.test(a))
{
f1.exp.focus();

}
else
{
alert("ENTER VALID CARD NUMBER");
f1.cno.focus();
}
}
function cvv()
{
var a=f1.cvvno.value;
var c=/^[0-9]{3}$/;

if(c.test(a))
{
f1.action="session2.jsp";
f1.submit();
}

else
{
alert("ENTER VALID CVV NUMBER");
f1.cvvno.focus();
}
}

function MM_preloadImages() { //v3.0
  var d=document; if(d.images){ if(!d.MM_p) d.MM_p=new Array();
    var i,j=d.MM_p.length,a=MM_preloadImages.arguments; for(i=0; i<a.length; i++)
    if (a[i].indexOf("#")!=0){ d.MM_p[j]=new Image; d.MM_p[j++].src=a[i];}}
}
//-->
</script>



<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
<title>Untitled Document</title>
<style type="text/css">
<!--
.style1 {
	font-size: 36px;
	font-weight: bold;
	font-style: italic;
	color: #0000FF;
}
body {
	background-color:#ffffcc;

}
-->
</style>
<body>
<form id="f1" name="f1" method="post" action="">
  <h2 align="center" class="style3"><b><u><i>Please Enter your Payment Details</b></u></i> </h2>
  <div align="center">
    <table width="400" border="3">
      
      <tr>
        <td><div align="center"><strong>Card Holder's Name</td>
       <td>   <input name="cname" type="text"  maxlength="20" maxlength="25"/>
        </strong></div></td>
      </tr>
      
      
      <tr>
        <td><div align="center"><strong>Enter Card Number</td>
     <td>     <input type="text" name="cno" onfocus="c()" maxlength="16"/>
        </strong></div></td>
      </tr>
      <tr>
        <td><div align="center"><strong>Expire date</td>
         <td> <input type="date" name="exp" placeholder="mm/yy" onfocus="f()" required="required"/>
        </strong></div></td>
      </tr>

	 <tr>
        <td><div align="center"><strong>Enter CVV number</td>
     <td>     <input name="cvvno" type="text" maxlength="3" minlength="3" />
        </strong></div></td>
      </tr>
      
     
      
      <tr>
        <td> </td><div align="center">
       &nbsp  <td> <input type="submit" name="Submit" value="Proceed" onclick="cvv()"/>
       
          </label>
        </div></td>
      </tr>
    </table>
  </div>
  
</form>
</body>
       
</html>