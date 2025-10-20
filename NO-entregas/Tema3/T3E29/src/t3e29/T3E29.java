/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e29;

import java.util.Scanner;

/**
 *Ejercicio 29.- Escribe un programa que juegue con el usuario a adivinar un
 * número. El ordenador debe generar un número entero aleatorio entre 1 y 100, y
 * el usuario tiene que intentar adivinarlo
 * @author galin
 */
public class T3E29 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numUsu, vueltas=0;
        int aleatorio = (int)Math.floor(Math.random ()*100 +1);
        //Declaro variables y aplico el numero aleatorio.
        
        System.out.println ("Vamos a jugar a un juego, adivina el numero del 1 al 100" + "\n"
        + ("te dire si es mayor o menor"));
        //Explico el juego.
        Scanner entrada = new Scanner (System.in);
        
        do {//Bucle del juego
            System.out.println("Escribe un numero");
            numUsu = entrada.nextInt ();
            //Almaceno el número.
            if (numUsu<aleatorio){//Mayor
                System.out.println ("El numero es mayor");
                vueltas++;
            }else if (numUsu>aleatorio){//Menor.
                System.out.println ("El numero es menor");
                vueltas++;
            }else //Correcto.
                System.out.println ("¡Felicidades, acertaste!");
                vueltas++;
        }while (numUsu!=aleatorio);//Condición del bucle.
        
        System.out.println ("Tus intentos han sido " + vueltas);
        //Imprimo la cantidad de intentos del usuario.
    }
    
}
