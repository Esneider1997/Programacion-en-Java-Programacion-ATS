// Encapsulamiento y métodos accesores ( Settersy Getters )
package paquete1;

/**
 *
 * @author Desarrollador4
 */
public class Clase1 {
    
    private String nombre;
    public int edad;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Método Setter: Establecemos la edad
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    // Método Getter: Mostramos la edad
    public int getEdad(){
        return edad;
    }
}
