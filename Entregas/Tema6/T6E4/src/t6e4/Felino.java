/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e4;

/**
 *
 * @author galin
 */
public abstract class Felino extends Animal {
    //Constructores
     public Felino (){
        super();
    }
    
    public Felino (String n, int e, double p){
        super(n, e, p);
    }
    //Mostrar sobrescrito
    @Override
    public void mostrarAnimal (){
        System.out.println("Mostrando Felino: ");
        super.mostrarAnimal();
    }
}
