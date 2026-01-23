/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e1;

import java.util.Scanner;


/**
 *Ejercicio 01.- Escribir un programa que contenga un método que pida al
 * usuario 10 números enteros y los guarde en un array unidimensional. Luego,
 * otro método, mostrará solo los números pares que contiene el array
 * 
 * @author Lorena
 */
public class T7E1 {
    public static void pedirNum(int[] vector){//Método para pedir un número y guardarlo en el vector.
        int num;
        Scanner entrada = new Scanner(System.in);
        
        for (int i =0; i<vector.length; i++){//Bucle para pedir los números al usuario y guardarlos.
            System.out.println("Introduzca el valor de la posicion " + i + " del vector");
            num=entrada.nextInt();
            vector[i]=num;
        }
        
        
    }
    
   
    public static void mostarPar( int[] vector){//Método para buscar los pares y mostrarlos.
    
        for (int i =0; i<vector.length;i++){//Bucle para buscarlos pares.
            
            if(vector[i]%2==0){
                System.out.println("El valor de la posicion " + i+ " es " + vector[i] + " y es par");
            }
        }
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //
        
        int[] vector = new int [10];
        pedirNum(vector);
        mostarPar(vector);
        
    }
    
}
