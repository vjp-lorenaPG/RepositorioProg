/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e14;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 14.- Diseña programa que almacene las temperaturas medias de un mes
 * que introduzca un usuario. Para hacerlo más sencillo vamos a suponer que el
 * mes tiene 28 días y está formado por 4 semanas de 7 días. Hasta que el
 * usuario pulse 5, mostrar un menú que nos permita: 
 * 1. Rellenar las
 * temperaturas. 
 * 2. Mostrar las temperaturas. 
 * 3. Visualizar la temperatura media
 * del mes. 
 * 4. Día o días más calurosos del mes. Ejemplo: El día o días más
 * calurosos fueron: • El Jueves de la Semana 3 con 40 grados. • El Sábado de la
 * Semana 4 con 40 grados. 
 * 5. Salir del programa. 
 * • Fíjate que necesitarás otro array con el nombre de los días de la semana
 *
 * @author alumno
 */
public class T7E14 {
    public final static int FIL =4;//Constantes para controlar el rango de la matriz.
    public final static int COL= 7;
    
    //Método para rellenar la matriz de temperaturas manualmente.
    public static void rellenarTemperaturas (int [][] matriz, String [] dias){
        //Bucle para recorrer la matriz intoduciendo datos.
        for(int i= 0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                System.out.println("Introduzca las temperaturas del dia " + dias[j] + " de la semana " + (i+1));
                matriz[i][j]=pedirNum();//Método para pedir el número al usuario
            }
        }
    }
    ///////////////////////////////////------------------------------------------
    //Método para probar el funcionamiento de manera eficiente-------------------
    public static void rellenarArrays (int matriz [] []){//Método para guardar el número aleatorio.
        System.out.println("Rellenando la matriz..");
        for(int i=0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                matriz[i][j]=generarAleatorio();
            }
        }
        System.out.println("Completado");
    }
    //Método para probar el funcionamiento de manera eficiente-------------------
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=30;
        int min=0;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    /////////////////////////////////////---------------------------------
    public static int pedirNum(){/*Método para pedir un número al usuario, tanto 
        para usarlo como opción del menú como para recibir los valores de la matriz */
        boolean valido=true;//Boolean para controlar si el usuario introduce un número o no.
        int num=0;
        Scanner entrada= new Scanner (System.in);
        //Bucle para controlar la excepción InputMismatch
        do{
            valido=true;
            try{//Control de excepciones
                num=entrada.nextInt();
            }catch(InputMismatchException e){
                entrada.nextLine();
                valido=false;
                System.out.println("Ha introducido un caracter incompatible."+
                        "Por favor, introduzca solamente numeros.");
            }
            
        }while(!valido);
        
        
        return num;
    }
    
    public static void mostrar (int [][] matriz, String [] dias){/*Método para mostrar
        de forma bonita, reusable.*/
        
        //For para mostrar los dias.
        System.out.println("Mostrando el valor de los campos de la matriz");
        for(int k=0;k<dias.length; k++){
            System.out.print(dias[k] + ",");
        }
        System.out.println("");
        //For para mostrar los valores asociados las semanas en orden
        for(int i =0; i<FIL; i++){
            System.out.println("Semana "+ (i+1));
            for(int j = 0; j<COL; j++){
                System.out.print( " ["+ matriz[i][j]+ "]" + ",");
            }
            System.out.println("");
        }
        
    }
    //Método para calcular la media de las temperaturas del mes
    public static void calcularMedia (int [][]matriz){
        int media=0;
        int contador=0;//Contador para calcular la cantidad de valor que existen y hacer la media.
        for(int i=0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                media+=matriz[i][j];
                contador++;
            }
        }
        media=media/contador;
        System.out.println("La media de tempraturas del mes es "+ media + " grados centigrados");
        
    }
    /*Método para calcular el valor mayor de las temperaturas. No las imprime,
    tiene que compararlas después para saber si hay mas días con la misma temperatura*/
    public static int calcularMayor (int [][] matriz){
        int mayor=matriz[0][0];
        for(int i =0; i<FIL ; i++){
            for(int j=0; j<COL; j++){
                if(matriz[i][j]>mayor){
                    mayor=matriz[i][j];
                }
            }
        }
        
        return mayor;//Devuelve el valor mayor para buscar coincidencias en el mes.
    }
    //Método para imprimir las coincidencias con el valor mayor de temperaturas del método anterior.
    public static void imprimirCoincidencias (int [][] matriz, String [] dias, int num){
        
        System.out.println("Imprimiendo dias o dia con mayor temperatura");
        for(int i=0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                if(num==matriz[i][j]){
                    System.out.println("El dia " + dias[j] + " de la semana " + (i+1) + " con " + num);
                }
            }
                    
        }
    }
    //Menú para interactuar con el programa y sus métodos.
    public static void menu (int [][] matriz, String [] dias){
        /*Al pedir num necesito poner antes un sout porque no esta implementado en el
        metodo para usarlo con el pedir datos para rellenar la matriz.*/
        boolean salir=false;//Condición para salir.
        boolean bienvenida=false;//Condición para imprimir la bienvenida
        boolean relleno=false;//Condición para confirmar que se ha rellenado el mes.
        int opcion=0;
        int mayor;//Variable para recibir el valor mayor de las temperraturas.
        do{
            if(!bienvenida){
                System.out.println("Bienvenido al programa");
                bienvenida=true;
            }
            System.out.println("Pulse: \n"+
                " * 1. Rellenar las temperaturas. \n"+
                " * 2. Mostrar las temperaturas. \n" +
                " * 3. Visualizar la temperatura media del mes.\n" +
                " * 4. Dia o dias mas calurosos del mes.\n"+
                " * 5. Salir del programa");
            opcion=pedirNum();//Pido numero para interactuar con el programa.
            
            if(!relleno&&opcion>1&&opcion<5){
                System.out.println("Aun no ha rellenado las temperaturas");
                opcion=0;
            }
            
            switch(opcion){
                case 1:{
                    System.out.println("Ha seleccionado rellenar las temperaturas \n"+
                            "Pulse: \n"+
                            "* 1. Para rellenar las temperaturas una por una. \n"+
                            "* 2. Para relllenar las temperaturas automaticamente.");
                
                    opcion=pedirNum();
                    if(opcion==1){
                        System.out.println("Ha seleccionado rellenar las temperaturas una por una.");
                        rellenarTemperaturas(matriz, dias);
                        relleno=true;
                    }else if  (opcion==2){
                        System.out.println("Ha seleccionado que se rellenen automaticamente.");
                        rellenarArrays(matriz);
                        relleno=true;
                    }else{
                        System.out.println("El número introducido no es uno o dos, vuelva a intentarlo.");
                    }
                    break;
                }
                case 2:{
                    System.out.println("Ha seleccionado mostrar las temperaturas.");
                    mostrar(matriz, dias);
                    break;
                }
                case 3:{
                    System.out.println("Ha seleccionado mostrar la temperatura media.");
                    calcularMedia(matriz);
                    break;
                }
                case 4:{
                    System.out.println("Ha seleccionado mostrar la o las temperaturas mas altas.");
                    mayor=calcularMayor(matriz);
                    imprimirCoincidencias(matriz, dias,mayor );
                    break;
                }
                case 5:{
                    System.out.println("Ha seleccionado salir del programa.\n"+
                            "Saliendo...");
                    salir=true;
                    break;
                }
                default:{
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
        
        int [][] matriz = new int [FIL][COL];
        String [] dias= {"Lunes ", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
        menu(matriz, dias);
    }
    
}
