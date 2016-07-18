<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>
<h1>ACME LOTTERY CO</h1><br><br>
<h3>Please preserve the CustomerID till the draw is completed</h3>
<h1>Order Summary</h1>
<h2>CustomerID --- ${customerid}</h2>
<h2> Item Purchased ---- ${typeloterry}</h2>
<h3> Quantity --- ${count} </h3>

<c:forEach var = "loterynumber" items = "${loterynumberlist}">

<table>
  <tr>
  <td>${loterynumber}</td>
  <tr>
</table>
</c:forEach>

<form method = "POST" action = "/AcmeLotteryco/close">
<input type = "Submit" class = "btn btn-primary" value = "Close"/>

</form>
</body>


</html>