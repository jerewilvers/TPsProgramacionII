
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class ClasificacionEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int edad=0;
        String etapa="";

        System.out.print("Ingrese tu Edad: ");
        edad=Integer.parseInt(sc.nextLine());
        if (edad<12) {
            etapa="Ninio";
        }else if(edad>=12 && edad<=17){
            etapa="Adolescente";
        }else if(edad>=18 && edad<=59){
            etapa="Adulto";
        }else if(edad>=60){
            etapa="Adulto Mayor";
        }
        System.out.println("Eres un "+etapa);
    }
    
}
