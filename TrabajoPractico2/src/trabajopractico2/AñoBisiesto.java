
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int anio = 0;
        
        System.out.print("Ingrese un Anio: ");
        anio = Integer.parseInt(sc.nextLine());
        if (anio % 400 == 0 || ((anio % 4 == 0) && (anio % 100 != 0))) {
            System.out.println("Es Bisiesto");

        } else {
            System.out.println("No es Bisiesto");
        }
    }
    
}
