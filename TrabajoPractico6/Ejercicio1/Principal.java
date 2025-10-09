package Ejercicio1;

public class Principal {

    public static void main(String[] args) {

        Producto a1 = new Producto("1", "arroz", 200.00, 5, CategoriaProducto.ALIMENTOS);
        Producto a2 = new Producto("100", "celular", 150000.00, 3, CategoriaProducto.ELECTRONICA);
        Producto a3 = new Producto("200", "remera", 25000.00, 10, CategoriaProducto.ROPA);
        Producto a4 = new Producto("300", "lampara", 8000.00, 4, CategoriaProducto.HOGAR);
        Producto a5 = new Producto("2", "papa", 120.00, 8, CategoriaProducto.ALIMENTOS);

        Inventario inventario = new Inventario();

        inventario.agregarProducto(a1);

        inventario.agregarProducto(a2);

        inventario.agregarProducto(a3);

        inventario.agregarProducto(a4);

        inventario.agregarProducto(a5);

        inventario.listarProductos();
        System.out.println("--------------------------------------");

        System.out.println(inventario.buscarProductoPorld(a1.getId()));
        System.out.println("--------------------------------------");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        System.out.println("--------------------------------------");
        inventario.eliminarProducto("200");
        System.out.println("--------------------------------------");
        inventario.actualizarStock("2",4);
        inventario.listarProductos();
        System.out.println("--------------------------------------");
        System.out.println(inventario.obtenerTotalStock());
        System.out.println("--------------------------------------");
        System.out.println(inventario.obtenerProductoConMayorStock());
        System.out.println("--------------------------------------");
        inventario.filtrarProductosPorPrecio(1000.00, 3000.00);
        System.out.println("--------------------------------------");
        inventario.mostrarCategoriasDisponibles();
        
        
    }
    

}
