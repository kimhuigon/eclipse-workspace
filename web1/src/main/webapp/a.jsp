<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>A 화면 - 
	<% Object obj1 = session.getAttribute("is_login");
	   Object obj2 = session.getAttribute("user_id");
		boolean value = false;
		if( obj1 != null) {
			value = (boolean) obj1;
		}
		out.println(value);
	String userId = null;
	if(obj2 != null) {
		userId = (String) obj2;
	}
	out.println(userId); %>
	</h1>
	<form action="b.jsp">
		<input type="text" name="x"><br>
		<input type="text" name="y"><br>
		<button>제출</button>
	</form>
</body>
</html>