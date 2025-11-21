/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e6;

import java.util.Scanner;

/**
 *Ejercicio 06.- Crea un programa en JAVA en donde el usuario introduzca la
 * nota de un alumno (número entero entre 0 y 10) en el main, y se le pasará a
 * un método que escribirá su calificación según el valor de la nota ingresada:
 *
 * @author Lorena
 */
public class T4E6 {
    public static void calificacion (int nota){
        //Condición para imprimir valor de la nota.
        if (nota<4){
            System.out.println("Su nota es equivalente a un suspenso");
        }else if(nota>=5&&nota<=6){
            System.out.println("Su nota es equivalente a un bien");
        }else if (nota>=7&&nota<=8){
        System.out.println("Su nota es equivalente a un notable");
        }else {
        System.out.println("Su nota es equivalente a un sobresaliente");
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variables.
        
        int nota;
        boolean correcto;
        //Inicio escáner.
        Scanner entrada = new Scanner (System.in);
        //Bucle para controlar el valor correcto.
        do {
            System.out.println("Introduzca su nota");
            nota = entrada.nextInt();
            
            if (nota>10){
                System.out.println("Error, el valor es superior a 10, intentelo de nuevo");
                entrada.nextInt();
                correcto=false;
            }else if  (nota<0){
                System.out.println("Error, el valor es inferior a 0, intentelo de nuevo");
                entrada.nextInt();
                correcto=false;
            }else {
                System.out.println ("El valor introducido es correcto");
                correcto = true;
                }
                
            
        }while (correcto==false);
        //Invoco al método.
        calificacion (nota);
    }
    
}
