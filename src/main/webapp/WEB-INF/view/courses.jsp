<!DOCTYPE html>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Courses</title>
	</head> 
	<body>
		<h2>List of Courses</h2>
		
		<ul>
		<c:forEach  items="${courses}" var="c">
		    <li> ${c.name}, ${c.fee} </li>
		    
		</c:forEach>
		</ul>
		
	</body>
</html>
