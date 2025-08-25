
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class SumaNumeroPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int numero, suma=0;
               
        do {
            System.out.print("Ingrese un Numero par (0 para Termianr): ");
            numero=Integer.parseInt(sc.nextLine());
            if(numero%2==0){
                suma+=numero;
            }
        } while (numero!=0);
        System.out.println("La Suma de Numeros Pares es: "+suma);
        
    }
    
}
