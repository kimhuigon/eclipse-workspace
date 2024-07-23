<%@page import="emp.Owner"%>
<%@page import="emp.OwnerDao"%>
<%@page import="javax.naming.spi.DirStateFactory.Result"%>
<%@page import="com.fasterxml.jackson.core.JsonProcessingException"%>
<%@page import="com.fasterxml.jackson.databind.ObjectMapper"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
OwnerDao ownerDao = new OwnerDao();
Owner owner = new Owner();
owner.setName("흥부");

int result = ownerDao.insert(owner);
out.println("입력 완료");
%>