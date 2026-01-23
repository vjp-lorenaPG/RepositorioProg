/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t7e16;

import java.util.InputMismatchException;
import java.util.Scanner;

/**Ejercicio 16.- Sabiendo que tenemos una clase de 6 alumnos (Pepe, Juan, Ana,
 * Marta, Pedro y María), con 4 asignaturas cada uno (Lengua, Mates, Historia y
 * Física), realiza un programa que le dé al usuario las siguientes opciones: 
 * 1. Rellenar las notas de los alumnos. 
 * 2. Mostrar las notas introducidas en el punto anterior. 
 * 3. Que nos diga que alumno es el mejor de la clase. (nota
 * media más alta) . (Necesitarás utilizar otro array unidimensional con los
 * nombres de los alumos) 
 * 4. Que nos diga el alumno con más suspensos. 
 * 5. Que nos diga cual es la asignatura más difícil. (nota media más baja) .
 * (Necesitarás utilizar otro array unidimensional con los nombres de las
 * asignaturas) 
 * 6. Salir del programa. • Hasta que el usuario no pulse 6 no
 * saldremos del programa y se volverá a mostrar el menú.
 *
 * @author galin
 */
public class T7E16 {
    public final static int FIL=4;
    public final static int COL=6;
    
    // Método para probar el programa
    public static void rellenarArrays (int matriz [] []){//Método para generar un número aleatorio
        System.out.println("Rellenando la matriz..");
        for(int i=0; i<FIL; i++){
            for(int j=0; j<COL; j++){
                matriz[i][j]=generarAleatorio();
            }
        }
        System.out.println("Completado");
    }
    //Método para probar el programa 
    public static int generarAleatorio (){//Método para generar un número aleatorio
        int aleatorio;
        int max=10;
        int min=0;
        aleatorio= (int) (Math.random()*(max-min+1)+min);
        
        return aleatorio;
    }
    //Método para rellenar el array con datos del usuario
    public static void recibirDatos (int matriz [] [], String [] alumnos, String [] asignaturas){
        System.out.println("Rellena la matriz con los siguientes datos..");
        for(int i=0; i<FIL; i++){
            System.out.println("De la asignatura de: "+asignaturas[i]);
            for(int j=0; j<COL; j++){
                System.out.println("Introduzca la nota de " + alumnos[j] );
                matriz[i][j]=pedirNum();
            }
        }
        System.out.println("Completado");
    }
    
    public static void mostrar (int [][] matriz, String [] alumnos, String [] asignaturas){/*Método para mostrar
        de forma bonita, reusable.*/
        
        //For para mostrar los dias.
        System.out.println("Mostrando el valor de los campos de la matriz:");
        
        for(int k=0;k<alumnos.length; k++){
            
            System.out.print(" [ " +alumnos[k] + " ] ");
        }
        
        System.out.println("");
        //For para mostrar los valores asociados las asignaturas en orden
        for(int i =0; i<FIL; i++){
            System.out.println("Notas de " + asignaturas[i]);
            for(int j = 0; j<COL; j++){
                System.out.print( " ["+ matriz[i][j]+ "]" + ",");
            }
            System.out.println("");
        }
        
    }
    
    
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
                System.out.println("Ha introducido un caracter incompatible. \n"+
                        "Por favor, introduzca solamente numeros enteros.");
            }
            
        }while(!valido);
        
        
        return num;
    }
    
    //____Aqui
    public static int calculoMediaAltaPorAlumnos (int [][] matriz, int columna){/*Método
        para calcular la nota media de las asignaturas.*/
        
        int media=0;
        int contador=0;
        for(int i=0; i<FIL; i++){
            
            media+=matriz[i][columna];
            contador++;
        }
        media/=contador;
        return media;
        
    }
    public static void calculoMayorMedia (int [][] matriz, String [] alumnos){/*Método para buscar la
        media mas alta entre los alumnos, lo guarda en una variable, no modifica la posición de los valores.*/
        
        int contador=0;
        int media=0;
        int mediaMax=0;
        String mejorAlumno="";
        
        System.out.println("Calculando mayor..");
        
        for(int i=0; i<COL; i++){
            
            media=calculoMediaAltaPorAlumnos(matriz, i);
            
            if(media>mediaMax){
                mediaMax=media;
                mejorAlumno=alumnos[i];
            }
        }
        
        System.out.println("El alumno con la mejor media es: " + mejorAlumno +
                " con "+ mediaMax + " de media");
        
    }
    //__Hasta aqui
    public static int asignaturasSuspendidas (int [][] matriz, int columna ){/*método
        que calcula los suspensos por un alumno y devuelve el valor*/
        int suspensos=0;
        for(int i=0; i<FIL; i++){
            if(matriz[i][columna]<5){
                suspensos++;
            }
        }
        return suspensos;
    } 
    
    
    public static void calculoSuspensos (int [][] matriz, String [] alumnos){/*Método para buscar la mayor
        cantidad de suspensos, lo guarda en una variable, no modifica la posición de los valores.*/
        
        int suspensos=0;
        int suspensosMax=0;
        String AlumnoMasSunpensos="";
        System.out.println("Calculando los suspensos..");
        
        for(int i=0; i<COL; i++){/*Recorre las columnas, envia el indice de la columna
            y opera con ese indice en las filas de esa columna*/
            suspensos=asignaturasSuspendidas(matriz,i);/*Llamo al método
            que calcula los suspensos por alumnos y los guarda si supera al 
            valor guardado en suspensosMax*/
            if(suspensos>suspensosMax){
                suspensosMax=suspensos;
                AlumnoMasSunpensos=alumnos[i];
            }
            
        }
        System.out.println("El alumno con mas suspensos es " + AlumnoMasSunpensos + " con " + suspensosMax);
        
    }
    public static int calculoMediaBajaPorAsignaturas (int [][] matriz, int fila){/*Método
        para calcular la nota media de las asignaturas.*/
        
        int media=0;
        int contador=0;
        for(int i=0; i<COL; i++){/*Recorro las columnas, que equivalen a las notas de 
            una mmism asignatura*/
            media+=matriz[fila][i];
            contador++;/*Contador para dividir entre la cantidad, se que podría
            usar el largo de FIL pero quiero que sea reutilizable para cuando el largo de las filan varie*/
        }
        media/=contador;
        return media;
        
    }
    
    public static void calculoAsignaturaMasDificil (int [][] matriz, String []asignaturas){/*Método
        calcular la asignatura mas dificil.*/
        int mediaMasBaja=10;
        int media=0;
        
        String asignaturaMasdificil="";
        System.out.println("Calculando la mas dificil..");
        
        for(int i=0; i<FIL; i++){
            
            media=calculoMediaBajaPorAsignaturas(matriz,i);
            if(media<mediaMasBaja){
                mediaMasBaja=media;
                asignaturaMasdificil=asignaturas[i];
            }
        }
        
        System.out.println("La asignatura mas dificil es " + asignaturaMasdificil +
                " con " + mediaMasBaja  + " de media");
        
    }
    
    
    public static void menu (int [][] matriz, String [] asignaturas, String [] alumnos){
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
                " * 1. Rellenar las notas de los alumnos \n"+
                " * 2. Mostrar las notas. \n" +
                " * 3. Mostrar el mejor alumno de la clase segun la nota media mas alta.\n" +
                " * 4. Mostrar alumno con mas suspensos.\n"+
                " * 5. Mostrar la asignatura mas dificil segun su media mas baja. \n"+
                " * 6. Salir del programa.");
            opcion=pedirNum();//Pido numero para interactuar con el programa.
            
            if(!relleno&&opcion>1&&opcion<6){
                System.out.println("Aun no ha rellenado las notas");
                opcion=0;
            }
            
            switch(opcion){
                case 1:{
                    System.out.println("Ha seleccionado rellenar las notas \n"+
                            "Pulse: \n"+
                            "* 1. Para rellenar las notas una por una. \n"+
                            "* 2. Para relllenar las notas automaticamente.");
                    /*Pongo la opción de rellenar las notas automáticamente para 
                    poder probar el programa mas rápidamente.*/
                    opcion=pedirNum();
                    if(opcion==1){
                        System.out.println("Ha seleccionado rellenar las notas una por una.");
                        recibirDatos(matriz, alumnos,asignaturas );
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
                    System.out.println("Ha seleccionado mostrar las notas.");
                    mostrar(matriz, alumnos, asignaturas);
                    break;
                }
                case 3:{
                    System.out.println("Ha seleccionado mostrar al alumno con la nota media mas alta.");
                    calculoMayorMedia(matriz,alumnos);
                    break;
                }
                case 4:{
                    System.out.println("Ha seleccionado mostrar el alumno con mas suspensos.");
                    calculoSuspensos(matriz,alumnos);
                    break;
                }
                case 5:{
                    System.out.println("Ha seleccionado mostrar la asignatura mas dificil.");
                    calculoAsignaturaMasDificil(matriz, asignaturas);
                    break;
                }
                case 6:{
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
        String [] alumnos = {"Pepe", "Juan", "Ana", "Marta", "Pedro", "Maria"};
        String [] asignaturas = {"Lengua", "Matematicas", "Historia", "Fisica"};
        menu(matriz, asignaturas, alumnos);
        }
    
}
