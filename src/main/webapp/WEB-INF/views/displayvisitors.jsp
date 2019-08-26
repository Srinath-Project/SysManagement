<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>vms welcome page</title>
</head>
<body>

Available Visitors
<c:url var="saveVisitor" value="/saveVisitor" ></c:url>
<c:forEach items="${allVisitors}" var="visitor">
  FirstName:  ${visitor.firstName} <br>
</c:forEach>


<c:url var="loginPage" value="/login" ></c:url>
<a href="${loginPage}" >back</a>

</body>
</html>