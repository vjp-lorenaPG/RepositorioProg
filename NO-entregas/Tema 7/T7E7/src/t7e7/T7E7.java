/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e7;

/**• Ejercicio 07.- Realiza un programa que cree 15 números aleatorios (entre 0
 * y 50) y muestre los 10 mayores.
 *
 * @author galin
 */
public class T7E7 {
    public static void generarAleatorio (int [] vector){//Método para generar aleatorio y guardarlo.
        int min=0;
        int max=50;
        
        for(int i = 0; i<vector.length; i++){//Bucle que genera aleatorios
            vector[i]=(int) (Math.random()*(max-min+1)+1);
        }
    }
    
    
    public static void mostrarMayor (int [] vector){//Método para mostrar los 10 mayores.
        int siguiente=0;
        int aux=0;
        
        System.out.println("* -- ---- Mostrando los 10 nmeros mayores. ---- -- *");
        for(int j=0;j<12;j++){//Bucle para hacer cambio de valores n-1 veces.
            for(int i=0; i<11;i++){//Bucle para comparar los valores y cambiarlos desde la posición 0 al 11(una vuelta).
                siguiente=i+1;

                if( vector[i]<vector[siguiente]){//Condición para cambiar los valores.
                    aux=vector[i];
                    vector[i]=vector[siguiente];
                    vector[siguiente]=aux;
                }
            } 
        }
        for(int i=0; i<10; i++){//Método para imprimir los mayores.
            System.out.println( vector[i]);
        }
        System.out.println("* -- ---- ---- -- *");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vector = new int [15];//Declaro
        generarAleatorio(vector);//Relleno con aleatorios
        mostrarMayor(vector);//Llamo al método para imprimir
        
    }
    
}
