<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>  
     <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page isELIgnored="false" %>
<title>Forgot Password</title>
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">
    <spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="image" value="/resources/image"></spring:url> 
    <!-- Bootstrap core CSS -->
    <link href="${css}/bootstrap.min.css" title="text/css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="${css}/login.css" title="text/css" rel="stylesheet">
    <script type="text/javascript">
    function forgot() {
    	document.getElementById('abc').style.display="block";
		
	}
    
    </script>

  </head>
<body>
<div class="container">
        <div class="card card-container">
            <form:form  method="POST" action="sendmsg" class="form-signin"   >
                <span id="reauth-email" class="reauth-email"></span>
           <label>Enter User Id</label>     <form:input path="mailId" type="email" id="inputEmail" class="form-control" placeholder="Enter Email address" required="autofocus"  />
      <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Send</button>
            </form:form><!-- /form -->
            
            
        </div><!-- /card-container -->
    </div>
</body>
</html>