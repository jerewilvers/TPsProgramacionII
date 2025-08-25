
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class CalculoDescuentoEspecial {
    public static void calcularDescuentoAplicado(double precio){
       double precioFinal;
       double DESCUENTO_ESPECIAL = 0.1;
       precioFinal=precio-(precio*DESCUENTO_ESPECIAL);
       System.out.println("El Descuento Aplicado es de: "+(precio*DESCUENTO_ESPECIAL));
       System.out.println("El Precio Final con Descuento es de : "+precioFinal);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precio11;
        System.out.print("Ingrese Precio: ");
        precio11=Double.parseDouble(sc.nextLine()); 
        calcularDescuentoAplicado(precio11);
        
    }
    
}
