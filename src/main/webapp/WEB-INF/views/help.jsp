<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>This is help page</title>
</head>
<body>

	<h1>This is Mohammed Azhar</h1>
	<h1>This is help page</h1>

	<%-- 	<%
	String name = (String) request.getAttribute("name");
	Integer rollnumber = (Integer) request.getAttribute("rollnumber");
	%> --%>

	<%-- 	<h1>My name is <%=name %></h1>
	<h1>My roll no is <%=rollnumber %></h1> --%>

	<!-- by using the expression language -->

	<h1>My name is ${name}</h1>
	<h1>My roll no is ${rollnumber}</h1>

</body>
</html>