/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10e14;

import java.util.Arrays;
import java.util.Scanner;





/**clase ALUMNO cuyos atributos son 2: 
 * • Nombre delAlumno. (String) 
 * • Asignaturas (Array de la ClaseAsignatura) • A su vez, la clase Asignatura
 *
 * @author alumno
 */
public class Alumno {
    //atributos de la clase
    private String nombre;
    private Asignatura []asignaturas;
    //Constructor por defecto
    public Alumno (){
        nombre="";
        asignaturas=new Asignatura[3];
    }
    //Constructores parametrizados
    public Alumno(String nombre, int numero) {
        this.nombre = nombre;
        this.asignaturas = new Asignatura [numero];
    }
    public Alumno(String nombre, Asignatura [] asignaturas) {
        this.nombre = nombre;
        this.asignaturas = asignaturas;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public Asignatura[] getAsignaturas() {
        return  asignaturas;
    }
    //Setters
    public void setAsignaturas(Asignatura [] asignaturas) {
        this.asignaturas=asignaturas;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", asignaturas=" + Arrays.toString(asignaturas) + '}';
    }
    //Método crear asignatuta
    public void crearAsignaturas( ){
        for (int i=0;i< asignaturas.length; i++){
            this.asignaturas[i]=new Asignatura();
        }
    
    }
    public void crearYRellenarAsignaturas() {
        for (int i = 0; i < asignaturas.length; i++) {

            asignaturas[i] = new Asignatura(pedirNombreAsignatura(), pedirNotaAsignatura() );
        }

    }
    //Método para pedir la nota de la asignatura
    public static float pedirNotaAsignatura() {
        float notaAsig;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la nota");
        notaAsig = entrada.nextFloat();
        return notaAsig;
    }
    //Método para pedir el nombre de la asignatura
    public static String pedirNombreAsignatura() {
        String nombreAsig;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la asignatura");
        nombreAsig = entrada.nextLine();
        return nombreAsig;
    }
    //Método para calcular la nota media de las asignaturas de un mismo alumno.
    public float notaMedia (){
        float media=0.0f;
        for(int i=0;i<asignaturas.length;i++){
            media+=asignaturas[i].getNota();
        }
        media/=asignaturas.length;
        return media;
    }
}

    

    
    
