<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<title>HOME</title>
<meta http-equiv="Content-Type" content="text/jsp; charset=ISO-8859-1">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

  <style type="text/css">
body {
	margin:80px 80px 100px 100px;
}
}
ul.topnav {
    list-style-type: none;
    overflow: hidden;
    background-color: #333;
}

/* Float the list items side by side */
ul.topnav li {float: left;}

/* Style the links inside the list items */
ul.topnav li a {
    display: inline-block;
    color: #f2f2f2;
    text-align: center;
    padding: 14px 16px;
    text-decoration: none;
    transition: 0.3s;
    font-size: 17px;}
    
    .carousel-inner > .item > img,
  .carousel-inner > .item > a > img {
      width: 70%;
      margin: auto;
  }
    
</style>


 </head>

 <body style="background-color: rgb(209,211,209)">

  <div class="container" >
   
<br/><br>

  <div id="myCarousel" class="carousel slide" data-ride="carousel">
 
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    
    <div class="carousel-inner" role="listbox">

      <div class="item active">
        <img src="<c:url value='/resources/carosal_pics/book-quotes-1.jpg'/>" alt="pic1" width="460" height="345" />
     </div>

      <div class="item">
        <img src="<c:url value='/resources/carosal_pics/pic1.jpg'/>" alt="pic2" width="460" height="345"/>
       </div>
    
      <div class="item">
        <img src="<c:url value='/resources/carosal_pics/book_quote_3'/>" width="460" height="345"/>
        </div>

      <div class="item">
        <img src="<c:url value='/resources/carosal_pics/cc.jpg'/>" alt="pic3" width="460" height="345"/>
     </div>

    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>

  <div id="fixedfooter" style align="center">Copyright © 2016 book's world.com</div>
  </div>
  </div>
 </body>
</html>