/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e24;

/**
 *
 * @author Lorena
 */
public class Producto {
    //Atributos comunes a clase y subclases.
    private String fechaCaducidad;
    private int numLote;
    //Constructor predeterminado
    public Producto(){
    
        fechaCaducidad="";
        numLote= 0;
    }
    //Constructor parametrizado
    public Producto (String f, int cod){
    
        fechaCaducidad=f;
        numLote=cod;
    }
    //Sett de fecha de caducidad
    public void setFechaCaducidad(String f){
    
        fechaCaducidad=f;
    }
    //Gett de fecha de caducidad
    public String getFechaCaducidad(){
        return fechaCaducidad;
    }
    //Sett del número del lote
    public void setNumLote (int cod){
        numLote=cod;
    }
    //Gett del número del lote
    public int getNumLote (){
    
        return numLote;
    }
    //Método mostrar
    public void mostrar(){
        
        System.out.println("Fecha de caducidad: " + fechaCaducidad
        + "\nNumero del lote: " + numLote);
    }














}

