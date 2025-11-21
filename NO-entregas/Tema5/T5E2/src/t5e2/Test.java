/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e2;

/**
 *Diseña una clase Curso que contenga los siguientes atributos privados: •
 * nombre (de tipo cadena) • numeroHoras (de tipo entero)
 * Además un atributo estático llamado numeroDeCursos de tipo entero que lo
 * utilizaremos para contar los objetos que vamos creando.
 *
 * @author galin
 */
public class Test {
    
    public static void main(String[] args){
        //Declaro los cursos y sus atributos.
        Curso curso1 = new Curso();
        Curso.sumarCursos();
        Curso curso2 = new Curso();
        Curso.sumarCursos();
        curso1.setNombreyHoras(200,"DAM");
        curso2.setNombreyHoras(250,"DAW");
        //Obtengo los datos
        Curso.getNumeroCursos();
        curso1.getNombre();
        curso1.getHoras();
        curso2.getNombre();
        curso2.getHoras();
    } 
}
