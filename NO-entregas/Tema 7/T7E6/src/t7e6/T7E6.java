/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e6;

/**Ejercicio 06.- Escribir un programa que rellene un array unidimensional con
 * los 80 primeros números primos y luego los visualice.
 * • Ejemplo de ejecución:
 * Contenido de un array unidimensional de 80 posiciones con números primos:
 *Clase
 * @author Lorena
 */
public class T7E6 {
    
    public static boolean verificarPrimo (int num){//método para comprobar si num es primo.
        
        boolean esPrimo=true;/*Boolean para devolver si es primo o no. Partimos del supuesto
        de que es primo*/
        
        for (int i = 2; i <= num / 2; i++) {/*For para recorrer hasta encontrar un divisior 
        o llegar hastala mitad de num.*/
            if (num % i == 0) {//Si encuentra un divisor no es primo.
                esPrimo=false;
                return esPrimo; // Devuelvo un falso porque tendria un divisor y estamos buscando que no tenga
            }
        }
        
        return esPrimo;
    }
    
    public static void mostrar (int []vector){//Método mostrar el valor de los campos del vector.
        
        System.out.println("* -- ---- Mostrando los primos. ---- -- *");
        for (int i=0; i<vector.length; i++){//Bucle para recorrer los campos del vector e imprimir.
            System.out.println(vector[i]);
        }
        System.out.println("* -- ---- ---- -- *");
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador=0;//Contador de los primos que encuentra.
        int num=2;//Variable que tendra el número que comprobaremos si es primo.
        int [] vector= new int [80];
        boolean primo=false;
        
        
        do {//Bucle para calcular los primos y guardarlos.
            primo=verificarPrimo(num);
            
            if(primo){
                vector[contador]=num;
                num++;
                contador++;
            }else {
                num++;
            }
            
        }while (contador!=80);//Condición para terminar el bucle. Mientras no sea 80.
            
        mostrar(vector);//Llamo al método mostrar para imprimir.
        
        
        
    }
    
}
