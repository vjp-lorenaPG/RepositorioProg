/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e6;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 06.- Desarrolle una aplicación en Java que determine el sueldo
 * bruto para cada uno de los empleados de una empresa. La empresa paga la
 * tarifa normal en las primeras 40 horas de trabajo de cada empleado, y paga
 * tarifa y media en todas las horas trabajadas que excedan de 40. 
 * • El programa creará los objetos que quiera el usuario (uno para cada empleado) los meterá
 * en un array y se le pedirá al usuario que rellene la información para cada
 * empleado. 
 * • Por cada empleado se almacenará su nombre, el número de horas que
 * trabajó, y la tarifa que cobra por una hora de trabajo. 
 * • Para finalizar el programa debe determinar y mostrar el sueldo bruto de cada empleado. •
 * Ejemplo de ejecución: Pepe trabajó 42 horas, cobra 20 euros la hora por lo
 * que le corresponde un sueldo de 860 euros.

 *
 * @author galin
 */
public class T8E6 {
    
    //Método para crear los objetos de los arrays con el constructor parametrizado.
    public static void rellenarDatos(Empleados [] vectorEmpleados){
        
        for(int i=0; i<vectorEmpleados.length; i++){
            
            vectorEmpleados[i]= new Empleados(pedirNombre(i),
                    pedirHoras(), pedirtarifa());
        }
        
    }
    //Método para pedir el nombre de los empleados.
    public static String pedirNombre(int indice){
        String nombre="";
        
        System.out.println("Introduzca el nombre del empleado " + (indice+1));
        Scanner entrada = new Scanner (System.in);
        nombre=entrada.nextLine();
        return nombre;
    }
    //Método para pedir la tarifa del empleado.
    public static int pedirtarifa(){
        int tarifa = 0;
        boolean correcto = false;//Boolean para controlar el valor del usuario.
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar errores.
        do {
            System.out.println("Introduzca la tarifa ");
            try {
                tarifa = entrada.nextInt();
                correcto = true;
                System.out.println("Numero correcto.");
            } catch (InputMismatchException e) {
                System.out.println("Ha introducido un caracter incorrecto.");
                entrada.next(); //Limpio la entrada
            }

        } while (!correcto);

        return tarifa;
    }
    //Método para pedir las horas trabajadas del empleado
    public static int pedirHoras(){
        int horas = 0;
        boolean correcto = false;//Boolean para controlar el valor del usuario.
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar errores.
        do {
            System.out.println("Introduzca las horas");
            try {
                horas = entrada.nextInt();
                correcto = true;
                System.out.println("Numero correcto.");
            } catch (InputMismatchException e) {
                System.out.println("Ha introducido un caracter incorrecto.");
                entrada.next(); //Limpio la entrada
            }
            
        } while (!correcto);
        
        return horas;
    }
    
    
    //Método para pedir el número de empleados que se introducirán.
    public static int pedirNum() {
        
        int num = 0;
        boolean correcto = false;//Boolean para controlar el valor del usuario.
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar errores.
        do {
            System.out.println("Introduzca un numero");
            try {
                num = entrada.nextInt();
                correcto = true;
                System.out.println("Numero correcto.");
            } catch (InputMismatchException e) {
                System.out.println("Ha introducido un caracter incorrecto.");
                entrada.next(); //Limpio la entrada
            }
            
        } while (!correcto);
        
        return num;
    }
     
    
    
    public static void main(String[] args) {
        
        //Creo el array de objetos con número que me da el usuario.
        Empleados [] vectorEmpleados= new Empleados [pedirNum()];
        /*Llamo al método para crear y rellenar los objetos tipo Empelados con el 
        constructor parametrizado*/
        rellenarDatos(vectorEmpleados);
        //Bucle para imprimir datos y calcular el sueldo bruto.
        for(Empleados fila :vectorEmpleados){
            fila.mostrar();
            fila.calcularSueldoBruto();
        }
        
    }
    
}
