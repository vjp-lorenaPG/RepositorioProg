/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e24;

/**
 *
 * @author galin
 */
public class ProductoRefrigerado extends Producto {
    //Atributo generarl de subclase
    private int codSupervision;
    //Cosntructor predeterminado
    public ProductoRefrigerado (){
    
        super();
        codSupervision=0;
    }
    //Constructor parametrizado
    public ProductoRefrigerado (String fchCad, int numLote, int codSupervision){
    
        super(fchCad, numLote);
        this.codSupervision=codSupervision;
    }
    //Sett del código de supervisión alimentaria
    public void setCodSupervision(int cod){
    
        codSupervision=cod;
    }
    //Gett del código de supervisión alimentaria
    public int getCodSupervision (){
        return codSupervision;
    }
    //Override del super con super.mostrar() y atributos de subclase. Polimorfismo
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Codigo de supervision alimentaria: " + codSupervision); 
        System.out.println("|---------------|");
    }
    
    
    
    
    
    
}
