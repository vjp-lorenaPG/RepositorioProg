/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e12;
import java.util.Scanner;
/**Ejercicio 12.- Escribe un programa en JAVA orientado a objetos, en el que se
 * le pida al usuario que introduzca la longitud de los catetos de un triángulo
 * rectángulo y que posteriormente el programa calcule la longitud de la
 * hipotenusa. • Para ello necesitarás una clase Triangulo con 2 atributos:
 * cateto1, cateto2. • En una clase Test crearás un objeto de la clase Triangulo
 * donde el tamaño de los catetos se los pedirás al usuario para pasárselos al
 * constructor. En esta clase también tendrás un método que calcule la
 * hipotenusa y otro método se encargará de mostrar los resultados por la
 * pantalla.
 *
 * @author galin
 */
public class T5E12 {
    public static double pedirNumero (){
        double num;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Introduzca un numero");
        num=entrada.nextDouble();
        return num;
    }
        public static double calcularHipotenusa (double c1, double c2){
        double resultado;
        double valorC1=Math.pow(c1, 2);
        double valorC2=Math.pow(c2, 2);
        
        resultado=valorC1+valorC2;
        resultado=Math.sqrt(resultado);
        return resultado;
    }
    public static void mostrarHipotenusa (double valorH){
    
        System.out.println("El valor de la hipotenusa es: " + valorH);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double valorC1, valorC2;
        double valorHipotenusa;
        valorC1=pedirNumero();
        valorC2=pedirNumero();
        Triangulo t1=new Triangulo(valorC1, valorC2);
        valorHipotenusa=calcularHipotenusa(valorC1, valorC2);
        mostrarHipotenusa(valorHipotenusa);
    }
    
    
}
