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
public class Operaciones {
    public static boolean comprobar (int num){
        boolean mayor;//Declaro variable para controlar.
        if (num<0){//Condición para comprobar si el número el válido.
            mayor = false;
            System.out.println("Error, el numero es menor que cero");//Imprimo error y modifico variable.
        }else{
            mayor=true;
        }
        return (mayor);//Devuelvo boolean.
    }
    public static void sumar (int num1,int num2){//Sumar.
        int resultado;
        resultado= num1 + num2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    public static void restar (int num1, int num2){//Restar.
        int resultado;
        resultado=num1-num2;
        System.out.println("El resultado de la resta es " + resultado);
    
    }
    public static void multiplicar(int num1, int num2){//Multiplicar.
        int resultado;
        resultado=num1*num2;
        System.out.println ("El resultado de la multiplicacion es " + resultado);
    
    }
    public static void division(int num1, int num2){//Dividir.
        int resultado;
        try{//Control del valor num2 en el caso de que sea cero.
            resultado=num1/num2;
            System.out.println("El resultado de la division es " + resultado);
        }catch (ArithmeticException e){
            resultado=0;
            System.out.println ("Error, ha intentado dividir por cero");
        }
    
    }
}
