/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e30;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 30.- Mejora el ejercicio 29, de tal forma que si el usuario
 * introduce algo que no es un número (una letra, por ejemplo) se le avisará del
 * error por pantalla y se contará como un intento.
 *
 * @author galin
 */
public class T3E30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // TODO code application logic here
        int numUsu = 0, vueltas=0;
        int aleatorio = (int)Math.floor(Math.random ()*100 +1);
        boolean error = false;
        //Declaro variables y aplico el numero aleatorio.
        
        System.out.println ("Vamos a jugar a un juego, adivina el numero del 1 al 100" + "\n"
        + ("te dire si es mayor o menor"));
        //Explico el juego.
        Scanner entrada = new Scanner (System.in);
        
        do {//Bucle del juego
            error=false;
            System.out.println("Escribe un numero");
            try{
            numUsu = entrada.nextInt ();//Almaceno el número.
            }catch (InputMismatchException e){
                entrada.next ();
                System.out.println ("Error, ha introducido algo distinto a un numero");
                error = true;
            }
            if (error==false){
                if (numUsu<aleatorio){//Mayor
                    System.out.println ("El numero es mayor");

                }else if (numUsu>aleatorio){//Menor.
                    System.out.println ("El numero es menor");

                }else{ //Correcto.
                    System.out.println ("¡Felicidades, acertaste!");
                }
            }vueltas++;       
        }while (numUsu!=aleatorio);//Condición del bucle.
        
        System.out.println ("Tus intentos han sido " + vueltas);
        //Imprimo la cantidad de intentos del usuario.
    }
    
}
