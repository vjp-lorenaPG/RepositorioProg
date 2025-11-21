/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e4;

import java.util.Scanner;

/**
 *• Ejercicio 04.- Escribir un algoritmo en JAVA que pida tres números (en el
 * main) y se los pase a un método que los imprima por pantalla el menor de
 * ellos. ESTE MÉTODO ESTARÁ EN UNA CLASE DISTINTA DEL MISMO PAQUETE.
 * @author Lorena
 */
public class T4E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro variables.
        int num1, num2, num3;
        int aux = 0;
        //Inicio escáner.
        Scanner entrada = new Scanner (System.in);
        //Informo al usuario y pido los números.
        System.out.println("Le pedire tres numeros para decirle cual es el mas menor");
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        System.out.println ("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        System.out.println ("Introduzca el tercer numero");
        num3 = entrada.nextInt();
        //Invoco al método
        Mayor.mayorMenor(aux, num1, num2, num3);
    }
    
}    
        
    
    
