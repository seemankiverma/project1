<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container-wrapper">

	<div class="container">

		<div class="page-header">

		<h1 style align="center">CUTOMER REGISTRARTION</h1>
		<p class="lead">Please Fill your information below :</p>
		</div>
	<c:url value="/customer/registration" var="url"></c:url>
	<form:form  action="${url }" method="post" commandName="customer">

	<h3>BASIC INFORMATION</h3>

	<div class="form-group">
	<label for="name">Name</label>
	<form:errors path="customerName" cssStyle="color:#ff0000" />
	<form:input path="customerName" class="form-control" />
	</div>
	
	<c:if test="${DuplicateEmail !=null }">
	${DuplicateEmail }
	</c:if>
	
	<div class="form-group">
	<label for="email">Email</label>
	<form:errors path="customerEmail" cssStyle="color:#ff0000" />
	<form:input path="customerEmail" class="form-control" />
	</div>
	
	<div class="form-group">
	<label for="phone">Phone</label>
	<form:input path="customerPhone" class="form-control" />
	</div>
	
	<c:if test="${DuplicateUname !=null }">
	${DuplicateUname }
	</c:if>	
	<div class="form-group">
	<label for="username">Username</label>
	<form:input path="users.username" class="form-control" />
	</div>
	
	<div class="form-group">
	<label for="password">Password</label>
	<form:input path="users.password" class="form-control" />
	</div>
	
	<br/>
	
	<h3>BILLING_ADDRESS</h3>
	
	<div class="form-group">
	<label for="billingStreet">Street Name</label>
	<form:input path="billingAddress.streetName" class="form-control" />
	</div>
	<div class="form-group">
	<label for="billingApartmentNumber">Apartment Number</label>
	<form:input path="billingAddress.apartmentNumber" class="form-control" />
	</div>
	<div class="form-group">
	<label for="billingCity">City</label>
	<form:input path="billingAddress.city" class="form-control" />
	</div>
	<div class="form-group">
	<label for="billingState">State</label>
	<form:input path="billingAddress.state" class="form-control" />
	</div>
	<div class="form-group">
	<label for="billingCountry">Country</label>
	<form:input path="billingAddress.country" class="form-control" />
	</div>
	<div class="form-group">
	<label for="billingZip">Zip Code</label>
	<form:input path="billingAddress.zipcode" class="form-control" />
	</div>
	
	<br/>

	<h3>SHIPPING ADDRESS</h3>
	
	<div class="form-group">
	<label for="shipppingStreet">Street Name</label>
	<form:input path="shippingAddress.streetName" class="form-control" />
	</div>
	<div class="form-group">
	<label for="shippingApartmentNumber">Apartment Number</label>
	<form:input path="shipping_address.apartmentNumber" class="form-control" />
	</div>
	<div class="form-group">
	<label for="shippingCity">City</label>
	<form:input path="shipping_address.city" class="form-control" />
	</div>
	<div class="form-group">
	<label for="shippingState">State</label>
	<form:input path="shipping_address.state" class="form-control" />
	</div>
	<div class="form-group">
	<label for="shippingCountry">Country</label>
	<form:input path="shipping_address.country" class="form-control" />
	</div>
	<div class="form-group">
	<label for="shippingZip">ZipCode</label>
	<form:input path="shipping_address.zipcode" class="form-control" />
	</div>
	<br/><br/>
	<input type="submit" value="submit" class="btn btn-default">
	<a href="<c:url value="/" />" class="btn btn-default">Cancel</a>
</form:form>
</div>
</div>
</body>
</html>