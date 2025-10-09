/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e7;

import java.util.Scanner;

/**
 *Realiza un programa en JAVA en el que tenga
 *cabida, sin modificar, el trozo de código de la imágen.
 * @author Lorena
 */
public class T3E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int diasemana;
        boolean laborable;
        boolean valido=true;//Para controlar si el numero es correcto
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero del uno al 7");
        diasemana = entrada.nextInt();
        
        switch (diasemana) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                laborable=true;
                break;
            case 6:
            case 7:
                laborable=false;
            default:
                System.out.println("El numero introducido no es correcto");
                    valido = false; // Declaro que el número no es válido
                    laborable = false; // Para evitar errores de variable sin valor
                break;
            }
        if (valido){
            if (laborable == true){
                    System.out.println ("El dia es laborable");
                }
                if (laborable == false){
                System.out.println("El dia es no laborable");
                }
            }
        }
    }
    

