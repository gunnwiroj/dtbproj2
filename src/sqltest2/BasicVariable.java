package sqltest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class BasicVariable extends javax.swing.JFrame{
        Connection conn = null;
        ResultSet rs;
        Statement st ;
        protected String username,employeeType;
        protected int userId;
        protected static Date time;
        protected int tableId=1;
        public BasicVariable(){
            time = new Date();
            try {
            conn = DriverManager.getConnection("jdbc:mysql://sql12.freesqldatabase.com:3306/sql12174963","sql12174963","JbZlvFX2bi");
            // Do something with the Connection
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
          
        }
        public Connection getConnect(){
            return conn;
            
        }
        public String getUsername() {
          return username;
      }

        public int getUserId() {
          return userId;
      }
}
