package emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

// Data Access Object
public class EmpDao {
	public List<Emp> select() {
		List<Emp> list = new ArrayList<>();
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

			String sql = "select * from emp";
			stmt = con.prepareStatement(sql);

			rs = stmt.executeQuery();
			while (rs.next()) {
//				String ename = rs.getString("ename"); // 단순하게 접근하기 : 하드코딩
				String ename = rs.getString(2); // 컬럼명으로 접근
				Emp emp = new Emp();
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(ename);
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				list.add(emp);
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
}
