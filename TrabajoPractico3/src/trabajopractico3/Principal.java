
package trabajopractico3;

import java.util.Scanner;
/**
 *
 * @author Jeremias
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         int opcion;
        Scanner sc = new Scanner(System.in);
        boolean menu=true;
        
        while(menu){
            
        System.out.print("Ejercicios: \n1- Registro de Estudiantes\n2- Registro de Mascotas\n3- Encapsulamiento con la Clase Libro"
                + "\n4- Gestion de Gallinas en Granja Digital\n5- Simulacion de Nave Espacial\n6- Salir \nElija una Opcion: ");
        
        opcion=Integer.parseInt(sc.nextLine());
        
        switch (opcion) {
            case 1:
                pruebaEstudiante();
                break;
            case 2:
                pruebaMascotas();
                break;
            case 3:
                pruebaLibro();
                break;
            case 4:
                pruebaGallinas();
                break;
            case 5:
                pruebaNave();
                break;
            case 6:
                menu=false;
                break;
            default:
                System.out.println("Opcion No Valida");
        }
        
        }
    }
    
    
    private static void pruebaEstudiante(){
        
        Estudiante pepe = new Estudiante();
        pepe.mostrarInfo();
        pepe.bajarCailifacion(2);
        pepe.mostrarInfo();
        pepe.subirCailifacion(1);
        pepe.mostrarInfo();
        System.out.println("");
    }

    private static void pruebaMascotas() {
        Mascotas perro = new Mascotas();
        perro.mostrarInfo();
        perro.cumplirAños();
        perro.cumplirAños();
        perro.mostrarInfo();
        System.out.println("");
    }

    private static void pruebaLibro() {
        Libro libro = new Libro();
        libro.setAutor("Pepe");
        libro.setTitulo("Aventuras de Pepe");
        libro.setAñoPublicacion(2021);
        libro.mostrarInfo();
        libro.setAñoPublicacion(234);
        libro.mostrarInfo();
        libro.setAñoPublicacion(2023);
        libro.mostrarInfo();
    }

    private static void pruebaGallinas() {
        
       Gallina gallina1 = new Gallina();
       Gallina gallina2 = new Gallina();
       gallina1.ponerHuevo();
       gallina1.ponerHuevo();
       gallina1.envejecer();
       gallina2.ponerHuevo();
       gallina2.envejecer();
       gallina2.envejecer();
       gallina1.mostrarEstado();
       gallina2.mostrarEstado();
       
    }

    private static void pruebaNave() {
      Nave halcon = new Nave();
        System.out.println("");
      halcon.avanzar(100);
      halcon.despegar();
      halcon.avanzar(1000);
      halcon.recargarCombustible(100);
      halcon.avanzar(90);
      halcon.mostrarEstado();
        System.out.println("");
    }
}
