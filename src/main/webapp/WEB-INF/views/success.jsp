<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success Page</title>
</head>
<body>

<h2 >${Header }</h2>
<p >${desc }</p>
<h3 style = "color:green">${msg }</h3>
<hr>
<h3> ${user.email}</h3>
<h3>${user.userName}</h3>
<h3> ${user.password}</h3>


</body>
</html>