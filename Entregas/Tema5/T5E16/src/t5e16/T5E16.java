/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e16;

import java.util.Scanner;

/**Ejercicio 16.- Realiza un programa en JAVA, orientado a objetos, donde el
 * usuario introduzca el nombre y la nota de un alumno (número entero entre 0 y
 * 10) y se escribirá su calificación según el valor de la nota ingresada: • 0 a
 * 4 = Suspenso. • 5 a 6 = Bien. • 7 a 8 = Notable. • 9 a 10 = Sobresaliente. •
 * Nota: Se le avisará al usuario de un error en caso de que la nota que nos
 * introduzca no esté entre 0 y 10. • Para ello tendrás una clase Alumno con los
 * atributos nombre y nota. En una clase Test crea 3 objetos y los métodos que
 * consideres necesarios (cuantos más mejor). Intenta que el método main sea lo
 * más pequeño posible.
 *
 * @author Lorena
 */
public class T5E16 {

    /**
     * @param args the command line arguments
     */
    //Método para asignar una calificaión a la nota.
    public static void calificacion (int nota){
    
        //Condición para imprimir valor de la nota.
        if (nota < 4 && nota >0) {
            System.out.println("Su nota es equivalente a un suspenso");
        } else if (nota >= 5 && nota <= 6) {
            System.out.println("Su nota es equivalente a un bien");
        } else if (nota >= 7 && nota <= 8) {
            System.out.println("Su nota es equivalente a un notable");
        } else if (nota >=9 && nota <=10) {
            System.out.println("Su nota es equivalente a un sobresaliente");
        } else {
            System.out.println("Error, la nota introducida no esta entre 0 y 10");
        }
    }
    //Método para pedir la nota.
    public static int pedirNota (){
        int nota;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca su nota");
        return nota = entrada.nextInt();
    }
    //Método para pedir el nombre.
    public static String pedirNombre(){
    
        String nombre;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca su nombre");
        return nombre = entrada.nextLine();
    }
    public static void main(String[] args) {
        /**Creo los objetos Alumno con el constructor parametrizado llamando a los
         *métodos para recoger los datos del usuario en una misma línea 
        **/
        Alumno a1 = new Alumno(pedirNombre(),pedirNota());
        Alumno a2 = new Alumno(pedirNombre(), pedirNota());
        Alumno a3 = new Alumno(pedirNombre(), pedirNota());
        //Llamo al método para calificar el valor de las notas de los objetos.
        calificacion(a1.getNota());
        calificacion(a2.getNota());
        calificacion(a3.getNota());
      
    }
    
}
