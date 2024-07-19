<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is home page</h1>
	<h1>called by home controller</h1>
	<h1>url /home</h1>

	<div class="container mt-4">

		<form action="welcome">
			<input type="text" name="input-box"
				placeholder="Please enter your name">
			<button type="submit">Say Hello!</button>
		</form>
	</div>

	<%
	String name = (String) request.getAttribute("name");
	int id = (int) request.getAttribute("id");
	%>
	<h1>
		Name is :
		<%=name%></h1>
	<h1>
		Id is :
		<%=id%></h1>
	<%
	List<String> names = (List<String>) request.getAttribute("friends");
	for (String f : names) {
	%>
	<h1><%=f%></h1>
	<%
	}
	%>


</body>
</html>