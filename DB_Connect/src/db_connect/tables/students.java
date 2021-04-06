
package db_connect.tables;

import java.sql.ResultSet;
import java.sql.SQLException;


public class students {
    public static void getStudents (ResultSet rs) throws SQLException{
        
        
        
       while (rs.next()){
        StringBuffer buffer = new StringBuffer();
        
        buffer.append("ID " + rs.getInt("ID"));
        buffer.append(" Name: "+rs.getString("first") +" "+ rs.getString("last"));
        
           System.out.println(buffer.toString());  
        
        
    
        
    }
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
