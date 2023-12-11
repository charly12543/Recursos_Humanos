package dao;

import bd.Conexion;
import dependencias.*;
import java.util.ArrayList;
import java.sql.*;


public class TrabajadorDao {
    Conexion cn = new Conexion();
    Connection conexion;
    
    public ArrayList<Trabajador> listaTrabajadores(){
        
        ArrayList<Trabajador> listarTrabajadores = new ArrayList<>();  
        
        try {
            conexion = cn.openConeccion();
            String sql = "select * from trabajador";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                Trabajador t = new Trabajador();
                t.setRut(rs.getString("rut_trabajador"));
                t.setNombre(rs.getString("nombre_trabajador"));
                t.setApellido(rs.getString("apellido_trabajador"));
                Cargo c = new Cargo();
                c.setId(rs.getInt("id_cargo"));
                t.setCargo(c);
                t.setFecha_nacimiento(rs.getDate("fecha_nacimiento_trabajador"));
                t.setSueldo(rs.getInt("sueldo"));
                listarTrabajadores.add(t);
            }
            
        } catch (SQLException e) {
            System.out.println("Error de Conexion " + e.getMessage());
        }
        return listarTrabajadores;  
    }
    
    public boolean agregarTrabajador(Trabajador trabajador){
        boolean fueAgregado=false;
        
        try {
            conexion = cn.openConeccion();
            String sql = "Insert into trabajador values(?,?,?,?,?,?)";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            
            stmt.setString(1, trabajador.getRut());
            stmt.setString(2, trabajador.getNombre());
            stmt.setString(3, trabajador.getApellido());
            stmt.setInt(4, trabajador.getCargo().getId());
            stmt.setDate(5, new java.sql.Date(trabajador.getFecha_nacimiento().getTime()));
            stmt.setInt(6, trabajador.getSueldo());
            
            int agregado = stmt.executeUpdate();
            fueAgregado=(agregado>0);
           
            
        } catch (SQLException e) {
            System.out.println("Trabajador No agregado " + e.getMessage());
        }
        return fueAgregado=false;
    }
    
    public boolean eliminar(String rut){
        boolean fueEliminado=false;
        try {
            conexion=cn.openConeccion();
            String sql = "Delete from trbajador where rut = ?";
            PreparedStatement stmt = conexion.prepareStatement(sql);
            stmt.setString(1, rut);
            
            int eliminado = stmt.executeUpdate();
            fueEliminado = (eliminado>0);
            
        } catch (SQLException e) {
            System.out.println("error "+ e.getMessage());
        }
        
        return fueEliminado = false;
    }
    
    
    
    
      
}
