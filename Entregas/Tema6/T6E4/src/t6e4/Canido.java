/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e4;

/**
 *
 * @author galin
 */
public abstract class Canido extends Animal {
    //Constructor predeterminado
    public Canido (){
        super();
    }
    //Constructor parametrizado.
    public Canido (String n, int e, double p){
        super(n, e, p);
    }
    //Mostrar sobrescrito
    @Override
    public void mostrarAnimal (){
        System.out.println("Mostrando Canido: ");
        super.mostrarAnimal();
    }
    



}
