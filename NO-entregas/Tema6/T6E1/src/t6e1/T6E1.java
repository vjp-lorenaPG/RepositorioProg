/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6e1;

/**Ejercicio 1. – Realiza un programa en JAVA, orientado a objetos, en el que
 * crees una clase llamada Calculadora que contenga un atributo numero y el
 * método abstracto realizarOperacion.
 *
 * @author galin
 */
public class T6E1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    Suma s1 = new Suma (147.0,10.0);
    Multiplicacion m1 = new Multiplicacion (147.0,10.0);
    Potencia p1 = new Potencia (147.0, 10.0);
    
    s1.realizarOperacion();
    m1.realizarOperacion();
    p1.realizarOperacion();
    
    Calculadora c1 = new Suma (147.0,10.0);
    Calculadora c2 = new Multiplicacion (147.0,10.0);
    Calculadora c3 = new Potencia (147.0,10.0);
    
    c1.realizarOperacion();
    c2.realizarOperacion();
    c3.realizarOperacion();
    }
    
}
