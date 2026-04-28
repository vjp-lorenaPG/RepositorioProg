/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12e05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**Ejercicio 05.- Realiza un programa en JAVA en el que muestres un menú que te
 * permita 3 opciones: 1. Añadir un contacto a un fichero de texto
 * (“agenda.txt”) en el que indiques en cada línea: • Un Nombre. • Una Edad. •
 * Un número de teléfono. 2. Mostrar por pantalla el contenido del fichero de
 * texto creado. 3. Salir del Programa. • Captura las excepciones que veas
 * necesarias.
 *
 *
 * @author galin
 */
public class T12E05 {
    
    static final String FICHERO = "agenda.txt";
    
    // Muestra el menú y devuelve opción elegida
    public static int mostrarMenu() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Pulse:"+
            "\n1. Añadir contacto"
            +"\n2. Mostrar agenda"+
            "\n3. Salir");

        return entrada.nextInt();
    }
    //Método para pedir el telefono
    public static String pedirTelefono() {
        String telefono;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el  telefono ");
        telefono = entrada.nextLine();
        return telefono;
    }
    //Método para pedir el nombre
    public static String pedirNombre() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre ");
        nombre = entrada.nextLine();
        return nombre;
    }
    //Método para pedir la edad
    public static int pedirEdad() {
        int edad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la edad");
        edad = entrada.nextInt();
        return edad;
    }
    // Guarda un contacto en el fichero
    public static void guardarContacto() {

        String nombre;
        int edad;
        String telefono;

        try(BufferedWriter bw =new BufferedWriter(new FileWriter(FICHERO,true))) {

            nombre = pedirNombre();
            edad = pedirEdad();
            telefono = pedirTelefono();

            bw.write(nombre + ";" + edad + ";" + telefono);
            bw.newLine();

            System.out.println("Contacto guardado correctamente.");

        }catch(IOException e){
            System.out.println("Error al escribir en el fichero.");
        }catch(Exception e){
            System.out.println("Error en los datos introducidos.");
        }

    }



    // Muestra los contactos almacenados
    public static void mostrarContactos() {

        String linea;
        String datos[];

        try(BufferedReader br =new BufferedReader(new FileReader(FICHERO))) {

            System.out.println("\n--- AGENDA ---");

            while((linea = br.readLine()) != null) {

                datos = linea.split(";");

                System.out.println("Nombre: " + datos[0]);
                System.out.println("Edad: " + datos[1]);
                System.out.println("Teléfono: " + datos[2]);
                System.out.println("------------------");
            }

        }catch(IOException e){
            System.out.println("Error al leer el fichero.");
        }

    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        //Bucle para operar con el usuario y los métodos del programa
        do {

            opcion = mostrarMenu();

            switch(opcion) {

                case 1:
                    guardarContacto();
                    break;

                case 2:
                    mostrarContactos();
                    break;

                case 3:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opción incorrecta.");
            }

        }while(opcion != 3);

    
    }
    
}
