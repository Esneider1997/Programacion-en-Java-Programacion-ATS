package RetornodeValores;

import javax.swing.JOptionPane;

/**
 *
 * @author Desarrollador4
 */
public class Main {

    public static void main( String [] args )
    {
        
        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero: "));
    
        Operacion op = new Operacion();

        int suma = op.sumar(n1, n2);
        int resta = op.restar(n1, n2);
        int multi = op.multiplicar(n1, n2);
        int divi = op.dividir(n1, n2);
        
        op.mostrarResultados( suma, resta, multi, divi );
        
    }
    
}
