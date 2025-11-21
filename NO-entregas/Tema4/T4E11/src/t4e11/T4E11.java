/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e11;

import java.util.Scanner;

/**
 *Ejercicio 11.- Crea un programa que calcule la raíz cuadrada del número que
 * introduzca el usuario. (Utiliza el método Math.sqrt() )
 * 
 * Si el usuario introduce un número negativo, debemos mostrarle un mensaje de
 * error y volver a pedírselo (tantas veces como sea necesario)
 * 
 * La petición del número lo haremos en un método, el cálculo de la raíz
 * cuadrada en otro, y mostraremos el resultado en otro método.
 * @author Lorena
 */
public class T4E11 {
    
    public static int raizCuadrada (int num){
        
        int raiz;
        
        raiz =(int) Math.sqrt(num);
    
        return (raiz);
    }

    public static int pedirNum (){
        int num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        num = entrada.nextInt();
        
    return (num);
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, raiz;
        boolean positivo= true;
        System.out.println("Le voy a pedir un numero para calcular la raiz cuadrada");
        do {
            num = pedirNum();
            if (num<0){
                positivo=false;
                System.out.println("Error, el numero es negativo");
            }
        }while (positivo==false);
        
        raiz=(int)raizCuadrada(num);
        
    
        
    }
    
}
