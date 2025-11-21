/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e1;

import java.util.Scanner;

/**Realiza un programa en JAVA en el cual se le pide al usuario (en el main) un
 * número por teclado. Luego se llamará a un método que pasándole número
 * introducido por el usuario, nos dirá si el número introducido es positivo o
 * negativo.
 *
 * @author Lorena
 */

public class T4E1 {
    public static void positivoNegativo( int num){//Método para comprobar e imprimir.
        //Condición para imprimir.
        if (num>=0){
        System.out.println("El numero introducido es positivo");
        }else {
        System.out.println("El numero introducido es negativo");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;//Variable del número del usuario.
        
        Scanner entrada = new Scanner (System.in);//Entrada
        
        System.out.println ("Introduzca un numero para conocer si es positivo o negativo");
        //Mensaje al usuario
        num = entrada.nextInt();//Guardo número.
        positivoNegativo (num);//Invoco método.
       
    }
    
}
