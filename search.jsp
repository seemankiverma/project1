<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC"-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page isELIgnored="false"%>
<%@include file="header2.jsp"%>
<html>
<head>
  <title>Search</title>
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.4.8/angular.min.js"></script>
  <script>
        var myapp=angular.module('myapp' , [])
        .controller('bookController', function($scope, $http){
        	$scope.getBooks=function(){
        		$http.get('http://localhost:8080/bookslove/getBookForSearch').success(function(data)){
        			$scope.books=data;
        		}
        	};
        }
        
 </script>
</head>
<body>
<div class="container" style="padding:50px">
<div ng-app="myapp" ng-controller="bookController">
  <input type="search" ng-model="searchText" placeholder="Search for products">
  <input type="submit"><br><br>
  <table class="table table-bordered">
    <thead>
      <tr>
        <th>Title</th>
        <th>Price</th>
        <th>Category</th>
      	<th>More</th>
      </tr>
    </thead>
    <tbody>
    <c:forEach items="${book}" var="b">
      <tr ng-repeat="book in books|filter:searchText">
        <td>${book.title }</td>
        <td>${book.price }</td>
        <td>${book.title }</td>
        <td>${book.price }</td>
      	<td><input type="button" value="More>>"></td>
      </tr>
      </c:forEach>
    </tbody>
  </table>
  </div>
  </div>
</div>
</body>
</html>