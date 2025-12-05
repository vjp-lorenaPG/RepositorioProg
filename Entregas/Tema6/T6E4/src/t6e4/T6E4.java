/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6e4;

/**– Realiza un programa en JAVA, orientado a objetos, en el que modeles una
 * jerarquía de animales con las siguientes características
 * animales, felinos, caninos, con objetos llamados perro, lobo, gato, leon
 *
 * @author galin
 */
public class T6E4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo objetos con constructor propio parametrizado
        Perro perro1=new Perro ("Max", 4, 8.30, "ladrido", "carniboro",
                "domestico", "Canis lupus familiaris");
        Lobo lobo1=new Lobo ("Mike", 8, 10.30, "aullido", "carniboro",
                "bosque", "Canis lupus");
        Leon leon1=new Leon ("Simba", 5, 20.70, "rugido", "carniboro",
                "sabana", "Panthera leo");
        Gato gato1=new Gato ("Lion", 11, 6.20, "maullido", "carniboro",
                "domestico", "Felis silvestris catus");
        
        //Métodos de mostrar los objetos creados
        perro1.mostrarAnimal();
        lobo1.mostrarAnimal();
        leon1.mostrarAnimal();
        gato1.mostrarAnimal();
        
        //Creo objetos con polimorfismo parametrizado
        Animal a1=new Perro ("Max", 4, 8.30, "ladrido", "carniboro",
                "domestico", "Canis lupus familiaris");
        Animal a2=new Lobo ("Mike", 8, 10.30, "aullido", "carniboro",
                "bosque", "Canis lupus");
        Animal a3=new Leon ("Simba", 5, 20.70, "rugido", "carniboro",
                "sabana", "Panthera leo");
        Animal a4=new Gato ("Lion", 11, 6.20, "maullido", "carniboro",
                "domestico", "Felis silvestris catus");
        //Métodos de mostrar los objetos creados
        a1.mostrarAnimal();
        a2.mostrarAnimal();
        a3.mostrarAnimal();
        a4.mostrarAnimal();
    }
    
}
