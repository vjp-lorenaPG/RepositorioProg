/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10e14;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Ejercicio 14.- Realiza un programa en el almacenes una lista de objetos de la
 * clase ALUMNO con un atributo de tipo asignatura con tres asignaturas •
 * Sabiendo que tenemos varios alumnos (los que desee el usuario) con 3
 * asignaturas cada uno (Lengua, Mates y Física), realiza un programa que le dé
 * al usuario las siguientes opciones: Sabiendo que tenemos varios alumnos (los
 * que desee el usuario) con 3 asignaturas cada uno (Lengua, Mates y Física),
 * realiza un programa que le dé al usuario las siguientes opciones: 1.
 * Introducir un nuevo alumno junto a sus notas. (uno solo, si se quieren
 * introducir mas volveríamos a entrar aquí) 2. Mostrar los alumnos introducidos
 * hasta el momento (junto a sus notas). 3. Que nos diga que alumno es el mejor
 * de la clase. (nota media más alta) . 4. Que nos diga cual es la asignatura
 * más difícil. (mayor número de suspensos). 5. Salir del programa. •
 * Controlaremos que el usuario elija una opción del menú entre 1 y 5. Hasta que
 * el usuario no pulse 5 no saldremos del programa.
 *
 * @author alumno
 */
public class T10E14 {
    //Método para pedir el nombre de la asignatura
    public static String pedirNombreAsignatura() {
        String nombreAsig;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la asignatura");
        nombreAsig = entrada.nextLine();
        return nombreAsig;
    }
    //Método paar pedir el nombre del alumno
    public static String pedirNombreAlumno() {
        String nombreAlum;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre del alumno");
        nombreAlum = entrada.nextLine();
        return nombreAlum;
    }
    //Método para pedir la nota de la asignatura
    public static float pedirNotaAsignatura() {
        float notaAsig;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la nota");
        notaAsig = entrada.nextFloat();
        return notaAsig;
    }
    /*Método para crear nuevo alumnos con llamada a un método de la clase Alumno
    que crea y rellena las asignaturas con sus datos usando el constructor de la clase Asignatura.*/
    public static void crearNuevoAlumno(ArrayList<Alumno> alumnos) {

        System.out.println("Creando nuevo alumno");
        Alumno a = new Alumno(pedirNombreAlumno(), 3);
        a.crearYRellenarAsignaturas();
        alumnos.add(a);

    }
    //Método mostrar
    public static void mostar(ArrayList<Alumno> alumnos) {
        //For each
        for (Alumno a : alumnos) {
            System.out.println("*Mostrando Alumno*");
            System.out.println(a.toString());

        }
    }
    /*Método para calcular el mejor alumno llamando al método de la clase Alumno 
    que calcula la nota media de cada alumno*/
    public static void mejorAlumno(ArrayList<Alumno> alumnos) {
        Alumno mejorAlumno = new Alumno();//Creo un nuevo alumno para guardar el alumno que tendrá la mejor media 
        float media = alumnos.get(0).notaMedia();//Guardo la nota media del primer alumno
        for (int i = 0; i < alumnos.size(); i++) {
            if (media < alumnos.get(i).notaMedia()) {
                media = alumnos.get(i).notaMedia();
                mejorAlumno = alumnos.get(i);
            }

        }
        System.out.println("El mejor alumno es: " + mejorAlumno.toString());
        //Imprimo

    }
    /*Método que recorre las asignaturas primero y luego los alumnos como si fuera una matriz.*/
    public static void asignaturaMasDificil(ArrayList<Alumno> alumnos) {
        int suspensos;
        int suspensosTotal = 0;
        String asignaturaMasdificil = "";
        /*Primer bucle recorre una asignatura, el segundo los alumnos guardando 
        la cantidad de notas suspensas de esa asignatura.*/
        for (int i = 0; i < alumnos.get(0).getAsignaturas().length; i++) {
            suspensos = 0;
            for (int j = 0; j < alumnos.size(); j++) {
                if (alumnos.get(j).getAsignaturas()[i].getNota() < 5) {
                    suspensos++;
                }
            }/*Si la cantidad de suspensos encontrados de una asignatura es mayor
            a las guardadas en la variable se intercambian lo valores y se guarda el nombre de la asignatura mas difícil.*/
            if (suspensosTotal < suspensos) {
                asignaturaMasdificil = alumnos.get(0).getAsignaturas()[i].getNombre();
                suspensosTotal = suspensos;
            }
        } 
        //Imprimo
        System.out.println("La asignatura mas dificil es: " + asignaturaMasdificil
                + "\nHay " + suspensosTotal + " suspensos.");
    }
    //Método menú para operar con los métodos según la voluntad del usuario.
    public static void menu(ArrayList<Alumno> alumnos) {

        Scanner entrada = new Scanner(System.in);

        int opcion;

        do {//Mensaje de interacción.
            System.out.println("\n----- MENU -----"+
            "\n1. Introducir nuevo alumno"+
            "\n2. Mostrar alumnos"+
            "\n3. Mejor alumno de la clase"+
            "\n4. Asignatura más difícil"+
            "\n5. Salir"+
            "\nSeleccione una opción:");
            
            opcion = entrada.nextInt();
            
            switch (opcion) { 
                case 1 -> {
                    //Crea nuevo alumno
                    System.out.println("Ha seleccionado crear nuevo alumno");
                    crearNuevoAlumno(alumnos);
                }    
                case 2 -> mostar(alumnos);  
                case 3 -> {
                    System.out.println("Ha seleccionado mostrar mejor alumno");
                    if (alumnos.size() > 0) {
                        mejorAlumno(alumnos);
                    } else {
                        System.out.println("No hay alumnos registrados.");
                    }
                }    
                case 4 -> {
                    //Muestro la asignatura más difícil.
                    System.out.println("Ha seleccionado mostrar la asignatura mas difícil");
                    if (alumnos.size() > 0) {
                        asignaturaMasDificil(alumnos);
                    } else {
                        System.out.println("No hay alumnos registrados.");
                    }
                }
                case 5 -> {
                    //Salir.
                    System.out.println("Ha seleccionado salir del programa.");
                    System.out.println("Cerrando el programa...");
                }
                default -> System.out.println("Opción incorrecta. Introduzca un número del 1 al 5.");
            }
        } while (opcion != 5);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Creo la lista de tipo Alumno
        ArrayList<Alumno> alumnos = new ArrayList<>();
        menu(alumnos);//Llamo al método que gestiona el programa y le paso la lista.
    }

}
