/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e5;

import java.util.Scanner;

/**Ejercicio 05.- Implementa un algoritmo en JAVA que le pida al usuario un
 * número por teclado (en el main). Ese número se lo pasaremos a un método que
 * nos dirá si el número introducido es par o impar. ESTE MÉTODO ESTARÁ EN UNA
 * CLASE DISTINTA DE OTRO PAQUETE.
 *
 * @author Lorena
 */
public class T4E5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaro.
        int num;
        //Entrada de escáner.
        Scanner entrada = new Scanner (System.in);
        //Pido datos.
        System.out.println("Introduzca un numero para saber si es par o impar");
        num = entrada.nextInt();
        //Guardo valores e invoco al método.
        parImpar.Comprobar.parImpar(num);
        
    }
    
}
