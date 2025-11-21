/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e15;

/**Ejercicio 15.- Diseña una clase Dirección con los atributos calle, número,
 * piso y ciudad. A continuación, diseña una clase Empleado con los atributos
 * nombre (de tipo String), salario (de tipo int) y dirección (de tipo
 * Dirección). • Para probar la funcionalidad de las clases creadas crea una
 * clase Test donde crees 3 direcciones y luego crea tres empleados,
 * asignándoles una de las direcciones anteriormente creadas. Por último, crea
 * un método que muestre los datos de cada empleado creado:
 *
 *
 * @author Lorena
 */
public class T5E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro nuevos objetos direccion con el constructor parametrizado.
        Direccion d1 = new Direccion ("Sol", 5, 4, "Careces");
        Direccion d2 = new Direccion ("Retorno", 32, 2, "Plasencia");
        Direccion d3 = new Direccion ("Laurel", 16, 8, "Salamanca");
        //Declaro nuevos empleados con el constructor parametrizado.
        Empleado e1 = new Empleado ("Miguel",1200, d1);
        Empleado e2 = new Empleado ("Miriam",1500, d3);
        Empleado e3 = new Empleado ("Bruno",1700, d2);
        //Metodo mostrar.
        e1.mostrarEmpleado();
        e2.mostrarEmpleado();
        e3.mostrarEmpleado();
        
        
    }
    
}
