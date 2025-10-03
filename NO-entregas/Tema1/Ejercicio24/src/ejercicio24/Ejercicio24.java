/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio24;

import java.util.Scanner;

/**
 *Ejercio 24
 * Pedir al usuario que introduzca numero de las notas y que calcule la media 
 * del curso
 *
 * @author Lorena
 */
public class Ejercicio24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Float programacion, lenguajeMarca, baseDatos, entorno,
        sistInfor, ingles, iPE, notaMedia;//Declaro las variables que usaré
        
        
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, introduzca la nota de Programación:");
        programacion = entrada.nextFloat();//Registro de primera entrada
        
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Introduzca la nota de Lenguajes de Marcas:");
        lenguajeMarca = entrada2.nextFloat();//Registro de segunda entrada
        
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Introduzca la nota de Base de Datos:");
        baseDatos = entrada3.nextFloat();//Registro de tercera entrada
        
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("Introduzca la nota de Entorno de Desarrollo:");
        entorno = entrada4.nextFloat();//Registro de cuarta entrada
        
        Scanner entrada5 = new Scanner(System.in);
        System.out.println("Introduzca la nota de Sistemas Informaticos:");
        sistInfor = entrada5.nextFloat();//Registro de quinta entrada
        
        Scanner entrada6 = new Scanner(System.in);
        System.out.println("Introduzca la nota de Ingles:");
        ingles = entrada6.nextFloat();//Registro de sexta entrada
        
        Scanner entrada7 = new Scanner(System.in);
        System.out.println("Por ultimo, introducca la nota de Itinerario Personal para la Empleabilidad:");
        iPE = entrada7.nextFloat();//Registro de septima entrada
        
        notaMedia= (iPE + ingles + sistInfor + entorno + baseDatos + lenguajeMarca + programacion)/7; 
        //Calculo de nota media
        System.out.println("Su nota media del curso es de: " + notaMedia);
    }
    
}
