<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<h3>Login Page</h3>
	<form:form action="${pageContext.request.contextPath}/authenticateTheUser " method="POST">
	
	
	<p>
		User name: <input type="text" name="username">
	</p>
	
	<p>
		Password: <input type="password" name="password">
	</p>
	
	<input type="submit" value="Login"/>
	
	</form:form>

</body>
</html>