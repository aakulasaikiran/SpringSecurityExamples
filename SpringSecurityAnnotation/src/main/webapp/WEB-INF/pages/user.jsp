<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<h1 style="color: red;" align="center">User Page</h1>
	<h1 style="color: green;" align="center">${title}</h1>
	<h1 style="color: green;" align="center">${message}</h1>
<a href="<c:url value="/logout"/>">logout</a>
</body>


</html>