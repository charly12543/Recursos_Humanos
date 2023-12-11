package dependencias;

import java.util.Date;

public class Trabajador {
    
    private String rut;
    private String nombre;
    private String apellido;
    private Cargo cargo;
    private Date fecha_nacimiento;
    private int sueldo;

    public Trabajador() {
    }

    public Trabajador(String rut, String nombre, String apellido, Cargo cargo, Date fecha_nacimiento, int sueldo) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.fecha_nacimiento = fecha_nacimiento;
        this.sueldo = sueldo;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "rut=" + rut + ", nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + ", fecha_nacimiento=" + fecha_nacimiento + ", sueldo=" + sueldo + '}';
    }
    
    
    
}
