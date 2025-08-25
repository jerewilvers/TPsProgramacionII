
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class ContadorPNyC {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num, positivos=0,negativos=0,ceros=0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese el Numero "+(i+1)+": ");
            num=Integer.parseInt(sc.nextLine());
            if (num<0) {
                negativos++;
            }else if (num>0) {
                positivos++;
            }else{
                ceros++;
            }
        }
        System.out.println("Positivos: "+positivos+"\nNegativos: "+negativos+"\nCeros: "+ceros);
    }
    
}
