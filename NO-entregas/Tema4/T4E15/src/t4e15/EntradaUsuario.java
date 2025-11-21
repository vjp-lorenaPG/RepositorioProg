/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class EntradaUsuario {
    
    private static Scanner entrada = new Scanner(System.in);/**Genero una única entrada 
     * para no generar escaners nuevos cada vez que pido números para operar y trabajar con
     el menú.**/
    
    public static int pedirNum (){//Almacenar números del usuario.
        int num;
        boolean datos;
        do {//Bucle para la entrada de números con los que operar.
            
            System.out.println ("Inserte un numero");
            try{//Control de errores en la introducción de caracteres incorrectos.
                num = entrada.nextInt();
                datos = true;//Con true saldría del bucle.
            }catch (InputMismatchException e){
                num= 0;
                entrada.next();//Limpio la entrada para evitar bucle infinito.
                datos = false;//Repetición del bucle.
                System.out.println ("Ha introducido un valor erroneo, introduzca un numero entero");
            }
        }while (datos==false);//Condición del bucle.
        
    return(num);
    }
    public static int menu (){//Menú de la calculadora.
        int operacion;
        
        System.out.println ("Para sumar pulse 1" + "\n"
            + ("Para restar pulse 2") + "\n"
            + ("Para multiplicar pulse 3 ") + "\n"
            +("Para dividir pulse 4") + "\n"
            + ("Para salir del programa pulse 5") + "\n"
            + ("Para cambiar los numeros pulse 6"));
            try{//Control de errores en la introducción del menú.
                operacion = entrada.nextInt();
            }catch (InputMismatchException e){
                operacion = 0;//Con el valor 0 salta a default.
                entrada.next();//Reinicio la entrada para evitar bucle.
            }
    return (operacion);
    }
}
