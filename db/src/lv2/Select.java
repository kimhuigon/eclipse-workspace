package lv2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
  public static void main(String[] args) {

    String url = "jdbc:mariadb://localhost:3306/test";
    String user = "root";
    String pw = "1234";

    Connection connection = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      Class.forName("org.mariadb.jdbc.Driver");

      connection = DriverManager.getConnection(url, user, pw);

      String sql = "select deptno, dname, loc from dept";
      stmt = connection.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        int deptno = rs.getInt("deptno");
        String dname = rs.getString("dname");
        String loc = rs.getString("loc");
        System.out.printf("%s %s %s\n", deptno, dname, loc);
      }
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
    	System.out.println("관리자에게 문의해주세요");
//      e.printStackTrace();
    } finally {
      if (rs != null) {
        try {
          rs.close();
        } catch (SQLException e) {
        }
      }
      if (stmt != null) {
        try {
          stmt.close();
        } catch (SQLException e) {
        }
      }
      if (connection != null) {
        try {
          connection.close();
        } catch (SQLException e) {
        }
      }
    }

  }
}
