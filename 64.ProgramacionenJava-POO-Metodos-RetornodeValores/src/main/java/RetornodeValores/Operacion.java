package RetornodeValores;

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
    public int sumar(int numero1, int numero2)
    {
        suma = numero1 + numero2;
        return suma;
    }
    
    // Metodo para restar ambos numeros
    public int restar(int numero1, int numero2)
    {
        resta = numero1 - numero2;
        return resta;
    }
    
    // Metodo para multiplicar ambos numeros
    public int multiplicar(int numero1, int numero2)
    {
        multiplicacion = numero1 * numero2;
        return multiplicacion;
    }
    
    // Metodo para dividir ambos numeros
    public int dividir(int numero1, int numero2)
    {
        division = numero1 / numero2;
        return division;
    }
    
    
    public void mostrarResultados( int suma, int resta, int multiplicacion, int division )
    {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
    // metodo mio 
    public void mostrarResultadosDosMia()
    {
        System.out.println("La suma es: " + this.suma);
        System.out.println("La resta es: " + this.resta);
        System.out.println("La multiplicación es: " + this.multiplicacion);
        System.out.println("La division es: " + this.division);
    }
    
}
