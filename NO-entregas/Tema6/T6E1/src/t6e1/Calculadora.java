/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e1;

/**
 *
 * @author galin
 */
public abstract class Calculadora {
    
    private double numero;
    
    public Calculadora (){
        numero=0;
    }
    public Calculadora (double numero){
        this.numero=numero;
    }
    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }
    
    public void mostrar (){
        System.out.println("Numero: " + numero);
    }
    
    public abstract void realizarOperacion();
}
