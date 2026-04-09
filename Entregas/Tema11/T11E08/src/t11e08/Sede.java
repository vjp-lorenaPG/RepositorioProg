/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11e08;

/** 
 *De cada sede almacenaremos el nombre de la sede y
 * sus ingresos anuales.
 * @author galin
 */
public class Sede implements Comparable <Sede>{
    //Atributos
    String nombre;
    double ingresosAnuales;
    //Constructores
    public Sede() {
        this.nombre = "";
        this.ingresosAnuales =0.0;
    }
    
    public Sede(String nombre, double ingresosAnuales) {
        this.nombre = nombre;
        this.ingresosAnuales = ingresosAnuales;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }
    //ToString
    @Override
    public String toString() {
        return "Sede{" + "nombre:" + nombre + ", ingresosAnuales:" + ingresosAnuales + '}';
    }
    //Método de interfaz comparable para ordenar
    @Override
    public int compareTo(Sede otra) {
    
    if (this.ingresosAnuales > otra.ingresosAnuales) {
        return -1;
    }
    else if (this.ingresosAnuales < otra.ingresosAnuales) {
        return 1;
    }
    else {//Si son iguales ordena por el nombre
        return this.nombre.compareTo(otra.nombre);
    }
}
    
    
    
    
    
    
    
    
    
}
