/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Scanner;

/**
 *
 * @author galin
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int precioModelo, cantidad, total;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Por favor, introduzca el precio del modelo de ordenador que desea comprar");
        precioModelo = entrada.nextInt();
        
        Scanner entrada2 = new Scanner (System.in);
        System.out.println("¿Cuantas unidades quiere llevarse?");
        cantidad= entrada2.nextInt();
        total=precioModelo*cantidad;
        System.out.println("El precio total de su compra es de " + total);
                
    }
    
}
