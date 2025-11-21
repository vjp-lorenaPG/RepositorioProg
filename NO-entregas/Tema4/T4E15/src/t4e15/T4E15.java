/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 15.- Diseña un programa en JAVA que pida al usuario dos números por
 * teclado. Posteriormente el programa mostrará un menú que le permitirá al
 * usuario:
 * • Nota 1:
 * Mientras el usuario no pulse 5, el programa no termina y el menú volverá a
 * aparecer pidiendo nuevamente que le introduzcas una opción.
 * • Nota 2:
 * Controla el caso de división entre 0 mediante la captura de excepciones. •
 * Nota 3: Utiliza todos los subprogramas que se te ocurran
 *
 * @author Lorena
 */
public class T4E15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 0, num2 = 0, operacion = 0;
        boolean valido;
        //Declaro las variables
        Scanner entrada = new Scanner (System.in);
        
        do {//Bucle para pedir número y comprobar valor.
            num1 = EntradaUsuario.pedirNum();
            valido =Operaciones.comprobar(num1);
        } while (!valido);
        
        do {//Bucle para pedir número y comprobar valor.
            num2 = EntradaUsuario.pedirNum();
            valido =Operaciones.comprobar(num2);   
        } while (!valido);
        
        
        do {//Bucle para operar con los números.
            operacion=EntradaUsuario.menu();//Invoco al método para usar el menú.
            switch (operacion){
                case 1:{//Suma.
                    Operaciones.sumar (num1, num2);
                    break;
                }case 2:{//Resta.
                    Operaciones.restar (num1, num2);
                    break;
                }case 3:{//Multiplicación.
                    Operaciones.multiplicar(num1,num2);
                    break;
                }case 4:{//División.
                    Operaciones.division(num1, num2);
                    break;
                }case 5: {//Salida
                    System.out.println ("Saliendo del programa...");//Mensaje de salida.
                    break;
                }case 6:{//Cambio de números.
                    System.out.println("Ha elegido cambiar de numeros, introduzcalos a continuacion");
                    do {
                        num1 = EntradaUsuario.pedirNum();
                        valido = Operaciones.comprobar(num1);
                    } while (!valido);

                    do {
                        num2 = EntradaUsuario.pedirNum();
                        valido = Operaciones.comprobar(num2);
                    } while (!valido);

                    System.out.println("Se han cambiado los números correctamente.");
                    break;
                }default: {//Resto de números que no tengan nada asignado, incluso cuando pasa por el catch de asignación de operación.
                    System.out.println("Te has equivocado de valor, vuelve a intentarlo");
                }
            } 
        }while (operacion!=5);//Bucle en repetición hasta que el usuario elija salir.
        
        
        
        
    }
    
}
