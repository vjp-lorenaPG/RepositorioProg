/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e11;

import java.util.Scanner;

/**Ejercicio 11.- Realiza un programa en JAVA, ORIENTADO A OBJETOS, en el que le
 * solicites al usuario 2 números y, si el primer número introducido es mayor
 * que 10, se multipliquen, y en caso contrario que se sumen. Se le mostrará al
 * usuario la operación realizada y su resultado. • Necesitarás una clase
 * “Numero” (con un único atributo llamado “valor”), y una clase Test. En esta
 * última crea dos objetos con el constructor por defecto. Luego, le pides al
 * usuario los valores y se los asignas a los objetos. • En la clase Test
 * también habrá un método para sumar, otro para multiplicar y otro para pedir
 * los valores al usuario.
 *
 * @author galin
 */
public class T5E11 {
    public static void sumar(double num1, double num2){
    
        double resultado = num1+ num2;
        System.out.println("Se ha realizado una suma \n"
        + "El resultado es: " + resultado);
    }
    
    public static void multiplicar(double num1, double num2){
    
        double resultado = num1* num2;
        System.out.println("Se ha realizado una multiplicacion \n"
        + "El resultado es: " + resultado);
    }
    
    
    public static double pedirNumero (){
        double num=0;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduce un número");
        num=entrada.nextDouble();
        return num;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorNum1;
        double valorNum2;
        Numero n1= new Numero();
        Numero n2= new Numero();
        n1.setValor(pedirNumero());
        n2.setValor(pedirNumero());
        valorNum1= n1.getValor();
        valorNum2= n2.getValor();
        if(valorNum1>10){
            multiplicar(valorNum1,valorNum2);
        }else {
            sumar(valorNum1, valorNum2);
        }
       
    }
    
}
