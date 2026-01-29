/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**EJERCICIOS • Ejercicio 02.- Escribir un programa en JAVA que contenga un
 * método que rellena un array unidimensional (vector) de enteros ALEATORIOS
 * entre el 1 y el 6, y luego, otro método, lo muestre por pantalla, utilizando
 * el bucle for-each. 
 * • El programa también tendrá un método donde el usuario elegirá la longitud del
 * array entre 1 y 10. Este método también controla que
 * el usuario nos introduzca un número entero y no una letra (mediante
 * excepciones). En caso de que el usuario introduzca el dato incorrecto se lo
 * volveremos a pedir las veces que hagan falta.
 *
 * @author galin
 */
public class T8E2 {
    //Método para generar aleatorios 
    public static int generarAleatorio() {
        int min = 1;
        int max = 6;
        int nota;
        
        nota = (int)(Math.random() * (max - min+1) + min);
        
        return nota;
    }
    //Rellenar con aleatorios 
    public static void rellenarConAleatorios(int[] vector) {
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (generarAleatorio());
        }
    }
    //Método para pedir nota la usuario.
    public static int pedirNum() {
        
        int num = 0;
        boolean correcto = false;
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
    //Mostrar con for each
    public static void mostrar (int [] vector){
        
        for(int fila :vector){
            System.out.print("["+fila +"]" + ",");
        }
        System.out.println("");
    }
    
    public static void mostrarNormal (int [] vector){/*Método para mostrar
        y probar si el resultado del for each en el otro mostrar es correcto.*/
        System.out.println("Mostrando el valor de los campos ");
        for(int i =0; i<vector.length; i++){
            
            System.out.print( "["+ vector[i]+ "]" + ",");
              
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [] vector= new int [pedirNum()];
        rellenarConAleatorios(vector);
        mostrar(vector);
        mostrarNormal(vector);
    }
    
}
