/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e8;

/**
 *
 * @author galin
 */
public class Moto extends Vehiculo {
    
    private boolean haciendoCaballito;
    
    public Moto (){
        super();
        haciendoCaballito=false;
    }
    public Moto (int velocidad, boolean haciendoCaballito){
        super(velocidad);
        this.haciendoCaballito=haciendoCaballito;
    }

    public boolean getHaciendoCaballito() {
        return haciendoCaballito;
    }

    public void setHaciendoCaballito(boolean haciendoCaballito) {
        this.haciendoCaballito = haciendoCaballito;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Moto: \n" + "Haciendo Caballito " + haciendoCaballito);
        System.out.println("*-------------------------*");
    }
    @Override
    public void mostrarMovimiento(){
        System.out.println("La moto esta circulando a " + getVelocidad() + " km/h");
    }
    
    
    
}
