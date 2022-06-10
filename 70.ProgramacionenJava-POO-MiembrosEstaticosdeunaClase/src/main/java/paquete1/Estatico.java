// Mienbros estàticos para la clase
package paquete1;

/**
 *
 * @author Desarrollador4
 */
public class Estatico {

    
    private static String frase = "Primera Frase";
    
    public static int sumar ( int n1, int n2 )
    {
        int suma = n1 + n2;
        return suma;
    }
    
    public static void main(String[] args) {
        // Cuando es estatico ya no le pertenece al objeto sino directamente a la Clase
        // ya no falta instanciar o crear objetos sino puedes directamente llamarlo con la clase
        Estatico ob1 = new Estatico();
        Estatico ob2 = new Estatico();

        ob2.frase = "Segunda frase"; // Nota: como los dos System de abajo tomaran "Segunda frase" como salida.
        
        System.out.println(ob1.frase);       
        System.out.println(ob2.frase);
        
        // Otras formas de imprimir.
        System.out.println( Estatico.frase );
        System.out.println( frase );
        
        
        // llamar un metodo estatico
        System.out.println( "La suma es: " + Estatico.sumar(2, 3));
    }
    
}
