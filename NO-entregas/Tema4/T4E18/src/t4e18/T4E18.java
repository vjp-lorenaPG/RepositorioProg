/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e18;

import java.util.Scanner;

/**Ejercicio 18.- Crea un programa que te pida tu nombre y a continuación te lo
 * muestre 5 veces.
 * • Utiliza un método para pedir el nombre y otro método que
 * contenga un bucle para mostrar el nombre las cinco veces.
 *
 * @author Lorena
 */
public class T4E18 {
    
    public static void imprimirNombre (String nombre){
        //Método para imprimir.
        System.out.println(nombre);
    }
            
    public static String pedirNombre (){
        //Método para pedir el nombre.
        String nombre;
        Scanner entrada = new Scanner (System.in);
        //Declaro variables e inicio Scanner.
        System.out.println("Introduzca su nombre");
        nombre=entrada.nextLine();//Guardo el nombre.
    return (nombre);//Devuelvo.
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variable.
        String nombre=pedirNombre();//Invoco método.
        //Buscle para imprimir.
        for (int i=0; i<5;i++){
            imprimirNombre(nombre);//Invoco método.
        }
        
    }
    
}
