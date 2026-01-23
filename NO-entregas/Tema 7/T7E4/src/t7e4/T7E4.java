/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e4;

/**Ejercicio 04.- Escribir un programa que contenga un método que guarde en un
 * array bidimensional de 4x3 12 números aleatorios. Los números aleatorios
 * estarán comprendidos entre el número 100 y el número 200. Luego, otro método,
 * mostrará solo los números pares que contiene el array.
 *
 * @author galin
 */
public class T7E4 {
    public final static int FIL=4;
    public final static int COL=3;
    public static void rellenarArrays (int matriz [] []){//Método para guardar el número aleatorio.
        System.out.println("Rellenando la matriz..");
        for(int i=0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                matriz[i][j]=generarAleatorio();
            }
        }
        System.out.println("Completado");
    }
    
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=200;
        int min=100;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    
    public static void mostrar (int [][] matriz){/*Método para mostrar
        de forma bonita, reusable.*/
        System.out.println("Mostrando el valor de los campos de la matriz");
        for(int i =0; i<FIL; i++){
            System.out.println("");
            for(int j = 0; j<COL; j++){
                System.out.print( "["+ matriz[i][j]+ "]" + ",");
            }  
        }
        System.out.println("");
    }
    
    public static void mostrarPares (int [][]matriz){
        System.out.println("Mostranto los valores pares");
        for(int i=0; i<FIL; i++){
            for (int j =0 ; j<COL; j++){
                if(matriz[i][j]%2==0){
                    System.out.println(matriz[i][j] + ",");
                }
            }
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz= new int [4][3];
        rellenarArrays(matriz);
        mostrar(matriz);
        mostrarPares(matriz);
        
        
    }
    
}
