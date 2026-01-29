/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 01.- Realiza un programa en JAVA en el que le pidas al usuario las
 * notas de las 6 asignaturas del Ciclo de DAM y te calcule la nota media del
 * curso. 
 * • Cada una de las asignaturas serán un objeto que se encuentran en un
 * array de 6 posiciones, y cuyos atributos serán el nombre y la nota.
 * • Crea un constructor con el que asigne directamente el nombre de la asignatura y la
 * nota al crear el objeto. El nombre de la asignatura se lo asignaremos
 * nosotros, en cambio, el atributo nota, será el usuario quien la introduzca
 * mediante un método. • Crea otro método que reciba el array con las 6 notas y
 * devuelva la nota media (return)
 * 
 * Ejemplo:
 * Por favor, introduzca la nota de Programación: 6,5 Introduzca la nota de
 * Lenguajes de Marcas: 7,5 Introduzca la nota de Bases de Datos: 7,5 Introduzca
 * la nota de Entornos de Desarrollo: 8 Introduzca la nota de Sistemas
 * Informáticos: 6,5 Por último, introduzca la nota de Formación y Orientación
 * Laboral: 6 Su nota media del curso es de: 7
 *
 * @author alumno
 */
public class T8E1 {
    
    //Método para generar notas aleatorias y probar el programa
    public static double generarNotaAleatoria() {
        double min = 0;
        double max = 10;
        double nota;
        
        nota = (Math.random() * (max - min) + min);
        nota = Math.round(nota * 100.0) / 100.0;//Redondea los decimáles, sino aparecen mas de dos decimales..
        
        return nota;
    }
    //Rellenar con notas aleatorias probar el programa rápidamente.
    public static void rellenarConAleatorios(Notas[] vectorNotas, String[] asignaturas) {
        
        for (int i = 0; i < vectorNotas.length; i++) {
            vectorNotas[i] = new Notas(generarNotaAleatoria(), asignaturas[i]);
        }
    }
    //Relleno con notas desde la entrada de datos y asignaturas desde el array
    public static void rellenarNotas(Notas[] vectorNotas, String[] asignaturas) {
        
        for (int i = 0; i < vectorNotas.length; i++) {
            System.out.println("Introduzca la nota de " + asignaturas[i]);
            vectorNotas[i] = new Notas(pedirNota(), asignaturas[i]);
        }
    }
    //Método para pedir nota la usuario.
    public static double pedirNota() {
        
        double num = 0;
        boolean correcto = false;
        Scanner entrada = new Scanner(System.in);
        //Bucle para controlar errores.
        do {
            try {
                num = entrada.nextDouble();
                correcto = true;
                System.out.println("Nota correcta.");
            } catch (InputMismatchException e) {
                System.out.println("Ha introducido un caracter incorrecto.");
                entrada.next(); //Limpio la entrada
            }

        } while (!correcto);

        return num;
    }
    //Método para calcular e imprimir la media del total de notas.
    public static void calcularMedia(Notas[] vectorNotas) {
        
        double total = 0;
        //Bucle para sumar todas la notas.
        for (int i = 0; i < vectorNotas.length; i++) {
            total += vectorNotas[i].getNota();
        }
        
        int media = (int) Math.round(total / vectorNotas.length);
        /*Redondeo la media del total de notas*/
        
        System.out.println("Su nota media del curso es: " + media);
    }
    //Método mostrar con llamada al método de la clase Notas
    public static void mostrar(Notas[] vectorNotas) {
        
        for (int i = 0; i < vectorNotas.length; i++) {
            vectorNotas[i].mostrar();
        }
    }
    
    public static void main(String[] args) {
        
        Notas[] vectorNotas = new Notas[6];
        //Array para rellenar los atributos de nombre de los objetos.
        String[] asignaturas = {"Programacion", "Lenguaje de marcas", "Base de datos"
                , "Entornos de Desarrollo", "Sistemas Informaticos", "IPE"};
        
        rellenarConAleatorios(vectorNotas, asignaturas);
        mostrar(vectorNotas);
        calcularMedia(vectorNotas);
    }
}

