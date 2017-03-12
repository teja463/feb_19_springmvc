<!DOCTYPE html>
<%@taglib prefix="form"  uri="http://www.springframework.org/tags/form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<html>
	<head>
		<meta charset="utf-8">
		<title>Discount Calculation</title>
	</head> 
	<body>
		<h2>Discount Calculation</h2>
		<form:form action="discount">
		   Amount : <br/>
		   <input type="text" name="amount" />
		   <p/>
		   
		   Rate : <br/>
		   <input type="text" name="rate"/>
		   <p/>
		   
		   <input type="submit" value="Calculate" />
		</form:form>
		
		<h3> ${discount}</h3>
		
	</body>
</html>
