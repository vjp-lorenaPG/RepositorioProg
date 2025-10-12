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
        int numUsuario, resultado, operador;//Declaro las variables.
        operador = 1;//Le asigno un valor al operador para evitar errores.
        
        //Declaro la entrada e imprimo la petición al usuario.
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero para calcular su tabla de multiplicar");
        numUsuario = entrada.nextInt();//Guardo la variable del usuario en "numUsuario".
        
        while (operador<=10){//Declaro la condición.
            resultado =numUsuario*operador;//Hago la operación
            System.out.println(numUsuario +" x " + operador + " = " + resultado);//Imprimo resultado.
            operador++;//Modifico el "operador".
        }
    
    }
    
}
