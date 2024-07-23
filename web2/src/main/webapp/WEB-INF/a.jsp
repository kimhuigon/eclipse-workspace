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
	<button>팝업1</button>
	<button>팝업2</button>
	<script>
	const buttons = document.querySelectorAll('body > button');
	buttons.forEach((button) => {	
		button.addEventListener('click', (e) => {
			open('/web2/popup?value=' +e.target.innerText, '', 'width=300px height=300px');
		});
	});
	</script>
</body>
</html>