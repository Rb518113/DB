/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author rifatbhuiyan
 */
public class DBConnection {
  private static final String USERNAME="RB";
  private static final String PASSWORD="Rifatbhuiyan0";
  private static final String CONN="jdbc:mysql://localhost:8889/school";
  
  public static Connection getConnection() throws SQLException{
      return DriverManager.getConnection(CONN, USERNAME, PASSWORD);
      
      
  }
  
  
}
