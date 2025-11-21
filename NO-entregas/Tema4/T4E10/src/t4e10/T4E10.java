/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e10;

import java.util.Scanner;
import javax.xml.stream.util.EventReaderDelegate;

/**
 *Ejercicio 10.- Escribe un programa en JAVA que, utilizando bucles, imprima la
 * tabla de multiplicar de un número que elija el usuario. El número se pedirá
 * en un método y la tabla de multiplicar se escribirá en otro.
 * 
 * @author Lorena
 */
public class T4E10 {
    public static int pedirNum() {
        int num;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        num= entrada.nextInt();
        return (num);
    }
    
    public static void tablaMultiplicar (int num){
        int numTabla=1, resultado;
        
        for (int i = 0; i<10; i++){
            
            resultado=num*numTabla;
            System.out.println(num + " * " + numTabla + " = " + resultado);
            numTabla++;
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        
        System.out.println("Le pedire un numero para relizar su tabla de multiplicar");
        num =pedirNum();
        tablaMultiplicar (num);
        
        
    }
    
}
