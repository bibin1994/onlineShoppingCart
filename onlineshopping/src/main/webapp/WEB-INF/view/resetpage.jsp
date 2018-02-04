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
<title>Reset Password</title>
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
            <!-- <img class="profile-img-card" src="//lh3.googleusercontent.com/-6V8xOA6M7BA/AAAAAAAAAAI/AAAAAAAAAAA/rzlHcD0KYwo/photo.jpg?sz=120" alt="" /> -->
            <img id="profile-img" class="profile-img-card" src="//ssl.gstatic.com/accounts/ui/avatar_2x.png" />
            <p id="profile-name" class="profile-name-card"></p>
            <form:form method="POST" action="restpass" class="form-signin">
                <span id="reauth-email" class="reauth-email"></span>
                <form:input path="otp" type="text" id="inputPassword" class="form-control" placeholder="Enter OTP" required="autofocus"/>
                <form:input path="mailId" type="email" id="inputEmail" class="form-control" placeholder="Email address" required/>
                <form:input path="newPassword" type="password" id="inputPassword" class="form-control" placeholder="New Password" required/>
                <form:input path="conformPswd" type="password" id="inputPassword" class="form-control" placeholder="Conform Password" required/>
                </div>
                <button class="btn btn-lg btn-primary btn-block btn-signin" type="submit">Change</button>
            </form:form><!-- /form -->
            
        </div><!-- /card-container -->
    </div><!-- /container -->
    
    

 <%@ include file="/WEB-INF/view/footer.jsp" %>
    

    <!-- Bootstrap core JavaScript -->
    <script src="${js}/login.js"></script>
    <script src="${js}/jquery.js"></script>
    <script src="${js}/bootstrap.bundle.min.js"></script>
</body>
</html>