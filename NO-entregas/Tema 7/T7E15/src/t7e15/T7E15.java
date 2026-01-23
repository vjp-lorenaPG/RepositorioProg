/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e15;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 15.- Realiza un programa que muestre un menú en el que se le
 * ofrezcan al usuario las siguientes opciones: 
 * 1. Rellenar un array unidimensional de 12 posiciones con las ventas de coches mensuales. Estas
 * ventas serán números aleatorios entre 10 y 100. 
 * 2. Mostrar las ventas introducidas en el punto anterior. 
 * 3. Mostrar las ventas introducidas al revés. 
 * 4. Que muestre la suma total de ventas del año. 
 * 5. Que muestre las ventas totales de los meses pares. 
 * 6. Que muestre el nombre del mes con más ventas. (Necesitarás otro array con el nombre de los meses) 
 * 7. Salir del programa. 
 * • Hasta que el usuario no pulse 7 no saldremos del programa y se
 * volverá a mostrar el menú.
 *
 * @author Lorena
 */
public class T7E15 {
    public static void rellenarVector (int[] vector){//Método para rellenar el vector.
        int max=100;
        int min=10;
        for(int i =0; i<12; i++){//Bucle para generar aleatorios y guardarlos en el vector.
            vector[i]= (int) (Math.random()*(max-min+1))+min;
        }
        System.out.println("* -- ---- ---- -- *");
        System.out.println("El vector vector se ha rellenado correctamente");
        System.out.println("* -- ---- ---- -- *");
    }
    
    public static void mostrar (int []vector, String [] mes){//Método mostrar el valor de los campos del vector.
        
        System.out.println("* -- ---- Mostrando las ventas de cada mes. ---- -- *");
        for (int i=0; i<vector.length; i++){//Bucle para recorrer los campos del vector e imprimir.
            System.out.println( "Las ventas del mes " + mes[i] + " han sido " + vector[i]);
        }
        System.out.println("* -- ---- ---- -- *");
    }
    
    
    public static void mostrarInvertido (int []vector, String [] mes){/*Método para mostrar el valor de los campor 
        del vector al reves*/
        
        System.out.println("* -- ---- Mostrando las ventas de cada mes al reves. ---- -- *");

        for (int i=vector.length; i>0; i--){//Bucle para recorrer los campos del vector e imprimir el valor.
            System.out.println( "Las ventas del mes " + mes[i-1] + " han sido " + vector[i-1]);
        }
        System.out.println("* -- ---- ---- -- *");
    }
    
    public static void mostrarTotal (int[]vector){//Método para calcular el total e imprimir.
        int total=0;
        System.out.println("* -- ---- Mostrando el total de las ventas. ---- -- *");
        for(int i=0; i<vector.length; i++){//Bucle para sumar los valores de los campos.
            total=total+vector[i];
        }
        System.out.println("El total de las ventas es " + total);
        System.out.println("* -- ---- ---- -- *");
    }
    public static void mostrarTotalPares (int[]vector){//Método para sumar el valos de los campos pares.
        System.out.println("* -- ---- Mostrando el total de las ventas de los meses pares. ---- -- *");
        int total=0;
        int mes=0;
        for(int i=0; i<vector.length; i++){//Bucle para sumar valor de los pares.
            mes=i+1;
            if(mes%2==0){
                total=total+vector[i];
            }
        }
        System.out.println("El total de las ventas es " + total);
        System.out.println("* -- ---- ---- -- *");
    }
    //Método para encontrar el mayor valor del vector.
    public static void mostrarMesMayorVenta (int [] vector, String [] mes){
        int siguiente=0;
        int aux=0;
        String auxMes="";
        System.out.println("* -- ---- Mostrando el total del mes con mayor ventas. ---- -- *");
        for(int j=0;j<12;j++){//Bucle para hacer cambio de valores n-1 veces.
            for(int i=0; i<11;i++){//Bucle para comparar los valores y cambiarlos desde la posición 0 al 11(una vuelta).
                siguiente=i+1;

                if( vector[i]<vector[siguiente]){//Condición para cambiar los valores.
                    aux=vector[i];
                    vector[i]=vector[siguiente];
                    vector[siguiente]=aux;
                    auxMes=mes[i];
                    mes[i]=mes[siguiente];
                    mes[siguiente]=auxMes;
                }
            } 
        }
        System.out.println("El mes con mas ventas ha sido: " + mes[0] + " con " + vector[0] +" ventas.");
        System.out.println("* -- ---- ---- -- *");
    }
    public static int pedirOpcion (){//Método para recibir la elección del usuario.
        int num=0;
        Scanner entrada=new Scanner(System.in);
        boolean correcto=false;//Boolean para controlar el numero.
        boolean error=false;//Boolean para controlar el mensaje de error final.
        do{//Bucle para controlar el número recibido.
            System.out.println("Introduzca su opcion");
            try{//Controlador de errores.
                num=entrada.nextInt();
            }catch (InputMismatchException e){//Error si no se introduce un numero.
                entrada.next();
                System.out.println("Error, ha introducida algo distinto a un numero."
                        + "Vuelva a intantarlo.");
                error=true;
            }
            if(num<=7&&num>0){//Condición para continuar.
                System.out.println("El numero es correcto, continuando..");
                correcto=true;
                error=true;
            }if(!error) {//Condición para mostrar cuando el númeor no coincide.
                System.out.println("El numero no se encuentra entre 1 y 7. Vuelve a intentarlo.");
                
            }
            error=false;//Reinicio el booleano para evitar bucle infinito.
            
        }while (!correcto);//Condición para salir.
        return num;//Devuelvo el numero de la elección.
    }
    
    public static void menu (int [] vector, String []mes){//Método para operar con el menú.
        int num=0;
        boolean bienvenida=false;//Control del mensaje de bienvenida.
        boolean paso1=false;//Control de mensajes posteriores al paso 1.
        boolean salir=false;//Control para salir del programa.
        boolean descolocado=false;//Control para ordenar el array de los meses al haber pasado por la opción 6.
        do{//Bucle para operar el menú.
            if(!bienvenida){//Control de bienvenida.
                System.out.println("* -- ----------- -- *");
                System.out.println("Bienvenido al programa");
                System.out.println("* -- ----------- -- *");
            }
            bienvenida=true;
            System.out.println("* -- ---- Mostrando opciones ---- -- *"
                    + "\n"+"Pulse"
                    + "\n"+"--> 1. Rellenar las ventas de cada mes.");
            if(paso1){
                System.out.println("--> 2. Mostrar las ventas introducidas."
                        + "\n"+"--> 3. Mostrar las ventas al reves."
                        + "\n"+"--> 4. Mostrar las ventas totales."
                        + "\n"+"--> 5. Mostrar las ventas totales de los meses pares."
                        + "\n"+"--> 6. Mostrar el nombre del mes con mas ventas.");
            }
            System.out.println("--> 7. Salir del programa.");
            num=pedirOpcion();//Pido el número de la elección.
            if(descolocado){//Recoloco el array.
                mes[0]="Enero";
                mes[1]="Febrero";
                mes[2]="Marzo";
                mes[3]="Abril";
                mes[4]="Mayo";
                mes[5]="Junio";
                mes[6]="Julio";
                mes[7]="Agosto";
                mes[8]="Septiembre";
                mes[9]="Octubre";
                mes[10]="Novimebre";
                mes[11]="Diciembre";
            }
            switch(num){//Switch para llamar a los métodos.
                case 1:
                    rellenarVector(vector);//Relleno el vector.
                    paso1=true;//Control de los mensajes habiendo pasado por aquí.
                    break;
                case 2:
                    mostrar(vector,mes);//Muestro.
                    break;
                case 3:
                    mostrarInvertido(vector,mes);//Llamo al método.
                    break;
                case 4:
                    mostrarTotal(vector);//Método mostrar el total del año.
                    break;
                case 5:
                    mostrarTotalPares(vector);//Método mostrar el valor de los pares.
                    break;
                case 6:
                    mostrarMesMayorVenta(vector, mes);//Método para mostrar el mes con mayor ventas.
                    descolocado=true;//Control del orden del array de los meses
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    salir=true;//Control para salir del programa.
            }
        }while (!salir);//Condición para salir del programa.
    
    } 
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] vector= new int [12];//Creo e inicializo el vector.
        String [] mes = {"Enero","Febrero", "Marzo", "Abril","Mayo","Junio", "Julio", "Agosto", "Septiembre"
            ,"Octubre", "Noviembre", "Diciembre"};//Creo e inicializo el vector String de los meses.
        menu(vector, mes);//Inicio el menú.
    }
    
}
