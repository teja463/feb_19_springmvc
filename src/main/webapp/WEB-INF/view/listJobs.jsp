<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>List Of Jobs</title>
</head>
<body>
	<h1>List Of Jobs</h1>

	<ul>
		<c:forEach var="job" items="${jobs}">
          <li>${job.title}</li>
        <p />
		</c:forEach>
	</ul>

</body>
</html>
