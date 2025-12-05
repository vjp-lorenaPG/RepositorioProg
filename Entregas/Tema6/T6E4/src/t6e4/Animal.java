/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e4;

/**Animal es la clase raíz y contiene los atributos nombre, edad, y peso. Esta
 * clase debe tener métodos abstractos para mostrar el sonido, la alimentación,
 * el hábitat y el nombre científico del animal.
 *
 * @author galin
 */
public abstract class Animal {
    //Atributos de la clase
    private String nombre;
    private int edad;
    private double peso;
    //Constructores
    public Animal (){
        nombre= "";
        edad=0;
        peso=0;
    }
    
    public Animal(String n, int e, double p ){
        nombre=n;
        edad = e;
        peso=p;
    }
    //Setters y getters
    public void setNombre(String n){
        nombre=n;
    }
    
    public void setEdad(int e){
        edad=e;
    }
    public void setPeso(double p){
        peso=p;
    }
    
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    public double getPeso(){
        return peso;
    }
    //mostrar
    public void mostrarAnimal(){
        System.out.println("*---------------------------*");
        System.out.println("Nombre: " + nombre + "\n"
            + "Edad: " + edad + "\n"
            + "Peso: " + peso);
    }
    //Metodos abstractos
    public abstract void mostrarSonido ();
    public abstract void mostrarAlimentación();
    public abstract void mostrarHabitat ();
    public abstract void mostrarNombreCi ();
}
