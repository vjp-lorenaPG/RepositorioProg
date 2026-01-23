/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e10;

/**Ejercicio 10.- Escribe un programa que contenga un método que rellene un
 * vector de 10 números enteros con números aleatorios entre 1 y 8, pudiendo
 * contener elementos duplicados. • Otro método visualizará el array creado.
 * Luego, otro método debe sustituir cada valor repetido por 0. Para terminar,
 * vuelve a visualizar el array ya modificado. • Ejemplo de ejecución: Se han
 * generado los siguientes números: 8 1 5 7 2 1 5 4 3 6 Sustituimos los
 * elementos repetidos por un 0: 8 0 0 7 2 0 0 4 3 6

 *
 * @author galin
 */
public class T7E10 {
    
    public static void generarAleatorio (int [] vector){//Método para generar aleatorios
        int min=1;
        int max=8;
        System.out.println("* -- ---- Generando aleatorios ---- -- *");
        for(int i=0; i<vector.length; i++){//Bucle para generar aleatorios
            vector[i]=(int) (Math.random()*(max-min+1)+min);
        }
        System.out.println("* -- ---- Completado ---- -- *");
    }
    
    public static void mostrar (int []vector){//Método mostrar el valor de los campos del vector.
        
        System.out.println("* -- ---- Mostrando los numeros. ---- -- *");
        for (int i=0; i<vector.length; i++){//Bucle para recorrer los campos del vector e imprimir.
            System.out.print(vector[i] + ",");
        }
        System.out.println("* -- ---- ---- -- *");
    }
    /*Método para sustituir UN número repetido, solo uno que se obtendrá del índice que viene del main con
    un for para enviar con las iteraciones cada índice y comprobar el valor de ese índice con el valor de los 
    siguientes índices*/
    public static void sustituirRepetidos (int [] vector, int indice){
        int valor=vector[indice];/*Variable donde guardo el valor del índice que 
        traigo desde el main que extraigo con vector[]*/
        //Bucle para recorrer desde la posición dada por el main hasta en final del vector.
        /*¡¡DATO!!: No recorre el vector con cada iteración, empieza en la posición SIGUIENTE del índice aportado*/
        for(int i =indice + 1; i<vector.length; i++){
            
            if(vector[i]==valor){
                vector[i]=0;
                vector[indice]=0;
            }
            
        }
        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int []vector=new int [10];
        generarAleatorio(vector);
        mostrar(vector);
        System.out.println("* -- ---- sustituyendo repetidos ---- -- *");
        for(int i=0; i<vector.length;i++){
            sustituirRepetidos(vector, i);
        }
        mostrar(vector);
    }
    
}
