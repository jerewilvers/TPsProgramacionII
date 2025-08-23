
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class DivisionInt {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num1;
        int num2;
        int resultado;
        
        System.out.print("Ingresa el Primer Numero: ");
        num1 = input.nextInt();
        
        System.out.print("Ingresa el Segundo Numero: ");
        num2 = input.nextInt();
        
        if (num2 != 0) { 
        
        resultado = num1 / num2;
        System.out.println("El Resultado de la Division es: "+resultado);
        
        } else {
            System.out.println("ERROR!! No se Puede Dividir entre CERO.");
        } 
        
        
    }
    
}
