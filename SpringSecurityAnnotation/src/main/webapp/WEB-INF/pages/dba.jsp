<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<h1 style="color: red;" align="center">DBA Page</h1>
	<h2 style="color: green;" align="center">${title}</h2>
	<h2 style="color: green;" align="center">${message}</h2>
<%-- <c:if test="${pageContext.request.userPrincipal.name != null}">
		 <a href='<c:url value="/logout" />' > Logout</a> 
	</c:if> --%>
</body>

<a href="<c:url value="/logout"/>">logout</a>
</html>