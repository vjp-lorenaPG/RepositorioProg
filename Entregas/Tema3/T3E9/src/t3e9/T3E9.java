/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e9;

import java.util.Scanner;

/**
 *Escribe un programa en JAVA en el que el usuario introduzca cuatro números enteros y luego el programa los muestre
 *por pantalla ordenados de manera ascendente.
 * @author galin
 */
public class T3E9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num1, num2, num3, num4, aux;//Declaro las variables
        
        //Pido los números al ususario y los guardo en sus variables
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Por favor, introduzca el primer numero");
        num1 = entrada.nextInt();
        
        System.out.println ("Por favor, introduzca el segundo numero");
        num2 = entrada.nextInt();
        
        System.out.println ("Por favor, introduzca el tercer numero");
        num3 = entrada.nextInt();
        
        System.out.println ("Por favor, introduzca el cuarto numero");
        num4 = entrada.nextInt();
        
        
        /*Primera pasada de intercambio de valores con el método burbuja y el
        vaso de agua*/
        if (num1>num2){//Aplico la condición de si el num1 es mayor que num2
            aux=num1;//Guardo el valor del num1
            num1=num2;//Paso el valor del num2 al num1
            num2=aux;}//Traslado el valor guardado en aux a la variable num2
        
        if (num2>num3){ //Aplico la condición de si el num2 es mayor que num3
            aux=num2;//Guardo el valor del num2
            num2=num3;//Paso el valor del num3 al num2
            num3=aux;}//Traslado el valor guardado en aux a la variable num3
        
        if (num3>num4){//Aplico la condición de si el num3 es mayor que num4
            aux=num3;//Guardo el valor del num3
            num3=num4;//Paso el valor del num4 al num3
            num4=aux;}//Traslado el valor guardado en aux a la variable num4
        
        //Segunda pasada de las tres.
        if (num1>num2){//Aplico la condición de si el num1 es mayor que num2
            aux=num1;//Guardo el valor del num1
            num1=num2;//Paso el valor del num2 al num1
            num2=aux;}//Traslado el valor guardado en aux a la variable num2
        
        if (num2>num3){ //Aplico la condición de si el num2 es mayor que num3
            aux=num2;//Guardo el valor del num2
            num2=num3;//Paso el valor del num3 al num2
            num3=aux;}//Traslado el valor guardado en aux a la variable num3
        
        if (num3>num4){//Aplico la condición de si el num3 es mayor que num4
            aux=num3;//Guardo el valor del num3
            num3=num4;//Paso el valor del num4 al num3
            num4=aux;}//Traslado el valor guardado en aux a la variable num4
        
        //Tercera y última pasada.
        if (num1>num2){//Aplico la condición de si el num1 es mayor que num2
            aux=num1;//Guardo el valor del num1
            num1=num2;//Paso el valor del num2 al num1
            num2=aux;}//Traslado el valor guardado en aux a la variable num2
        
        if (num2>num3){ //Aplico la condición de si el num2 es mayor que num3
            aux=num2;//Guardo el valor del num2
            num2=num3;//Paso el valor del num3 al num2
            num3=aux;}//Traslado el valor guardado en aux a la variable num3
        
        if (num3>num4){//Aplico la condición de si el num3 es mayor que num4
            aux=num3;//Guardo el valor del num3
            num3=num4;//Paso el valor del num4 al num3
            num4=aux;}//Traslado el valor guardado en aux a la variable num4
         
        System.out.println ("El orden de los numeros introducidos es " + num1 + 
                num2 + num3 + num4);
    }
    
}
