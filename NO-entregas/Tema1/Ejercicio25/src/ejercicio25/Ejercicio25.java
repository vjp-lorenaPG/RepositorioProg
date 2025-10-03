/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio25;

import java.util.Scanner;

/**
 *Ejercicio 25
 * Pedir al usuario tres números y devolver la suma de todos, además del producto
 * @author Lorena
 */
public class Ejercicio25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero1, numero2, numero3, suma,  producto;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca el primer numero :");
        numero1 = entrada.nextInt();//Registro de primera entrada
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Por favor, introduzca el segundo numero :");
        numero2 = entrada2.nextInt();//Registro de segunda entrada
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Por favor, introduzca el tercer numero :");
        numero3 = entrada3.nextInt();//Registro de tercera entrada
        
        suma= numero1 + numero2 + numero3 ;//Registro el valor de suma con la operación correspondiente
        producto = numero1 * numero2 * numero3 ;//Registro el valor del producto con la operación correspondiente
        
        System.out.println("La suma de los números introducidos es: "+ suma);
        
        System.out.println("El producto de los números introducidos es: " + producto);
        
        
    }
    
}
