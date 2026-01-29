/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t8e7;

/**Ejercicio 07.- Diseña programa que almacene las temperaturas medias de un
 * mes. Para ello crearemos un array unidimensional de 30 posiciones relleno con
 * objetos de la clase Día. La clase Día contiene los siguientes atributos:
 *
 * 
 * • Hasta que el usuario pulse 5, mostrar un menú que nos permita: 
 * 1. Rellenar de forma aleatoria las temperaturas. Además el día 1 del mes no tiene porqué
 * ser un Lunes, será un día aleatorio de la semana. 
 * 2. Mostrar las temperaturas. Ejemplo: Jueves día 1: 40 grados, Viernes día 2: 35 grados,
 * Sábado día 3: 38 grados… 
 * 3. Visualizar la temperatura media del mes. 
 * 4. Día o días más calurosos del mes. Ejemplo: El día o días más calurosos fueron: •
 * El Jueves día 1 con 40 grados. • El Sábado día 18 con 40 grados. 
 * 5. Salir del programa. 
 * • Fíjate que necesitarás otro array con el nombre de los días de la semana.
 *
 * @author galin
 */
public class T8E7 {
    //Método para rellenar el array de objetos con su constructor parametrizado
    public static void rellenarArrays (Dia [] vectorDia, String []nombreDias){//Método para guardar el número aleatorio.
        System.out.println("Rellenando el array..");
        int inicio=generarDiaAleatorio();//Genero un día aleatorio.
        for(int i=0; i<vectorDia.length; i++){
            /*Creo el objeto Dia y lo guardo en el vectorDia[i] con los parametros
            que le paso.*/
            vectorDia[i]= new Dia (nombreDias[(inicio+i)%7]
                    ,generarAleatorio());
        }
        /*Aquí está la lógica complicada el arrays de dias se reinicia cuando llega a 7%7, y 
        siguie hacia arriba hasta volver a dar como resultado 0 en 14, 
        porque 14 entre 7 es 2 con resto 0, ahí inicia, es cíclico el 
        resultado, pero los números siguen aumentando*/
        System.out.println("Completado");
    }
    
    public static int generarDiaAleatorio (){/*Método para generar un número aleatorio
        correspondiente al íncide del vector String que guarda los dias de la semana*/
        int aleatorio;
        int max=6;
        int min=0;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    
    
    //Usado con el metodo rellenar Array
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=40;
        int min=-10;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    
    /*Método para buscar el día mas caluroso y despues imprimir los que coincidan en temperatura*/
    public static void imprimirDiasMasCalurosos (Dia [] vectorDia){
        int maxTemperatura=vectorDia[0].getTemperatura();
        //Bucle para guardar la temperatura más alta y operar con ella mas abajo.
        for(int i=0; i<vectorDia.length; i++){
            if(vectorDia[i].getTemperatura()>maxTemperatura){
                maxTemperatura=vectorDia[i].getTemperatura();
            }
        }
        //Bucle para imprimir coincidencias de la temperatura máxima.
        System.out.println("Mostrando dia o dias mas calurosos.");
        for(int i=0; i<vectorDia.length; i++){
            if(maxTemperatura==vectorDia[i].getTemperatura()){
                vectorDia[i].mostrar(i+1);
            }
        }
    }
    
    //Método mostrar con el método de la Clase Dia
    public static void mostrar(Dia [] vectorDia){
        
        for(int i=0; i<vectorDia.length; i++){
            vectorDia[i].mostrar(i+1);
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo el array de objetos.
        Dia [] dias = new Dia [30];
        String []nombreDias={"Lunes","Martes","Miercoles","Jueves","Viernes",
            "Sabado","Domingo"};
        rellenarArrays(dias, nombreDias);//Creo los objetos y los guardo en el array
        mostrar(dias);//Método mostrar del main.
        imprimirDiasMasCalurosos(dias);//Método que imprime los dias mas calurosos.
        
    }
    
}
