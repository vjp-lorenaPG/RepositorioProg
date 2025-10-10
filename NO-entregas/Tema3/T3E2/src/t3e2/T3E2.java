/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e2;

import java.util.Scanner;

/**
 *Pide al usuario dos numero y si el primero es mayor de 10 haz el producto y si es
 * menor haz la suma de ambos.
 * @author Lorena
 */
public class T3E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numUsuario1, numUsuario2, producto, suma;//Declaro las variables que usaré.
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero");
        numUsuario1 = entrada.nextInt();//Pido el primer número y lo guardo
        
        Scanner entrada2 = new Scanner (System.in);
        System.out.println("Por favor, introduzca un numero");
        numUsuario2 = entrada2.nextInt();//Pido el segundo número y lo guardo.
        
        suma = numUsuario1 + numUsuario2;
        producto = numUsuario1 * numUsuario2;//Realizo las operaciones para aplicarlas después.
        
        if (numUsuario1 > 10){
            System.out.println("La operacion que se realizo es un producto y " +
                    "el resultado es " + producto);//Aplico el producto si el primer numero es mayor a 10.
            }else if (numUsuario1 < 10){
            System.out.println ("La operacion que se realizo es una suma y " +
                    "el resultado es " + suma);//Aplico la suma si el primer numero es menor a 10.
            }else
            System.out.println ("La operacion que se realizo es una suma y " +
                    "el resultado es " + suma);//Aplico la suma si el primer numero no entra en ninguna opción.
                
    }
}
    
    

