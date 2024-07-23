<%@page import="emp.Point"%>
<%@page import="emp.PointDao"%>
<%@page import="com.fasterxml.jackson.core.JsonProcessingException"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
PointDao pointDao = new PointDao();
List<Point> list = pointDao.select();
System.out.println(list);
ObjectMapper om = new ObjectMapper();

try {
	String result = om.writeValueAsString(list);
	out.println(result);
} catch (JsonProcessingException e) {
	e.printStackTrace();
}
%>