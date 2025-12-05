/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6e7;

/**Ejercicio 7. – Desarrolla un programa en JAVA, orientado a objetos, en el que
 * crees una interfaz ControlRemoto con los siguientes métodos de tipo void:
 * apagar(), encender(), bajarVolumen(), subirVolumen() y cambiarCanal(float
 * canal).
 *
 * @author alumno
 */
public class T6E7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo objetos
        Televisor t1 = new Televisor ();
        Radio r1 = new Radio ();
        //Operar con Televisor
        t1.encender();
        t1.mostrar();
        for(int i = 0; i<3; i++){//Bucle para modificar el volumen
            t1.subirVolumen();
        }
        t1.cambiarCanal(10);
        t1.bajarVolumen();
        t1.apagar();
        t1.mostrar();
        
        //Operar con Radio
        r1.encender();
        r1.mostrar();
        for(int i = 0; i<3; i++){//Bucle para modificar el volumen
            r1.subirVolumen();
        }
        r1.cambiarCanal(110.10f);
        r1.bajarVolumen();
        r1.apagar();
        r1.mostrar();
        
    }
    
}
