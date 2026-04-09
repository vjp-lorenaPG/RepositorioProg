/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11e06;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 06.- Debido a la avalancha de campañas de donaciones para la compra
 * de material para hospitales y residencias contra el coronavirus, el
 * Ministerio de Sanidad ha decidido crear un software que gestione todo el
 * dinero donado. En la versión alfa del software debemos gestionar las
 * donaciones de una única campaña. Para ello, debemos implementar las
 * siguientes clases: 
 * • Clase Donacion, que almacenará el nombre de la persona
 * que dona y la cantidad donada. 
 * • Clase Campania, que almacenará un conjunto de donaciones y el nombre de la 
 * campaña.
 * 
 * El programa mostrará un menú con las siguientes opciones: 
 * 1. Añadir donación.
 * 2. Mostrar donaciones. 
 * 3. Mostrar donaciones por nombre de donante (Pediremos
 * un nombre y mostraremos las donaciones cuyo donante coincida con el nombre
 * dado). 
 * 4. Mostrar número de donaciones. 
 * 5. Mostrar total dinero recaudado. 
 * 6.Ordenar donaciones (de mayor a menor importe de las donaciones) 
 * 7. Salir.
 * NOTA: No se puede utilizar el método de la Burbuja para realizar la
 * ordenación de las donaciones. 
 * PISTA: Podéis utilizar un vector de Donaciones
 * donde ir insertándolas de manera ordenada.
 *
 * @author galin
 */
public class T11E06 {
    public static String pedirNombre(){
        String nombre="";
        Scanner entrada =  new Scanner (System.in);
        System.out.println("Introduzca el nombre");
        return nombre=entrada.nextLine();
        
    }
       
    public static int pedirOpcion (){//Método para recibir la elección del usuario.
        int num=0;
        Scanner entrada=new Scanner(System.in);
        boolean correcto=false;//Boolean para controlar el numero.
        do{//Bucle para controlar el número recibido.
            System.out.println("Introduzca su opcion");
            try{//Controlador de errores.
                num=entrada.nextInt();
                correcto=true;
            }catch (InputMismatchException e){//Error si no se introduce un numero.
                entrada.next();
                System.out.println("Error, ha introducida algo distinto a un numero."
                        + "Vuelva a intantarlo.");
                correcto=false;
            }
            
        }while (!correcto);//Condición para salir.
        return num;//Devuelvo la opción.
    }
        
    public static void mostrar (Campania camp){/*Método para mostrar
        de forma bonita, reusable.*/
        System.out.println("Mostrando el valor de las donaciones ");
       
        System.out.print( camp.toString());
    }
    /*Método para buscar un resultado por un nombre*/
    public static void buscarNombreDonante (Campania camp){
        boolean encontrado=false;
        String nombre=pedirNombre();
        int i=0;
        while(!encontrado && i<camp.getDonaciones().size()){//Bucle
            if(nombre.equalsIgnoreCase(camp.getDonaciones().get(i).getNombre())){
               encontrado=true;
                System.out.println("COincidencia encontrada con nombre: "+ nombre);
                System.out.println(camp.getDonaciones().get(i));
            }
            i++;
        }
        
    }
    //Método para mostrar las donaciones realizadas
    public static void mostrarNumeroDonaciones (Campania camp){
    
        System.out.println("Mostrando el numero de donaciones realizadas:");
        System.out.println(camp.getDonaciones().size());
    }
    //Método para mostrar la cantidad total del dinero de las donaciones
    public static void mostrarSumaDonaciones(Campania camp){
        double total=0.0;
        for (int i = 0; i <camp.getDonaciones().size(); i++) {
            total+=camp.getDonaciones().get(i).getCantidad();
        }
        System.out.println("El total de las donaciones asciende a:" +total+ "€");
    }
    //Método que devuelve la posición donde debería ir la cantidad donada.
    public static int buscarPosicionVector(double cantidad, Donacion[] donaVector, int numElementos){

        int i = 0;

        while(i < numElementos && cantidad < donaVector[i].getCantidad()){
            i++;
        }
        return i; // devuelve directamente la posición correcta
    }
    //Método que ordena las donaciones.
    public static Donacion[] ordenarDonacionesConVector (Campania camp){

        Donacion[] donaVector = new Donacion[camp.getDonaciones().size()];
        int numElementos = 0; // control real de posiciones ocupadas
        for(int i = 0; i < camp.getDonaciones().size(); i++){//Bucle
            Donacion nueva = camp.getDonaciones().get(i);
            //Guardo la posición donde debería ir.
            int posicion = buscarPosicionVector(nueva.getCantidad(), donaVector, numElementos);
            //Bucle para mover elementos
            for(int j = numElementos; j > posicion; j--){// Desplazo para hacer hueco
                donaVector[j] = donaVector[j-1];
            }
            // Inserto en su sitio
            donaVector[posicion] = nueva;
            numElementos++; // aumento elementos reales
        }

     return donaVector;
    }
    public static void menu(Campania camp){
        int opcion;
        do{//Bucle para interactuar
            System.out.println("""
                    1. Añadir donación
                    2. Mostrar donaciones
                    3. Buscar por nombre
                    4. Número de donaciones
                    5. Total recaudado
                    6. Ordenar donaciones (vector)
                    7. Salir
                    """);
            opcion = pedirOpcion();
            switch(opcion){//Switch
                case 1 -> {
                    String nombre = pedirNombre();
                    System.out.println("Introduzca cantidad:");
                    Scanner entrada = new Scanner(System.in);
                    double cantidad = entrada.nextDouble();

                    camp.getDonaciones().add(new Donacion(nombre, cantidad));
                }
                case 2 -> mostrar(camp);

                case 3 -> buscarNombreDonante(camp);

                case 4 -> mostrarNumeroDonaciones(camp);

                case 5 -> mostrarSumaDonaciones(camp);

                case 6 -> {
                    System.out.println("Donaciones ordenadas (vector):");
                    Donacion[] ordenadas = ordenarDonacionesConVector(camp);
                    for(int i = 0; i < ordenadas.length; i++){
                        if(ordenadas[i] != null){
                            System.out.println(ordenadas[i]);
                        }
                    }
                }
                case 7 -> System.out.println("Saliendo...");

                default -> System.out.println("Opción incorrecta");
            }

        }while(opcion != 7);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Campania camp = new Campania("Campaña Solidaria");
        menu(camp);//Llamo al método que gestiona el programa
    }
    
}
