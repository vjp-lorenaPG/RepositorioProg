/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e1;

/**
 *
 * @author galin
 */
//Declaro clase coche
public class Coche {
    //Declaro atributos
    private String marca;
    private String modelo;
    private String color;
    private int velocidad;
    private boolean motorEncendido;
    //Metodo para fijar una marca
    public void setMarca(String marc){
        marca = marc;
     
    }
    //Metodo para fijar una modelo
    public void setModelo(String model){
        modelo = model;
        
     
    }
    //Metodo para fijar un color
    public void setColor(String c){
        color = c;
     
    }
    //Metodo para arrancar
    public void arrancarCoche (){
        motorEncendido = true;
        velocidad= velocidad+10;
    }
    //Metodo para apagar
    public void apagarCoche (){
        motorEncendido = false;
        velocidad= 0;
    }
    //Metodo para acelerar
    public void acelerarCoche (){
        if(motorEncendido == true){
            velocidad= velocidad+20;
        }else {
            System.out.println("El motor no está encendido");
        }
    }
    //Metodo para frenar
    public void frenarCoche (){
        if(motorEncendido == true){
            velocidad= velocidad-6;
        }
    }
    //Metodo para generar el estado del objeto
    public void getEstado (){
        System.out.println(marca);
        System.out.println(modelo);
        System.out.println(color);
        System.out.println(motorEncendido);
        System.out.println(velocidad);
        
        
    }
}
