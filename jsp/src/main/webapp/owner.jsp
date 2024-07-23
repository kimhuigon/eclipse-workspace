<%@page import="emp.Owner"%>
<%@page import="emp.OwnerDao"%>
<%@page import="com.fasterxml.jackson.core.JsonProcessingException"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
OwnerDao ownerDao = new OwnerDao();
List<Owner> list = ownerDao.select();
ObjectMapper om = new ObjectMapper();

try {
	String result = om.writeValueAsString(list);
	out.println(result);
} catch (JsonProcessingException e) {
	e.printStackTrace();
}
%>