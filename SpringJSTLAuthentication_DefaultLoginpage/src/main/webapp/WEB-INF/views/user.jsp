<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %><html>    
<head>    
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   
<title>Home Page</title>    
</head>    
<body>    
<h1 style="color: red;" align="center">Welcome to User page! </h1>
<a href="logout">logout</a> <br><br>  
<security:authorize access="hasRole('ADMIN')">  
Hello User  
</security:authorize>  
<security:csrfInput/>  
</body>    
</html>