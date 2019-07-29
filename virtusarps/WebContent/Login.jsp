<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login pages</title>
<style>
input[type=text],input[type=password]{
background-color:#ddd;
outline:none;
width:270px;
padding:15px;
margin:5px 0 10px 0;

}
input[type=submit]{
width:100px;

}
.text
{
text-size:10spx;
}
button:hover{
opacity:;
width:100px;
color:red;
}
button{
width:100px;
}
.form
{

margin-top:10px;
margin-left:150px;
}
.border
{
border-width:10px;
border-style:solid;
border-color:white;
margin-left:100px;
margin-right:300px;
}
.Loginheader
{
font-size:80px;
color:red;
margin-left:30%;
margin-top:50px;
}
</style>
<meta charset="ISO-8859-1">
<title>Login Template</title>

</head>
<body background="images/2.jpg">
<div class="Loginheader">
Login Form
</div>
<div class="form">
<div class="border">
<form action="LoginServlet" method="post">
<pre>

<h2>			 Employee ID:<input type="text" name="empid"  placeholder="Enter Employee Id" required></h2>
<h2>			    Password:<input type="password" name="pwd" placeholder="Enter Password" required></h2>

							           <button type="submit" value="Sign In">SignIn</button>	
				
</pre>
</form>
</div>
</div>
</body>

</html>