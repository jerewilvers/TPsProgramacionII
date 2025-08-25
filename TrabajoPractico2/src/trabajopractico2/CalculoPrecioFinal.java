
package trabajopractico2;

import java.util.Scanner; 
/**
 *
 * @author Jeremias
 */
public class CalculoPrecioFinal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double precioFinal=0,impuesto=0, descuento=0, precioBase=0;
        
        System.out.print("Ingrese el Precio Base del Producto: ");
        precioBase=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el Impuesto en Porcentaje: ");
        impuesto=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese el Descuento en Porcentaje: ");
        descuento=Integer.parseInt(sc.nextLine());
        precioFinal=calcularPrecioFinal(precioBase, impuesto, descuento);
        System.out.print("El Precio Final del Producto es: "+ precioFinal);
    }
    
    public static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double precioFinal;
        precioFinal = precioBase + (precioBase*(impuesto/100)) - (precioBase*(descuento/100));
        return precioFinal;
    }
    
}
