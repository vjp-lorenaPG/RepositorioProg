/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e3;

import Mayor.MayorMenor;
import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *Ejercicio 03.- Diseña un programa en JAVA que lea tres números en el main y
 * se los pase a un método que imprimirá por pantalla el mayor de ellos. ESTE
 * MÉTODO ESTARÁ EN UNA CLASE DISTINTA DE OTRO PAQUETE.
 * @author alumno
 */
public class T4E3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variables
        int num1, num2, num3;
        int aux = 0;
        Scanner entrada = new Scanner (System.in);//Inicio escáner
        //Informo al usuario e inicio las peticiones de datos.
        System.out.println("Le pedire tres numeros para decirle cual es el mas mayor");
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        System.out.println ("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        System.out.println ("Introduzca el tercer numero");
        num3 = entrada.nextInt();
        
        Mayor.MayorMenor.mayor(aux, num1, num2, num3);//Invoco método.
    }
    
}
