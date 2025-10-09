/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e6;

import java.util.Scanner;

/**
 *
 * @author Lorena
 * Crea un programa en JAVA en donde el usuario
 *introduzca la nota de un alumno (número entero entre 0 y 10) y se
 *escribirá su calificación según el valor de la nota ingresada
 */
public class T3E6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic her
        int nota;//Declaro la variable
        
        Scanner entrada = new Scanner(System.in);
        System.out.println ("Introduzca su nota");//Pido la nota
        nota = entrada.nextInt();//Guardo la nota.
        
        if (nota < 5){
        System.out.println("Su calificacion es \"suspenso\".");/*Escribo el mensaje
        en caso de que la nota sea menor a cinco*/
        }else if (nota==5){
        System.out.println("Su calificacion es \"bien\"");/*Escribo el mensaje
        en caso de que la nota sea igual a cinco*/
        }else if (nota==6){
        System.out.println("Su calificacion es \"bien\"");/*Escribo el mensaje
        en caso de que la nota sea igual a seis*/
        }else if (nota==7){
        System.out.println("Su calificacion es \"notable\"");/*Escribo el mensaje
        en caso de que la nota sea igual a siete*/
        }else if (nota==8){
        System.out.println("Su calificacion es \"notable\"");/*Escribo el mensaje
        en caso de que la nota sea igual a ocho*/
        }else if (nota==9){
        System.out.println("Su calificacion es \"sobresaliente\"");/*Escribo el mensaje
        en caso de que la nota sea igual a nueve*/
        }else if (nota==10){
        System.out.println("Su calificacion es \"sobresaliente\"");/*Escribo el mensaje
        en caso de que la nota sea igual a diez*/
        }else //Aplico el mensaje de error
            System.out.println("El numero no se encuentra en el rango entre cero y diez");
        
    }
    
}
