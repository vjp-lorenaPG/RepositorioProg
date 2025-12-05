/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e1;

/**
 *
 * @author galin
 */
public class Potencia extends Calculadora{
    private double exponente;
    
    public Potencia (){
        super();
        exponente=0;
    }
    public Potencia (double n,double exponente){
        super(n);
        this.exponente=exponente;
    }

    public double getExponente() {
        return exponente;
    }

    public void setExponente(double exponente) {
        this.exponente = exponente;
    }
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Exponente: " + exponente);
    }

    @Override
    public void realizarOperacion() {
        double resultado= Math.pow(super.getNumero(), exponente);
        System.out.println("Resultado: " + resultado);
    }
}
