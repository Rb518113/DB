/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rifatbhuiyan
 */
public class DB_Connect {

  private static final String USERNAME="RB";
  private static final String PASSWORD="Rifatbhuiyan0";
  private static final String CONN="jdbc:mysql://localhost:8889/school";
  
  
  
  
    public static void main(String[] args) throws SQLException {
       // class.forName(com.mysql.jdbc.Driver);
       
        
        Connection con = null;
        Statement stmt =null;
        ResultSet rs = null;
        
        try{
            con = DriverManager.getConnection(CONN, USERNAME, PASSWORD);
            stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            rs =stmt.executeQuery("SELECT * FROM school_table");
            
            rs.last();
            
         System.out.println(rs.getRow());
        System.out.println("Connected");
        }
        catch(SQLException e){
            System.out.println(e);
        }
        finally{
            if(rs != null){
                rs.close();
            }
            if(stmt != null){
                stmt.close();
            }
            
            if(con != null){
                
                con.close();
            }
            
        }
        
        
        
        
       
        
    }
    
}
