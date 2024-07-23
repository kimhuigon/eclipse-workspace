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
	String userId = request.getParameter("user_id");
	String userPw = request.getParameter("user_pw");
	
	if(userId.equals("busan")) {
		if(userPw.equals("1234")) {
	        out.println("<h1>로그인 되었습니다.</h1>");
	        session.setAttribute("is_login", true);
	        session.setAttribute("user_id", userId);
	    } else {
	  	    out.println("<h1>비밀번호를 확인해주세요.</h1>");
	    }
	} else {
	    out.println("<h1>아이디를 확인해주세요.</h1>");
	}
%>
</body>
</html>







