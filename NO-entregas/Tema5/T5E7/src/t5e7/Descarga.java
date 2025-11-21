/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e7;

/**
 *
 * @author galin
 */
public class Descarga {
    
    private String nombreDescarga;
    private double tamañoDescarga;
    private double velocidadDescarga;
    
    public Descarga (){
        this.nombreDescarga="";
        this.tamañoDescarga=0;
        this.velocidadDescarga=0;
            
    }
    
    
    public Descarga(double t, double v){
        
        this.nombreDescarga="Descarga1";
        this.tamañoDescarga = t;
        this.velocidadDescarga = v;
        
    }
    
    public void setNombreDescarga (String n){
            
        nombreDescarga= n;
    
    }
    
    public void setTamañoDescarga (double t){
            
        tamañoDescarga= t;
    
    }
    
    public void setVelocidadDescarga (double v){
            
        velocidadDescarga= v;
    
    }
    public String getNombreDescarga (){
            
        return nombreDescarga;
    
    }
    public double getTamañoDescarga (){
           
        return tamañoDescarga;
    }
    public double getVelocidadDescarga (){
           
        return velocidadDescarga;
    }
    
    public void mostrarDescarga (){
    
        System.out.println(getNombreDescarga() + getTamañoDescarga() + getVelocidadDescarga());
    }
    
    public static void calcularTiempoDescarga (double tamañoDescarga, double velocidadDescarga){
            
        double segundos;
        double minutos=0;
        double horas = 0;
        double dias= 0;

        double tamañoMiB=tamañoDescarga*8;
        double tiempo=tamañoMiB/velocidadDescarga;
        
        
        if (tiempo>60&&tiempo<3600){
            minutos=tiempo/60;
            tiempo=tiempo%60;
            segundos=tiempo;
        }else if(tiempo<60){
            segundos=tiempo;
        }else if(tiempo>3600&&tiempo<86400){
            horas=tiempo/3600;
            tiempo=tiempo%3600;
            minutos=tiempo/60;
            tiempo=tiempo%60;
            segundos=tiempo;
        }else {
            dias=tiempo/86400;
            tiempo=tiempo%86400;
            horas=tiempo/60;
            tiempo=tiempo%60;
            minutos=tiempo/60;
            tiempo=tiempo%60;
            segundos=tiempo;
            }
        System.out.println("Su descarga estará lista en: " );
        if(dias!=0){
            System.out.println(dias + " dias");
        } else if (horas!=0){
            System.out.println(horas+" horas");
        }else if(minutos!=0){
            System.out.println(minutos + " minutos");
        }else {
            System.out.println(segundos+" segundos");
        }
        
    }
    
    
    
}
