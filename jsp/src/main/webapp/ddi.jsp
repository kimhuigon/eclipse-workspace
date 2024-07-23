<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%

	String[] ddi = { "자-쥐", "축-소", "인-호랑이", "묘-토끼",
					 "진-용", "사-뱀", "오-말", "미-양",
					 "신-원숭이", "유-닭", "술-개", "해-돼지" };

	String q = request.getParameter("birth");
	if(q== null) {
		q = "2024";
	}
	
	// 2020년 쥐
	int birth = Integer.parseInt(q); // 숫자형태만 들어가고 나머지는 들어가지 않음
	int diff = (2020 - birth) % 12; // 1
	int diff2 = (12 - diff) % 12; // 11
	
	out.println(q);
	out.println(ddi[diff2]);
%>