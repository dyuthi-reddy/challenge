<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet">
</head>
<body>

<form method = POST action = "/AcmeLotteryco/salecount" >
<table>
  <tr>
  <td><label style="font-size:18">Select the quantity:</label></td></tr>
  <tr>
  <td><select class="selectpicker show-menu-arrow show-tick" name = "quantity">
  <option value = "0">Select Quantity</option>
  <option value = "1">1</option>
  <option value = "2">2</option>
  <option value = "3">3</option>
  <option value = "4">4</option>
  <option value = "5">5</option>
  </select></td>
  <td><input class = "btn btn-primary" type = "submit" value = "Buy"/></td>
  <td><label style="color:red;font-size:14">${message2} ${message3}</label></td>
  </tr>
</table>
</form>

 <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
 <script src="/resources/js/bootstrap.min.js"></script>
</body>
</html>