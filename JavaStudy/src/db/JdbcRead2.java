package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class JdbcRead2 {
	private static final String DRIVER_CLASS_NAME = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/test";
	private static final String USERNAME = "root";
//  private static final String URL = "jdbc:mariadb://15.164.153.191:3306/java";
//  private static final String USERNAME = "java";
	private static final String PASSWORD = "1234";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(DRIVER_CLASS_NAME);
		Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		String sql = "SELECT id, name, tel, road_address " + "  FROM night_pharmacy" + 
		" WHERE road_address LIKE CONCAT('%',?,'%')";
		
		System.out.println("검색어를 입력하세요");
		Scanner s = new Scanner(System.in);

		PreparedStatement stmt = con.prepareStatement(sql);
		stmt.setString(1, s.next());
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String tel = rs.getString("tel");
			String road_address = rs.getString("road_address");

			System.out.printf("id : %s, name: %s, tel : %s,\n" + "road_address : %s\n", 
					id, name, tel, road_address);
		}
		rs.close();
		stmt.close();
		con.close();
	}
}
