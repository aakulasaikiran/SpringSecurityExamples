


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>

<body>
	<h1 style="color: red;">Spring Security HomePage</h1>
	<a href="admin">Admin</a>
	<br>
	<br>
	<a href="login">login</a>
	<br>
	<br>
	<a href="<c:url value="/j_spring_security_logout" />"> Logout</a>
	</h2>
</body>

