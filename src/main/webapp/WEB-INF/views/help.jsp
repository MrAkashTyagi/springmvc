<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
	/* String name = (String) request.getAttribute("name");
	int rollnumber = (int) request.getAttribute("rollnumber");
	LocalDateTime date = (LocalDateTime) request.getAttribute("date"); */
	%>

	<h1>
		Hello my name is
		${name }
		<%-- <%=name%></h1> --%>
	<h1>
		my roll number is
		${rollnumber}
		<%-- <%=rollnumber%></h1> --%>
	<h1>
		Date is
		${date}
		<%-- <%=date%></h1> --%>
	<h1>This is help page</h1>
	<hr>
	
	<c:forEach var = "item" items="${marks }">
	<h1>${item }</h1>	
	</c:forEach>
	
	
</body>
</html>