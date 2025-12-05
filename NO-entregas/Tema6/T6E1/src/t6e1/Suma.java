/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e1;

/**
 *
 * @author galin
 */
public class Suma extends Calculadora {
    private double sumando;
    
    public Suma (){
        super();
        sumando=0;
        
    }
    public Suma (double n,double sumando){
        super(n);
        this.sumando=sumando;
    }

    public double getSumando() {
        return sumando;
    }

    public void setSumando(double sumando) {
        this.sumando = sumando;
    }
    
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Sumando: " + sumando);
    }

    @Override
    public void realizarOperacion() {
        double resultado= super.getNumero(), sumando;
        System.out.println("Resultado: " + resultado);
    }



}
