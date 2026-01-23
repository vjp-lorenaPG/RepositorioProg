/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e17;

/** Ejercicio 17.- Diseña un método que cree un array unidimensional de 10
 * números enteros aleatorios entre el 0 y el 9. Luego, otro método, lo
 * visualizará por pantalla, otro método ordenará sus elementos de mayor a
 * menor, y por último volverás a visualizar el array ya ordenado.
 *
 *
 * @author Lorena
 */
public class T7E17 {
    
    public static void rellenarArrays (int vector []){//Método para guardar el número aleatorio.
        System.out.println("Rellenando el array..");
        for(int i=0; i<vector.length; i++){
            vector[i]=generarAleatorio();//Genero el aleatorio y lo guardo.
        }
        System.out.println("Completado");
    }
    
    
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=9;
        int min=0;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    //Método para ordenar los valores de l vector de mayor a menor.
    public static void ordenarVector ( int []vector){
        
        System.out.println("Ordenando los datos..");
        int aux=0;
        int siguiente;
        //Doble for para el método de la burbuja 
        for(int i =0; i< vector.length-1; i++){
            for(int j=0; j<vector.length-1;j++){
                siguiente=j+1;
                if(vector[j]<vector[siguiente]){
                    aux=vector[j];
                    vector[j]=vector[siguiente];
                    vector[siguiente]=aux;
                }
            }
        }
        System.out.println("Completado.");
    }
    //Método para mostrar los valores, recorre el arry imprimiendo
    public static void mostrar (int [] vector){
        System.out.println("Mostrando los valores");
        System.out.print("[");
        for(int i=0; i<vector.length; i++){
            System.out.print(vector[i] + ",");
        }
        System.out.println("]");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int [] vector = new int [10];//Declaro
        rellenarArrays(vector);//Relleno con aleatorios
        mostrar(vector);//Imprimo
        ordenarVector(vector);//Ordeno de mayor a menor
        mostrar(vector);//Imprimo
    }
    
}
