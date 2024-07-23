package lv3;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
  public static void main(String[] args) {

    Connection connection = null;
    PreparedStatement stmt = null;
    ResultSet rs = null;

    try {
      connection = Connector.getConnection();

      String sql = "select deptno, dname, loc from dept";
      stmt = connection.prepareStatement(sql);
      rs = stmt.executeQuery();
      while (rs.next()) {
        int deptno = rs.getInt("deptno");
        String dname = rs.getString("dname");
        String loc = rs.getString("loc");
        System.out.printf("%s %s %s\n", deptno, dname, loc);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      Connector.close(connection, stmt, rs);
    }

  }
}
