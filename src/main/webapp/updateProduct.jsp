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
<form:form action="registerProduct.do" method="post" commandName="newProduct">
			<!-- path=bean property -->
	Product UPC: <form:input path="productUPC" /> 
		<form:errors path="productUPC" cssClass="error" /><br/>
	Product Name: <form:input path="productName" /> 
		<form:errors path="productName" cssClass="error" /><br/>
	Product Description: <form:input path="productDescription" /> 
		<form:errors path="productDescription" cssClass="error" /><br/>
	Short Name: <form:input path="shortName" /> 
		<form:errors path="shortName" cssClass="error" /><br/>
	Unit Cost: <form:input path="unitCost" /> 
		<form:errors path="unitCost" cssClass="error" /><br/>
	Pack Size: <form:input path="packSize" /> 
		<form:errors path="packSize" cssClass="error" /><br/>
	Reorder Quantity: <form:input path="reorderQuantity" /> 
		<form:errors path="reorderQuantity" cssClass="error" /><br/>
	Retail Price: <form:input path="retailPrice" /> 
		<form:errors path="retailPrice" cssClass="error" /><br/>
	Product Weight: <form:input path="productWeight" /> 
		<form:errors path="productWeight" cssClass="error" /><br/>
	ProductImage: <form:input path="productImage" /> 
		<form:errors path="productImage" cssClass="error" /><br/>
	<input type="submit" value="Register" />
</form:form>
</body>
</html>