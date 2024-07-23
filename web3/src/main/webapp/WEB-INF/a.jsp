<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>A 화면</h1>
	<form action="b">
		<input type="text" name="x"><br>
		<input type="text" name="y"><br>
		<button>제출</button>
	</form>
	<button onclick = "popup()">팝업</button>
	<script>
	function popup() {
		open('popup','','width=300px height=300px');
	}
	</script>
</body>
</html>