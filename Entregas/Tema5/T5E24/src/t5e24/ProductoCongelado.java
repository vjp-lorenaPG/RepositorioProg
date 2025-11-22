/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e24;

/**
 *
 * @author Lorena
 */
public class ProductoCongelado extends Producto {
    //Atributo general de subclase
    private int tempRecomendada;
    
    //Constructor Predeterminado
    public ProductoCongelado(){
        super();
        tempRecomendada=0;
    }
    //Constructor parametrizado
    public ProductoCongelado (String fchCad, int numLote, int tempRecomendada){
    
        super(fchCad, numLote);
        this.tempRecomendada= tempRecomendada;
    }
    //Sett de temperatura
    public void setTempRecomendada(int temp){
        tempRecomendada=temp;
    }
    //Gett de temperatura
    public int getTempRecomendada (){
        return tempRecomendada;
    }
    //Mostrar con override y super.mostrar para usar polimorfismo
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Temperatura recomendada: " + tempRecomendada);
        System.out.println("|---------------|");
    }
    
    
}
