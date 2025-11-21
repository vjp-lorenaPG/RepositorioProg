/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e15;

/**
 *
 * @author Lorena
 */
//Atributos comuenes de la clase direccion
public class Direccion {
    private String calle;
    private int numero;
    private int piso;
    private String ciudad;
    //constructor predeterminado
    public Direccion(){
        calle="";
        numero=0;
        piso=0;
        ciudad="";
        
    }
    //Constructor parametrizado
    public Direccion (String calle, int numero, int piso, String ciudad){
        
        this.calle=calle;
        this.piso=piso;
        this.numero=numero;
        this.ciudad=ciudad;
        
    
    
    }
    //Set de calle
    public void setCalle (String ca){
    
        calle=ca;
    }
    //Set de ciudad
    public void setCiudad (String ci){
    
        ciudad=ci;
    }
    //Set de numero
    public void setNumero (int n){
    
        numero=n;
    }
    //Set de piso
    public void setPiso (int p){
    
        piso=p;
    }
    //Mostrar direccion
    public void mostrarDireccion(){
    
        System.out.println("Calle: " + calle + "\n Numero: " + numero
       + "\n piso: " + piso + "\n Ciudad: " + ciudad);
        System.out.println("|---------------------|");
    }
    
    
}
