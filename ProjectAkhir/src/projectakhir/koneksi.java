package projectakhir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class koneksi {
    private static Connection sqlConfig;
   public static void main(String[] args) throws SQLException{
        getConnection();
    }    
    public static Connection getConnection() {
        try{
            String DB="jdbc:mysql://localhost:3306/pendaftaran"; 
            String user="root"; 
            String pass=""; 
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            sqlConfig = DriverManager.getConnection(DB, user, pass);
           
        }catch(SQLException e) {
            System.out.println("Koneksi gagal"+e.getMessage());
        }
        return sqlConfig;
    }
    
}
