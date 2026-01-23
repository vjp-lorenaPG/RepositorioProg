/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e19;

/**Ejercicio 19.- Realiza un programa que cree un vector de 100 posiciones con
 * números aleatorios entre 10 y 80. Una vez creado este vector, el programa
 * deberá mostrar el mayor, el menor, el valor que más se repite y la media.
 *
 * @author galin
 */
public class T7E19 {
    
    public static void rellenarArrays (int vector []){//Método para guardar el número aleatorio.
        System.out.println("Rellenando el array..");
        for(int i=0; i<vector.length; i++){
            vector[i]=generarAleatorio();
        }
        System.out.println("Completado");
    }
    
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=80;
        int min=10;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    public static void calcularMayor (int [] vector){//Método para calcular el mayor e imprimirlo.
        int mayor=vector[0];
        
        //Bucle para busar el mayor y guardarlo
        for(int i =0; i<vector.length ; i++){
            if(vector[i]>mayor){
                mayor=vector[i];
            }
        }
        
        System.out.println("El mayor es: " + mayor);
    }
    
    //Método para calcular el menor e imprimirlo
    public static void calcularMenor (int [] vector){
        int menor=vector[0];
        
        //Bucle para calcular el menor y guardarlo
        for(int i =0; i<vector.length ; i++){
            if(vector[i]<menor){
                menor=vector[i];
            }
        }
        
        System.out.println("El menos es: " + menor);
    }
    
    //Método para calcular la media de los valores.
    public static void calcularMedia (int [] vector){
        int contador=0;
        int media=0;
        for(int i =0; i<vector.length ; i++){
            media+=vector[i];
        }
        media=media/vector.length;
        System.out.println("La media es: " + media);
        
    }
    
    //Método para calcular cual es el número mas repetido.
    public static void calcularRepetido (int [] vector){
        
        int maxRepeticiones = 0;
        int rept;
        int masRepetido=vector[0];
        
        /*For para recorrer el vector y llamar al método que calcula las repeticiones
        y despues las guarda si el número es mayor que el guardado en la variable maxRepeticones*/
        for(int i=0; i<vector.length; i++){
            rept = repeticiones(vector[i], vector);

            if (rept > maxRepeticiones) {
                maxRepeticiones = rept;
                masRepetido = vector[i];
            }
        }
        
        System.out.println("El numero mas repetido es el "+ masRepetido);
    }
    
    //Método que calcula cuántas veces se repite un número en el vector.
    public static int repeticiones (int num, int [] vector){
        int repeticiones=0;
        
        //For recorre el vector buscando coincidencias.
        for(int i=0; i<vector.length; i++){
            if(num==vector[i]){
                repeticiones++;
            }
        }
        
        return repeticiones;
    }
    
    //Método para mostrar
    public static void mostrar (int [] vector){/*Método para mostrar
        de forma bonita, reusable.*/
        System.out.println("Mostrando el valor de los campos ");
        for(int i =0; i<vector.length; i++){
            
            System.out.print( "["+ vector[i]+ "]" + ",");
              
        }
        System.out.println("");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int [] vector = new int [100];
        
        rellenarArrays(vector);//Relleno el array
        calcularMayor(vector);//Imprime el mayor
        calcularMenor(vector);//Imprime el menor
        calcularMedia(vector);//Imprime la media
        calcularRepetido(vector);//Imprime el mas repetido
    }
    
}
