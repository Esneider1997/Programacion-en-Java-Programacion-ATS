package SobrecargadeMetodos;

/**
 *
 * @author Desarrollador4
 */
public class Persona {
    
    // Atributos
    String nombre;
    int edad;
    String dni;
    //Métodos

    
    //Método Contructor
    public Persona( String _nombre, int _edad){
        nombre = _nombre;
        edad   = _edad;
    }
    
    public Persona(String dni) {
        this.dni = dni;
    }
    
    public void correr()
    {
        System.out.println(" Soy " + nombre + ", tengo " + edad +" años y estoy corriendo una maraton"); 
    }
    
    public void correr( int km )
    {
        System.out.println(" He corrido " + km + " Kilometros" ); 
    }
}
