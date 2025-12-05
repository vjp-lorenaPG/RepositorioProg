/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e7;

/**
 *
 * @author alumno
 */
public class Radio implements ControlRemoto {
    //Atributos
    private boolean encendido;
    private float emisora;
    private int volumen;
    //Constructores
    public Radio (){
        
        encendido=false;
        emisora=(float)80.0;
        volumen =15 ;
    }
    public Radio (boolean encendido, float emisora, int volumen){
        
        this.encendido=encendido;
        this.emisora=(float)emisora;
        this.volumen =volumen;
    }
    //Getters
    public float getEmisora() {
        return emisora;
    }

    public int getVolumen() {
        return volumen;
    }
    //Setters
    public void setCanal(int canal) {
        this.emisora = canal;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }
    //Mostrar
    public void mostrar (){
        System.out.println("Mostrando televisor:" + "\n" + "Encendido - " + encendido
            + "\n" + "Canal - " + emisora + "\n" 
            + "Volumen - " + volumen);
    }
    //Metodos implementados de la interfaz 
    @Override
    public void apagar() {
        if (encendido){
            System.out.println("Apagando..");
            encendido=false;
        }else {
            System.out.println("Ya esta apagada");
        }
    }
    @Override
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
            volumen-=5;
            System.out.println("Ha bajado el volumen.\n"
                + "El volumen actual es: " + volumen);
        }else {
            System.out.println("Error, no se puede modificar el volumen. \n "
                    +"Su radio esta apagada");
        }
    }
    @Override
    public void subirVolumen() {
        if (encendido){
            volumen+=5;
            System.out.println("Ha subido el volumen.\n"
                + "El volumen actual es: " + volumen);
        }else {
            System.out.println("Error, no se puede modificar el volumen. \n "
                    +"Su radio esta apagada");
        }
    }

    @Override
    public void cambiarCanal(float emisora) {
    
        if (encendido){
            this.emisora=emisora;
            System.out.println("Ha cambiado el canal.\n"
                + "El canal actual es: " + emisora);
        }else {
            System.out.println("Error, no se puede modificar la emisora. \n "
                    +"Su radio esta apagada");
        }
    }
    

}
