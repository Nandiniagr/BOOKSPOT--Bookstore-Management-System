package source;

import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect
{
    Connection conn=null;
    
    public  static Connection connerDb()
    {
        try {
          Class.forName("com.mysql.jdbc.Driver").newInstance();
           Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/book_store?zeroDateTimeBehavior=convertToNull","root","Aksb67@2001");
           // JOptionPane.showMessageDialog(null, "Connect database");
           
             
           // Class.forName("org.sqlite.JDBC");
          //  Connection conn=DriverManager.getConnection("jdbc:sqlite:student_database.sqlite");
            
            return conn;
        } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null, "Database Connection Problem.");
        }
        return null;
    }
            
}
  