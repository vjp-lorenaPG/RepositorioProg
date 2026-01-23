/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vuelta;

/**
 *
 * @author Lorena
 */
public class Vuelta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo los objetos de cada clase pedidos en el ejercicio
        
        CiclistaEscalador cEs1 = new CiclistaEscalador("Rafa", false, 120f, 3f, 20f, 30f);
        CiclistaSprinter cSp1 = new CiclistaSprinter("Miguel", false, 120f, 3f, 30f);
        //Muestro el número de ciclistas creados
        Ciclista.mostrarNumCiclistas();
        //Creo una variable Ciclista y guardo los objetos en ella
        Ciclista c1 = cEs1;
        Ciclista c2 = cSp1;
        //Opero con los objetos según el enunciado
        c1.mostrar();
        c1.comer();
        c1.beber();
        c1.mostrar();
        
        c2.mostrar();
        c2.comer();
        c2.beber();
        c2.mostrar();
        //Creo una variable de la interfaz pedaleable y guardo los objetos en ella.
        Pedaleable p1 = cEs1;
        Pedaleable p2 = cSp1;
        //Opero con los objetos almacenados dentro de la variable interfaz
        p1.mostrarPedaleable();
        p1.atacar();
        p1.recuperar(50f);
        p1.sprintar();
        p1.mostrarPedaleable();
        
        p2.mostrarPedaleable();
        p2.atacar();
        p2.recuperar(3f);
        p2.sprintar();
        p2.mostrarPedaleable();
    }
    
}
