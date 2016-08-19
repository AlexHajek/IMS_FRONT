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

<style>
	.error{
		color: red;
	}
</style>
</head>
<body>
<form:form action="updateclient.do" method="post" commandName="myClient">
			<!-- path=bean property -->
	ClientId: <form:input path="id" /> 
		<form:errors path="id" cssClass="error" /><br/>
	Name: <form:input path="name" /> 
		<form:errors path="name" cssClass="error" /><br/>
	Email: <form:input path="email" /> 
		<form:errors path="email" cssClass="error" /><br/>
	Person of Contact: <form:input path="pocn" /> 
		<form:errors path="pocn" cssClass="error" /><br/>
	Phone Number: <form:input path="phone" /> 
		<form:errors path="phone" cssClass="error" /><br/>
	Fax Number: <form:input path="fax" /> 
		<form:errors path="fax" cssClass="error" /><br/>
	<!-- Address: <form:input path="address" />
		<form:errors path="address" cssClass="error" /><br/>
	ClientType: <form:input path="clientType" />
		<form:errors path="clientType" cssClass="error" /><br/>
		-->
	<input type="submit" value="Register" />
</form:form>
</body>
</html>