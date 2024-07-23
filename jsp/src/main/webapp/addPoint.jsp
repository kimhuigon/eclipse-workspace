<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="emp.Point"%>
<%@page import="emp.PointDao"%>
<%@page import="com.fasterxml.jackson.core.JsonProcessingException"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
PointDao pointDao = new PointDao();
Point point = new Point();
point.setTitle("부산정보산업진흥원");
point.setLat(30.1234);
point.setLng(127.5678);

int result = pointDao.insert(point);
System.out.println(result);
out.println("입력 완료");
%>