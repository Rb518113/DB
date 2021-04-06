
package db_connect;

import db_connect.tables.addStudent;
import db_connect.tables.students;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DB_Connect {

  
 
  
    public static void main(String[] args) throws SQLException {
       // class.forName(com.mysql.jdbc.Driver);
       
        
       // Connection con = null;
       // Statement stmt =null;
        //ResultSet rs = null;
        
        try(
           Connection con = DBConnection.getConnection();
           Statement stmt =con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
           ResultSet rs = stmt.executeQuery("SELECT * FROM Students"); 
            ){
            
 
            students.getStudents(rs);
            
            
            
           
          
            
            
           
        }
        catch(SQLException e){
            System.out.println(e);
        }
      
        
           addStudent student = new addStudent();
           student.student("2", "rifat", "BHuiyan", "21", "2332");
           
        
        
       
        
    }
    
}


