/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vuelta;

/**
 *
 * @author Lorena
 */
public abstract class Ciclista {
    //Atributos
    private static int contador=0;
    private String nombre;
    private int energia;
    private boolean escapado;
    private float kmMeta;
    private int numBidones;
    private float velocidad;
    private int hidratacion;
    
    //Constructores
    public Ciclista (){
        this.nombre="";
        this.energia=50;
        this.escapado=false;
        this.kmMeta=120f;
        this.numBidones=2;
        this.velocidad=0f;
        this.hidratacion=50;
        contador++;
    }
    public Ciclista (String nombre, boolean escapado, float kmMeta, float velocidad){
        this.nombre=nombre;
        this.energia=50; //Siempre en 50
        this.escapado=escapado;
        this.kmMeta=kmMeta;/*Por defecto se inicializa en 120, como este es el constructor
        parametrizado no lo pongo, pero sí queda fijado en el por defecto más arriba.*/
        this.numBidones=2;//Siempre en 2
        this.velocidad=velocidad;
        this.hidratacion=50;//Siempre en 50
        contador++;
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public boolean getEscapado() {
        return escapado;
    }

    public float getKmMeta() {
        return kmMeta;
    }

    public int getNumBidones() {
        return numBidones;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public int getHidratacion() {
        return hidratacion;
    }

    public static int getContador() {
        return contador;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void setEscapado(boolean escapado) {
        this.escapado = escapado;
    }

    public void setKmMeta(float kmMeta) {
        this.kmMeta = kmMeta;
    }

    public void setNumBidones(int numBidones) {
        this.numBidones = numBidones;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

    public void setHidratacion(int hidratacion) {
        this.hidratacion = hidratacion;
    }

    public static void setContador(int contador) {
        Ciclista.contador = contador;
    }
    
    //Mostrar ciclista
    public void mostrar(){
        System.out.println("*-- ------------------------- --*");
        System.out.println("Mostrando ciclista: \n"+ "Nombre: " + nombre + 
            "\nEnergia: " + energia + "\nEscapado: " + escapado + 
            "\nKM hasta la meta: " + kmMeta + "\nNumero de bidones: " + numBidones +
            "\nVelocidad: " + velocidad + "\nNivel de hidratacion: " + hidratacion);
    }
    //Mostrar numCiclistas, lo pide el ejercicio
    public static void mostrarNumCiclistas(){
        System.out.println("Numero de ciclistas: " + contador);
    }
    //Métodos privados para que no puedan ser sobreescritos por la herencia
    private void cogerBidones(){
        if (kmMeta>10){
            setNumBidones(2);
        }else{
            System.out.println("No puedes coger bidones a menos de 10km de meta");
        }
    }
    private void tirarBidon(){
        setNumBidones(getNumBidones()-1);
    
    }
    //Métodos abstractos, implementar en la herencia.
    public abstract void comer();
    public abstract void beber();
    
}
