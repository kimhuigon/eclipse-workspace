package lv4;

import java.io.Closeable;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector implements Closeable {
  private static String url = "jdbc:mariadb://svc.sel4.cloudtype.app:30646/ggoreb";
  private static String user = "ggoreb";
  private static String pw = "1234";
  private static Connection connection = null;

  public static Connection getConnection() {
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

  @Override
  public void close() throws IOException {
    try {
      connection.close();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}
