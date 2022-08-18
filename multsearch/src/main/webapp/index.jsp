<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Search</title>
</head>
<body>
	<form action="getServlet" method="post">
		<table>
			<td><input type="text" name="shoename">
			<input type="submit">
		</table>
	</form>
	<div id="show">
		<%@include file="show.jsp" %>
	</div>
	
</body>
</html>