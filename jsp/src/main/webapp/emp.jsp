<%@page import="com.fasterxml.jackson.core.JsonProcessingException"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="emp.Emp"%>
<%@page import="java.util.List"%>
<%@page import="emp.EmpDao"%>
<%@page import="emp.Person"%>
<%@ page language="java" contentType="application/json; charset=UTF-8" pageEncoding="UTF-8"%>
    <%
    EmpDao empDao = new EmpDao();
	List<Emp> list = empDao.select();
	System.out.println(list);
	
	ObjectMapper om = new ObjectMapper();
	try {
		String result = om.writeValueAsString(list);
		out.println(result);
	} catch (JsonProcessingException e) {
		e.printStackTrace();
	}
    %>