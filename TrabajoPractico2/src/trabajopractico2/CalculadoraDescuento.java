
package trabajopractico2;

import java.util.Scanner;

/**
 *
 * @author Jeremias
 */
public class CalculadoraDescuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double precio, precioDescuento=0;
        String categoria;
        
        System.out.print("Ingrese el Precio del Producto: ");  
        precio=Integer.parseInt(sc.nextLine());
        System.out.print("Ingrese la Categoria del Producto: ");  
        categoria=sc.nextLine();
        switch (categoria) {
            case "A" -> precioDescuento=precio*0.9;
            case "B" -> precioDescuento=precio*0.85;
            case "C" -> precioDescuento=precio*0.8;
            default -> System.out.println("Categoria Invalida");
        }
        System.out.println("Precio Original: "+precio+"\nCategoria: "+categoria+"\nPrecio con Descuento: "+precioDescuento);
    }
}
