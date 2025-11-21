/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Mayor;

/**
 *
 * @author Lorena
 */
public class MayorMenor {
    
    public static void mayor (int aux, int num1, int num2, int num3){
        //Burbuja para cambiar valores.
       if (num1<num2){
        aux=num1;
        num1=num2;
        num2=aux;
       } 
       if (num2<num3){
        aux=num2;
        num2=num3;
        num3=aux;
       } 
       if (num1<num2){
        aux=num1;
        num1=num2;
        num2=aux;
       } 
       if (num2<num3){
        aux=num2;
        num2=num3;
        num3=aux;
       }
       
       System.out.println ("El numero mas grande es " + num1);//Imprimo.
    
    
    }
    
}
