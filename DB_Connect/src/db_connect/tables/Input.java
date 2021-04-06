/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db_connect.tables;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author rifatbhuiyan
 */
public class Input {
    
    public static String  getInput(String value){
        
       BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(value);
        System.out.flush();
      try{
          return buffer.readLine();
      }
      catch(Exception e){
          return "error";
      }
        
    }
    
    public static int getInt(String value){
       String in = getInput(value);
       return Integer.parseInt(in);
            
    
    
    
}

    
    
}
