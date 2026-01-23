/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e8;

import java.util.Scanner;

/**
 *Ejercicio 08.- Realizar un programa en JAVA que le pida al usuario un número
 * entero de 5 cifras y que le devuelva el mismo número escrito al revés. 
 * • Para ello necesitarás un método que le pida el número al usuario, otro método
 * dividirá el número en cifras y que las vaya metiendo en un array. Por último,
 * otro método visualizará el array.
 *
 * @author Lorena
 */
public class T7E8 {
    
    public static int pedirNumero(){//Método para pedir la cifra de cinco dígitos.
        int cifras=0;
        int contador=0;
        int num;
        boolean correcto=false;//Boolean para salir del bucle.
        Scanner entrada = new Scanner(System.in);
        do {//Bucle para pedir la cifra hasta que cumpla con los cinco digitos.       
            System.out.println("Introduzca un numero entero de CINCO digitos.");
            num= entrada.nextInt();
            while (num>0) {//Bucle para comprobar la longitud del número.
                num=num/10;
                contador++;
            }
            if(contador<5){//Condifiones para cominucar fallos o no.
                System.out.println("Ha introduciodo menos caracteres de los indicados, vuelva a intentarlo");
            }else if (contador>5){
                System.out.println("Ha introducido mas caracteres de los indicados, vuelva a intentarlo.");
            }else{
                System.out.println("El numero cumple con la longitud.");
                correcto=true;
            }
        } while (!correcto);//Condición para la salida del bucle.
       
        return num;
    }
    
    public static void rellenarVector (int num, int[] vector){//Método para rellenar el vector con los dígitos.
        
        int aux;
        for(int i= 0; i<vector.length ; i++){//Bucle para separar las cifras y guardarlas
           vector[i]=num%10;
           num=num/10;
       }
    }
    
    public static void mostrar (int [] vector){//Método para mostrar el valos de las posiciones del vector.
        System.out.println("El numero al reves seria...");
        for(int i=0; i<vector.length ; i++)
            System.out.print( vector[i]);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[5];//Declaro el vector.
        
        int num= pedirNumero();//Pido la cifra y la guardo.
        rellenarVector(num, vector);//Relleno el vector con los digitos.
        mostrar(vector);
        
    }
    
}
