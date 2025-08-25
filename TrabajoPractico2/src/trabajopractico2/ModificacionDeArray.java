
package trabajopractico2;

/**
 *
 * @author Jeremias
 */
public class ModificacionDeArray {
    public static void main(String[] args) {
        double[] precios={199.99, 299.5, 149.75, 399, 89.99};
        
        for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio N"+(i+1)+": $"+precios[i]);
        }
        precios[2]=129.99;
        System.out.println("Precios Modificados:");
         for (int i = 0; i < precios.length; i++) {
            System.out.println("Precio N"+(i+1)+": $"+precios[i]);
    }
    }
    public static void mostrarArray(double[] precio, int indice){
        if (indice>=precio.length){
            return;
        }
        System.out.println("Precio N"+(indice+1)+": "+precio[indice]);
        mostrarArray(precio, indice+1);
}
}