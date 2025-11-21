/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e4;

/**
 *
 * @author galin
 */
public class Pajarito {


    static int numpajaros = 0;
    String color;
    int edad;

    static void nuevopajaro() {
        numpajaros++;
    }

    public void establecerColorYEdad(String col, int ed) {
        color = col;
        edad = ed;
        nuevopajaro();
    }

    static int muestraPajaros() {
        return (numpajaros);
    }

   
}
 

