/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e2;

/**Ejercicio 02.- Realiza un programa en el que le solicites en el main al
 * usuario 2 números y, si el primer número introducido es mayor que 10, se
 * llamará a un método que los multiplicará y mostrará el resultado, y en caso
 * contrario se llamará a un método que los sume. ESTOS DOS MÉTODOS ESTARÁN EN
 * UNA CLASE DISTINTA EN EL MISMO PAQUETE. Muestra al usuario la operación
 * realizada y el resultado.
 *
 * @author Lorena
 */
public class SumaOProducto {
    
    public static void suma (int num1, int  num2){
        //Declaro resultado
        int resultado;
        resultado = num1 + num2;//Operación.
        System.out.println("La operacion que sea ha realizado es suma y "
                + "el resultado es " + resultado);//Imprimo
    }
    public static void producto (int num1, int num2){
        //Declaro
        int resultado;
        resultado = num1 * num2;//Operación.
        System.out.println("La operacion que sea ha realizado es producto y "
                + "el resultado es " + resultado);//Imprimo.
    }
    
    
}
