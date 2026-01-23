/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e2;

import java.util.Scanner;

/** Ejercicio 02.- Realizar un programa que lea 7 números enteros y los
 * introduzca en un array unidimensional. Luego muestras el array, intercambias
 * los números que se encuentren en la 2ª y 4ª posición, y muestras el nuevo
 * array por pantalla. 
 * • Utiliza al menos 3 métodos: uno para introducir los
 * datos, otro para mostrar los datos y otro para intercambiar los datos.
 *
 * @author alumno
 */
public class T7E2 {
    
    public static void pedirNum(int [] vector){//Método para pedir un número
        int num;
        Scanner entrada = new Scanner (System.in);
        for (int i = 0; i < vector.length; i++){
            System.out.println("Introduzca el valor de la posicion " + i);
            num=entrada.nextInt();
            vector[i]=num;
        }
    }
    
    public static void mostrar (int[] vector){//Método para mostrar los valores del vector.
        for (int i = 0; i < vector.length; i++) {
            System.out.println("El valor de la posicion " + i + " es " + vector[i] );
        }
    }
    
    public static void intercambiar (int [] vector){//Método para cambiar las posiciones de los valores.
        
        int aux =vector[2];//Auxiliar para no peder los valores.
        vector[2]=vector[4];
        vector[4]=aux;
        System.out.println("* ------------ ------------ *");
        System.out.println("Valores de los vectores intercambiados");
        System.out.println("* ------------ ------------ *");
        
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector = new int[7];
        pedirNum(vector);
        mostrar(vector);
        intercambiar(vector);
        mostrar(vector);
        
        
        
        
        
        
        
    }
    
}
