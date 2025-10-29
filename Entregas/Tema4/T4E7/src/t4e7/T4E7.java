/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e7;

import java.util.Scanner;

/**Ejercicio 07.- Escribe un programa en JAVA en el que el usuario introduzca
 * cuatro números enteros (en el main), y que se los pase a un método que los
 * muestre por pantalla ordenados de forma creciente (de menor a mayor).
 *
 * @author Lorena
 */
public class T4E7 {
    public static void menor(int aux, int num1, int num2, int num3 ,int num4) {
        
        //Bucle para ordenar los números.
        for (int i=0; i<3;i++){
            if (num1 > num2) {
                aux = num1;
                num1 = num2;
                num2 = aux;
            }
            if (num2 > num3) {
                aux = num2;
                num2 = num3;
                num3 = aux;
            }
            if (num3 > num4) {
                aux = num3;
                num3 = num4;
                num4 = aux;
            }
        }//Imprimo el orden.
        System.out.println("El orden de los numeros de menor a mayor es " + num1+ " - "
        + num2 + " - " + num3 + " - " + num4);

    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Delcaro las variables.
        
        int num1, num2, num3, num4;
        int aux = 0;
        //Inicio escáner.
        Scanner entrada = new Scanner(System.in);
        //Informo y pido valores.
        System.out.println("Le pedire cuatro numeros para decirle cual es el mas menor");
        System.out.println("Introduzca el primer numero");
        num1 = entrada.nextInt();
        System.out.println("Introduzca el segundo numero");
        num2 = entrada.nextInt();
        System.out.println("Introduzca el tercer numero");
        num3 = entrada.nextInt();
        System.out.println("Introduzca el cuarto numero");
        num4 = entrada.nextInt();
        //Después de almacenar los valores invoco al método.
        menor(aux, num1, num2, num3, num4);
    }
    
}
