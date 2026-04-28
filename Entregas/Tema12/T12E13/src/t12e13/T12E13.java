/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12e13;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Ejercicio 13.- Realizar un programa que lea de teclado (la entrada estándar)
 * los siguientes datos: • Nombre y apellido de un supuesto becario. • Sexo
 * (H-M) • Edad (20-60) • Número de suspensos del curso anterior (0-4). •
 * Residencia familiar (SI-NO) • Ingresos anuales de la familia. • Los datos se
 * almacenan en un fichero llamado “DatosBeca.txt”. • Cuando vuelvas a ejecutar
 * el programa no se sobrescribirá el fichero, sino que se seguirán añadiendo
 * posibles becarios al final del fichero.
 *
 *
 * @author galin
 */
public class T12E13 {

    /**
     * @param args the command line arguments
     */
    //Método para pedir nombre y apellidos
    public static String pedirNombre() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nombre y apellidos: ");
        return entrada.nextLine();

    }

    //Método para pedir sexo
    public static String pedirSexo() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Sexo (H/M): ");
        return entrada.nextLine();

    }

    //Método para pedir edad
    public static int pedirEdad() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Edad (20-60): ");
        return entrada.nextInt();

    }

    //Método para pedir suspensos
    public static int pedirSuspensos() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de suspensos (0-4): ");
        return entrada.nextInt();

    }

    //Método para pedir residencia familiar
    public static String pedirResidencia() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Residencia familiar (SI/NO): ");
        return entrada.nextLine();

    }

    //Método para pedir ingresos
    public static double pedirIngresos() {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresos anuales: ");
        return entrada.nextDouble();

    }

    //Método que guarda los datos en fichero sin sobrescribir
    public static void guardarDatos(String nombre, String sexo, int edad,
            int suspensos, String residencia,
            double ingresos) {

        try {

            FileWriter fw = new FileWriter("DatosBeca.txt", true);
            PrintWriter pw = new PrintWriter(fw);

            pw.println(nombre + ";"+sexo +";" +edad +";"+ suspensos+";"
                    + residencia+";"+ ingresos);

            pw.close();

            System.out.println("Datos guardados correctamente.");

        } catch (IOException e) {

            System.out.println("Error al guardar el archivo.");

        }

    }

    public static void main(String[] args) {
        //Métodos para guardar los datos en variables y después lo pasamos por parámetros
        String nombre = pedirNombre();
        String sexo = pedirSexo();
        int edad = pedirEdad();
        int suspensos = pedirSuspensos();
        String residencia = pedirResidencia();
        double ingresos = pedirIngresos();

        guardarDatos(nombre, sexo, edad, suspensos, residencia, ingresos);

    }

}
