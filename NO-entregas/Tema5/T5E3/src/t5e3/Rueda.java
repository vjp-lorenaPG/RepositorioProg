/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e3;

/**
 *
 * @author galin
 */
public class Rueda {
     //Declaro atributos
    private String material;
    private int pulgadas;
    
    //Metodo para fijar una material
    public void setMaterial(String mat){
        material = mat;
     
    }
    //Metodo para fijar una pulgadas
    public void setPulgada(int p){
        pulgadas = p;
    }
    //Metodo para obtener pulgadas
    public void getMarca (){
        System.out.println(pulgadas);
    }
    //Metodo para obtener material
    public String getMaterial(){
        return material;
    }
    //Metodo para obtener las pulgadas
    public int getPulgada(){
        return pulgadas;
    }
}
