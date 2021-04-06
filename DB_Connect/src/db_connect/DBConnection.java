
package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
  private static final String USERNAME="RB";
  private static final String PASSWORD="Rifatbhuiyan0";
  private static final String CONN="jdbc:mysql://localhost:8889/school";
  
  public static Connection getConnection() throws SQLException{
      return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
      
      
  }
  
  
}
