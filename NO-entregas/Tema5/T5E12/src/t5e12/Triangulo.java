/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e12;

/**Ejercicio 12.- Escribe un programa en JAVA orientado a objetos, en el que se
 * le pida al usuario que introduzca la longitud de los catetos de un triángulo
 * rectángulo y que posteriormente el programa calcule la longitud de la
 * hipotenusa. • Para ello necesitarás una clase Triangulo con 2 atributos:
 * cateto1, cateto2. • En una clase Test crearás un objeto de la clase Triangulo
 * donde el tamaño de los catetos se los pedirás al usuario para pasárselos al
 * constructor. En esta clase también tendrás un método que calcule la
 * hipotenusa y otro método se encargará de mostrar los resultados por la
 * pantalla.
 *
 * @author galin
 */
public class Triangulo {
    private double cateto1;
    private double cateto2;
    
    public Triangulo(){
        cateto1=0;
        cateto2=0;
    }
    public Triangulo(double c1, double c2){
        cateto1=c1;
        cateto2=c2;
    }
    
    public void setCateto1(double c1){
        this.cateto1=c1;
        
    }
    public void setCateto2(double c2){
        this.cateto2=c2;
        
    }
    public double getCateto1(){
        return cateto1;
        
    }
    public double getCateto2(){
        return cateto2;
        
    }
    public void mostrarTriangulo (){
        
        System.out.println("El valor de los catetos es: " + cateto1 + cateto2);
    
    }
   
}   
