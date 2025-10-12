/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e17;

import java.util.Scanner;

/**Crea un programa que calcule la raíz cuadrada del número que introduzca el usuario.
 *
 * @author Lorena
 */
public class T3E17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // TODO code application logic here
        int num;
        double raiz;
        //Declaro las variables.
        
        Scanner entrada = new  Scanner (System.in);//Declaro la entrada.
        do{
        System.out.println("Introduzca un numero para calcular la raiz cuadrada");//Imprimo petición.
        num = entrada.nextInt();//Guardo el valor del usuario en "num"
            if (num>0){//Primera condición.
            raiz = Math.sqrt(num);//Aplica raíz cuadrada.
            System.out.println ("La raiz cuadrada de "+ num + " es " + raiz);//Imprime resultado.
            }else {//Añado mensaje de error con el número para el resto de casos.
            System.err.println ("El numero introducido no es positivo");
            }
        }while (num<=0);//Añado repetición del bucle.
    }
    
}
