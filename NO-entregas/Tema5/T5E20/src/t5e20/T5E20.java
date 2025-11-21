/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e20;

import java.util.Scanner;

/**Ejercicio 20.- Se pretende desarrollar una aplicación que simule el
 * funcionamiento de un cajero automático. Primeramente, se debe crear una clase
 * llamada Cuenta, que gestione las operaciones sobre la cuenta. Además de los
 * constructores y campos que se estimen necesarios, la clase contará con los
 * métodos: void ingresar (float c) //Agrega alsaldo de la cuesta la cantidad
 * recibida. void extraer(float c) //Descuenta del saldo la cantidad recibida.
 * Tras la llamada a este método, elsaldo podrá quedar en negativo. float
 * getSaldo() //Devuelve elsaldo actual • Por otro lado, existirá una clase con
 * el método main encargada de la captura y presentación de datos, y de la
 * gestión de la cuenta. Al iniciarse la aplicación se mostrará el siguiente
 * menú:
 *
 * @author alumno
 */
public class T5E20 {
    //Pedir valor monetario para ingresar o retirar
    public static float pedirValor (){
    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca la cantidad");
        return entrada.nextFloat();
    }
    //Método para el menú
    public static void mostrarMenu (){
        System.out.println("Pulse: \n"
            + "1. Crear cuenta vacia.\n"
            + "2. Crear cuenta con saldo inicial.\n"
            + "3. Ingresar dinero\n"
            + "4. Sacar dinero \n"
            + "5. Ver saldo\n"
            + "6. Salir");
    }
    //Elegir una cuenta
    public static int opcionCuenta (int nCuentas){
        int eleccion;
        
        Scanner entrada = new Scanner (System.in);
        System.out.println("Para operar con una cuenta pulse: ");
        
        if (nCuentas==1){
            System.out.println("1 - para la cuenta numero 1");
           
        }else if (nCuentas==2){
            System.out.println("1 - para su primera cuenta");
            System.out.println("2 - para su segunda cuenta");
            
            
        }else if (nCuentas ==3){
            System.out.println("1 - para su primera cuenta");
            System.out.println("2 - para su segunda cuenta");
            System.out.println("3 - para la cuenta numero 3");
           
        }else {
            System.out.println("Aun no tiene una cuenta");
        } 
        return eleccion= entrada.nextInt();
    }
    //Método para recibir que opción del menú desea realizar el usuario.
    public static int pedirOpcionMenu(){
        int opcion;
        Scanner entrada=new Scanner (System.in);
        
        return opcion=entrada.nextInt();
    }
     
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        int eleccionCuenta;
        int nCuentas=0;
        Cuenta c1 = new Cuenta();
        Cuenta c2 = new Cuenta();
        Cuenta c3 = new Cuenta();
        //Declaro variables y objetos pero están inactivos.
        
        //Bucle para operar.
        do{
            mostrarMenu();
            opcion=pedirOpcionMenu();
            switch (opcion){
                case 1://Crear cuenta a 0
                    if (nCuentas == 0) {
                        System.out.println("Ha seleccionado crear");
                        c1.activar();
                        System.out.println("Cuenta 1 creada");
                        nCuentas++;
                    } else if (nCuentas == 1) {
                        c2.activar();
                        System.out.println("Cuenta 2 creada");
                        nCuentas++;
                    } else if (nCuentas == 2) {
                        c3.activar();
                        System.out.println("Cuenta 3 creada");
                        nCuentas++;
                    } else {
                        System.out.println("Máximo de 3 cuentas alcanzado");
                    }
                    break;
                case 2://Crear cuenta con saldo
                    System.out.println("Ha seleccionado crear con saldo inicial");
                    if (nCuentas == 0) {
                        c1.activar();
                        System.out.println("Cuenta 1 creada");
                        nCuentas++;
                        c1.ingresar(pedirValor());
                    } else if (nCuentas == 1) {
                        c2.activar();
                        System.out.println("Cuenta 2 creada");
                        nCuentas++;
                        c2.ingresar(pedirValor());
                    } else if (nCuentas == 2) {
                        c3.activar();
                        System.out.println("Cuenta 3 creada");
                        nCuentas++;
                        c3.ingresar(pedirValor());
                    } else {
                        System.out.println("Máximo de 3 cuentas alcanzado");
                    }
                    break;
                case 3://Ingresar saldo
                    System.out.println("Ha seleccionado ingresar");
                    eleccionCuenta=opcionCuenta(nCuentas);
                    if (eleccionCuenta == 1 && c1.getActiva()) {
                        c1.ingresar(pedirValor());
                    } else if (eleccionCuenta == 2 && c1.getActiva()) {
                        c2.ingresar(pedirValor());
                    } else if (eleccionCuenta == 3 && c1.getActiva()) {
                        c3.ingresar(pedirValor());
                    }else {
                        System.out.println("Cuenta inválida o no activa.");
                    }
                    break;
                case 4://Retirar saldo
                    System.out.println("Ha seleccionado extraer");
                    eleccionCuenta=opcionCuenta(nCuentas);
                    if (eleccionCuenta == 1 && c1.getActiva()) {
                        c1.extraer(pedirValor());
                    } else if (eleccionCuenta == 2 && c1.getActiva()) {
                        c2.extraer(pedirValor());
                    } else if (eleccionCuenta == 3 && c1.getActiva()) {
                        c3.extraer(pedirValor());
                    } else {
                        System.out.println("Cuenta inválida o no activa.");
                    }
                    break;
                case 5://Mostrar la cuenta
                    System.out.println("Ha seleccionado mostrar");
                    eleccionCuenta=opcionCuenta(nCuentas);
                    if (eleccionCuenta == 1 && c1.getActiva()) {
                        c1.mostrarCuenta();
                    } else if (eleccionCuenta == 2 && c1.getActiva()) {
                        c2.mostrarCuenta();
                    } else if (eleccionCuenta == 3 && c1.getActiva()) {
                        c3.mostrarCuenta();
                    } else {
                        System.out.println("Cuenta inválida o no activa.");
                    }
                    break;
                case 6://Salir
                    System.out.println("Ha seleccionado salir"
                            + "\nsaliendo del programa...");
                    break;
                default:
                    System.out.println("Error, el valor no coincide");
            }
            
        }while (opcion!=6);//Condición del bucle
        
    }
    
}
