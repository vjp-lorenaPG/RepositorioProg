/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e1;

/**
 *
 * @author galin
 */
public class Multiplicacion extends Calculadora{
    private double multiplicador;
    
    public Multiplicacion (){
        super();
        multiplicador=0;
    }
    public Multiplicacion (double n,double multiplicador){
        super(n);
        this.multiplicador=multiplicador;
    }

    public double getExponente() {
        return multiplicador;
    }

    public void setExponente(double multiplicador) {
        this.multiplicador = multiplicador;
    }
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Multiplicacor: " + multiplicador);
    }

    @Override
    public void realizarOperacion() {
        double resultado= super.getNumero()* multiplicador;
        System.out.println("Resultado: " + resultado);
    }
}
