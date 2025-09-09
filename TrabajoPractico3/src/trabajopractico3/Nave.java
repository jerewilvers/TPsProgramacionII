
package trabajopractico3;

/**
 *
 * @author Jeremias
 */
public class Nave {
    private String nombre="Endurance";
    private int combustible=50;
    private boolean despego = false;
    
    void despegar(){
        despego=true;
        System.out.println("La Nave Despego");
    }
    void avanzar(int distancia){
        if (despego) {
            if (combustible>distancia) {
            System.out.println("Se Avanzaron "+distancia+" metros");
            combustible-=distancia;
            System.out.println("Quedan "+combustible+ " litros de Combustible");
        }else{
                System.out.println("Combustible Insuficiente");
            }
        }else{
            System.out.println("La Nave No Ha Despegado Todavia");
        }
    }
    void recargarCombustible(int combustible){
        if(combustible>0 && combustible<(1000-this.combustible)){
            this.combustible+=combustible;
        }
    }
    void mostrarEstado(){
        if (despego) {
            System.out.println("La Nave "+nombre+" ha Despegado, tiene "+combustible+" de Combustible");
        }else{
            System.out.println(nombre+" no ha Despegado Todavia");
        }
    }

}
