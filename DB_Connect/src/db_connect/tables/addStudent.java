
package db_connect.tables;

import db_connect.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class addStudent {
    
    public void student(String id, String fname, String lname, String age,String fee){
        
        String SQL ="INSERT INTO Students VALUES(?,?,?,?,?)";
        
        try(Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareCall(SQL);
                )
        {
            stmt.setString(1, id);
            stmt.setString(2, fname);
            stmt.setString(3, lname);
            stmt.setString(4, age);
            stmt.setString(5, fee);
            
            stmt.execute();
            
        }  
        catch(Exception e){
            
        }
        
        
        
        
    }
    
    
}
