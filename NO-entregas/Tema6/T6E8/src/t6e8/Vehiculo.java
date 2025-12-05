/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e8;

/**
 *
 * @author galin
 */
public abstract class Vehiculo {
    
    private int velocidad;
    
    public Vehiculo (){
        velocidad=0;
    }
    public Vehiculo (int velocidad){
    
        this.velocidad=velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    
    public void mostrar (){
        System.out.println("*-------------------------*");
        System.out.println("Mostrando vehiculo: \n" + "Velocidad: " + velocidad );
        
    }
    
    public abstract void mostrarMovimiento ();
}
