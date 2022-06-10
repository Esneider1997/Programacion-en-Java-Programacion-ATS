package paquete1;

/**
 *
 * @author Desarrollador4
 */
public class Persona {
    
    private final String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    // No puedes porque no puedes asignarle otro nombre a esa constante
    /*public void setNombre( String nombre) {
        this.nombre = nombre;
    }*/
    
    public void mostrarDatos()
    {
        System.out.println("El nombre es: "+nombre);
        System.out.println("La edad es: "+edad);
    }
}
