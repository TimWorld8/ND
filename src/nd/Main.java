/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Main {
      public static Connection connectDB() {
        String db_name = "ndclinic";
        String user = "root";
        String pwd = "";
        String hostName = "localhost";
        String driverName = "com.mysql.cj.jdbc.Driver";
        
        try{
            Class.forName(driverName);
            String url = "jdbc:mysql://"+hostName+":3306/"+db_name;
            Connection con = (Connection) DriverManager.getConnection(url,user,pwd);
            System.out.println("Connection Successful");
            System.out.println(con);
            return con;
        }catch(Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }
      
     public static void main(String args[]) {
       new Employee_login().setVisible(true);
     }
}
