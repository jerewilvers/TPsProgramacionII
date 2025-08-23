
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class DivisionDouble {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double num1;
        double num2;
        double resultado;
        
        System.out.print("Ingresa el Primer Numero: ");
        num1 = input.nextDouble();
        
        System.out.print("Ingresa el Segundo Numero: ");
        num2 = input.nextDouble();
        
        if (num2 != 0) { 
        
        resultado = num1 / num2;
        System.out.println("El Resultado de la Division es: "+resultado);
        
        } else {
            System.out.println("ERROR!! NO SE PUEDE DIVIDIR ENTRE CERO.");
        } 
        
        
    }
    
}

