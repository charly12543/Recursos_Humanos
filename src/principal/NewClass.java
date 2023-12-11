package principal;

import dao.TrabajadorDao;
import dependencias.*;
import java.util.ArrayList;

public class NewClass {
    
    public static void main(String[] args) {
        TrabajadorDao dao = new TrabajadorDao();
        ArrayList<Trabajador> lista = dao.listaTrabajadores();
        
        for (Trabajador t : lista) {
            System.out.println("rut_trabajador " + t.getRut() +
                    "nombre " + t.getNombre());
        }
        
        dao.eliminar("44444");
        
        for (Trabajador t2 : lista) {
            System.out.println("trabajador eliminado " + t2.getNombre());
        }
        
        
        
        
    }
    
}
