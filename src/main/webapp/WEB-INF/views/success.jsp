<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>success page here</title>
</head>
<body>
	<!-- this is in normal condition -->
	<%-- <h1>Welocme ,${userName}</h1>
	<h1>Your email id is , ${userEmail}</h1>
	<h1>your password is ${userPassword}</h1> --%>
	<br>

	<h1>Welocme ,${user.name}</h1>
	<h1>Your email id is , ${user.email}</h1>
	<h1>your password is ${user.password}</h1>
</body>
</html>