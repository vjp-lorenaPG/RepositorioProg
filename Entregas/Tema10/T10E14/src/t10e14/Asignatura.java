/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10e14;

/**Nombre de la asignatura. (String) 
 * • Nota de laAsignatura (float)
 *
 * @author alumno
 */
public class Asignatura {
    //Atributos
    private String nombre;
    private float nota;
    
    //Constructor
    public Asignatura(){
        this.nombre="";
        this.nota=0.0f;
        
    }
    //Constructor
    public Asignatura(String nombre, float nota){
        this.nombre=nombre;
        this.nota=nota;
        
    }
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public float getNota() {
        return nota;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
    //To String
    @Override
    public String toString() {
        return "Mostrando Asignatura{" + "nombre=" + nombre + ", nota=" + nota + '}';
    }
    
    
    
    
}
