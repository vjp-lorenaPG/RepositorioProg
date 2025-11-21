/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e21;

import java.util.Scanner;

/**• Ejercicio 21.- Desarrolla un programa que, a partir de dos números que nos
 * introduzca el usuario, muestre en pantalla la suma total de todos los números
 * pares comprendidos entre ambos. 
 * • Utiliza 2 métodos distintos para pedir los datos al usuario, ya que en el segundo método
 * deberás comprobar que el usuario te mete un número mayor que el primero (y
 * sino se lo vuelves a pedir
 * • Utiliza también otro método que muestre el resultado a partir de
 * los números recibidos.
 *
 * @author Lorena
 */
public class T4E21 {
    public static int pedirNum1 (){
        int num1;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Intoduzca el primer numero");
        num1= entrada.nextInt();
        return (num1);
    }
    public static int pedirNum2 (int num1){
        int num2;
        Scanner entrada = new Scanner (System.in);
        do {
            System.out.println("Intoduzca el primer numero");
            num2= entrada.nextInt();
            if (num1>num2){
                System.out.println("Error el numero introducido es menor que el primer numero");
            }
        } while (num1>num2);
        return (num2);
    }
    
    public static void sumarPares (int num1, int num2){
        int sumatorioPares=0;
        for (int i=num1; i<num2; i++){
            if (num1%2==0){
                sumatorioPares=sumatorioPares*num1;
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro variables.
        
        int num1, num2;
        
        num1=pedirNum1();
        pedirNum2(num1);
        
        
        
        
    }
    
}
