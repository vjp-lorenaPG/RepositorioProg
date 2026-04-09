/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11e06;

/**
 *
 * @author galin
 */
public class Donacion {
    //Atributos
    private String nombre;
    private double cantidad;
    
    //Constructores
    public Donacion(){
        this.nombre="";
        this.cantidad=0;
    }
    public Donacion(String nombre, double cantidad){
        this.nombre=nombre;
        this.cantidad=cantidad;
    }
    
    
    
    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getCantidad() {
        return cantidad;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    //ToString
    @Override
    public String toString() {
        return "Donacion{" + "nombre=" + nombre + ", cantidad=" + cantidad + '}';
    }
    
    
    
}
