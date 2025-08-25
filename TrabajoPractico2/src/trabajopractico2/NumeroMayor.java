
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class NumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n1,n2,n3 = 0;
        
        System.out.print("Ingrese el Primer Numero: ");
        n1=Integer.parseInt(sc.nextLine());
         System.out.print("Ingrese el Segundo Numero: ");
        n2=Integer.parseInt(sc.nextLine());
         System.out.print("Ingrese el Tercer Numero: ");
        n3=Integer.parseInt(sc.nextLine());
        
        if(n1>n2 && n1>n3){
            System.out.println(n1+" Es el Mayor");
        }else if (n2>n1 && n2>n3){
            System.out.println(n2+" Es el Mayor");
        }else{
            System.out.println(n3+" Es el Mayor");
        }
    }
    
}
