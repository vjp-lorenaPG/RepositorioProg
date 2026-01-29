/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t8e1;

/**
 *
 * @author alumno
 */
public class Notas {
    //Atributos
    private double nota;
    private String nombre;
    //Constructores
    public Notas(double nota, String nombre) {
        this.nota = nota;
        this.nombre = nombre;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("En " + nombre + " la nota es: " + nota);
    }
}