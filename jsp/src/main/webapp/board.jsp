<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
pageEncoding="utf-8"%>
<%
String id = request.getParameter("id");

String jdbcClassName = "org.mariadb.jdbc.Driver";
String dbUrl = "jdbc:mariadb://svc.sel4.cloudtype.app:30646/ggoreb";
String username = "ggoreb";
String password = "1234";

Class.forName(jdbcClassName);

Connection con = DriverManager.getConnection(dbUrl, username, password);
String sql = "select id, title, content" + 
             "  from secure_board" + 
		     " where id = '" + id + "'";
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery(sql);
String html = "<table border='1'>";
html += "<tr><td>번호</td><td>제목</td><td>내용</td></tr>";
while (rs.next()) {
	int boardId = rs.getInt("id");
	String title = rs.getString("title");
	String content = rs.getString("content");
	html += "<tr>";
	html += "<td>" + boardId + "</td>";
	html += "<td>" + title + "</td>";
	html += "<td>" + content + "</td>";
	html += "</tr>";
}
html += "</table>";
out.println(html);
%>