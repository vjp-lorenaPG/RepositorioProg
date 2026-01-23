/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e9;

import java.util.Scanner;

/**
 *Ejercicio 09.- Realizar un programa en JAVA que le pida al usuario un número
 * entero y que le devuelva el mismo número escrito al revés. 
 * • Para ello necesitarás un método que le pida el número al usuario, otro método calculará
 * cuantas cifras tiene el número, otro método dividirá el número en cifras y
 * las irá metiendo en un array. Por último, otro método visualizará el array al
 * revés. 
 *
 * @author alumno
 */
public class T7E9 {
    
    public static int pedirNumero(){//Pedir numero al usuario.
        int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un numero entero.");
        num = entrada.nextInt();
        return num;//Devuelvo.
    }
    
    public static int calcularCifras (int num){//Método para calcular las cifras.
        int cifras=0;
        int contador=0;
        while (num>0) {//Bucle para calcular las cifras.
            num=num/10;
            contador++;
        }
        return cifras;
    }
    
    public static void rellenarVector (int num, int [] vector){//Método para guardar las cifras en el vector.
    
        for(int i=0; i<vector.length; i++){
            vector[i]=num%10;
            num=num/10;
        }
    }
    
    public static void mostrarAlReves (int [] vector){//Método para mostrar.
        
        for(int i=0; i<=vector.length; i--){//Bucle para imprimir.
            System.out.print(vector[i]);
            
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num= pedirNumero();//Pido el número.
        int [] vector = new int [calcularCifras(num)];//Declaro el vector con el tamaño calculado.
        rellenarVector(num, vector);//Guardo las cifras en el vector.
        mostrarAlReves(vector);//Muestro los valores de las posiciones inversamente.
    }
    
}
