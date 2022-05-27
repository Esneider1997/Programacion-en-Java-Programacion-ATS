package MetodoConstructor;

/**
 *
 * @author Desarrollador4
 */
public class Persona {
    
    // Atributos
    String nombre;
    int edad;
    
    //Métodos
    
    
    //Método Contructor
    public Persona( String _nombre, int _edad){
        nombre = _nombre;
        edad   = _edad;
    }
    
    //Otra forma de declarar el Método Contructor
    /*public Persona( String nombre, int edad){
        this.nombre = nombre;
        this.edad   = edad;
    }*/
    
    public void mostrarDatos()
    {
        System.out.println(" El nombre es: "+ nombre);
        System.out.println(" El nombre es: "+ edad);

    }
}
