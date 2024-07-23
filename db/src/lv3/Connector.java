package lv3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connector {
  static String url = "jdbc:mariadb://localhost:3306/test";
  static String user = "root";
  static String pw = "1234";

  public static Connection getConnection() {
    Connection connection = null;
    try {
      Class.forName("org.mariadb.jdbc.Driver");
      connection = DriverManager.getConnection(url, user, pw);
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return connection;
  }
  
  public static void close(Connection connection, PreparedStatement stmt, ResultSet rs) {
    if(rs != null) {
      try {
        rs.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(stmt != null) {
      try {
        stmt.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
    if(connection != null) {
      try {
        connection.close();
      } catch (SQLException e) {
        e.printStackTrace();
      }
    }
  }
}
