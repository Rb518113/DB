/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect.tables;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author rifatbhuiyan
 */
public class students {
    public static void getStudents (ResultSet rs) throws SQLException{
       while (rs.next()){
        StringBuffer buffer = new StringBuffer();
        
        buffer.append("ID " + rs.getInt("id"));
        buffer.append(" Name: "+rs.getString("FirstName") +" "+ rs.getString("LastName"));
        
           System.out.println(buffer.toString());  
        
        
    
        
    }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
