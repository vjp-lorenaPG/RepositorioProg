/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e12;

import java.io.SequenceInputStream;

/**
 *Crea un algoritmo en JAVA que, utilizando un
 *bucle do…while, imprima los números pares que existen
 *entre el número 11 y el número 133
 * @author Lorena
 */
public class T3E12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 10;//Declaro la variable
        
        do {
            System.out.println(num);//Imprimo la variable "num".
            num++;//Sumo y modifico la variable "num" una unidad.
            num++;//Sumo y modifico la variable "num" una unidad.
            }while (num <133);//Declaro condición del bucle.
    }
    
}
