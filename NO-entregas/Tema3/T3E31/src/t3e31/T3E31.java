/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e31;

/**Ejercicio 31.- Desarrolla un programa que genere números enteros aleatorios
 * entre 1 y 100 hasta obtener 3 números impares.
 *
 * @author Lorena
 */
public class T3E31 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int aleatorio;
        int contador = 0, numImp= 0;
        //Declaro variables.
        do {//Bucle para generar números
            aleatorio = (int)Math.floor(Math.random ()*100 +1);
            if (aleatorio%2!=0){//Averiguo si es impar.
                System.out.print( +aleatorio + " ");
                numImp++;//Cuento los impares para salir del bucle.
            }
        contador++;//Cuento los intentos.    
        }while (numImp<3);//Salir del bucle con 3 impares.
        
        System.out.println ("Cantidad de numeros aleatorios generados: " + contador);
        //Imprimo número de intentos.
        
    }
    
}
