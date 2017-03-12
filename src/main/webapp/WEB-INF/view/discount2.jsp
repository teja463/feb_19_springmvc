<!DOCTYPE html>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<html>
<head>
<meta charset="utf-8">
<title>Discount Calculation</title>
</head>
<body>
	<h2>Discount Calculation</h2>
	<form:form action="discount2">
		   Amount : <br />
		<form:input type="text" name="amount" path="amount" />
		<form:errors path="amount" />
		<p />
		   
		   Rate : <br />
		<form:input type="text" name="rate" path="rate" />
		<form:errors path="rate"></form:errors>
		<p />

		<input type="submit" value="Calculate" />
	</form:form>

	<h3>
		<c:if test="${command.discount > 0}">
		      ${command.discount}
		 </c:if>
	</h3>
</body>
</html>
