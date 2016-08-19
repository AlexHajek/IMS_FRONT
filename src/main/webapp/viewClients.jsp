<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Registered Clients</h2>
<a href="updateClientList.do">Add a Client</a>
	<table>
		<tr><th>Id</th><th>Name</th><th>Email</th><th>PoCName</th><th>Phone</th><th>Fax</th></tr>
		<c:forEach var="client" items="${clientList}">
			<tr>
				<td><c:out value="${client.id}"></c:out></td>
				<td><c:out value="${client.name}"></c:out></td>
				<td><c:out value="${client.email}"></c:out></td>
				<td><c:out value="${client.pocn}"></c:out></td>
				<td><c:out value="${client.phone}"></c:out></td>
				<td><c:out value="${client.fax}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>