<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page isELIgnored="false" %>
<title>Home</title>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="image" value="/resources/image"></spring:url> 



    <title>Services</title>

    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" title="text/css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/myapp.css" title="text/css" rel="stylesheet">

  </head>
<body>

<%@include file="/WEB-INF/view/header.jsp" %>




<%@include file="/WEB-INF/view/footer.jsp" %>
</body>
</html>