package ClasesObjetos;
/**
 *
 * @author Desarrollador4
 */
public class Coche {
    String color;
    String marca;
    int km;
    
    public static void main(String [] args)
    {
       Coche coche1 = new Coche(); 
       
       coche1.color = "Rojo";
       coche1.marca = "Ferraari";
       coche1.km    = 100;
       String cadena = "el color del coche1 es: " + coche1.color + "\n" + 
                        "la marca del coche es: " + coche1.marca + "\n" + 
                        "el kilometraje es:" + coche1.km;
        System.out.println(cadena);
        
        
        Coche coche2 = new Coche(); 
       
       coche1.color = "Rojo";
       coche1.marca = "Ferraari";
       coche1.km    = 100;
       String cadena2 = "el color del coche2 es: " + coche2.color + "\n" + 
                        "la marca del coche es: " + coche2.marca + "\n" + 
                        "el kilometraje es:" + coche2.km;
        System.out.println(cadena2);
    }   
    
}
