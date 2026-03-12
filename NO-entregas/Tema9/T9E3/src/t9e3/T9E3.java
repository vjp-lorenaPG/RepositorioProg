/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t9e3;

import java.util.Scanner;

/**
 *Ejercicio 03.- (OPTATIVO) Crea un programa en JAVA en el que pidas al usuario
 * una cadena de caracteres, y luego la muestres carácter por carácter por
 * pantalla. • Muestra cada carácter en una línea distinta. • Utiliza la clase
 * String y el método toCharArray.
 * @author alumno
 */
public class T9E3 {
    
    public static void mostrarCadena(String cadena){
        char [] c=cadena.toCharArray();//Guardo los caracteres en el array de c para imprimir.
        for(int i=0; i<cadena.length(); i++){
            System.out.println(c[i]);//Imprimo cada caracter por separado.
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
        mostrarCadena(cadena);//Mostrar
        
        
    }
    
}
