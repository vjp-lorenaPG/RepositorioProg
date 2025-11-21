/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e2;

import java.util.Scanner;

/**Ejercicio 02.- Realiza un programa en el que le solicites en el main al
 * usuario 2 números y, si el primer número introducido es mayor que 10, se
 * llamará a un método que los multiplicará y mostrará el resultado, y en caso
 * contrario se llamará a un método que los sume. ESTOS DOS MÉTODOS ESTARÁN EN
 * UNA CLASE DISTINTA EN EL MISMO PAQUETE. Muestra al usuario la operación
 * realizada y el resultado.
 *
 * @author alumno
 */
public class T4E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2;//Declaro variables.
        
        Scanner entrada = new Scanner (System.in);
        
        //Informo al usuario y pido valores.
        System.out.println("Para realizar las operaciones tendra que introducir dos numeros.");
        System.out.println("Por favor, introduzca un numero.");
        num1 = entrada.nextInt ();
        System.out.println("Por favor, introduzca el segundo numero.");
        num2 = entrada.nextInt();
        //Guardo valores y realizo condición para las operaciones.
        if (num1>10){
            SumaOProducto.producto(num1, num2);
        }else {
            SumaOProducto.suma(num1, num2);
        }
        
        
    }
    
}
