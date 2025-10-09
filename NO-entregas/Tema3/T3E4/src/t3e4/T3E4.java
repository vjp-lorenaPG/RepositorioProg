/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e4;

import java.util.Scanner;

/**
 *Escribir un algoritmo en JAVA que pida tres
 *números e imprima por pantalla el menor de ellos.
 * @author Lorena
 */
public class T3E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3, aux;
        
        Scanner entrada  = new Scanner (System.in);
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt ();
        
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt ();
        
        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextInt ();
        
        //Primera vuelta
        if (num1 > num2){//aplico el condicional
            aux=num1;//Guardo el valor del num1 en la variable aux
            num1=num2;//Traslado el valor del num2 al num1
            num2=aux;//Traslado el valor de aux al num2
        }
        if (num2 > num3){//Aplico el condicional
            aux=num2;//Guardo el valor del num2
            num2=num3;//Traslado el valor del num3 al num2
            num3=aux;//Traslado el valor de aux al num3
        }
        //Segunda vuelta
        if (num1 > num2){//aplico el condicional
            aux=num1;//Guardo el valor del num1 en la variable aux
            num1=num2;//Traslado el valor del num2 al num1
            num2=aux;//Traslado el valor de aux al num2
        }
        if (num2 > num3){//Aplico el condicional
            aux=num2;//Guardo el valor del num2
            num2=num3;//Traslado el valor del num3 al num2
            num3=aux;//Traslado el valor de aux al num3
        }
        System.out.println ("El numero menor de entre todos es: " + num1);
    }   
    
}
