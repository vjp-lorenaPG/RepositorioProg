/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e5;

import java.util.Scanner;

/**Ejercicio 05.- Realiza un programa en JAVA en el que le pidas al usuario las
 * notas de las 6 asignaturas del Ciclo de DAM y te calcule la nota media del
 * curso. 
 * • Nota 1: Cada una de las asignaturas serán un objeto cuyos
 * atributos serán el nombre y la nota. 
 * • Nota 2: Crea un constructor con el
 * que puedas asignar directamente el nombre de la asignatura al crear el
 * objeto. En cambio, el atributo nota, será el usuario quien lo introduzca
 * mediante un método al que se le pase la nota como argumento.
 * • Nota 3: Crea otro método que reciba las 6 notas como argumentos y devuelva la nota media
 * (return)
 *
 * @author galin
 */
public class T5E5 {
    //Método para pedir nota
    public static int pedirNota(String nombre){
        int nota;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la nota de " + nombre);
        nota= entrada.nextInt();
        
        return nota;
    }
    //Método para calcular nota media
    public static int notaMedia (int nota1, int nota2, int nota3, int nota4, int nota5, int nota6){
        int media;
        media=((nota1 + nota2 + nota3 + nota4 + nota5 + nota6) /6);
        return media;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaro variable.
        int media;
        
        //Asigno nombre a las asignaturas
        Asignatura prog = new Asignatura ("programacion");
        Asignatura lmsgi = new Asignatura ("lenguajes de marca");
        Asignatura si = new Asignatura ("sistemas informaticos");
        Asignatura fol = new Asignatura ("formacion en orientacion laboral");
        Asignatura ed = new Asignatura ("entornosde desarrollo");
        Asignatura bd = new Asignatura ("bases de datos");
        
        //Pido notas según cada asignatura.
        prog.setNota(pedirNota("programacion"));
        lmsgi.setNota(pedirNota("lenguajes de marca"));
        si.setNota(pedirNota("sistemas informaticos"));
        fol.setNota(pedirNota("formacion en orientacion laboral"));
        ed.setNota(pedirNota("entornosde desarrollo"));
        bd.setNota(pedirNota("bases de datos"));
        
        //Calculo la nota media y la guardo para imprimirla.
        media=notaMedia(prog.getNota(),lmsgi.getNota(), si.getNota(), fol.getNota(), ed.getNota(), bd.getNota());
        System.out.println("su nota media del curso es: "+media);
    
    
    }
    
}
