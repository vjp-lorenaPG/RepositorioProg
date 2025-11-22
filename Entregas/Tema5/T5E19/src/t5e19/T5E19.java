/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e19;

import java.util.Scanner;

/**
 *Ejercicio 19.- Desarrolle una aplicación en Java que determine el sueldo
 * bruto para cada uno de los tres empleados de una empresa. La empresa paga la
 * tarifa normal en las primeras 40 horas de trabajo de cada empleado, y paga
 * tarifa y media en todas las horas trabajadas que excedan de 40. • El programa
 * creará 3 objetos (uno para cada empleado) y se le pedirá al usuario que
 * rellene la información para cada empleado en el constructor. • Por cada
 * empleado se almacenará su nombre, el número de horas que trabajó, y la tarifa
 * que cobra por una hora de trabajo. • Para probar la clase Empleado, crea una
 * clase Test con un método que determine y muestre el sueldo bruto de cada
 * empleado.
 * @author Lorena
 */
public class T5E19 {
    public static final int jornada =40;//Constante.
    //Calcular salario.
    public static int calcularSalario (int numHoras,int tarifaHora){
        
        int salarioTotal, salarioBase,salarioExtra, restoHoras, tarifaExtra;
        tarifaExtra= (tarifaHora/2)+tarifaHora;
        if(numHoras>jornada){
        salarioBase=jornada*tarifaHora;
        restoHoras=numHoras-jornada;
        salarioExtra=restoHoras*tarifaExtra;
        salarioTotal=salarioBase+salarioExtra;
        }else {
            salarioTotal=numHoras*tarifaHora;
        }
        return salarioTotal;
    }
    //Pedir el numero de horas trabajadas
    public static int pedirNumHoras (){
        int num;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca el numero de horas");
        num=entrada.nextInt();
        return num;
    }
    //Pedir tarifa de las horas
    public static int pedirTarifa (){
        int num;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca el numero de la tarifa de una hora");
        num=entrada.nextInt();
        return num;
    }
    //Pedir el nombre
    public static String pedirNombre (){
        String nom;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca el nombre de un empleado");
        nom=entrada.nextLine();
        return nom;
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int salario;
        //Creo los objetos Empleados con el constructor parametrizado
        Empleado e1 =new Empleado (pedirNombre(), pedirNumHoras(), pedirTarifa());
        Empleado e2 =new Empleado (pedirNombre(), pedirNumHoras(), pedirTarifa());
        Empleado e3 =new Empleado (pedirNombre(), pedirNumHoras(), pedirTarifa());
        //Calculo y muestro sin almacenar el salario.
        salario=calcularSalario(e1.getNumHoras(),e1.getTarifaHora());
        e1.mostrarEmpleado(salario);
        salario=calcularSalario(e2.getNumHoras(),e2.getTarifaHora());
        e2.mostrarEmpleado(salario);
        salario=calcularSalario(e3.getNumHoras(),e3.getTarifaHora());
        e3.mostrarEmpleado(salario);
    
    }
    
}
