/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e8;

import java.util.Scanner;

/**Ejercicio 08.- Realiza un programa en JAVA, orientado a objetos, en el que
 * crees una clase llamada Numero que contendrá un único atributo privado,
 * llamado valor, de tipo entero. • Para probar el funcionamiento de la clase
 * Numero, crea una nueva clase llamada Test donde le pidas al usuario un número
 * por teclado. Luego, crea un objeto, siendo el número introducido por el
 * usuario el valor del atributo valor. Posteriormente, le pasarás el objeto a
 * un método que le dirá al usuario si el número introducido es par o impar.
 *
 * @author alumno
 */
public class T5E8 {
    //Método para pedir valor.
    public static int pedirValor(){
        int numUsu;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca el valor del numero");
        numUsu =entrada.nextInt();
        return numUsu;
    }
    //Método para comprobar si el númeor es par o impar.
    public static void comprobarParImpar(int numUsuario){
    
        if (numUsuario%2==0){
            System.out.println("El numero con valor " + numUsuario + " es par");
        }else {
            System.out.println("El numero con valor " + numUsuario + " es impar");
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo un nuevo objeto de tipo Numero
        Numero n = new Numero();
        //Invoco al método para pedir valor y guardándolo en el atributo del número.
        n.setValor(pedirValor());
        //Invoco al método para comprobar si el valor del número del usuario es par o impar.
        comprobarParImpar(n.getValor());
        
        
        
        
        
        
        
        
    }
    
}
