/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e8;

/**
 *
 * @author galin
 */
public class Coche extends Vehiculo{
    
    private boolean aireEncendido;
    
    public Coche (){
        super();
        aireEncendido=false;
    }
    public Coche (int velocidad, boolean aire){
        super(velocidad);
        aireEncendido=aire;
    }

    public boolean getAireEncendido() {
        return aireEncendido;
    }

    public void setAireEncendido(boolean aireEncendido) {
        this.aireEncendido = aireEncendido;
    }
    @Override
    public void mostrar(){
        super.mostrar();
        System.out.println("Coche: \n" + "Aire encendido: " + aireEncendido);
        System.out.println("*-------------------------*");
    }
    
    public void encenderAire(){
        int bajarVelocidad=10;
        if (!aireEncendido){
            System.out.println("Encendiendo el aire..");
            aireEncendido=true;
            System.out.println("Reduciendo la velocidad");
            setVelocidad(getVelocidad()-bajarVelocidad);
        }else {
            System.out.println("Ya esta encendido");
        }
    }
    public void apagarAire(){
        if (aireEncendido){
            System.out.println("Apagando..");
            aireEncendido=false;
        }else {
            System.out.println("Ya esta apagado");
        }
    }
    @Override
    public void mostrarMovimiento(){
        System.out.println("El coche esta circulando a " + getVelocidad() + " km/h");
    }
    
    
}
