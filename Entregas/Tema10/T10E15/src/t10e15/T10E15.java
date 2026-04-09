/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10e15;

import java.util.ArrayList;
import java.util.Scanner;

/**Realiza un programa en JAVA que esté formado por dos clases: 
 * • Clase Empresa:
 * • nombreEmpresa de tipo cadena. • Lista de empleados de tipo Empleados.
 * • Clase Empleados: • nombreEmpleado de tipo cadena. • sueldo de tipo entero.
 *
 * Además, crearás un menú que le permita al usuario las siguientes opciones: 
 * 1. Añadir empresas junto a sus empleados a una lista. 
 * 2. Mostrar las empresas de la lista junto a sus empleados 
 * 3. Mostrar los empleados cuyo nombre contenga la letra ‘A’ 
 * 4. Mostrar todos los empleados ordenados por el sueldo que cobran 
 * 5. Salir del programa.
 * @author galin
 */
public class T10E15 {

    // Pedir nombre
    public static String pedirNombre(String mensaje) {
        Scanner entrada=new Scanner(System.in);
        System.out.println(mensaje);
        return entrada.nextLine();
    }

    // Pedir sueldo
    public static int pedirSueldo() {
        System.out.println("Introduzca sueldo:");
        Scanner entrada=new Scanner(System.in);
        return entrada.nextInt();
    }

    public static String pedirSeguir() {
        String seguir="";
        Scanner entrada=new Scanner(System.in);
        return seguir=entrada.nextLine();
    }

    // Crear empresas y empleados
    public static void añadirEmpresas(ArrayList<Empresa> empresas) {

        String continuarEmpresa;

        do {
            String nombreEmpresa = pedirNombre("Nombre de la empresa:");
            Empresa empresa = new Empresa(nombreEmpresa);
            String continuarEmpleado;
            int contador =1;
            do {

                String nombreEmpleado = pedirNombre("Nombre del empleado " + contador + ":");
                int sueldo =pedirSueldo();
                empresa.añadirEmpleado(new Empleado(nombreEmpleado, sueldo));
                System.out.println("Quiere añadir mas empleados (Si/No)");
                continuarEmpleado = pedirSeguir();
                contador++;

            } while (continuarEmpleado.equalsIgnoreCase("si"));
            empresas.add(empresa);
            System.out.println("Quiere añadir ms empresas (Si/No)");
            continuarEmpresa =pedirSeguir();

        } while (continuarEmpresa.equalsIgnoreCase("si"));
    }

    // Mostrar empresas y empleados
    public static void mostrarEmpresas(ArrayList<Empresa> empresas) {

        for (Empresa e :empresas) {

            System.out.println("** Empresa: " + e.getNombreEmpresa() + " **");

            int contador=1;

            for (Empleado emp :e.getEmpleados()) {

                System.out.println("Empleado " + contador + ": " + emp.getNombreEmpleado());
                System.out.println("Sueldo: " + emp.getSueldo());

                contador++;
            }
        }
    }

    // Mostrar empleados con letra A
    public static void empleadosConA(ArrayList<Empresa> empresas) {

        for (Empresa e :empresas) {
            for (Empleado emp : e.getEmpleados()) {

                if (emp.getNombreEmpleado().toUpperCase().contains("A")) {
                    System.out.print(emp.getNombreEmpleado() + " - ");
                }
            }
        }

        System.out.println();
    }

    // Mostrar empleados ordenados por sueldo
    public static void empleadosOrdenados(ArrayList<Empresa> empresas) {

        ArrayList<Empleado> listaEmpleados = new ArrayList<>();

        //guardo todos los empleados de todas las empresas para tener un auxiliar
        for (Empresa e : empresas) {
            listaEmpleados.addAll(e.getEmpleados());
        }

        //Ordeno con la burbuja (de mayor a menor sueldo)
        for (int i=0; i<listaEmpleados.size() -1;i++) {
            for (int j=0; j<listaEmpleados.size() - 1;j++) {

                if (listaEmpleados.get(j).getSueldo()<listaEmpleados.get(j +1).getSueldo()) {
                    Empleado aux=listaEmpleados.get(j);
                    listaEmpleados.set(j, listaEmpleados.get(j + 1));
                    listaEmpleados.set(j + 1, aux);

                }
            }
        }

        //mostrar resultado
        for (Empleado e :listaEmpleados) {
            System.out.println(e.getNombreEmpleado() + " - " + e.getSueldo());
        }
    }

    // Menú
    public static void menu(ArrayList<Empresa> empresas) {

        int opcion;
        do {
            System.out.println("Pulse 1 para introducir empresas y sus empleados. "
                +"\nPulse 2 para mostrar empresas y sus empleados."
                +"\nPulse 3 para mostrar empleados con la letra A."
                +"\nPulse 4 para mostrar empleados ordenados por sueldo."
                +"\nPulse 5 para salir.");
                
            Scanner entrada = new Scanner(System.in);
            opcion = entrada.nextInt();
            switch (opcion) {

                case 1 ->
                    añadirEmpresas(empresas);

                case 2 ->
                    mostrarEmpresas(empresas);

                case 3 ->
                    empleadosConA(empresas);

                case 4 ->
                    empleadosOrdenados(empresas);

                case 5 ->
                    System.out.println("Saliendo...");

                default ->
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo la lista del empresas
        ArrayList<Empresa> empresas = new ArrayList<>();
        //Llamo al menú que controla todo
        menu(empresas);
    }

}
