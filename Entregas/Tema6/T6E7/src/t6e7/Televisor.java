/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e7;

/**
 *
 * @author alumno
 */
public class Televisor implements ControlRemoto {
    //Atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    //Constructores
    public Televisor(){
        encendido=false;
        canal=1;
        volumen = 10;
        
    }
    
    public Televisor(boolean encendido){
        this.encendido=encendido;
        canal=1;
        volumen = 10;
        
    }
    //Getters
    public int getCanal() {
        return canal;
    }

    public int getVolumen() {
        return volumen;
    }
    //Setters
    public void setCanal(int canal) {
        this.canal = canal;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    //Mostrar
    public void mostrar (){
        System.out.println("Mostrando televisor:" + "\n" + "Encendido - " + encendido
            + "\n" + "Canal - " + canal + "\n" 
            + "Volumen - " + volumen);
    }
    //Métodos implemnetados de la interfaz
    @Override
    public void apagar() {
        if (encendido){
            System.out.println("Apagando..");
            encendido=false;
        }else {
            System.out.println("Ya esta apagada");
        }
    }
    public void encender() {
        if (!encendido){
            System.out.println("Encendiendo..");
            encendido=false;
        }else {
            System.out.println("Ya esta encendida");
        }
    }
    @Override
    public void bajarVolumen() {
        if (encendido){
            volumen-=1;
            System.out.println("Ha bajado el volumen.\n"
                + "El volumen actual es: " + volumen);
        }else {
            System.out.println("Error, no se puede modificar el volumen. \n "
                    +"Su television esta apagada");
        }
    }
    @Override
    public void subirVolumen() {
        if (encendido){
            volumen+=1;
            System.out.println("Ha subido el volumen.\n"
                + "El volumen actual es: " + volumen);
        }else {
            System.out.println("Error, no se puede modificar el volumen. \n "
                    +"Su television esta apagada");
        }
    }

    @Override
    public void cambiarCanal(float canal) {
    
        if (encendido){
            this.canal=(int)canal;
            System.out.println("Ha cambiado el canal.\n"
                + "El canal actual es: " + canal);
        }else {
            System.out.println("Error, no se puede modificar el canal. \n "
                    +"Su television esta apagada");
        }
    }
    
    
    
}
