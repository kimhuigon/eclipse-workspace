<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String jumin1 = request.getParameter("jumin1");
	String jumin2 = request.getParameter("jumin2");
	
	out.println(jumin1 + jumin2);
%>
</body>
</html>