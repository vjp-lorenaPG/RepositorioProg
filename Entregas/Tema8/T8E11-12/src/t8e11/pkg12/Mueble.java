/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8e11.pkg12;

/**
 *
 * @author galin
 */
public class Mueble {
    private double precio;
    private String descripcion;
    
    // Constructor por defecto
    public Mueble() {
        this.precio = 0;
        this.descripcion = "";
    }
    
    // Constructor parametrizado
    public Mueble(double precio, String descripcion) {
        this.precio = precio;
        this.descripcion = descripcion;
    }
    
    // Getters
    public double getPrecio() {
        return precio;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    // Setters
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    // Método mostrar
    public String toString() {
        return "Mueble: " + descripcion + "\nPrecio: " + precio + " euros.";
    }
}
