/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e24;

/**
 *Ejercicio 24.- Se plantea desarrollar un programa Java que permita la gestión
 * de una empresa agroalimentaria que trabaja con tres tipos de productos:
 * productos frescos, productos refrigerados y productos congelados. • Todos los
 * productos llevan esta información común: fecha de caducidad y número de lote.
 * • A su vez, cada tipo de producto lleva alguna información específica: • i.
 * Los productos frescos deben llevar la fecha de envasado y el país de origen.
 * • ii. Los productos refrigerados deben llevar el código del organismo de
 * supervisión alimentaria. • iii.Los productos congelados deben llevar la
 * temperatura de congelación recomendada. • Crear el código de las clases Java
 * implementando una relación de herencia desde la superclase Producto hasta las
 * subclases ProductoFresco, ProductoRefrigerado y ProductoCongelado. • Cada
 * clase debe disponer de constructor y permitir establecer (set) y recuperar
 * (get) el valor de sus atributos y tener un método que permita mostrar la
 * información del objeto. • Crear una clase Test con el método main donde se
 * cree un objeto de cada tipo y se muestren los datos de cada uno de los
 * objetos creados.

 * @author Lorena
 */
public class T5E24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creo un objeto de cada tipo con el constructo parametrizado.
        ProductoFresco pF1 = new ProductoFresco ("05/2027", 453720, "25/08/2025", "Espania");
        ProductoRefrigerado pR1 = new ProductoRefrigerado ("12/2027", 215670, 438570);
        ProductoCongelado pC1 = new ProductoCongelado ("03/2030", 350000, -10);
        //Muestro los atributos de los objetos con el mostrar sobrescrito.
        pF1.mostrar();
        pR1.mostrar();
        pC1.mostrar();
    }
    
}
