package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DeptDao2 {
	private static final String DRIVER_CLASS_NAME = "org.mariadb.jdbc.Driver";
	private static final String URL = "jdbc:mariadb://127.0.0.1:3306/test";
	private static final String USERNAME = "root";
	private static final String PASSWORD = "1234";

	List<Map<String, Object>> select(String search) { // 조회
		List<Map<String, Object>> list = new ArrayList<>();

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "SELECT DEPTNO, DNAME, LOC " + " FROM dept" +
			" WHERE DNAME LIKE CONCAT('%',?,'%')";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, search);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				int DEPTNO = rs.getInt("DEPTNO");
				String DNAME = rs.getString("DNAME");
				String LOC = rs.getString("LOC");

				// 맵 생성
				Map<String, Object> map = new HashMap<>();
				map.put("DEPTNO", DEPTNO);
				map.put("DNAME", DNAME);
				map.put("LOC", LOC);

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

	int insert(int DEPTNO, String DNAME, String LOC) { // 삽입
		int result = 0;

		try {
			Class.forName(DRIVER_CLASS_NAME);
			Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);

			String sql = "INSERT INTO dept (DEPTNO, DNAME, LOC)" + " VALUES (?, ?, ?)";

			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, DEPTNO);
			stmt.setString(2, DNAME);
			stmt.setString(3, LOC);

			result = stmt.executeUpdate();

			stmt.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

}
