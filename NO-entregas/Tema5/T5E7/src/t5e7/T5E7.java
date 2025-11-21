/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e7;

import java.util.Scanner;

/**Ejercicio 07.- Implementa un programa en JAVA, orientado a objetos, al que
 * introduciéndole el tamaño de un archivo en MB y la velocidad del ADSL (en
 * megabits) te calcule el tiempo en minutos que tardarías en descargártelo. •
 * Crearás una clase Descarga que tendrá 3 atributos privados: nombreDescarga,
 * tamañoDescarga y velocidadDescarga, así como los métodos correspondientes. •
 * Para probar el funcionamiento de la clase Descarga, crea una clase Test en la
 * que crees un objeto con un constructor al que le pases los valores, que elija
 * el usuario, de todos los atributos de la clase. Luego, también le preguntaras
 * al usuario si desea crear otro objeto (si o no), para crear todos los objetos
 * que quiera el usuario. (los objetos se sobreescribiran) • La clase Test
 * también tendrá un método que recibirá el objeto de la clase Descarga, y
 * mostrará por pantalla el nombre y el tiempo que se tarda en descargar.
 * Utiliza este método para ver el nombre y el tiempo de descarga de los objetos
 * creados.
 *
 * @author galin
 */
public class T5E7 {
    public static void mostrarMenu(){
         
        
    
    }
    public static double pedirVelocidad(){
        double velocidad;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la velocidad de la descarga");
        velocidad=entrada.nextDouble();
        
        return(velocidad);
    }
    public static double pedirTamaño(){
        double tamaño;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el tamanio de la descarga");
        tamaño=entrada.nextDouble();
        
        return(tamaño);
    }
    public static boolean salirPrograma (){
        boolean salir=false;
        int numUsu=0;
        Scanner entrada =new Scanner (System.in);
        do{
            System.out.println("Si desea continuar calculando pulse 1"
                + "para continuar calculando pulse 2");
            numUsu=entrada.nextInt();
            switch(numUsu){
                case 1: 
                    salir=false;
                    break;
                case 2:
                    salir=true;
                    break;
                default :
                    System.out.println("Error, ha introducido un numero distinto a 1 o 2");
                    entrada.nextInt();
                    break;
            }
        }while (numUsu!=1&&numUsu!=2);
        return salir;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean terminar=false;
        Descarga descarga1 = new Descarga();
        
        do{
            descarga1.setTamañoDescarga(pedirTamaño());
            descarga1.setVelocidadDescarga(pedirVelocidad());
            Descarga.calcularTiempoDescarga(descarga1.getTamañoDescarga(),descarga1.getVelocidadDescarga());
            terminar=salirPrograma();
        }while(!terminar);
        
        
    }
    
}
