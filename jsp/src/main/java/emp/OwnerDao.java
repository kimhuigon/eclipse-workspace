package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// DAO - Data Access Object
public class OwnerDao {
	public List<Owner> select() {
		List<Owner> list = new ArrayList<>();
													// 해당 데이터베이스의 이름
		String url = "jdbc:mariadb://localhost:3306/test";
		String id = "root";
		String pw = "1234";

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);

			String sql = "select * from owner";
			stmt = con.prepareStatement(sql);

			rs = stmt.executeQuery();
			while (rs.next()) {
				Owner owner = new Owner();
				owner.setId(rs.getInt("id"));
				owner.setName(rs.getString("name"));
				
				list.add(owner);
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return list;
	}

	public int insert(Owner owner) {
		int result = 0;
		
		String url = "jdbc:mariadb://localhost:3306/test";
		String id = "root";
		String pw = "1234";

		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pw);

			String sql = "insert into owner (id, name)" + "	values (null, ?)";
			stmt = con.prepareStatement(sql);
			stmt.setString(1, owner.getName());

			result = stmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (rs != null) {
				try {
					rs.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return result;
	}
}
