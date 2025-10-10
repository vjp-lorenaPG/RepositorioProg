/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e3;

import java.util.Scanner;

/**
 *Diseña un programa que lea tres números e
 *imprima por pantalla el mayor de ellos.
 * @author Lorena
 */
public class T3E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, aux;//Declaro las variables.
        
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Por favot, introduzca el primer numero");
        num1 = entrada.nextInt ();//Registro primer número.
        
        
        System.out.println ("Ahora, introduzca el segundo numero");
        num2 = entrada.nextInt();//Registro segundo número.
        
        
        System.out.println("Por ultimo, introduzca el tercer numero");
        num3 = entrada.nextInt();//Registro tercer número.
        
        aux=num1;//Guardo la variable "num1" en la variable "aux"
        
        if (num1 < num2){//Si el segundo número es mayor lo guardo en "aux"
            aux= num2;
            }
        if (num1 < num3){//Si el tercer número es mayor lo guardo en "aux"
            aux = num3;
            }
            
        System.out.println ("El numero mayor es " + aux);
        //Imprimo el número guardado en la varaible "aux".
        
        
    }
    
}
