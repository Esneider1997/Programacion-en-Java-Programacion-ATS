package Paquete2;

/**
 *
 * @author Desarrollador4
 */

import Paquete1.Clase1; // Nota: Clase 1 no esta en el mismo paquete, hay que llamarlo
                         //        para que se pueda instanciar la clase y obtenr sus atributos.

public class Clase3 {
    
    public static void main( String [] args ){
    
        Clase1 objeto1 = new Clase1();
        
        objeto1.atributo1 = 25; // es publico el mod de acceso.
        
        // objeto1.atriburo2 = 26; // No se puede utilizar porque es un atributo 
                                 // con modificador de acceso privado.
    }
}
