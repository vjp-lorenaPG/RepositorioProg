/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e17;

import java.util.Scanner;

/**
 *
 * @author galin
 */
public class JuegoAdivinar {
    public static char pedirLetra(){//Método para pedir letra.
        int contador =0;
        char letraUsua;
        Scanner entrada = new Scanner (System.in);
        //Declaro variables e inicio Scanner.
        
        System.out.println("Introduzca una letra en minuscula");
        letraUsua= entrada.nextLine().toLowerCase().charAt(0);
        /*Guardo el valor, lo convierto a minúsculas y lo transformo a char porque "nextLine" 
        devuelve un String y es más fácil comparar valores en char con los símbolos ">", "<" */
           
    return (letraUsua);//Devuelvo valor.
    }
    public static void ComprobarMayorMenor (char letraUsua, char letra){//Método para comprobar.
        
        if(letraUsua<letra){//Condición para informar.
            System.out.println("La letra es mayor");//Mayor.
        }else if(letraUsua>letra){
            System.out.println("La letra es menor");//Menor.
        }else {
            System.out.println("Correcto, has acertado");//Por defecto correcto.
        }
     
    }
}
