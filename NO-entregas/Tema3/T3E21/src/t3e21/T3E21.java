/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e21;

import java.util.Scanner;

/**
 *Ejercicio 21.- Crea un programa que calcule el resultado de
dividir los números que introduzca el usuario.
 * @author Lorena
 */
public class T3E21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, resultado;// Declaro variables.
        boolean error;
        
        Scanner entrada = new Scanner (System.in);
        
        
        do {//Bucle para pedir el valor de los numeros en caso de error.
            System.out.println ("Introduzca dos numeros para iniciar la division");
            num1 = entrada.nextInt();
            num2 = entrada.nextInt();
            //Entrada del valor de las variables.
            try {//Control de excepciones.
                resultado = num1 / num2;
                error = false;
            }catch (ArithmeticException e){//Capturo el error y aplico solución.
                resultado = 0;
                System.out.println ("Ha intentado dividir por cero");//Mensaje de error.
                error = true;//Aplico condición de repecitión del bucle.
                entrada = new Scanner (System.in);//Reinicio el escáner.
            }
        }while (error ==true );//Condición de repetición
        
        System.out.println ("El resultado de dividir " + num1 + "/" + num2 + " = " + resultado);
        //Imprimo resultado de la operación.
    }
    
}
