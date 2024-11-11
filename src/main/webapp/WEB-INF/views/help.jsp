<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page isELIgnored = "false" %>
    
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
   <!--  this has to be added in order to use for each loop -->
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help page</title>
</head>
<body>
<h1>This is Help Page</h1>

<%
/* String name = (String)request.getAttribute("name");
Integer roll = (Integer)request.getAttribute("roll"); */
%>

<h1>Name is : ${name}
<%-- <%=name %> --%>
</h1>

<h1>Roll no is :${roll } 
<%-- <%=roll %> --%>
</h1>

<hr>
<!-- hr is horizontal divider -->

<c:forEach var = "i" items = "${marks }">
<h1>Mark is : ${i }</h1>
</c:forEach>

</body>
</html>

<!-- we are using short cut technique about how to gep/print data without using request.getAttribute(), every time and for that we have
to use JSP Expression language(JSTL), in that we use $ symbol followed by{} the key i.e.${key},First page is ignoring our JSTL which can be 
solved when we use isELIgnored=false -->