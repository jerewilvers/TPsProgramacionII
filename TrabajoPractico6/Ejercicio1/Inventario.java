package Ejercicio1;

import java.util.ArrayList;

public class Inventario {

    private ArrayList<Producto> productos;

    public Inventario() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(Producto p) {
        Producto producto = this.buscarProductoPorld(p.getId());
        if (producto != null) {
            System.out.println("El producto ya esta");
        } else {
            productos.add(p);
        }

    }

    public void listarProductos() {
        for (int i = 0; i < productos.size(); i++) {
            System.out.println(productos.get(i));
        }

    }

    public Producto buscarProductoPorld(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equals(id)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equals(id)) {
                productos.remove(i);
            }

        }
        this.listarProductos();
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto producto = this.buscarProductoPorld(id);
        if (producto.getId().equals(id)) {
            producto.setCantidad(nuevaCantidad);
        }
    }

    public void filtrarPorCategoria(CategoriaProducto categoria) {
        for (int i = 0; i < productos.size(); i++) {
            if (categoria == productos.get(i).getCategoria()) {
                System.out.println(productos.get(i));
            }
        }
    }

    public int obtenerTotalStock() {
        int total = 0;
        for (Producto producto : productos) {
            int suma = producto.getCantidad();
            total += suma;
        }
        return total;
        
    }

    public Producto obtenerProductoConMayorStock() {
        Producto max=null;
        for (Producto producto : productos) {
            if (max==null || max.getCantidad()<producto.getCantidad()  ){
                max= producto;
            }
        }
        return max;
    }

    public void filtrarProductosPorPrecio(double min, double max) {
        for (Producto producto : productos) {
            if (producto.getPrecio()>min && producto.getPrecio()<max){
                System.out.println(producto);
            }
        }
    }

    public void mostrarCategoriasDisponibles() {
        for (CategoriaProducto categoriaProducto : CategoriaProducto.values()) {
            System.out.println(categoriaProducto+" "+categoriaProducto.getDescripcion());    
        }
    }

}
