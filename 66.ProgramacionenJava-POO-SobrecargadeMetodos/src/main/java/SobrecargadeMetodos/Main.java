package SobrecargadeMetodos;

/**
 *
 * @author Desarrollador4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Persona persona1 = new Persona("Esneider", 24);
        persona1.correr();
        
        Persona persona2 = new Persona("99426548");
        persona2.correr(22);
    }
    
}
