<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Insert title here</title>
</head>
<body>
<table border=1>
		<tr align="center">
			<th width=100>ID
			<th width=150>Name
			<th width=150>Model
			<th width=100>Price
			<th width=100>Stock
		<c:forEach var="shoe" items="${shoe}">
		<tr align="center">
			<td>${shoe.id}
			<td>${shoe.name}
			<td>${shoe.model}
			<td>${shoe.price}
			<td>${shoe.stock}	
		</c:forEach>	
	</table>
</body>
</html>