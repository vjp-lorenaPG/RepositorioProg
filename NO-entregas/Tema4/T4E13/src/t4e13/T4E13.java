/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e13;

import java.util.Scanner;

/**Realiza un algoritmo que imprima todos los números existentes entre el número
 * 1 y otro introducido por el usuario.
 * •  Controla que el usuario te meta un número mayor que 1 y, sino, avísale del error y 
 * vuélveselo a pedir las veces que hagan falta. (hasta que introduzca un número mayor que 1)
 *  • Crea un método para pedir el número al usuario, otro de tipo booleano para comprobar
 * que el número es mayor que 1 y otro para mostrar el resultado
 *
 * @author alumno
 */
public class T4E13 {

    public static int pedirNum (){
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        num = entrada.nextInt ();
        
        return (num);
    }
    public static void contar (int num){
        
        for (int i=0; i<num; i++){
            System.out.print(i + " ");
        }    
    }
    public static boolean comprobar (int num){
        boolean mayor;
        if (num<0){
            mayor = false;
            System.out.println("Error, el numero es menor que cero");
        }else{
            mayor=true;
            System.out.println("El numero es correcto");
        }
        return (mayor);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num =0;
        boolean valido;
        //Declaro variables.
        
        do {//Bucle para pedir numero y comprobar si es correcto.
            num= pedirNum();//Metodo para pedir numero.
            valido =comprobar(num);//Metodo para comprobar si es correcto.
            
        }while (!valido);//Condición para salir.
        contar(num);//Invoco al metodo para contar.
    }
    
}
