
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class Operaciones {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;
        
        System.out.print("Ingresa el Primer Numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingresa el Segundo Numero: ");
        num2 = input.nextInt();
        
        System.out.println("Suma = "+(num1 + num2));
        System.out.println("Resta = "+(num1 - num2));
        System.out.println("Multiplicacion = "+(num1 * num2));
        System.out.println("Divisision = "+(num1 / num2));
    }
    
}
