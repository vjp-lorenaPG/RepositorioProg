/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e24;

/**
 *
 * @author galin
 */
public class ProductoFresco extends Producto{
    //Atributos comunes a la subclase
    private String fechaEnvasado;
    private String paisOrigen;
    //Constructor predeterminado
    public ProductoFresco(){
    
        super();
        fechaEnvasado="";
        paisOrigen="";
    }
    //Constructor parametrizado
    public ProductoFresco (String fchCad,int numLote, String fchEnv,String pais){
    
        super(fchCad,numLote);
        this.fechaEnvasado=fchEnv;
        this.paisOrigen=pais;
    }
    //Sett de la fecha del envasado
    public void setFechaEnvasado (String fchEnv){
    
        fechaEnvasado=fchEnv;
    }
    //Gett de la fecha del envasado
    public String getFechaEnvasado (){
        return fechaEnvasado;
    }
    //Sett del país de orígen
    public void setPaisOrigen (String pais){
        paisOrigen=pais;
    }
    //Gett del país de orígen
     public String getPaisOrigen (){
         return paisOrigen;
    }
     //Override de los atributos del super y sub clase en mostrar. Polimorfismo
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Fecha de envasado; " + fechaEnvasado
            + "\nPais de origen : " + paisOrigen );
        System.out.println("|---------------|");
    }
}
