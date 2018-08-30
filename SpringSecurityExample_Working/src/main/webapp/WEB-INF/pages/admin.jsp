<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<html>
<body>
<h1 style="color: red;" align="center">Admin Page</h1>
	<h1>${title}</h1>
	<h1>${message}</h1><br><br>

	<a href="<c:url value="/j_spring_security_logout" />" > Logout</a></h2> 

	<!-- Alternative 
	<c:if test="${pageContext.request.remoteUser != null}">
		<h2>Welcome : ${pageContext.request.remoteUser}</h2>
	</c:if>
 	-->

</body>
</html>