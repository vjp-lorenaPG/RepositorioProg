/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t12e14;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author galin
 */
public class T12E14 {

    
    static final String FICHERO="DatosBeca.txt";


    //Método para calcular la cuantía de la beca
    public static double calcularBeca(int edad,int suspensos,
                                      String residencia,double ingresos){

        double beca = 1500;
        if (suspensos >= 2) {
            beca=0;
        } else {
            if (ingresos <= 12000) {
                beca += 500;
            }
            if (edad < 23) {
                beca += 200;
            }
            if (suspensos == 0) {
                beca += 500;
            }
            if (suspensos == 1) {
                beca += 200;
            }
            if (residencia.equalsIgnoreCase("NO")) {
                beca += 1000;
            }

        }
        return beca;
    }
    //Método para leer fichero y mostrar becas
    public static void mostrarBecas() {

        String linea;
        String[] datos;

        String nombre;
        int edad;
        int suspensos;
        String residencia;
        double ingresos;
        double cantidad;

        try (BufferedReader br
                = new BufferedReader(new FileReader(FICHERO))) {

            while ((linea = br.readLine()) != null) {

                datos = linea.split(";");

                nombre = datos[0];
                edad = Integer.parseInt(datos[2]);
                suspensos = Integer.parseInt(datos[3]);
                residencia = datos[4];
                ingresos = Double.parseDouble(datos[5]);

                cantidad = calcularBeca(edad, suspensos, residencia, ingresos);

                if (cantidad > 0) {
                    System.out.println(nombre + " tiene una beca de "
                            + cantidad + " euros");
                }

            }

        } catch (IOException e) {
            System.out.println("Error al leer fichero.");
        }

    }




    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        mostrarBecas();
    }

}
