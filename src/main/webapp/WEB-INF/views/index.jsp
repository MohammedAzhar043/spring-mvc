<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>

	<h1>This is home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	<%-- 	<%
	String name = (String) request.getAttribute("name");
	Integer id = (Integer) request.getAttribute("id");

	List<String> friends = (List<String>) request.getAttribute("f");
	%>

	<h1>
		Name is
		<%=name%>
		and my id is
		<%=id%></h1>

	<%
	for (String s : friends) {
	%>
	<h1><%=s%></h1>
	<%
	}
	%> --%>
	<h1>My Name is ${name} and my Id is ${id}</h1>
	<c:forEach var="friend" items="${f}">
		<output>${friend}</output>
	</c:forEach>

</body>
</html>