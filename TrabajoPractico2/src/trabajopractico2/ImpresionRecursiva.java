
package trabajopractico2;

/**
 *
 * @author Jeremias
 */
public class ImpresionRecursiva {
    public static void main(String[] args) {
        double[] precios13={199.99, 299.5, 149.75, 399, 89.99};
        
        mostrarArray(precios13, 0);
        precios13[2]=129.99;
        System.out.println("Precios Modificados:");
         mostrarArray(precios13, 0);
    }
    public static void mostrarArray(double[] precio, int indice){
        if (indice>=precio.length){
            return;
        }
        System.out.println("Precio N"+(indice+1)+": "+precio[indice]);
        mostrarArray(precio, indice+1);
    }
    
}
