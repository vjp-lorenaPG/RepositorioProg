/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e9;

import java.util.Scanner;

/**Ejercicio 09.- Escribir un algoritmo en JAVA que pida tres números (utiliza
 * un método) y se los pase a otro método que los imprima por pantalla el menor
 * de ellos. ESTOS MÉTODOS ESTARÁN EN UNA CLASE DISTINTA DEL MISMO PAQUETE.
 *
 *
 * @author alumno
 */
public class Peticion {
    public static int dato(){
        int num;
        
        Scanner entrada= new Scanner (System.in);
        
        
        System.out.println("Introduzca un numero");
        num = entrada.nextInt ();
        
        
    return( num);
    }
}
