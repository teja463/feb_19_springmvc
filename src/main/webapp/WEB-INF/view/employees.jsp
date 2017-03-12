<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE htmt>
<html>
<head>
<title>Employees By Job</title>
</head>
<body>
	<h2>Employees By Job</h2>
	<p />
	<ul>
		<c:forEach items="${employees}" var="emp">
			<li>${emp.name},${emp.salary}</li>
		</c:forEach>
	</ul>
</body>
</html>