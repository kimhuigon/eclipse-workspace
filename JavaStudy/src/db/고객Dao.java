package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 고객Dao {
	private static final String DRIVER_CLASS_NAME = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://localhost:3306/test";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";

	int insert(String id, String name, int age, String grade, String job, int point) {
		int result = 0;

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "INSERT INTO 고객 (고객아이디, 고객이름, 나이, 등급, 직업, 적립금) " + 
			" VALUES(?, ?, ?, ?, ?, ?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, id);
			stmt.setString(2, name);
			stmt.setInt(3, age);
			stmt.setString(4, grade);
			stmt.setString(5, job);
			stmt.setInt(6, point);
			result = stmt.executeUpdate();

			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;

	}

	List<Map<String, Object>> select(String 검색어) {
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "SELECT 고객아이디, 고객이름, 나이, 등급, 직업, 적립금 " + "  FROM 고객" + " WHERE 고객이름 LIKE CONCAT('%',?,'%')";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, 검색어);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				String 고객아이디 = rs.getString("고객아이디");
				String 고객이름 = rs.getString("고객이름");
				int 나이 = rs.getInt("나이");
				String 등급 = rs.getString("등급");
				String 직업 = rs.getString("직업");
				int 적립금 = rs.getInt("적립금");

				// 맵 생성
				Map<String, Object> map = new HashMap<>();
				map.put("고객아이디", 고객아이디);
				map.put("고객이름", 고객이름);
				map.put("나이", 나이);
				map.put("등급", 등급);
				map.put("직업", 직업);
				map.put("적립금", 적립금);

				// 리스트에 맵 입력
				list.add(map);
			}

			rs.close();
			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}
}
