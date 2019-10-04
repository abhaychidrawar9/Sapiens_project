<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form:form method="post" action="save" modelAttribute="employee">
		<table>
			<tr>
				<td>First Name :</td>
				<td><form:input type="text" path="firstName"
						value="${editemployee.getFirstName}" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input type="text" path="lastName" /></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><form:input type="text" path="age" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>