/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e15;

import java.util.Scanner;

/**- Escribe un programa en JAVA que, utilizando bucles, imprima la tabla de
 * multiplicar de un número que elija el usuario.
 *
 * @author Lorena
 */
public class T3E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numUsuario;
        int operador = 1;
        int resultado;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar");
        numUsuario = entrada.nextInt();
        
        while (operador<=10){
            resultado =numUsuario*operador;
            System.out.println(numUsuario +" x " + operador + " = " + resultado);
            operador++;
        }
    
    }
    
}
