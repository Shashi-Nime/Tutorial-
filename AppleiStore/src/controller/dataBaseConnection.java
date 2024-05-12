
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class dataBaseConnection {
    static PreparedStatement connection;

    public static  Connection connection(){
 
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection  c = DriverManager.getConnection("jdbc:mysql://localhost:3306/appleistore","root","");
            
            return c;
        } 
        catch(Exception e){
            Logger.getLogger(dataBaseConnection.class.getName()).log(Level.SEVERE, null, e);
        }  
        
    return null;
    }
}
