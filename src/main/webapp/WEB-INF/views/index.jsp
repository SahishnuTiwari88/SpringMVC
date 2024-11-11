
<!-- step->5 -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "java.util.ArrayList" %>
    <%@ page import = "java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>
</head>
<body>
<h1>This is Home Page</h1>
<h1>Called by Home method in controller</h1>
<h1>url--> "/home" fired</h1>

<% String name = (String)request.getAttribute("name"); 
Integer id = (Integer)request.getAttribute("Id");
List<String> friends = (List<String>) request.getAttribute("f");

%>

<!-- it will return object but we convert it to string
 -->
<h1>Name is :<%= name %></h1>
<h1>ID is :<%= id %></h1>

<h1>Friend is :<% 
for(String s :friends){
	out.println(s);
}
%>
</h1>
<!-- print data(name) using expression tag -->
 
</body>
</html>
