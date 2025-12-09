/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelta;

/**
 *
 * @author Lorena
 */
public class CiclistaEscalador extends Ciclista implements Pedaleable {
    
    //Atributos específicos
    private float potencia;
    private float fuerza;
    
    //Constructores
    public CiclistaEscalador(){
        super();
        potencia=0f;
        fuerza=0f;
    }
    public CiclistaEscalador(String nombre, boolean escapado, float kmMeta, float velocidad, float potencia, float fuerza){
        super(nombre, escapado, kmMeta, velocidad);
        this.potencia=potencia;
        this.fuerza=fuerza;
    }
    
    //Getters

    public float getPotencia() {
        return potencia;
    }

    public float getFuerza() {
        return fuerza;
    }
    //Setters

    public void setPotencia(float potencia) {
        this.potencia = potencia;
    }

    public void setFuerza(float fuerza) {
        this.fuerza = fuerza;
    }
    //Mostrar sobreescrito
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("--  --  --");
        System.out.println("Tipo de ciclista: Escalador\n" + "Mostrando atributos");
        System.out.println("Potencia: " + potencia + "\nFuerza: " + fuerza);
        System.out.println("*-- ------------------------- --*");
    }
    //Metodos abstractos implementados
    @Override
    public void comer(){
        if (getKmMeta()>20){
            setEnergia(getEnergia()+30);
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
            setHidratacion(getHidratacion()+10);
            setNumBidones(getNumBidones()-2);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }else if(getNumBidones()==1){
            setNumBidones(1);
            setHidratacion(getHidratacion()+10);
            setNumBidones(getNumBidones()-2);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }else {
            System.out.println("El escalador tiene dos bidones bidones, no coge ninguno");
            setHidratacion(getHidratacion()+10);
            setNumBidones(getNumBidones()-2);
            System.out.println("EL escalador " + getNombre() + " se ha hidratado."
                + "\nSu nivel de hidratacion  ahora es de " + getHidratacion());
        }
    }
    //Métodos implementados de la interfaz
    @Override
    public void sprintar(){
        int tantoPorCienEnergia=(50*20)/100;
        if (getKmMeta()<0.3 && getEnergia()>tantoPorCienEnergia){
            setVelocidad(getPotencia()/getFuerza());
            setEnergia(getEnergia()-20);
            System.out.println("El escalador " + getNombre() + "esta esprintando a velocidad "+ getVelocidad()
                +" km/h");
        }else{
            System.out.println("Aun no puedes esprintar");
        }
    }
    @Override
    public void atacar (){
        if(!getEscapado()){
            setEscapado(true);
            setHidratacion((getHidratacion()-(getHidratacion()*20)/100));
            System.out.println("El escalador " + getNombre() + " esta atacando");
        }else {
            System.out.println("El escalador "+ getNombre() + " no puede atacar estando escapado");
        }
    }
    
    @Override
    public float recuperar(float km){
        if(km>15){
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
        System.out.println("*-- ---------------------------- --*");
        System.out.println("Tipo de ciclista: Escalador\n" + "Mostrando atributos");
        System.out.println("Potencia: " + potencia + "\nFuerza: " + fuerza);
                System.out.println("*-- ------------------------- --*");

    }
    
    
}
