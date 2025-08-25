
package trabajopractico2;

import java.util.Scanner;
/**
 *
 * @author Jeremias
 */
public class ActualizacionDeStock {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
         int stockActual,cantVendida=0,cantRecibida=0;
        
        System.out.print("Ingrese el Stock Actual: ");
        stockActual=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la Cantidad Vendida: ");
        cantVendida=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la Cantidad Recibida: ");
        cantRecibida=Integer.parseInt(sc.nextLine());
        
        stockActual=actualizarStock(stockActual, cantVendida, cantRecibida);
        
        System.out.println("El Nuevo Stock del Producto es: "+stockActual);
    }
    
    private static int actualizarStock(int stockActual, int cantVendida, int cantRecibida) {
        int nuevoStock=0;
        nuevoStock = stockActual - cantVendida + cantRecibida;
        return nuevoStock;
    }
}
