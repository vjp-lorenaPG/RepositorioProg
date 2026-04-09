/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11e08;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**• Ejercicio 08.- Una importante empresa multinacional nos ha solicitado un
 * programa para gestionar las distintas sedes que tiene repartidas a lo largo
 * del mundo. Para ello, dispondremos de un arrayList de ciudades. De cada
 * ciudad, almacenaremos su nombre y un conjunto de sedes (elige el tipo de
 * conjunto que prefieras). 
 * • De cada sede almacenaremos el nombre de la sede y sus ingresos anuales.
 *
 * • Implementa las siguientes opciones para el software: 
 * • Añadir una ciudad (al menos pediremos los datos de una sede. Después de añadir cada sede,
 * preguntaremos al usuario si desea seguir añadiendo sedes). 
 * • Mostrar todas las ciudades junto con sus sedes. 
 * • Método que muestre el nombre de las sedes cuyos ingresos anuales son superiores a la media. 
 * • Buscar por nombre de sede. (El método retornará un booleano). 
 * • Añadir sede (pediremos el nombre
 * de la ciudad y, si ésta existe en el arrayList, pediremos los datos de la
 * nueva sede y los insertaremos).  
 * • Mostrar todas las sedes ordenadas de mayor a menor número de ingresos anuales 
 * (PISTA: Utiliza una estructura de datos donde ir añadiendo todas las sedes de manera ordenada).
 * @author galin
 */
public class T11E08 {
    //Método para pedir nombre de la ciudad
    public static String pedirNombreCiudad() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la ciudad");
        nombre= entrada.nextLine();
        return nombre;
    }
    //Método para pedor nombre de la sede
    public static String pedirNombreSede() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la Sede");
        nombre= entrada.nextLine();
        return nombre;
    }
    //Método para pedir ingresos
    public static double pedirNum(){/*Método para pedir un número al usuario */
        boolean valido=true;//Boolean para controlar si el usuario introduce un número o no.
        double num=0;
        Scanner entrada= new Scanner (System.in);
        System.out.println("Introduzca los ingresos");
        //Bucle para controlar la excepción InputMismatch
        do{
            valido=true;
            try{//Control de excepciones
                num=entrada.nextDouble();
            }catch(InputMismatchException e){
                entrada.nextLine();
                valido=false;
                System.out.println("Ha introducido un caracter incompatible."+
                        "Por favor, introduzca solamente numeros separados por un punto.");
            }
            
        }while(!valido);
        
        
        return num;
    }
    //Método para añadir una sede a su ciudad
    public static void addSedeACiudad(TreeSet<Ciudad> ciudades) {
        String nombreCiudad = pedirNombreCiudad();
        boolean encontrada = false;

        for (Ciudad ciudad : ciudades) {
            if (ciudad.getNombre().equalsIgnoreCase(nombreCiudad)) {
                String nombreSede = pedirNombreSede();
                double ingresos = pedirNum();

                ciudad.getSedes().add(new Sede(nombreSede, ingresos));
                encontrada = true;
            }
        }

        if (!encontrada) {
            System.out.println("Ciudad no encontrada");
        }
    }
    //Método para añadir ciudad con su sede o sedes
    public static void addCiudadYSede(TreeSet <Ciudad> ciudades){
        boolean seguir=true;
        Scanner entrada = new Scanner (System.in);
        String eleccion="";
        System.out.println("Registrando ciudad:");
        String nombreSede="";
        double ingresosSede=0.0;
        Ciudad ciudad=new Ciudad(pedirNombreCiudad());
        while (seguir) {    
            ciudad.getSedes().add(new Sede(pedirNombreSede(),pedirNum()));
            System.out.println("Desea añadir mas sedes" +
                "Introduzca Si / No.");
            if(entrada.nextLine().equalsIgnoreCase("no")){
                seguir=false;
            }else{
                seguir=true;
                //Añadir sede a la ciudad añadida antes?
            }
        }
        ciudades.add(ciudad);
    }
    
    //Método para mostrar los las sedes con ingresos mayores a la media global
    public static void mostrarIngresosSedesMayoresAMedia (TreeSet <Ciudad> ciudades){
        double totalIngresos=0.0;
        int totalSedes=0;
        double mediaGlobal;
        for (Ciudad ciudad : ciudades) {//for para calcular media global
            totalIngresos+=ciudad.totalIngresosSedes();
            totalSedes+=ciudad.getSedes().size();
        }
        mediaGlobal=totalIngresos/totalSedes;
        //For para imprimir sedes que superen la media global
        for (Ciudad ciudad : ciudades) {
            ciudad.imprimirSedesPorEncimaDeMediaGlobal(mediaGlobal);
        }
        
    }
    //Método para buscar una sede por su nombre
    public static void buscarSedePorNombre (TreeSet <Ciudad> ciudades){
        
        boolean encontrado=false;
        for (Ciudad ciudad : ciudades) {
            encontrado=ciudad.buscarSedePorNombre(pedirNombreSede());
            if (encontrado) {
                System.out.println("La sede existe en la ciudad: " + ciudad.getNombre());
                System.out.println(ciudad.getSedes().toString());
            }
        }
        if (!encontrado) {
            System.out.println("No se han encontrado coincidencias");
        }
    }
    //Método mostrar
    public static void mostrar(TreeSet <Ciudad> ciudades){
    
    
        for (Ciudad ciudad : ciudades) {
            System.out.println(ciudad);
        }
    }
    //Método que gestiona el programa
    public static void menu(TreeSet <Ciudad> ciudades){
    System.out.println("1. Añadir ciudad");
    System.out.println("2. Mostrar ciudades");
    System.out.println("3. Mostrar sedes > media");
    System.out.println("4. Buscar sede");
    System.out.println("5. Añadir sede a ciudad");
    System.out.println("6. Salir");
    
    Scanner entrada = new Scanner(System.in);
    
    int opcion;
    
    do {//Bucle para llamar a las opciones
        opcion = entrada.nextInt();
        entrada.nextLine();
        
        switch(opcion){
            case 1:
                addCiudadYSede(ciudades);
                break;
            case 2:
                mostrar(ciudades);
                break;
            case 3:
                mostrarIngresosSedesMayoresAMedia(ciudades);
                break;
            case 4:
                buscarSedePorNombre(ciudades);
                break;
            case 5:
                addSedeACiudad(ciudades);
                break;
            case 6:
                System.out.println("Ha seleccionado salir");
                System.out.println("Cerrando el programa...");
        }
        
    } while(opcion != 6);
}

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TreeSet <Ciudad> ciudades = new TreeSet<> ();
        menu(ciudades);//Llamo al método que gestiona el programa
        
    }
    
}
