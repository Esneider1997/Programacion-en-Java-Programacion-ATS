package ClasesYObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Desarrollador4
 */
public class Operacion {
    
    int numero1;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    // metodos
    
    // Metodo para que digite el usuario dos numeros
    public void leerNumeros()
    {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
    }
    
    // Metodo para sumar ambos numeros
    public void sumar()
    {
        suma = numero1 + numero2;
    }
    
    // Metodo para restar ambos numeros
    public void restar()
    {
        resta = numero1 - numero2;
    }
    
    // Metodo para multiplicar ambos numeros
    public void multiplicar()
    {
        multiplicacion = numero1 * numero2;
    }
    
    // Metodo para dividir ambos numeros
    public void dividir()
    {
        division = numero1 / numero2;
    }
    
    public void mostrarResultador()
    {
        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: " + resta);
        System.out.println("La multiplicación es: " + multiplicacion);
        System.out.println("La division es: " + division);
    }
    
}
