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

Welcome To VMS
<c:url var="saveVisitor" value="/saveVisitor" ></c:url>
<form:form method="POST" action="${saveVisitor}" modelAttribute="visitor">
First Name:<input type="text" name="firstName"> <br>
Last Name:<input type="text" name="lastName"> <br>
<button type="submit">Save Visitor</button>
</form:form>

 <br> <br> <br>
<c:url var="allVisitors" value="/allVisitors" ></c:url>
<a href="${allVisitors}" >See All Visitors</a>

</body>
</html>