package lv4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
  public static void main(String[] args) {
    
    try (Connection connection = Connector.getConnection();) {
      String sql = "select deptno, dname, loc from dept";
      try (PreparedStatement stmt = connection.prepareStatement(sql);) {
        try (ResultSet rs = stmt.executeQuery();) {
          while (rs.next()) {
            int deptno = rs.getInt("deptno");
            String dname = rs.getString("dname");
            String loc = rs.getString("loc");
            System.out.printf("%s %s %s\n", deptno, dname, loc);
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }

  }
}
