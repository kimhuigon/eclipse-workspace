<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	int a = (int) (Math.random() * 45 + 1);
	int b = (int) (Math.random() * 45 + 1);
	int c = (int) (Math.random() * 45 + 1);
	int d = (int) (Math.random() * 45 + 1);
	int e = (int) (Math.random() * 45 + 1);
	int f = (int) (Math.random() * 45 + 1);
	int g = (int) (Math.random() * 45 + 1);
	
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	out.println("�̹��� �ζ� ��ȣ�Ӥ���" + "<br>");
	out.println(a);
	out.println(b);
	out.println(c);
	out.println(d);
	out.println(e);
	out.println(f);
	out.println("+ " + g);
%>