/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student.information.system;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author rahul
 */
public class dbconnection {
    
    public static Connection con(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaregister","root","");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Connected");
        }
        return con;
    }
}
