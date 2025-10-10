/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3.e1;

import java.text.BreakIterator;
import java.util.Scanner;

/**
 *
 * @author Lorena
 * Pídele al usuario un número e impreime si es positivo o negativo
 */
public class T3E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numUsuario;//Declaro la variable para guardar el número del usuario.
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el numero");
        numUsuario = entrada.nextInt();//Registro el número del usuario en la variable.
        
            if (numUsuario > 0){
                    System.out.println("El numero es positivo");
                }   else if(numUsuario < 0){// Imprimo que el número es positivo si es mayor a 0.
                    System.out.println("El numero es negativo");/* Imprimo que el número es negativo
                    si es menor a 0.*/
                }   else {
                    System.out.println ("El numero es positivo");/*Imprimo que el número es negativo
                    si fuera igual a cero.*/
             }
        
        
    }
    
}
