<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="/index" method="POST" modelAttribute="emp">
<input type="text" name="firstName" placeholder="FName"><br>
<input type="text" name="lastName" placeholder="LName"><br>
<input type="text" name="age" placeholder="Age"><br>
<input type="submit" value="submit" name="submit"> 
</form>



</body>
</html>