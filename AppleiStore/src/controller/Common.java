
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Common {
    public static ResultSet get(String qry){
        ResultSet rslt = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/appleistore","root","");
            Statement stm = conn.createStatement();
            rslt = stm.executeQuery(qry);
        }catch (SQLException  | ClassNotFoundException e){
            System.out.println("Can't get Result as :"+e.getMessage());
        }
        return rslt;
    }
    
    public static String modify(String qry) {

        String msg = "0";
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/appleistore","root","");
            Statement stm = conn.createStatement();
            int rows = stm.executeUpdate(qry);

            if (rows != 0)
                msg = "1";

        } catch (SQLException e) {
            System.out.println("Can't Get Results as : " + e.getMessage());
            msg = "dberror";

        }
        return msg;

    }
}


