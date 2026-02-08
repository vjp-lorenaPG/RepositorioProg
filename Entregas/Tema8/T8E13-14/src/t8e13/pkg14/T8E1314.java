/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e13.pkg14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 13.- Diseña la clase Alumno, cuyos atributos serán nombre, edad y
 * notaMedia. Crea constructores por defecto, parametrizado, getters y setters.
 * • En el main, crea un par de objetos de la claseAlumno. • Completa el main a
 * tu gusto.
 *
 * Ejercicio 14.- Amplía el ejercicio anterior. Crea un vector de 5 alumnos y
 * muestra al usuario las siguientes opciones: 
 * • Rellenar un alumno (pediremos posición e insertaremos al nuevo alumno en esa posición.
 * Si la posición está ya rellena, volveremos a pedir una nueva posición las veces que sean
 * necesarias). 
 * • Mostrar vector de alumnos (si una celda todavía no está rellena, no mostraremos
 * nada de esa celda). 
 * • Mostrar alumnos con nota media por encima de una nota dada. 
 * • Mostrar cuántos alumnos hay con la nota media suspensa. 
 * • Buscar alumnos (pediremos nombre y mostraremos si está matriculado o no).
 * @author galin
 */
public class T8E1314 {
    /*Método para pedir un entero, imprime el mensaje "Edad" si el boolean que recibe
    es true para interactuar con el usuario y optimizar el ingreso de datos del alumno en una
    sola línea, mas limpio y claro en otros métodos que lo usan*/
    public static int pedirEntero(boolean esEdad) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        boolean valido;
        //Imprime si se usa este método para recibir la edad del alumno
        if (esEdad) {
            System.out.println("Edad:");
        }
        //Bucle para control de exceptiones.
        do {
            valido = true;
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.nextLine();
                valido = false;
                System.out.println("Debe introducir un número válido.");
            }
        } while (!valido);//Condicón para continuar
        
        return num;//Devulevo el valor.
    }
    //Método para pedir un numero de tipo double.
    public static double pedirDouble() {
        Scanner sc = new Scanner(System.in);
        double num = 0;
        boolean valido;
        System.out.println("Nota media:");
        do {
            valido = true;
            try {
                num = sc.nextDouble();
            } catch (InputMismatchException e) {
                sc.nextLine();
                valido = false;
                System.out.println("Debe introducir un número válido.");
            }
        } while (!valido);
        
        return num;
    }
    //Método para pedir el nombre del alumno
    public static String pedirNombre() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nombre:");
        return sc.nextLine();
    }
    
    /*Método para guardar el alumno, aquí se usa el boolean "esEdad" para permitir
    la flexibilidad del método pedirEntero y guardar los parámetros en una sola línea*/
    public static void insertarAlumno(Alumno[] alumnos) {
        boolean noEsEdad = false;//He separado en dos boolean para que sea claro el código al leerlo*/
        boolean esEdad = true;
        boolean correcto = true;
        int posicion;//Variable para pedir la posición donde se quiere guardar el alumno
        do {
            System.out.println("Introduce la posición (0-4): ");
            posicion = pedirEntero(noEsEdad);
            //Condicion para comprobar si la posición esta ocupada.
            if (posicion < 0 || posicion >= alumnos.length || alumnos[posicion] != null) {
                System.out.println("Posición inválida o ya ocupada. Introduce otra:");
                correcto = false;
            }
        } while (!correcto);
        
        System.out.println("Introduzca los siguientes datos:");
        /*Por esta línea es que he creado los boolean para darle limpieza al método
        y construirlo sin guardar variables con los valores recibidos por los métodos
        correspondientes, además se ve más claro en una sola línea.*/
        alumnos[posicion] = new Alumno(pedirNombre(), pedirEntero(esEdad), pedirDouble());
    }
    //Método mostrar con for each 
    public static void mostrarAlumnos(Alumno[] alumnos) {
        
        for (Alumno a : alumnos) {
            if (a != null) {//Condición para evitar el error NullPointerException
                System.out.println(a);
                System.out.println("-----------");
            }
        }
    }
    //Método para mostrar por nota
    public static void mostrarPorNota(Alumno[] alumnos) {
        
        System.out.println("Introduce nota mínima:");
        double notaMin = pedirDouble();
        //For each para imprimir si coincide con el valor proporcionado.
        for (Alumno a : alumnos) {
            if (a != null && a.getNotaMedia() >= notaMin) {
                System.out.println(a);
                System.out.println("-----------");
            }
        }
    }
    //Método para contar los alumnos suspensos con for estándar
    public static void contarSuspensos(Alumno[] alumnos) {
        
        int contador = 0;
        
        for (int i = 0; i < alumnos.length; i++) {
            if (alumnos[i] != null && alumnos[i].getNotaMedia() < 5) {
                contador++;
            }
        }
        
        System.out.println("Hay " + contador + " alumnos suspensos.");
    }
    //Método para buscar una coincidencia de alumno por su nombre.
    public static void buscarAlumno(Alumno[] alumnos) {
        
        System.out.println("Introduce el nombre a buscar:");
        String nombreBuscado = pedirNombre();
        
        boolean encontrado = false;
        
        for (Alumno a : alumnos) {
            if (a != null && a.getNombre().equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }
        
        if (encontrado) {
            System.out.println("El alumno está matriculado.");
        } else {
            System.out.println("El alumno NO está matriculado.");
        }
    }
    
    //Método para operar con el programa y llamar a los métodos.
    public static void menu(Alumno[] alumnos) {
        boolean bienvenida = false;
        int opcion;
        boolean noEsEdad = false;//Boolean para pedir el número sin imprimir el sout "Edad"
        do {//Bucle para permanecer en el programa
            if (!bienvenida) {
                System.out.println("Bienvenido al programa");
                bienvenida=true;
            }
            System.out.println("Pulse: \n"
                    + "* 1. Insertar alumno\n"
                    + "* 2. Mostrar alumnos\n"
                    + "* 3. Mostrar alumnos por nota mínima\n"
                    + "* 4. Contar suspensos\n"
                    + "* 5. Buscar alumno\n"
                    + "* 6. Salir");
            
            opcion = pedirEntero(noEsEdad);
            
            switch (opcion) {
                case 1:
                    insertarAlumno(alumnos);
                    break;
                case 2:
                    mostrarAlumnos(alumnos);
                    break;
                case 3:
                    mostrarPorNota(alumnos);
                    break;
                case 4:
                    contarSuspensos(alumnos);
                    break;
                case 5:
                    buscarAlumno(alumnos);
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 6);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Ejercicio 13
        /*
        Alumno a1 = new Alumno();
        Alumno a2 = new Alumno("Laura", 20, 8.5);

        a1.setNombre("Carlos");
        a1.setEdad(19);
        a1.setNotaMedia(6.3);

        System.out.println(a1);
        System.out.println(a2);
        */
        /*Hasta aquí el ejercicio 13, como se complementan he dejado ambos y solo
        comentado la primera parte para que no influya en el siguiente ejercicio.*/
        //Parte ejercicio 14
        Alumno[] alumnos = new Alumno[5];
        menu(alumnos);
        
    }

}
