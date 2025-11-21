/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e11;

/**
 *Ejercicio 11.- Realiza un programa en JAVA, ORIENTADO A OBJETOS, en el que le
 * solicites al usuario 2 números y, si el primer número introducido es mayor
 * que 10, se multipliquen, y en caso contrario que se sumen. Se le mostrará al
 * usuario la operación realizada y su resultado. • Necesitarás una clase
 * “Numero” (con un único atributo llamado “valor”), y una clase Test. En esta
 * última crea dos objetos con el constructor por defecto. Luego, le pides al
 * usuario los valores y se los asignas a los objetos. • En la clase Test
 * también habrá un método para sumar, otro para multiplicar y otro para pedir
 * los valores al usuario.
 * @author Lorena
 */
public class Numero {
    private double valor;
    
    public Numero(){
    
        this.valor=0;
    
    }
    public Numero (double v){
        this.valor=v;
    }
    
    public void setValor (double v){
        this.valor=v;
    }
    
    public double getValor (){
    
        return valor;
    }
    
    public void mostrarValor (){
        System.out.println("El valor del numero es "+valor);
    }
    
}
