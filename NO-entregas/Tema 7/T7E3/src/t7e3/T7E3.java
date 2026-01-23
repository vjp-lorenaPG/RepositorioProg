/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 03.- Escribir un programa en JAVA que contenga un método que
 * rellena un array unidimensional (vector) de enteros aleatorios entre el 1 y
 * el 6, y luego, otro método, lo muestre por pantalla. 
 * • El programa también tendrá un método donde el usuario elegirá la longitud del array entre 1 y 10.
 * Este método también controla que el usuario nos introduzca un número entero y
 * no una letra (mediante excepciones). En caso de que el usuario introduzca el
 * dato incorrecto se lo volveremos a pedir las veces que hagan falta.
 *
 * @author galin
 */
public class T7E3 {
    
    public static int pedirNum (){//Método para pedir un número que será el tamaño del vector.
        int num=0;
        boolean correcto=false; //Boolean para salir del bucle.
        boolean capturado=false;/*Boolean para comprobar si ha habído error o no y continuar
        con la revisión del valor aportado.*/
        Scanner entrada = new Scanner (System.in);
        
        do{//Bucle para pedir el número hasta que sea correcto según el enunciado.
            capturado=false;
            System.out.println("Introduzca un numero entre 1 y 10");
            try{//Capturar errores.
                num=entrada.nextInt();
            }catch (InputMismatchException e){
                System.out.println("El caracter que ha introducido no es un numero, vuelva a intentarlo");
                entrada.next();
                
                capturado=true;
            }
            if (!capturado){//Si no ha habido error revisa el valor del usuario para que sea correcto.
                if (num>10||num<1){
                    System.out.println("El numero introducido no se encuentra entre 1 y 10, vuelva a intentarlo");
                }else{
                    correcto=true;//Boolean para salir del bucle.
                }
            }
        }while (!correcto);//Condicion para repetir el bucle.
    
        return num;//Devuelve el numero.
    }
    
    public static void mostrar (int[] vector){//Método para mostrar los valores del vector.
        for(int i=0; i < vector.length; i++){//Bucle para mostrar cada valor.
            System.out.println("El valor de la posicion " + i + " del vector es " + vector[i] );
            
        }
    }
    
    public static void generaraleatorios (int[] vector){//Método para generar aleatorios
        int aleatorio;
        int max =6;
        int min=1;
        System.out.println("* -- --------------- -- *");
        System.out.println("Generando numeros aleatorios");
        System.out.println("* -- --------------- -- *");
        for (int i=0; i<vector.length; i++){//Bucle para generar aleatorios y almacenarlos en el vector.
            aleatorio= (int)(Math.random()*(max-min +1))+ min;
            vector[i]=aleatorio;
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] vector = new int [pedirNum()];
        generaraleatorios(vector);
        mostrar(vector);
    }
    
}
