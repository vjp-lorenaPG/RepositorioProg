/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e16;

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
public class Alumno {
    //Atributos propios de la clase
    private String nombre;
    private int nota;
    //Constructo predeterminado
    public Alumno (){
        nombre="";
        nota=0;
    }
    //Constructor parametrizado.
    public Alumno (String n, int nota){
     
        nombre=n;
        this.nota=nota;
    }
    //Sett de nombre
    public void setNombre (String nombre){
    
        this.nombre=nombre;
    }
    //Gett de nombre
    public String getNombre (){
       
       return nombre;
    }
    //Sett de nota
    public void setNota (int nota){
        this.nota=nota;
    }
    //Gett de nota
    public int getNota (){
        return nota;
    }
    //Mostrar objeto Alumno.
    public void mostrarAlumno (){
        System.out.println("Nombre: " + nombre
            + "Nota: " + nota);
    }
   
}
