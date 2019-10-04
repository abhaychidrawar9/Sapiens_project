<%@page import="com.abhay.model.Employee"%>
<%@page import="com.abhay.model.Address"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.List"%>
<%
	List<Address> al = (List<Address>) request.getAttribute("eList");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>
		<tr>
			<th>Name</th>
			<th>Age</th>
			<th>Address</th>
			<th>Contact No</th>
		</tr>
		<%
			for(Address a : al) {
				//Address a1 = (Address)a;
				Employee e = a.getEmployee();
				%>
		<tr>
			<td><%= e.getFirstName() %> <%=e.getLastName() %></td>
			<td><%= e.getAge() %></td>
			<td><%= a.getPresentAddress() %></td>
			<td><%= a.getContactNo() %></td>
			<td><a href="edit">Edit</a></td>
			<td><a href="delete">Delete</a></td>
		<tr>
			<%
				}
			%>
		
	</table>


</body>
</html>