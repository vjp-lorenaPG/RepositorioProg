/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12e06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author galin
 */
public class T12E06 {
    // Muestra menú y devuelve opción

    public static int mostrarMenu() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Pulse:"
                + "\n1. Guardar números pares en fichero"
                + "\n2. Mostrar fichero"
                + "\n3. Salir");

        return entrada.nextInt();
    }

    //Método para pedir el nombre del fichero
    public static String pedirNombreFichero() {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca nombre del fichero:");
        return entrada.nextLine();
    }

    //Método para genera un array con 100 primeros pares
    public static int[] crearArrayPares() {

        int[] numeros = new int[100];
        int contador = 0;
        int num = 1;
        while (contador < numeros.length) {

            if (num % 2 == 0) {
                numeros[contador] = num;
                contador++;
            }
            num++;
        }

        return numeros;
    }

    // Guarda array en fichero
    public static void guardarNumeros() {

        String fichero;
        int[] numeros;
        fichero = pedirNombreFichero();
        numeros = crearArrayPares();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fichero))) {
            for (int i = 0; i < numeros.length; i++) {
                bw.write(String.valueOf(numeros[i]));
                bw.newLine();
            }

            System.out.println("Fichero creado correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir en fichero.");
        }

    }

    // Muestra contenido del fichero
    public static void mostrarFichero() {

        String fichero;
        String linea;
        fichero = pedirNombreFichero();
        try (BufferedReader br  =new BufferedReader(new FileReader(fichero))) {
            System.out.println("\nContenido del fichero:");
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        //Bucle para gestionar el programa 
        do {
            //Pido la opción
            opcion = mostrarMenu();
            //Switch para llamar al método corespondiente
            switch (opcion) {

                case 1:
                    guardarNumeros();
                    break;

                case 2:
                    mostrarFichero();
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        } while (opcion != 3);

    }

}
