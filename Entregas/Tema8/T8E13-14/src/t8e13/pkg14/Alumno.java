/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8e13.pkg14;

/**
 *
 * @author galin
 */
public class Alumno {
    
    private String nombre;
    private int edad;
    private double notaMedia;
    
    //Constructor por defecto
    public Alumno() {
        this.nombre = "";
        this.edad = 0;
        this.notaMedia = 0.0;
    }
    
    //Constructor parametrizado
    public Alumno(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }
    
    //Getters
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public double getNotaMedia() {
        return notaMedia;
    }
    
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void setNotaMedia(double notaMedia) {
        this.notaMedia = notaMedia;
    }
    //Método mostrar
    public String toString() {
        return "Alumno: " + nombre + "\nEdad: " + edad + "\nNota media: " + notaMedia;
    }
}
