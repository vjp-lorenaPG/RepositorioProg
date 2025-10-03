/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio32;

import java.util.Scanner;

/**Ejercicio 32
 * Pedir al usuario una cantidad en euros e imprimir las cantidades de billetes de
 * 50, 20, 10, 5 y las monedas correspondientes
 *
 * @author Lorena
 */
public class Ejercicio32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int billete50, billete20, billete10, billete5, moneda1, moneda2, total, resto;
        //Declaro l,as variables que voy a usar
               
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor indique una cantidad de dinero");
        total = entrada.nextInt();
        
        resto= total;
        
        billete50 = total / 50;
        resto = resto % 50;//Calculo billetes 50 y modifico resto
        
        billete20 = resto / 20;
        resto = resto % 20;//Calculo billetes 20 y modifico resto
        
        billete10 = resto / 10;
        resto = resto % 10;//Calculo billetes 10 y modifico resto
        
        billete5 = resto / 5;
        resto = resto % 10;//Calculo billetes 5 y modifico resto
        
        moneda2 = resto / 2;
        resto = resto % 2;//Calculo monedas de 2 euros y modifico resto
        
        moneda1 = resto;//Calculo moneda de un euro con el resto
        
        System.out.println(total + " Euros se descomponen en " + billete50 + " billetes de 50, "+ 
                billete20 + " billetes de 20, " + billete10 + " billetes de  10, " + billete5 + " billetes de 5, "
                + moneda2 + " monedas de 2 euros, " + moneda1 + " y monedas de 1 euro");
        
        
    }
    
}
