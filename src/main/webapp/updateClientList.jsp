<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Client List</title>

</head>
<body>
<form:form action="register.do" method="post" commandName="pickle">
			<!-- path=bean property -->
	Name: <form:input path="name" /> 
		<form:errors path="name" cssClass="error" /><br/>
	Age: <form:input path="age" /> 
		<form:errors path="age" cssClass="error" /><br/>
	Email: <form:input path="email" /> 
		<form:errors path="email" cssClass="error" /><br/>
	<input type="submit" value="Register" />
</form:form>
</body>
</html>