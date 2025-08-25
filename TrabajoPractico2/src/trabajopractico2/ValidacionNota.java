
package trabajopractico2;
        
import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class ValidacionNota {
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       int nota=0;
       
       System.out.print("Ingrese su Nota(0-10): ");
       nota=Integer.parseInt(sc.nextLine());
       if (nota<0 || nota>10) {
           System.out.println("Nota Ingresada no Valida");
        }else{
           System.out.println("Nota Guardada Correctamente");
        }
    }
}
