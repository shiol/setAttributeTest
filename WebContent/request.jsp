<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>request.setAttribute</title>
</head>
<body>
<h2>request.setAttribute() Example</h2>
<%
Object name = request.getAttribute("name");
out.println("Attribute Value : " +name);
%>
</body>
</html>