/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package show;
import java.sql.*;
/**
 *
 * @author HP
 */
public class Show {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ShowInfo().setVisible(true);
    }
    
    public static Connection connectDB(){
        String db_name = "testsub";
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
    
}
