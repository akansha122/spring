<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
${loginError}
<form action="login" method="post">
 <input type="text" name="username" placeholder="enter username"/><br>
 <input type="password" name="password" placeholder="enter password"/><br>
 <input type="submit" value="submit"/>
</form>

</body>
</html>