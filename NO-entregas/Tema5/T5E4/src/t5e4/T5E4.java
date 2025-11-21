/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e4;


/**
 *
 * @author galin
 */
public class T5E4 {

    /**
     * @param args the command line arguments
     */
     public static void main(String[] args) {
        // TODO code application logic here
        Pajarito p1 = new Pajarito();
        Pajarito p2 = new Pajarito();

        p1.establecerColorYEdad("rojo", 1);
        p2.establecerColorYEdad("azul", 2);

         System.out.println("El numero de objetos creados es: "+Pajarito.muestraPajaros());
    }
    
}
