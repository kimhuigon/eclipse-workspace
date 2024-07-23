<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
String jdbcClassName = "org.mariadb.jdbc.Driver";
String dbUrl = "jdbc:mariadb://svc.sel4.cloudtype.app:30646/ggoreb";
String username = "ggoreb";
String password = "1234";

Class.forName(jdbcClassName);

Connection con = DriverManager.getConnection(dbUrl, username, password);

String sql = "select id, title" + 
             "  from reply_board2" + 
		     " order by p_id desc, `order` asc";
PreparedStatement stmt = con.prepareStatement(sql);
ResultSet rs = stmt.executeQuery();

String html = "<table border='1'>";
html += "<tr><td>번호</td><td>제목</td></tr>";
while (rs.next()) {
	int id = rs.getInt("id");
	String title = rs.getString("title");
	html += "<tr>";
	html += "<td>" + id + "</td>";
	html += "<td>" + title + "</td>";
	html += "</tr>";
}
html += "</table>";
out.println(html);

rs.close();
stmt.close();
con.close();
%>