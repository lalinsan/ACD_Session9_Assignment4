<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Successfully</title>
</head>
<body>


<h2> You have successfully logged in ! </h2>
<p> Welcome ${sessionScope.userName} your session id is : ${sessionScope.id}</p>
<form action="LogOutServlet" method="POST">
<input type="submit" value="logout">
</form>

</body>
</html>