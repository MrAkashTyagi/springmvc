<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
   pageEncoding="ISO-8859-1"%>
   <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 class= "text-center">${Header }</h1>
<p class= "text-center">${Desc}</p>
<h1 style = "color :green">${msg }</h1>
<hr>

<h1>Welcome ${user.userName } </h1>
<h1>Your email address is ${user.userEmail }</h1>
<h1>Your password is ${user.userPassword } please try to secure your password </h1>

</body>
</html>