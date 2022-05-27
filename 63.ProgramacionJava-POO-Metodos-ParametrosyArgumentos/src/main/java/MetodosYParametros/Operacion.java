package MetodosYParametros;

/**
 *
 * @author Desarrollador4
 */
public class Operacion {
    
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // metodos
    
    // Metodo para sumar ambos numeros
    public void sumar(int numero1, int numero2)
    {
        suma = numero1 + numero2;
    }
    
    // Metodo para restar ambos numeros
    public void restar(int numero1, int numero2)
    {
        resta = numero1 - numero2;
    }
    
    // Metodo para multiplicar ambos numeros
    public void multiplicar(int numero1, int numero2)
    {
        multiplicacion = numero1 * numero2;
    }
    
    // Metodo para dividir ambos numeros
    public void dividir(int numero1, int numero2)
    {
        division = numero1 / numero2;
    }
    
    public void mostrarResultados()
    {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
}
