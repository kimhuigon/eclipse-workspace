package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcRead {
	private static final String DRIVER_CLASS_NAME = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/test";
	private static final String USERNAME = "root";
//  private static final String URL = "jdbc:mariadb://15.164.153.191:3306/java";
//  private static final String USERNAME = "java";
	private static final String PASSWORD = "1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "SELECT empno, ename, job, sal " + "  FROM emp";

		PreparedStatement stmt = con.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int empno = rs.getInt("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			int sal = rs.getInt("sal");

			System.out.printf("id : %s, title: %s, content : %s,\n" + "member_id : %s\n", 
					empno, ename, job, sal);
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
