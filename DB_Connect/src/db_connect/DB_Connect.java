/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect;

import db_connect.tables.students;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author rifatbhuiyan
 */
public class DB_Connect {

  
 
  
    public static void main(String[] args) throws SQLException {
       // class.forName(com.mysql.jdbc.Driver);
       
        
       // Connection con = null;
       // Statement stmt =null;
        //ResultSet rs = null;
        
        try(
           Connection con = DBConnection.getConnection();
           Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ResultSet rs =stmt.executeQuery("SELECT * FROM school_table"); 
            ){
            
 
            students.getStudents(rs);
            
           System.out.println(rs.getRow());
           System.out.println("Connected");
        }
        catch(SQLException e){
            System.out.println(e);
        }
      
        
        
        
        
       
        
    }
    
}
