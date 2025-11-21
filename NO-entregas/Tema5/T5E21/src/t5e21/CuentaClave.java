/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e21;

/**
 *
 * @author alumno
 */
public class CuentaClave extends Cuenta {
    
    private String clave;
    
    public CuentaClave (){
        super();
        clave="";
    }
    public CuentaClave (float s, String c){
    
        super( s);
        clave=c;
    }
    
    public void setClave (String c){
    
        clave=c;
    
    }
    public String getClave (){
    
        return clave;
    }
    public void mostrarClave (){
    
        System.out.println("La clave es: " + clave);
    }
    public boolean comprobarClave (String claveUs){
        boolean correcto=false;
        correcto=this.clave.equals(claveUs);
        return correcto;
    }
    @Override
    public void extraer (float c){
        super.extraer(c);
        setSaldo(getSaldo()- c);
        //Ambas opciones.
    }
    
    
}
