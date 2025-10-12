/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e23;
import java.util.Scanner;
/**Realiza un algoritmo que imprima todos los números existentes entre el número
 * 1 y otro introducido por el usuario.
 *
 * @author Lorena
 */
public class T3E23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, numUsua;
        num = 2;
        //Declaro ls variables.
        
        Scanner entrada = new Scanner (System.in);//Declaro la entrada.

        do { 
            System.out.println ("Introduzca un numero mayor que uno para hacer el conteo");
            numUsua = entrada.nextInt ();//Imprimo y guardo el numero del usuario.
            if (numUsua <= 2){//Añado la condición para imprimir que el número es inválido.
                    System.out.println ("El numero introducido no es valido");
                }
        }while (numUsua <= 2);//Añado la condición para repetir el bucle.
        
        System.out.println ("Los numero existentes entre " + num + " y "+ numUsua);
        //Imprimo parte del enunciado.
        do {
            System.out.print (num + " ");//Imprimo el valor de "num".
            num++;//Sumo y añado una unidad a "num".
        }while (num <numUsua);//Añado la condición del bucle.
    }
        
        
} 

    

