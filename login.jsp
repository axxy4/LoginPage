<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="">
<title>Login</title>
</head>
<body background="ddd.jpeg" style="background-repeat:no-repeat; background-size: 100% 240%"> 

<center>
					<h1 align="center">******      Welcome to My You Tube Channel      ******</h1>
					<hr/>
					<h2 style="border:5px solid Black;" align="center">Login here....</h2>
</center>
<form align="center" action = "verifyLogin" method = "post" >
					<center>
					<table border="2px solid Black;">
					<tr style="center";>
					<thead align="center">
						<td><b>Username :</b></td>
						<td><input type = "text" name = "email" placeholder="Username" /></td><br>
					</tr>
					
					<tr>
						<td><b>Password :</b></td>
						<td><input type = "password" name = "password" placeholder="Password"/></td>
					</tr>
					</center>
					
					</table><br><br>
					
					<table border="1">
					<tr>
						<td><b><input type = "submit"  value= "Login" /></b></td>
					</tr>
					</table><br><br>
						<%
						
						if(request.getAttribute("error")!=null)
						{
						out.println(request.getAttribute("error"));
						}
						
						%>
</form>
</body>
</html>