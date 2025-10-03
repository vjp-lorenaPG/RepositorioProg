/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio26;

import java.util.Scanner;

/**
 *Ejercicio 26
 * Pedir al usuario un numero a de 4 cifras y devolver los numeros ordenados por posición
 * @author Lorena
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int numUsuario, cifra1, cifra2, cifra3, cifra4 ;
    
    Scanner entrada = new Scanner (System.in);
    System.out.println("Por favor, introduzca un número de 4 cifras:");
    numUsuario = entrada.nextInt();
    
    cifra1 = (numUsuario /1000);
    cifra2 = (numUsuario /100)%10;
    cifra3 = (numUsuario / 10)% 10;
    cifra4 = numUsuario %10;
    System.out.println("La primera cifra es:" + cifra1 + "\n"+
            "La segunda cifra es: " + cifra2 +"\n" +
            "La tercera cifra es: " + cifra3 + "\n" +
            "La cuarta cifra es; " + cifra4);

    
    
    
    }
    
}
