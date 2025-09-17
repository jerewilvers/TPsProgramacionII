
package trabajopractico4;


/**
 *
 * @author Jeremias
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Empleado emp1 = new Empleado(12, "Rodolfo", "Tecnico", 24499);
        Empleado emp2 = new Empleado(234, "Norberto", "Servicio de Limpieza", 500);
        Empleado emp3 = new Empleado("Timoteo", "CEO");
        
        
        emp2.actualizarSalario(10);
        emp1.actualizarSalario(10000.0);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        Empleado.mostrarEmpleados();
    }
    
}
