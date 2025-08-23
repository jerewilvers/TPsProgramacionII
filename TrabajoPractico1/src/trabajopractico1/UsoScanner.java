
package trabajopractico1;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class UsoScanner {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nombre;
        int edad;
        
        System.out.print("Ingresa tu Nombre: ");
        nombre = input.nextLine();
        
        System.out.print("Ingresa tu Edad: ");
        edad = input.nextInt();
        
        System.out.println("Tu Nombre es: "+nombre+".");
        System.out.println("Tu edad es: "+edad+" anios.");
    }
    
}
