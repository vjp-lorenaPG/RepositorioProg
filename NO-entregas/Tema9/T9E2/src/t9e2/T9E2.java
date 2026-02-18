/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9e2;

import java.util.Scanner;

/**Ejercicio 02.- Crea un programa en JAVA en el que pidas al
 * usuario una cadena de caracteres, y luego la muestres carácter por carácter
 * por pantalla. • Muestra cada carácter en una línea distinta. • Utiliza la
 * clase String y el método charAt.
 *
 * @author alumno
 */
public class T9E2 {

    //Método para imprimir los caracteres separados de la cadena.
    public static void mostrarCadena(String cadena){
        char c;
        for(int i=0; i<cadena.length(); i++){
            c=cadena.charAt(i);//Guardo el caracter de i en c para imprimir.
            System.out.println(c);
        }
    }
    
    //Método para pedir la cadena
    public static String pedirCadena (){
        String cadena="";
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca una cadena de caracteres");
        cadena= entrada.nextLine();
        
        return cadena;//Devuelve
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro e inicializo.
        String cadena= pedirCadena();
        mostrarCadena(cadena);//Llamo al método mostrar.
        
        
        
    }
    
}
