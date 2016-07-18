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
<p>${message}</p>
<h1>Winning Ticket Numbers</h1>
<c:forEach var = "winner" items = "${winnerlist}">
<table>
<tr><td>${winner}</td></tr>
</table>
</c:forEach>

<br>

<form method = "POST" action = "/AcmeLotteryco/drawclose">
<input class = "btn btn-primary" type = "submit" value = "Close"/>
</form>
<br>
<form method = "POST" action = "/AcmeLotteryco/drawsummary">
<input class = "btn btn-primary" type = "submit" value = "DrawReport"/>
</form>
</body>
</html>