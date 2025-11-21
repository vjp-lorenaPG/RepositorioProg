/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e2;


/**Diseña una clase Curso que contenga los siguientes atributos privados: •
 * nombre (de tipo cadena) • numeroHoras (de tipo entero)
 * Además un atributo estático llamado numeroDeCursos de tipo entero que lo
 * utilizaremos para contar los objetos que vamos creando.
 *
 * @author galin
 */
public class Curso {
    //Declaro los atributos
    private String nombre;
    private int numeroHoras;
    public static int numeroDeCursos=0;
    //Método establecer horas y nombre
    public void setNombreyHoras(int horas, String nombreClase){
        
        nombre=nombreClase;
        numeroHoras=horas;
    
    }
    //Método obtener nombre
    public void getNombre(){
    
        System.out.println("El nombre es: " +nombre);
    } 
    //Método obtener horas
    public void getHoras(){
    
        System.out.println("El numero de horas es: " +numeroHoras);
    } 
    //Método sumar el número de cursos
    public static void sumarCursos(){
    
        numeroDeCursos++;
    } 
    //Método obtener el número de cursos
    public static void getNumeroCursos(){
    
        System.out.println("El numero de cursos es: " +numeroDeCursos);
    }
    
    
    
}
