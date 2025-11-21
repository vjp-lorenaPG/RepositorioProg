/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e3;

/**
 *
 * @author galin
 */
public class Coche {
     //Declaro atributos
    private String marca;
    private String modelo;
    private Rueda tipoRuedas;
    
    //Metodo para fijar una marca
    public void setMarca(String marc){
        marca = marc;
     
    }
    //Metodo para fijar una modelo
    public void setModelo(String model){
        modelo = model;
        
     
    }
    //Metodo para fijar un ruedas
    public void setTipoRuedas(Rueda r){
        tipoRuedas = r;
     
    }
    //Metodo para obtener modelo
    public void getModelo (){
        System.out.println(modelo);
       
    }
    //Metodo para obtener marca
    public void getMarca (){
        System.out.println(marca);
       
    }
    //Metodo para obtener tipo de ruedas.
    public void getTipoRuedas(){
        System.out.println("Material: " + tipoRuedas.getMaterial()+ "\n"
                +"Pulgadas:" + tipoRuedas.getPulgada());
       
}
    
    
    
}
