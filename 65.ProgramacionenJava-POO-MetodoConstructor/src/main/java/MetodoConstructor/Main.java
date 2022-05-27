package MetodoConstructor;

/**
 *
 * @author Desarrollador4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // ¿Qué es un método Contructor? 
        // - Metodo especial de una clase que se invoca siempre que se crea un objeto de esa clase.
        
        // Cuando se crea un objeto ocurren 3 coss: 
        // 1. Se asigna memoria para el objeto.
        // 2. Se inicializan los atributos de ese objeto.
        // 3. Se invoca el constructor de la clase que puede ser un entre varios. 
        
        // ejmplo: Persona p1 = new Persona(); <-- Este metodo "Persona();" se conoce como método Constructor 
        
        // Caracteristicas de los Constructores
        // - Tienen el mismo nombre de la Clase.
        // No devuelve ningún valor.
        // Debe declararse como público. 
        
        Persona p1 = new Persona("Esneider", 12);
        p1.mostrarDatos();
        
    }
    
}
