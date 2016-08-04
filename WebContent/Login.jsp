<!-- Page that Prompts the user to pass credentials -->

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h2 align="center">Login</h2>
<form action="LoginServlet" method="POST">
<table border="1" align="center">
<tr>
	<td bgcolor=E0DAD6>User Name: </td>
	<td><input type="text" name="userName"></td>
</tr>

<tr>
	<td bgcolor=E0DAD6>Password: </td>
	<td><input type="password" name="password"></td>
</tr>

<tr>
	<td align="center" colspan="2" bgcolor=#BDBDBD><input type="Submit"></td>
</tr>

</table>


<p align="center">Enter your credentials</p>

</form>


</body>
</html>