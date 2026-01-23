/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e5;

import java.util.Scanner;

/**Ejercicio 05.- Realiza un programa en JAVA que calcule el mayor, el menor y
 * la suma de todos los elementos de un array bidimensional de 4x2 números
 * enteros. 
 * • El programa ejecutará un método en el que el usuario introduzca
 * los valores, luego ejecutará otro método que visualizará los elementos del
 * array de forma atractiva y, por último, se mostrará el mayor, el menor y la
 * suma de todos los elementos (otros 3 métodos independientes).
 * 
 * Resumen requerimientos
 * Valores del ususario en 4x2, mostrar bonito, mayor, menor y suma total. 
 * 
 * @author lorena
 */
public class T7E5 {
    public final static int FIL = 4;
    public final static int COL=2;
    public static void rellenarMatriz(int [][] matriz){
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el valor de las siguientes posiciones de la matriz");
        //AQuí imprimir tabla con sout!!
        for(int i =0; i<FIL; i++){
            for(int j = 0; j<COL; j++){
                System.out.println("Posicion " + i +"-" + j);
                matriz[i][j]=entrada.nextInt();
            }
        }
    }
    
    
    public static void calculoMayor (int [][] matriz){/*Método para buscar el mayor,
        lo guarda en una variable, no modifica la posición de los valores.*/
        
        int mayor=matriz[0][0];
        
        System.out.println("Calculando mayor..");
        
        for(int i=0; i<FIL; i++){

            for(int j=0; j<COL; j++){
                if(matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
            }
        }
        System.out.println("El numero mayor es " + mayor);
        
    }
    
    public static void calculoMenor (int [][] matriz){/*Método para buscar el menor,
        lo guarda en una variable, no modifica la posición de los valores.*/
        
        int menor=matriz[0][0];
        
        System.out.println("Calculando menor..");
        
        for(int i=0; i<FIL; i++){

            for(int j=0; j<COL; j++){
                if(matriz[i][j]<menor){
                    menor=matriz[i][j];
                }
            }
        }
        System.out.println("El numero menor es " + menor);
        
    }
    
    public static void calculoTotal (int [][] matriz){/*Método para calcular el total,
        lo guarda en una variable, no modifica la posición de los valores.*/
        
        int total=0;
        
        System.out.println("Calculando el total..");
        
        for(int i=0; i<FIL; i++){

            for(int j=0; j<COL; j++){
                total+=matriz[i][j];
            }
        }
        System.out.println("El total es " + total);
        
    }
    public static void mostrar (int [][] matriz){//Método para mostrar//
        System.out.println("Mostrando el valor de los campos de la matriz");
        for(int i =0; i<FIL; i++){
            System.out.println("");
            for(int j = 0; j<COL; j++){
                System.out.print( "["+ matriz[i][j]+ "]" + ",");
            }  
        }
        System.out.println("");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [][] matriz= new int [FIL][COL];
        
        rellenarMatriz(matriz);//Relleno matriz con datos del usuario
        mostrar(matriz);//Muestro
        calculoMayor(matriz);//Calculo el mayor
        calculoMenor(matriz);//Calculo el menor
        calculoTotal(matriz);//Claculo el total.
        
        
    }
    
}
