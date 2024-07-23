<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>B 화면</h1>
<%
	String x = request.getParameter("x");
	String y = request.getParameter("y");
	String text = 
	    String.format("A로부터 넘겨받는 데이터 x: %s, y: %s", x, y);
	out.println(text);
%>


</body>
</html>