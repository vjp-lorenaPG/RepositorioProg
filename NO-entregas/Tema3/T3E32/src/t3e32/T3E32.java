/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e32;

import java.util.Scanner;

/**
 *Ejercicio 32.- Realiza un programa que calcule la edad de una persona,
 * solicitando la fecha actual y la fecha de su nacimiento.
 * @author Lorena
 */
public class T3E32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int anioAc, mesAc, diaAc;//Variables de fecha actual.
        int anioNac, mesNac, diaNac;//Variables de nacimiento.
        int anio, meses, dias;//Variables para imprimir.
        
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Vamos a calcular su edad, introduzca los siguientes valores:");
        //Año actual
        System.out.println ("Introduzca el anio actual");
        anioAc = entrada.nextInt();
        //Mes actual
        System.out.println ("Introduzca el mes actual");
        mesAc = entrada.nextInt();
        //Día actual
        System.out.println ("Introduzca el dia actual");
        diaAc = entrada.nextInt();
        
        //Año de nacimiento
        System.out.println ("Introduzca el anio de nacimiento");
        anioNac = entrada.nextInt();
        //Mes de nacimiento
        System.out.println ("Introduzca el mes de nacimiento");
        mesNac = entrada.nextInt();
        //Día de nacimiento
        System.out.println ("Introduzca el dia de nacimiento");
        diaNac = entrada.nextInt();
        
        anio = anioAc - anioNac;//Calculo años.
        
        if (mesAc>=mesNac){//Calculo meses
            meses = mesAc - mesNac;
        }else {
            meses = mesAc;
        }
        
        if (diaAc>=diaNac){//Calculo dias.
            dias = diaAc - diaNac;
        }else {
            dias = diaAc;
        }
        
        System.out.println("Su edad es " + anio + " anios " + meses + " meses " + 
                dias + " dias ");
        //Imprimo.
    }
    
}
