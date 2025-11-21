/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e3;

/**Ejercicio 03.- Diseña una clase Rueda que contenga los siguientes atributos
 * privados: • material (de tipo cadena) • pulgadas (de tipo entero) • La clase
 * Rueda contendrá los siguientes métodos públicos: • establecerMaterial •
 * establecerPulgadas. • obtenerMaterial. • obtenerPulgadas.
 *
 * @author lorena
 */
public class Test {
     public static void main(String[] args) {
        // Declaro nuevas ruedas.
        Rueda rueda1 = new Rueda();
        Rueda rueda2 = new Rueda();
        //Declaro tipo de material.
        rueda1.setMaterial("caucho natural");
        rueda2.setMaterial("caucho sintetico");
        
        //Declaro cantidad de pulgadas.
        rueda1.setPulgada(195);
        rueda2.setPulgada(205);
        //Obtengo las pulgadas y mateiales con el get.
        rueda1.getMaterial();
        System.out.println("Pulgadas: "+rueda1.getPulgada());
        rueda2.getMaterial();
        System.out.println("Pulgadas: "+rueda2.getPulgada());
        //Delcaor nuevos coches
        Coche coche1 = new Coche();
        Coche coche2 = new Coche();
        Coche coche3 = new Coche();
        //Establezco marcas de los coches
        coche1.setMarca("Ford");
        coche2.setMarca("citroen");
        coche3.setMarca("alfa");
        //Establezco modelos de los coches
        coche1.setModelo("Focus");
        coche2.setModelo("C4");
        coche3.setModelo("Giulietta");
        //Establezco ruedas de los coches
        coche1.setTipoRuedas(rueda1);
        coche2.setTipoRuedas(rueda2);
        coche3.setTipoRuedas(rueda1);
        //Imprimo atributos de los coches.
        System.out.println("\n" + "Coche1:");
        coche1.getMarca();
        coche1.getModelo();
        coche1.getTipoRuedas();
        
        System.out.println("\n" + "Coche2:");
        coche2.getMarca();
        coche2.getModelo();
        coche2.getTipoRuedas();
        
        System.out.println("\n" + "Coche3:");
        coche3.getMarca();
        coche3.getModelo();
        coche3.getTipoRuedas();
    }
}
