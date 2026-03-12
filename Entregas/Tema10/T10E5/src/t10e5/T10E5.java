/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t10e5;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 05.- Realiza un programa en JAVA que lea por teclado números
 * enteros (los que quiera el usuario) y los introduzca en una lista. • Tras
 * mostrar la lista por pantalla, calcularás cual es el mayor número par y
 * también el menor número impar de la lista, los muestras por pantalla,
 * intercambias sus posiciones en la lista y muestras el nuevo la lista por
 * pantalla. • Crea todos los métodos que creas conveniente; cuantos más, mejor.
 *
 * @author alumno
 */
/* Uno introduce nº enteros en una lista.
 *- Mostrar - Calcular mayor (par)- Calcular menor (impar) - Intercambiar nº antetiores
 *- Mostrar la lista
 */
public class T10E5 {
    //Método para pedir el num de la opción y el número, es estandar para ambos. Incluye control de excepciones.
    public static int pedirNum() {
        int num = 0;
        boolean numCorrecto = false;
        Scanner entrada = new Scanner(System.in);
        
        do {
            System.out.println("Introduzca el numero");
            numCorrecto = false;
            try {//Try catch
                num = entrada.nextInt();
                numCorrecto = true;
            } catch (InputMismatchException e) {//Error a capturar
                entrada.next();
                System.out.println("Ha introducido algo distinto a un numero.");

            }
        } while (!numCorrecto);//Salida del bucle
        return num;
    }
    // Rellena la lista preguntando al usuario si desea seguir introduciendo números
    public static void rellenarLista(ArrayList<Integer> lista) {
        
        int opcion;
        
        do {
            lista.add(pedirNum());

            System.out.println("¿Desea introducir otro número?\n1. Sí\n2. No");
            opcion = pedirNum();

        } while (opcion == 1);
    }

    // Muestra la lista
    public static void mostrar(ArrayList<Integer> lista) {
        System.out.println("Contenido de la lista:");
        for (Integer n : lista) {
            System.out.println(n);
        }
    }

    //Devuelve la posición del menor número impar, si no existe devuleve -1
    public static int posicionMenorImpar(ArrayList<Integer> lista) {

        int posicion = -1;

        for (int i = 0; i < lista.size(); i++) {
            int num = lista.get(i);
            
            if (num%2!= 0) {//Comprueba si es impar.
                if (posicion == -1 || num < lista.get(posicion)) {//Comprueba si es menor.
                    posicion = i;
                }
            }
        }
        
        return posicion;//Devuelve
    }

    // Devuelve la posición del mayor número par, si no existe devuelve -1
    public static int posicionMayorPar(ArrayList<Integer> lista) {
            
        int posicion=-1;
        
        for  (int i=0;i< lista.size();i++) {
            int num = lista.get(i);

            if (num %2==0){  // Solo si es par
                if (posicion == -1 || num > lista.get(posicion)) {//Comprueba si es mayor
                    posicion = i;
                }
            }
        }
        
        return posicion;//Devuelve
    }

    // Intercambia dos posiciones de la lista
    public static void intercambiar(ArrayList<Integer> lista, int pos1, int pos2) {

        int aux = lista.get(pos1);
        lista.set(pos1, lista.get(pos2));
        lista.set(pos2, aux);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo la lista de tipo Integer
        ArrayList<Integer> lista = new ArrayList<>();
        //Llamo al método relenar lista
        rellenarLista(lista);
        //Muestro
        System.out.println("Lista original:");
        mostrar(lista);
        //Guardo las posiciones del mayor Par y el menor impar y los intercambio.
        int posPar = posicionMayorPar(lista);
        int posImpar = posicionMenorImpar(lista);
        //Compruebo que tengo posiciones válidas o no.
        if (posPar == -1 || posImpar == -1) {
            System.out.println("No existe mayor par o menor impar para intercambiar.");
        } else {//Si ambas posiciones son distintas de -1 las intercambio.
            System.out.println("Mayor número par: " + lista.get(posPar));
            System.out.println("Menor número impar: " + lista.get(posImpar));
            //Llamo el método.
            intercambiar(lista, posPar, posImpar);
            //Imprimo
            System.out.println("Lista después del intercambio:");
            mostrar(lista);
        }
    }

}
