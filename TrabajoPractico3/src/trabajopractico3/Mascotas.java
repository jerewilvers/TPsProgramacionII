
package trabajopractico3;

/**
 *
 * @author Jeremias
 */
public class Mascotas {
    private String nombre="Molly", especie="Pastor Belga";
    private int edad=4;
    
    void mostrarInfo(){
        System.out.println("--------------------------\n"+"Nombre: "+nombre+"\nEspecie: "+especie+"\nEdad: "+edad+"\n--------------------------\n");
    }
    void cumplirAños(){
        edad++;
    }
}