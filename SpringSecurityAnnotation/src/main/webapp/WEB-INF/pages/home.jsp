<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<html>
<body>
	<h1 style="color: red;" align="center">Home Page</h1>
	<h4 style="color: green;" align="center">${title}</h4>
	<h4 style="color: green;"align="center">${message}</h4>
	
	<a href="admin">Admin</a>
	<a href="dba">dba</a>
	<a href="user">User</a>
	<a href="<c:url value="/logout"/>">logout</a>
</body>
</html>