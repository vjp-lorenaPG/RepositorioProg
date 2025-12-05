/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e4;

/**
 *
 * @author galin
 */
public class Lobo extends Canido{
    //Atributos de la clase
    private String sonido;
    private String alimentacion;
    private String habitat;
    private String nombreCi;
    
    //Cosntructores predeterminado y parametrizado
    public Lobo (){
        super();
        sonido="";
        alimentacion="";
        habitat="";
        nombreCi="";
    }
    public Lobo (String n, int e, double p, String s, String a, String h, String nomCi){
        super(n, e, p);
        sonido=s;
        alimentacion=a;
        habitat=h;
        nombreCi=nomCi;
    }
    //Getters y setters
    public String getSonido() {
        return sonido;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNombreCi() {
        return nombreCi;
    }

    public void setSonido(String sonido) {
        this.sonido = sonido;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setNombreCi(String nombreCi) {
        this.nombreCi = nombreCi;
    }
    
    //Mostrar sobreescrito
    @Override
    public void mostrarAnimal() {
        super.mostrarAnimal();
        System.out.println("Lobo: " + "\n" + 
                 "sonido: " + sonido + "\n" + 
                 "Alimentacion: " + alimentacion + "\n" + 
                 "Habitat: " + habitat + "\n" + 
                 "NombreCi:" + nombreCi );
        System.out.println("*---------------------------*");
    }
    //Metodos heredados sobreescritos, antes abstractos
    @Override
    public void mostrarSonido (){
        System.out.println("Sonido: " + sonido);
    }
    @Override
    public void mostrarAlimentación(){
        System.out.println("Alimentacion: " + alimentacion);
    }
    @Override
    public void mostrarHabitat (){
        System.out.println("Habitat: " + habitat);
    }
    @Override
    public void mostrarNombreCi (){
        System.out.println("Nombre Cientifico: " + nombreCi);
    }
    
    
    
    
    
    
}
