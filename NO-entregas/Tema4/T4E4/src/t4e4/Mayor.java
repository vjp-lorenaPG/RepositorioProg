/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e4;

/**
 *
 * @author alumno
 */
public class Mayor {
        public static void mayorMenor (int aux, int num1, int num2, int num3){
        //Burbuja para cambiar valores con variable auxiliar.
       if (num1>num2){
        aux=num1;
        num1=num2;
        num2=aux;
       } 
       if (num2>num3){
        aux=num2;
        num2=num3;
        num3=aux;
       } 
       if (num1>num2){
        aux=num1;
        num1=num2;
        num2=aux;
       } 
       if (num2>num3){
        aux=num2;
        num2=num3;
        num3=aux;
       }
       //imprimo.
       System.out.println ("El numero menor es " + num1);
    
    
    }
}
