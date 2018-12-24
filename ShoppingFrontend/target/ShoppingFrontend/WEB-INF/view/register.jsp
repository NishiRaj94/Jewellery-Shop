<%@page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration Page</title>
</head>
<body>

	<form:form action="register" method="post" modelAttribute="reg">
	<table>
	<tr>
	<td><form:label path="u_username">User name:-</form:label></td>
	<td><form:input path="u_username"/></td>
	</tr>
	<tr>
	<td><form:label path="u_password">Password:-</form:label></td>
	<td><form:input path="u_password"/></td>
	</tr>
	<tr>
	<td><form:button>submit</form:button></td>
	</tr>
	</table>
</form:form>
</body>
</html>