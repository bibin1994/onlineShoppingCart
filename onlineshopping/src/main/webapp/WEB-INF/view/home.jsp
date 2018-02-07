<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@page isELIgnored="false"%>
<title>Online Shopping ${title}</title>
<head>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<meta name="description" content="">
<meta name="author" content="">
<c:set var="contextRoot" value="${pageContext.request.contextPath }" />
<spring:url var="css" value="/resources/css"></spring:url>
<spring:url var="js" value="/resources/js"></spring:url>
<spring:url var="image" value="/resources/image"></spring:url>
<!-- Bootstrap core CSS -->
<link href="${css}/bootstrap.min.css" title="text/css" rel="stylesheet">

<!-- Custom styles for this template -->
<link href="${css}/myapp.css" title="text/css" rel="stylesheet">
<script type="text/javascript">
	window.menu = '${title}';
</script>
</head>

<body>
	<div class="wrapper">

		<!-- Navigation -->
		<%@ include file="./shared/header.jsp"%>
		<div class="content">
		<!-- Page Content -->
		
			<!-- index -->
			<c:if test="${userClickHome == true}">
				<%@ include file="./home1.jsp"%>
			</c:if>

			<!-- about page when user click about -->
			<c:if test="${userClickAbout == true}">
				<%@ include file="./about.jsp"%>
			</c:if>

			<!-- about page when user click contact -->
			<c:if test="${userClickContact == true}">
				<%@ include file="./contact.jsp"%>
			</c:if>

			<!-- about page when user click service -->
			<c:if test="${userClickService == true}">
				<%@ include file="./services.jsp"%>
			</c:if>
		
		<!-- /.container -->
</div>
		<!-- Footer -->
		<%@ include file="./shared/footer.jsp"%>


		<!-- Bootstrap core JavaScript -->
		<script src="${js}/jquery.js"></script>
		<script src="${js}/bootstrap.bundle.min.js"></script>
		<script src="${js}/myjs.js"></script>
	</div>
</body>

</html>

