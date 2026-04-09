/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11e06;

import java.util.ArrayList;

/**
 *
 * @author galin
 */
public class Campania {
   //Atributos
    private String nombre;
    private ArrayList <Donacion> donaciones; 
    //Constructores
    public Campania (){
        
        this.nombre="";
        this.donaciones= new ArrayList <>();
    }
    
    public Campania (String nombre){
        
        this.nombre=nombre;
        this.donaciones= new ArrayList <>();
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public ArrayList<Donacion> getDonaciones() {
        return donaciones;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDonaciones(ArrayList<Donacion> donaciones) {
        this.donaciones = donaciones;
    }
    //ToString
    @Override
    public String toString() {
        return "Campania{" + "nombre=" + nombre + ", donaciones=" + donaciones.toString() + '}';
    }
    
    
    
    
}
