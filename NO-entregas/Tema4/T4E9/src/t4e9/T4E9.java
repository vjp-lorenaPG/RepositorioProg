/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e9;

/**
 *
 * @author alumno
 */
public class T4E9 {

    /**Ejercicio 09.- Escribir un algoritmo en JAVA que pida tres números
     * (utiliza un método) y se los pase a otro método que los imprima por
     * pantalla el menor de ellos. ESTOS MÉTODOS ESTARÁN EN UNA CLASE DISTINTA
     * DEL MISMO PAQUETE.

     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, num3; //Declaro variables.
        
        System.out.println("Le voy a pedir tres numeros para saber el menor");
        num1 = Peticion.dato();
        num2 = Peticion.dato();
        num3 = Peticion.dato();
        Calcular.menor(num1, num2, num3);
        Imprimir.numMenor(num1);
        
    }
    
}
