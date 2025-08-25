
package trabajopractico2;

import java.util.Scanner;
/**
 *
 * @author Jeremias
 */
public class ComposicionDeFunciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        double peso,precio9=0,precioFinal9=0, costoEnvio;
        String zona;
        
        System.out.print("Ingrese el Precio del Paquete: ");
        double precio = Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese el Peso del Paquete: ");
        peso=Double.parseDouble(sc.nextLine());
        System.out.print("Ingrese la Zona (Nacional o Internacional): ");
        zona=sc.nextLine();
        costoEnvio=calcularCostoEnvio(peso, zona);
        double precioFinal = calcularTotalCompra(precio9, costoEnvio);
        System.out.println("El Costo de Envio es: "+costoEnvio+"\nEl Total a Pagar es: "+precioFinal9);
        
    }
    public static double calcularCostoEnvio(double peso, String zona){
        double costoEnvio=0;
        if (zona.equalsIgnoreCase("Nacional")){
            costoEnvio=peso*5;
        }else if (zona.equalsIgnoreCase("Internacional")) {
            costoEnvio=peso*10;
        }
        return costoEnvio;
    }
    public static double calcularTotalCompra(double precioProducto, double
costoEnvio){
        double precioFinal;
        precioFinal=precioProducto + costoEnvio;
        return precioFinal;
    }
}
    
