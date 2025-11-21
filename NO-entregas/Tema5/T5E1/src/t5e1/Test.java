/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e1;

/**
 *
 * @author galin
 */
public class Test {
    
    public static void main(String[] args){
        //Declaro el objeto miCoche y sus atributos
        Coche miCoche = new Coche ();
        miCoche.setModelo("Focus");
        miCoche.setMarca("Ford");
        miCoche.setColor ("Gris");
        //Declaro el objeto cochePadre y sus atributos
        Coche cochePadre = new Coche ();
        cochePadre.setMarca ("Alfa Romeo");
        cochePadre.setModelo ("Giuletta");
        cochePadre.setColor ("Rojo");
        //Arranco
        miCoche.arrancarCoche();
        cochePadre.arrancarCoche();
        //Acelero
        for (int i=0; i<=5;i++){
            miCoche.acelerarCoche();
        }
        //Freno
        miCoche.frenarCoche();
        miCoche.frenarCoche();
        //Acelero cochePadre
        for (int i=0; i<=3;i++){
            cochePadre.acelerarCoche();
        }
        //Apago motor
        cochePadre.apagarCoche();
        //Llamo al método obtener estado
        miCoche.getEstado();
        cochePadre.getEstado();
    }
}
    

