/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t11e03;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Ejercicio 03.- Diseña un programa en Java para gestionar los autobuses de la
 * estación de Plasencia. 
 * • Nuestro programa dispondrá de un vector de 6 celdas dónde “aparcar” los autobuses. 
 * • De cada autobús, almacenaremos su matrícula y los conductores que tiene asignados (los cuales se almacenarán en un
 * HashMap). 
 * • De cada conductor almacenaremos su DNI (que hará las veces de
 * clave) y su nombre.
 * @author alumno
 * 
 * El programa dispondrá del siguiente menú: 
 * • Aparcar (pedirá un número, que será la posición del vector donde deberemos aparcar el autobús. Si la
 * posición está ocupada, se volverá a pedir hasta encontrar una libre).
 * • Mostrar dársenas libres. 
 * • Buscar autobús (método que muestre toda la información del autobús a partir de su matrícula). 
 * • Buscar conductor (Mostrará la matrícula del autobús que tiene asignado). 
 * • Método que retorne la posición del vector donde se encuentra el autobús con mayor número de
 * conductores asignados.
 */
public class T11E03 {
    //Método para pedir el dni del conductor
    public static String pedirDNI() {
        String dni;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el numero de DNI");
        dni= entrada.nextLine();
        return dni;
    }
    //Método para pedir un nombre
    public static String pedirNombre() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca elnombre del conductor");
        nombre= entrada.nextLine();
        return nombre;
    }
    //Método para pedir una matricula de un autobús
    public static String pedirMatricula() {
        String matricula;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la matricula");
        matricula= entrada.nextLine();
        return matricula;
    }
    //Método para pedir el numero de conductores que desea introducir.
    public static int pedirConductores(){
        int numConductores=0;
        System.out.println("Introduzca el numero de conducctores que desea ingresar");
        Scanner entrada= new Scanner (System.in);
        boolean valido = false;
        do{
            valido=true;
            try{//Control de excepciones
                numConductores=entrada.nextInt();
            }catch(InputMismatchException e){
                entrada.nextLine();
                valido=false;
                System.out.println("Ha introducido un caracter incompatible."+
                        "Por favor, introduzca solamente numeros.");
            }
            
        }while(!valido);
        return numConductores;
    }
    //Método para pedir un numero de aparcamiento
    public static int pedirNum() {
        boolean valido=true;//Boolean para controlar si el usuario introduce un número o no.
        int num=0;
        boolean exception=false;
        System.out.println("Introduzca el numero del aparcamiento que desea ocupar entre el 1 y el 6");
        Scanner entrada= new Scanner (System.in);
        //Bucle para controlar la excepción InputMismatch
        do{
            valido=true;
            try{//Control de excepciones
                num=entrada.nextInt();
            }catch(InputMismatchException e){
                entrada.nextLine();
                valido=false;
                exception=true;
                System.out.println("Ha introducido un caracter incompatible."+
                        "Por favor, introduzca solamente numeros.");
            }
            if(!exception){
                num-=1;
                if(num>5){//Condifiones para cominucar fallos o no.
                    System.out.println("Ha introduciodo un numero de aparcamiento por encima de las plazas existentes");
                }else if (num<0){
                    System.out.println("Ha introducido una plaza de aparcameinto inferior a los existentes.");
                }else{
                    System.out.println("El numero cumple con alguna plaza existente");
                    valido=true;
                }
            }
        }while(!valido);
        
        
        return num;
    }
    //Método para añadir los conductores que anteriormente indico el usuario
    public static void addConductores (int numConductores, Autobus aut){
        HashMap <String,String> map=aut.getConductores();
        for (int i = 0; i < numConductores; i++) {
            map.put(pedirDNI(),pedirNombre());
        }
    
    }
    /**Método para aparcar y crear los autobuses según el aparcamiento que indica 
    el usuario y siempre que esté libre**/
    public static void  aparcar (Autobus []autobuses){
    
        int numAparcamiento;
        int numConductores;
        boolean libre=false;
        while (!libre) {//Bucle para crear el conductor cuando el aparcamiento esté libre
            numAparcamiento=pedirNum();
            if(autobuses[numAparcamiento]==null){
                autobuses [numAparcamiento]= new Autobus(pedirMatricula());
                numConductores=pedirConductores();
                addConductores(numConductores, autobuses[numAparcamiento]);
                libre=true;
            }
            else {
                System.out.println("El aparcamiento está ocupado");
            }
        }
    }
    //Método para mostrar los aparcamientos libres
    public static void mostrarLibres(Autobus[] autobuses){
        for (int i=0; i<autobuses.length; i++) {//Bucles
            if (autobuses[i]==null) {
                System.out.println("Espacio libre numero: "+ (i+1));
            }
        }
    
    }
    //Método para buscar el conductor indicado por el usuario
    public static void buscarConductor (Autobus[] autobuses){
        String nombreConductor=pedirNombre();
        boolean encontrado=false;
        int i=0;
        while (!encontrado && i<autobuses.length ) {//Bucle 
            if(autobuses[i]!=null){  //Condición para saber si esa posción está ocupada 
                if (autobuses[i].buscarConductor(nombreConductor)) {//Condición para saber si existe ese conductor
                        System.out.println("Conductor encontrado asociado a: " +"\n"+ autobuses[i].toString());
                        encontrado=true;
                }
            }
            i++;
        }
        if (!encontrado) {//Feedback
            System.out.println("Conductor no encontrado");
        }
    
    }
    
    //Método para buscar la poscion del autobus con mas conductores.
    public static int buscarPoscionConMasConductores (Autobus[] autobuses){
        int posicionMaxConductores=-1;
        int maxConductores=0;
        for (int i = 0; i <autobuses.length; i++) {// Bucle
            if(autobuses[i]!=null){  //Condición para controlar si es null o no  
                if (maxConductores<autobuses[i].contarConductores()) {//Condición para guardar el máximo
                    posicionMaxConductores=i;
                }
            }
        }
        return posicionMaxConductores;
    }
    //Método para buscar un autobús
    public static void buscarAutobus (Autobus[] autobuses){
        
        String matricula=pedirMatricula();
        boolean encontrado=false;
        int i=0;
        while (!encontrado && i<autobuses.length ) {//Bucle
            if(autobuses[i]!=null){    
                /*Condición para comparar matriculas y encontrar un vehiculo*/
                if (autobuses[i].getMatricula().equalsIgnoreCase(matricula)) {
                        System.out.println("Autobus encontrado: " +"\n"+ autobuses[i].toString());
                        encontrado=true;
                }
            }
            i++;
        }
        if (!encontrado) {
            System.out.println("Autobus no encontrado");
        }
    }
    //Menú para controlar el programa.
    public static void menu (Autobus[] autobuses){
        boolean salir=false;//Condición para salir.
        int opcion=0;
        do{
            
            System.out.println("Pulse: \n"+
                " * 1. Aparcar. \n"+
                " * 2. Mostrar darsenas libres. \n" +
                " * 3. Mostrar autobus por su matricula.\n" +
                " * 4. Buscar conductor.\n"+
                " * 5. Buscar el autobus con mas conductores.\n"+
                " * 6. Salir");
            opcion=pedirNum();//Pido numero para interactuar con el programa.
            //Opciones
            switch(opcion){
                case 1:{
                    System.out.println("Ha seleccionado aparcar");
                    aparcar(autobuses);
                    break;
                }
                case 2:{
                    System.out.println("Ha seleccionado mostrar las darsenas libres.");
                    mostrarLibres(autobuses);
                    break;
                }
                case 3:{
                    System.out.println("Ha seleccionado buscar autobus.");
                    buscarAutobus(autobuses);
                    break;
                }
                case 4: {
                    System.out.println("Ha seleccionado buscar un conductor.");
                    buscarConductor(autobuses);
                    break;
                }
                case 5: {
                    int pos = buscarPoscionConMasConductores(autobuses);
                    if (pos != -1) {
                        System.out.println("El autobús con más conductores está en la posición: " + (pos + 1));
                        System.out.println(autobuses[pos]);
                    } else {
                        System.out.println("No hay autobuses");
                    }
                }
                case 6:{
                    System.out.println("Ha seleccionado salir del programa.\n"+
                            "Saliendo...");
                    salir=true;
                    break;
                }default:{
                    System.out.println("El numero introducido no es correcto, vuelva a intentarlo");
                }
            }
        
        }while (!salir);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Autobus [] autobuses =  new Autobus [6];
        System.out.println("Bienvenido al programa");
        menu(autobuses);
    }

    
}
