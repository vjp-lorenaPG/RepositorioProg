/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e28;



/**Ejercicio 28.- Realiza un programa que genere un número aleatorio (utiliza
 * Math.random() ) entre 1 y 100, que lo muestre por pantalla e indique si es
 * par o impar
 *
 * @author galin
 */
public class T3E28 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        int aleatorio =(int) Math.floor((Math.random()*100+1));
        System.out.print("El numero " + aleatorio);
        
        
        if (aleatorio%2==0){
            System.out.print(" es par ");
        }else {
            System.out.print(" es impar ");
        }
    }
    
}
