/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6e8;

/**Realiza un programa en JAVA, orientado a objetos, en el que crees una clase
 * llamada Vehiculo que contenga un atributo velocidad y el método abstracto
 * mostrarMovimiento. Ademas, debes crear dos clases que hereden de Vehiculo
 *
 * @author Lorena
 */
public class T6E8 {
    
    public static void procesarVehiculo (Vehiculo vehiculo){
        
        if(vehiculo instanceof Coche){
            System.out.println("*-- ------------------------ --");
            System.out.println("Es un coche");
            Coche c1 = (Coche)vehiculo;
            if(c1.getAireEncendido()){
            c1.mostrarMovimiento();
            }else {
            c1.encenderAire();
            c1.mostrarMovimiento();
            }
        }else if(vehiculo instanceof Moto){
            System.out.println("*-- ------------------------ --");
            System.out.println("Es una moto");
            Moto m1 = (Moto) vehiculo;
            if(m1.getHaciendoCaballito()){
            vehiculo.mostrarMovimiento();
            }else {
            m1.setHaciendoCaballito(true);
            vehiculo.mostrarMovimiento();
            }
        }
        
    
    } 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehiculo c1 = new Coche();
        Vehiculo m1 = new Moto ();
        
        procesarVehiculo(c1);
        procesarVehiculo(m1);
    }
    
}
