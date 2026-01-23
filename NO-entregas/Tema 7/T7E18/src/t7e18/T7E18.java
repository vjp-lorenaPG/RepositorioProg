/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e18;

import java.util.Scanner;

/**Ejercicio 18.- Diseña un método que tome como parámetros de entrada dos
 * arrays de 5 enteros y devuelva como salida un único array de 10 enteros con
 * los elementos de los anteriores arrays ordenados de menor a mayor.
 *
 * @author Lorena
 */
public class T7E18 {
    
    
    ///////////////////////////////////------------------------------------------
    //Método para probar el funcionamiento de manera eficiente-------------------
    public static void rellenarArrays (int vector []){//Método para guardar el número aleatorio.
        System.out.println("Rellenando la matriz..");
        for(int i=0; i<vector.length; i++){
            vector[i]=generarAleatorio();
        }
        System.out.println("Completado");
    }
    //Método para probar el funcionamiento de manera eficiente-------------------
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=50;
        int min=0;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    /////////////////////////////////////---------------------------------
    
    public static void rellenarVector (int[] vector){//Método para rellenar el vector.
        int max=100;
        int min=10;
        for(int i =0; i<12; i++){//Bucle para pedir números y guardarlos en el vector.
            vector[i]= pedirNumero();
        }
        System.out.println("* -- ---- ---- -- *");
        System.out.println("El vector vector se ha rellenado correctamente");
        System.out.println("* -- ---- ---- -- *");
    }
    
    
    public static int pedirNumero(){//Pedir numero al usuario.
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero entero.");
        num = entrada.nextInt();
        return num;//Devuelvo.
    }
    //Método para ordenar de meno a meyor con el método de la burbuja.
    public static void ordenarMenor(int[] vector){
        int siguiente;
        int aux;
        System.out.println("Ordenando los campos");
        for(int j =0; j<vector.length-1; j++){
            for(int i=0; i<vector.length-1; i++){
                siguiente=i+1;
                if(vector[i]>vector[siguiente]){
                    aux=vector[i];
                    vector[i]=vector[siguiente];
                    vector[siguiente]=aux;
                }
            }
        }
    }
    //Metodo para unir los arrays.
    public static void unirArrays (int [] v1,int [] v2, int [] vFinal){
        //Bucle para pasar los valores de los indices al nuevo array.
        for(int i=0; i<v1.length;i++){
            vFinal[i]=v1[i];
        }
        for(int i=0; i<v2.length; i++){
            vFinal[i+v1.length]=v2[i];
        }
    }
    public static void mostrar (int [] vector){/*Método para mostrar
        de forma bonita, reusable.*/
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
        
        int [] vector1 = new int [5];
        int [] vector2 =  new int [5];
        int [] vectorFinal = new int [10];
        
        rellenarArrays(vector1);
        rellenarArrays(vector2);
        unirArrays(vector1, vector2, vectorFinal);
        mostrar(vectorFinal);
        ordenarMenor(vectorFinal);
        mostrar(vectorFinal);
    }  
    
}
