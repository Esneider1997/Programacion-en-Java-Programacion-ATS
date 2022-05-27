package paquete1;

/**
 *
 * @author Desarrollador4
 */
public class Clase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Clase1 objeto1 = new Clase1();
       
        objeto1.setEdad( 24 );
        System.out.println("La edad es: "+objeto1.getEdad());
        
        objeto1.setNombre("Esneider");
        System.out.println("El nombre es: "+objeto1.getNombre());
        
    }
    
}
