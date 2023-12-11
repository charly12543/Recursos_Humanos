package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
    private String bd="recursos_humanos";
    private String usuario = "root";
    private String password = "";
    private String url = "jdbc:mysql://localhost:3306/"+bd;
    private Connection conexion;
    
    public Connection openConeccion(){
        
        try {
            conexion =DriverManager.getConnection(this.url, this.usuario, this.password);
            
        } catch (SQLException e) {
            System.out.println("Error de conexion " +  e.getMessage());
        }     
        return conexion;       
    }  
    
}
