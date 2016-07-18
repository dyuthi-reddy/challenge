<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Insert title here</title>

<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
<link href="<c:url value="/resources/css/mycss.css" />" rel="stylesheet">

<style>
.movedown{
   position:absolute;
   top:250px;
   left:800px;
   
   padding: 15px;
   border: 5px solid gray;
  }

.textbox { 
    background: transparent url(http://html-generator.weebly.com/files/theme/input-text-8.png) repeat-x; 
    border: 1px solid #999; 
    outline:0; 
    height:25px; 
    width: 220px; 
  }
  </style>
</head>
<body>
<form class="movedown" action = "/AcmeLotteryco/Home" method = "GET">

<input class = "btn btn-primary btn-lg"type ="submit" value = "Click">

</form>
</body>
</html>