<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<html>
<head>
<meta http-equiv="Content-Type"content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

</head>
<body>
<H1> List of Books</H1>
	<!--  use JSTL tags -->
	<!--  iterate list of objects -->
	<!--  For each book b in books -->
	<table border="0" class="table table-striped table-hover">
		<tr>
		<th>Image</th>
			<th>ISBN</th>
			<th>TITLE</th>
			<th>CATEGORY NAME</th>
			<th>View/edit/delete</th>
		</tr>
		<!--  for Each book b in books -->
		<c:forEach items="${books}" var="b">
		<tr>
		<c:url value="resources/images/${b.isbn }.png" var="src"/>
		<td><img src="${src }"style="width: 30%" align="middle"/></td>
		<td><a href="getBookByIsbn/${b.isbn}">${b.isbn}</a></td><td>${b.title }</td>
		<td>${b.category.categoryName }</td>
		<td><a href="getBookByIsbn/${b.isbn}"><span class="glyphicon glyphicon-info-sign"></span></a>
		<security:authorize ifAnyGranted="ROLE_ADMIN">
		<a href="admin/delete/${b.isbn }"><span class="glyphicon glyphicon-trash"></span></a>
		<a href="admin/book/editBook/${b.isbn }"><span class="glyphicon glyphicon-edit"></span></a>
		</security:authorize>
		</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>