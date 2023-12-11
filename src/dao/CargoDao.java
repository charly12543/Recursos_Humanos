package dao;

import bd.Conexion;
import dependencias.Cargo;
import java.sql.*;
import java.util.ArrayList;


public class CargoDao {
    
    Conexion conexion = new Conexion();
    
    public ArrayList<Cargo> listaCargo(){
        ArrayList<Cargo> cargos= new ArrayList<>();
        Connection cn;
        try {
            cn = conexion.openConeccion();
            String sql = "select * from cargo";
            PreparedStatement stmt = cn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Cargo c = new Cargo();
                c.setId(rs.getInt("id_cargo"));
                c.setNombre_cargo(rs.getString("nombre_cargo"));
                cargos.add(c);
                
            }
            
        } catch (SQLException e) {
            System.out.println("Error de conexion " + e.getMessage());
        }
        
        return cargos;   
        
    }
    
}
