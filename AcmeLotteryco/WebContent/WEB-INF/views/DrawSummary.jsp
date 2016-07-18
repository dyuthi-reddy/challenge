<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<label>${messageinfo}</label>
<p>winning tickets</p>
<c:forEach var = "winners" items = "${winnerlist1}">
<table>
<tr><td>${winners}</td></tr>
</table>

</c:forEach>


<h1><strong>Winner customer ids</strong></h1>
<c:forEach var = "winnerid" items = "${winnerids}">
<table>
<tr>
<th>
Customer ID
</th>
<th>
Lottery Type
</th>
</tr>
<tr>
<td>${winnerid.key}</td>
<td>${winnerid.value}</td>
</tr>

</table>
</c:forEach>

<p>Customers Ids and Type of Tickets purchased</p>
<c:forEach var = "customertype" items = "${custlotmaptypelist}">
<table>
<tr><td>${customertype.key}</td>
<td>${customertype.value}</td>
</tr>
</table>
</c:forEach>

<p> No of Customers who purchased the tickets</p>
<p>${custlotmapsize}</p>

<p>${attemptsoldout}</p>

<form method = "POST" action = "/AcmeLotteryco/drawclose">
<input class = "btn btn-primary" type = "submit" value = "Close"/>
</form>

</body>
</html>