/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e5;

import java.util.Scanner;

/**
 *Implementa un algoritmo en JAVA que le pida
 *al usuario un número por teclado. Posteriormente, el
 *programa le dirá al usuario si el número introducido es par
 *o impar.
 * @author Lorena
 */
public class T3E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;//Declaro la variable 
        
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Introduzca el numero");
        num = entrada.nextInt();//Pido el numero y lo guardo
        
        if (num % 2 ==0){//Si no hay resto es par
            System.out.println("El numero es par");
        }
        else {//Si no es lo anterior es impar
            System.out.println("El numero es impar");
        }
        
        
        
    }
    
}
