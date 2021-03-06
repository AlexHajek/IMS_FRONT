<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="./style.css">
</head>
<body>
	<div class="fulldiv">
   <div class="navbar">
			<ul>
				<li><a href="home.jsp">Home</a></li>
			  <li><a href="updateClientList.do">Update Client</a></li>
			  <li><a href="updateProduct.do">Update Product</a></li>
			  <li><a href="invoices.do">Generate Invoices</a></li>
			  <li><a href="reports.do">Generate Reports</a></li>
			  <li><a href="faq.jsp">FAQ</a></li>
			  <li><a href="about.jsp">About</a></li>
			</ul>
   </div>
   <div class="pagebody">
   	<div class="pagecenter">
   		<h1>Create New Product</h1>
			<form:form action="registerProduct.do" method="post" commandName="newProduct">
						<!-- path=bean property -->
				Product UPC:<br/> <form:input path="productUPC" /> <br/>
					<form:errors path="productUPC" cssClass="error" /><br/>
				Product Name:<br/> <form:input path="productName" /> <br/>
					<form:errors path="productName" cssClass="error" /><br/>
				Product Description:<br/> <form:input path="productDescription" /> <br/>
					<form:errors path="productDescription" cssClass="error" /><br/>
				Short Name:<br/> <form:input path="shortName" /> <br/>
					<form:errors path="shortName" cssClass="error" /><br/>
				Unit Cost:<br/> <form:input path="unitCost" /> <br/>
					<form:errors path="unitCost" cssClass="error" /><br/>
				Pack Size:<br/> <form:input path="packSize" /> <br/>
					<form:errors path="packSize" cssClass="error" /><br/>
				Reorder Quantity:<br/> <form:input path="reorderQuantity" /> <br/>
					<form:errors path="reorderQuantity" cssClass="error" /><br/>
				Retail Price:<br/> <form:input path="retailPrice" /> <br/>
					<form:errors path="retailPrice" cssClass="error" /><br/>
				Product Weight:<br/> <form:input path="productWeight" /> <br/>
					<form:errors path="productWeight" cssClass="error" /><br/>
				ProductImage:<br/> <form:input path="productImage" /> <br/>
					<form:errors path="productImage" cssClass="error" /><br/>
				<input type="submit" value="Register" />
			</form:form>
			<br/>
		</div>
   </div>
	</div>
	<div class="cleardiv"></div>
</body>
</html>