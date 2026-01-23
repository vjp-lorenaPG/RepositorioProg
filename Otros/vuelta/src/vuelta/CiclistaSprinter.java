/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelta;

/**
 *
 * @author Lorena
 */
public class CiclistaSprinter extends Ciclista implements Pedaleable{//Hereda de Ciclista e implementa Pedaleable
    //Atributos
    private float aceleracion;
    
    //Constructores
    public CiclistaSprinter (){
        super();
        aceleracion=0;
    }
    public CiclistaSprinter (String nombre, boolean escapado, float kmMeta, float velocidad, float aceleracion){
        super(nombre, escapado, kmMeta, velocidad);
        this.aceleracion=aceleracion;
    }
    //Getter
    public float getAceleracion() {
        return aceleracion;
    }
    //Setter

    public void setAceleracion(float aceleracion) {
        this.aceleracion = aceleracion;
    }
    
    //Mostrar sobreescrito
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("--  --  --");
        System.out.println("Tipo de ciclista: Sprinter\n" + "Mostrando atributo");
        System.out.println("Aceleracion: " + aceleracion);
        System.out.println("*-- ------------------------- --*");

    }
    //Metodos abstractos implementados
    @Override
    public void comer(){
        if (getKmMeta()>10){
            setEnergia(getEnergia()+25);
            System.out.println("El escalador " + getNombre() + " acaba de tomar un gel.\n"
                + "Su energia ahora es de " + getEnergia());
        }else{
            System.out.println("No puedes coger bidones a menos de 10km de meta");
        }
    }
    @Override
    public void beber(){
        if(getNumBidones()==0){
            setNumBidones(2);
            setHidratacion(getHidratacion()+5);
            setNumBidones(getNumBidones()-1);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }else if(getNumBidones()==1){
            setNumBidones(1);
            setHidratacion(getHidratacion()+5);
            setNumBidones(getNumBidones()-1);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }else {
            System.out.println("El escalador tiene dos bidones bidones, no coge ninguno");
            setHidratacion(getHidratacion()+5);
            setNumBidones(getNumBidones()-1);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }
    }
    
    //Métodos implementados de la interfaz
    @Override
    public void sprintar(){
        int tantoPorCienEnergia=(50*50)/100;
        if (getKmMeta()<1.0 && getEnergia()>tantoPorCienEnergia){
            setVelocidad(aceleracion);
            setEnergia(getEnergia()-50);
            System.out.println("El sprinter " + getNombre() + "esta esprintando a velocidad "+ getVelocidad()
                +" km/h");
        }else{
            System.out.println("Aun no puedes esprintar");
        }
    }
    
    @Override
    public void atacar (){
        if(!getEscapado()){
            setEscapado(true);
            setHidratacion((getHidratacion()-(getHidratacion()*10)/100));
            System.out.println("El escalador " + getNombre() + " esta atacando");
        }else {
            System.out.println("El escalador "+ getNombre() + " no puede atacar estando escapado");
        }
    }
    
    @Override
    public float recuperar(float km){
        if(km>5){
            setEnergia((int)km*5);
            System.out.println(getNombre()+" de esta recuperando");
        }else {
            System.out.println("Esta a menos de 15 km de la meta, no puede recuperar");
        }
        return getEnergia();
    }
    //Método mostar pedaleable adquirido de la interfaz para cumplir con el requisito de mostrar del enunciado
    @Override
    public void mostrarPedaleable(){
        System.out.println("--  --  --");
        System.out.println("Tipo de ciclista: Sprinter\n" + "Mostrando atributo");
        System.out.println("Aceleracion: " + aceleracion);
        
    }
    
}
