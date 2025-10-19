/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e27;


import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Diseña un programa en JAVA que pida al usuario dos números por teclado.
 * Posteriormente el programa mostrará un menú que le permitirá al usuario: •
 * 1.- Sumar los números. • 2.- Restar los números. • 3.- Multiplicar los
 * números. • 4.- Dividir los números. • 5.- Salir del programa.
 * @author Lorena
 */
public class T3E27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1 = 0, num2 = 0, operacion = 0, resultado=0;
        boolean datos;
        //Declaro las variables
        Scanner entrada = new Scanner (System.in);
        
        do {//Bucle para la entrada de números con los que operar.
            System.out.println ("Inserte dos numeros para realizar operaciones");
            try{//Control de errores en la introducción de caracteres incorrectos.
                num1 = entrada.nextInt();
                num2 = entrada.nextInt();
                datos = true;//Con true saldría del bucle.
            }catch (InputMismatchException e){
                num1= 0;
                num2 = 0 ;
                entrada = new Scanner(System.in);//Limpio la entrada para evitar bucle infinito.
                datos = false;//Repetición del bucle.
                System.out.println ("Ha introducido un valor erroneo, introduzca un numero entero");
            }
        }while (datos==false);//Condición del bucle.
        
        do {//Bucle para operar con los números.
            System.out.println ("Para sumar pulse 1" + "\n"
            + ("Para restar pulse 2 ") + "\n"
            + ("Para multiplicar pulse 3 ") + "\n"
            +("Para dividir pulse 4") + "\n"
            + ("Para salir del programa pulse 5") + "\n"
            + ("Para cambiar los numeros pulse 6"));
            try{//Control de errores en la introducción del menú.
                operacion = entrada.nextInt();
            }catch (InputMismatchException e){
                operacion = 0;//Con el valor 0 salta a default.
                entrada = new Scanner (System.in);//Reinicio la entrada para evitar bucle.
            }switch (operacion){
                case 1:{//Suma.
                    resultado= num1 + num2;
                    System.out.println("El resultado de la suma es " + resultado);
                    break;
                }case 2:{//Resta.
                    resultado=num1-num2;
                    System.out.println("El resultado de la resta es " + resultado);
                    break;
                }case 3:{//Multiplicación.
                    resultado=num1*num2;
                    System.out.println ("El resultado de la multiplicacion es " + resultado);
                    break;
                }case 4:{//División.
                    try{//Control del valor num2 en el caso de que sea cero.
                        resultado=num1/num2;
                        System.out.println("El resultado de la division es " + resultado);
                    }catch (ArithmeticException e){
                        resultado=0;
                        System.out.println ("Error, ha intentado dividir por cero");
                    }break;
                }case 5: {
                    System.out.println ("Saliendo del programa...");//Mensaje de salida.
                    break;
                }case 6:{//Cambio de números.
                    System.out.println("Ha elegido cambiar de numeros, introduzcalos a continuacion");
                    try {//Control de la nueva entrada de números.
                    num1 = entrada.nextInt();
                    num2 = entrada.nextInt();
                    }catch (InputMismatchException e) {
                        num1=0;
                        num2=0;
                        System.out.println ("Se ha producido un error, no se han cambiado los numeros");
                        entrada = new Scanner (System.in);
                    }
                break;
                }default: {//Resto de números que no tengan nada asignado, incluso cuando pasa por el catch de asignación de operación.
                    System.out.println("Te has equivocado de valor, vuelve a intentarlo");
                }
            } 
        }while (operacion!=5);//Bucle en repetición hasta que el usuario elija salir.
    }    
}
    

