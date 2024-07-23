package lv1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    String url = "jdbc:mariadb://localhost:3306/test";
    String user = "root";
    String pw = "1234";
    
    Class.forName("org.mariadb.jdbc.Driver");
    
    Connection connection = DriverManager.getConnection(url, user, pw);
    
    String sql = "select deptno, dname, loc from dept";
    PreparedStatement stmt = connection.prepareStatement(sql);
    ResultSet rs = stmt.executeQuery();
    while(rs.next()) {
      int deptno = rs.getInt("deptno");
      String dname = rs.getString("dname");
      String loc = rs.getString("loc");
      System.out.printf("%s %s %s\n", deptno, dname, loc);
    }
  }
}
