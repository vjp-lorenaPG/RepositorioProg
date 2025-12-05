/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e2;

/**
 *
 * @author galin
 */
public abstract class Persona {
    
    private String nombre;
    
    public Persona (){
        nombre="";
    }
    public Persona (String nombre){
        this.nombre=nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrar (){
        System.out.println("Nombre: " + nombre);
    }
    
    public abstract void saludar();
    
}
