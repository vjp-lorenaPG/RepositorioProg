/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e11.pkg12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 11.- Crea una clase Mueble con precio y descripción como atributos.
 * Crea constructor por defecto y parametrizado, así como getters y setters. •
 * Una vez creada la clase, crea en el main dos objetos de la clase mueble (crea
 * uno de ellos con el constructor por defecto y el otro con el parametrizado) e
 * implementa varias sentencias a tu gusto: cambia la descripción de los objetos
 * utilizando los setters, muestra la información de los objetos por pantalla,
 *
 * Ejercicio 12.- Amplía el ejercicio anterior. Crea un vector de muebles (de 4
 * celdas) y muestra al usuario las siguientes opciones: • Rellenar muebles
 * (todos los muebles del vector). • Mostrar muebles. • Mostrar muebles por
 * precio (pediremos un precio al usuario y mostraremos todos los muebles con
 * igual o menor precio)
 *
 * @author galin
 */
public class T8E1112 {

    public static int pedirNum() {/*Método para pedir un número al usuario  */
        boolean valido = true;//Boolean para controlar si el usuario introduce un número o no.
        int num = 0;
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar la excepción InputMismatch
        do {
            valido = true;
            try {//Control de excepciones
                num = entrada.nextInt();
            } catch (InputMismatchException e) {
                entrada.nextLine();
                valido = false;
                System.out.println("Ha introducido un caracter incompatible."
                        + "Por favor, introduzca solamente numeros.");
            }

        } while (!valido);//Condición para salir.

        return num;
    }

    public static double pedirPrecio() {//Método estándar para pedir el precio de tipo double.
        double precio = 0.0;
        boolean valido = false;
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar la excepción InputMismatch
        do {
            valido = true;
            try {//Control de excepciones
                System.out.println("Introduzca el precio");
                precio = entrada.nextDouble();
            } catch (InputMismatchException e) {
                entrada.nextLine();
                valido = false;
                System.out.println("Ha introducido un caracter incompatible."
                        + "Por favor, introduzca solamente numeros.");
            }

        } while (!valido);//Condición para salir.

        return precio;
    }

    public static String pedirDescripcion() {//Método estándar para pedir una descripción
        String descripcion = "";
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la descripcion:");
        return descripcion = entrada.nextLine();
    }

    public static void rellenarMuebles(Mueble[] mueble) {/*Método para rellenar el vector de muebles.*/
        System.out.println("Introduzca los siguientes datos:");
        double precio = 0.0;
        String descripcion = "";
        for (int i = 0; i < mueble.length; i++) {
            System.out.println("Mueble " + (i + 1));
            mueble[i] = new Mueble(precio = pedirPrecio(), descripcion = pedirDescripcion());//Guardo los valores
        }
    }

    public static void mostrarMuebles(Mueble[] mueble) {/*Método mostrar con for each*/
        boolean hayMuebles = false;
        for (Mueble m : mueble) {
            if (m != null) {
                System.out.println(m);
                hayMuebles = true;
            }
        }
        if (!hayMuebles) {
            System.out.println("Aun no ha guardado los muebles.");
        }

    }

    public static void mostrarMueblesPorPrecio(Mueble[] mueble) {/*Método para mostrar 
        muebles que cumplan con el precio elegido por el usuario*/
        double precioMax = 0.0;
        System.out.print("Introduce precio maximo: ");
        precioMax = pedirPrecio();

        for (Mueble m : mueble) {
            if (m != null && m.getPrecio() <= precioMax) {
                System.out.println(m);
            }
        }
    }

    public static void menu(Mueble[] mueble) {/*Menú para operar con los métodos 
        según las elecciones del usuario.*/
        int opcion = 0;
        boolean bienvenida = false;//Boolean para mostrar la bienvenida una sola vez.

        do {
            if (!bienvenida) {
                System.out.println("Bienvenido al programa");
                bienvenida = true;
            }
            //Menu de opciones con switch
            System.out.println("Pulse:\n"
                    + "* 1. Rellenar el vector de muebles.\n"
                    + "* 2. Mostrar los muebles\n"
                    + "* 3. Mostrar los muebles por precio\n"
                    + "* 4. Salir del programa");
            opcion = pedirNum();//Método mostrar estándar reusable.

            switch (opcion) {
                //Llamada a los métodos según las elecciones del usuario.
                case 1:
                    System.out.println("Ha seleccionado rellenar los muebles");
                    rellenarMuebles(mueble);
                    break;

                case 2:
                    System.out.println("Ha seleccionado mostrar los muebles");
                    mostrarMuebles(mueble);
                    break;

                case 3:
                    System.out.println("Ha seleccionado mostrar los muebles por precio");
                    mostrarMueblesPorPrecio(mueble);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 4);//Condición para salir.
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /*Parte del ejercicio 11, está comentado para que no afecte a su continuación en el ejercicio 12*/
/*
        //Objeto mueble creado con constructor por defecto
        Mueble m1 = new Mueble();

        //Objeto mueble con creado constructor parametrizado
        Mueble m2 = new Mueble(250, "Mesa de comedor");

        //Modificamos el primero usando setters
        m1.setPrecio(120);
        m1.setDescripcion("Silla de madera");

        //Mostramos 
        System.out.println(m1);
        System.out.println(m2);

        // Cambio la descripción
        m2.setDescripcion("Mesa grande de comedor");

        System.out.println("Después de modificar:");
        System.out.println(m2);
*/
         
        /*Hasta aquí el ejercicio 11. Lo dejo comentado porque el ejercicio 12 amplía
        el anterior utilizando un vector y un menú interactivo.*/
        
        Mueble[] mueble = new Mueble[4];//Creo el array de tipo mueble
        menu(mueble);//Llamo al método que gestiona el programa.
        
    }

}
