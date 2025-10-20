/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e22;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 22.- Crea un programa que calcule sume dos números que introduzca
 * el usuario.
 * En caso de que el usuario introduzca una letra en vez de un
 * número, debemos capturar la excepción y mostrarle un mensaje de error.
 *
 * @author Lorena
 */
public class T3E22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, resultado;//Declaro variables,
        boolean error;
        Scanner entrada = new Scanner (System.in);
        
        do{//Bucle para pedir la información correcta.
            System.out.println ("Introduzca los numeros para realizar la suma");
            try {//Control de errores.
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                error = false;//Condición para salir del bucle.
            }catch(InputMismatchException e){//Captura del error y solución.
                num1= 0;
                num2=0;
                error = true;
                System.out.println ("Ha introducido un caracter invalido");
                //Mensaje de error más reinicio del escáner.
                entrada = new Scanner (System.in);
            }
        }while (error ==true);//Condición para salir.
        
        resultado = num1 + num2; //Operación.
        System.out.println ("La suma de " + num1 + " + " + num2 + " = " + resultado );
        //Imprimo resultado.
    }
        
}
    

