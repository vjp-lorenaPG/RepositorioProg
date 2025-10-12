/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e16;

/**
 * Crea un programa que imprima los números impares que existen entre los
 * números 20 y el 160. Además, al final, nos dirá cuantos impares ha imprimido
 * en total por pantalla.
 * @author Lorena
 */
public class T3E16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num, vueltas;
        vueltas = 0;
        num = 21;
        //Declaro las variables que usaré después
        
        System.out.print("Los numeros impares existentes entre el numero 20 y el 160 son: " );
        //Imprimo el primer mensaje
        
        do {
            System.out.print( num + "-");
            num+=2;//Sumo dos y modifico la variable para que sean impares.
            vueltas++;//Registro las veces que se imprime un número.
            } while (num < 160);//Se repite mientras que "num" sea menor a 160.
        System.out.println("\n La cantidad de numeros impares impresos han sido: " + vueltas);
        }//Imprimo la cantidad de números que sea han impreso.
    }
    

