<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%
String id = request.getParameter("id");
String pw = request.getParameter("pw");

String jdbcClassName = "org.mariadb.jdbc.Driver";
String dbUrl = "jdbc:mariadb://127.0.0.1:3306/injection";
String username = "root";
String password = "1234";

Class.forName(jdbcClassName);

Connection con = DriverManager.getConnection(dbUrl, username, password);
String sql = "select 1" + 
             "  from secure_member" + 
		     " where id = '" + id + "'" +
             "   and pw = '" + pw + "'";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
if(rs.next()) {
	out.println("로그인 성공");
} else {
	out.println("로그인 실패");	
}
%>