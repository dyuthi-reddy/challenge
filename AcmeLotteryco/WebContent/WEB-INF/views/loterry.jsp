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
<br>
<form method = POST action = "/AcmeLotteryco/pick3sales">
<input type = "hidden" name = "lotterytype" value = "PICK3">
<input class = "btn btn-lg btn-primary" type = "submit" value = "PICK 3"/>
<label style="color:red;font-size:14">${message}</label>
</form>
<br>
<form method = POST action = "/AcmeLotteryco/pick4sales">
  <input name = "lotterytype" type = "hidden" value = "PICK4">
 <input class = "btn btn-lg btn-primary" type = "submit" value = "PICK 4"/> 
 <label style="color:red;font-size:14">${message2}</label>
</form>

<br>

<form method = POST action = "/AcmeLotteryco/pick5sales">
  <input name = "lotterytype" type = "hidden" value = "PICK5">
 <input class = "btn btn-lg btn-primary" type = "submit" value = "PICK 5"/> 
 <label style="color:red;font-size:14">${message1}</label>
</form>
</body>
</html>