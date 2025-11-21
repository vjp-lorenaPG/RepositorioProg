/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e5;

/**
 *
 * @author Lorena
 */
public class Asignatura {
    //Atributos de los objetos Asignaturas
    private String nombre;
    private int nota;
    //Constructor predeterminado
    public Asignatura (){
        nombre=" ";
        nota=0;
    }
    //Constructor parametrizado
    public Asignatura (String a){
        nombre=a;
        nota=0;
    }
    //Método para asignar nombre
    public void setNombre(String a){
        nombre=a;
    
    }
    //Método para asignar nota
    public void setNota(int n){
        nota=n;
    }
    //Método para obtener nombre
    public String getNombre(){
    
        return (nombre);
    }
    //Método para obtener nota   
    public int getNota(){
    
        return (nota);
    }
}
