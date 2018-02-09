<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<%@page isELIgnored="false"%>
</head>
<body>
<table bordercolor="red" width="2">
<thead>
<td>id</td><td>name</td>
</thead>
<c:forEach items="${categories }" var="cat"> 
<tr>
<td>${cat.id}</td>
<td>${cat.name}</td>
<tr>
</c:forEach>

</table>
</body>
</html>