/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t5e21;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class T5E21 {
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
    public static String pedirClave(){
        String clave;
        Scanner entrada = new Scanner (System.in);
        
        return clave= entrada.nextLine();
    }
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion=0;
        int eleccionCuenta;
        int nCuentas=0;
        boolean correcto=false;
        String clave;
        CuentaClave c1 = new CuentaClave();
        CuentaClave c2 = new CuentaClave();
        CuentaClave c3 = new CuentaClave();
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
                        c1.setClave(pedirClave());
                        System.out.println("Cuenta 1 creada");
                        nCuentas++;
                    } else if (nCuentas == 1) {
                        c2.activar();
                        c2.setClave(pedirClave());
                        System.out.println("Cuenta 2 creada");
                        nCuentas++;
                    } else if (nCuentas == 2) {
                        c3.activar();
                        c3.setClave(pedirClave());
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
                    clave= pedirClave();
                    correcto=c1.comprobarClave(clave);
                    if (eleccionCuenta == 1 && c1.getActiva() ) {
                        correcto=c1.comprobarClave(clave);
                        if(correcto){
                            c1.extraer(pedirValor());
                        }
                    } else if (eleccionCuenta == 2 && c1.getActiva()) {
                        correcto=c2.comprobarClave(clave);
                        if(correcto){
                            c2.extraer(pedirValor());
                        }
                    } else if (eleccionCuenta == 3 && c1.getActiva()) {
                        correcto=c3.comprobarClave(clave);
                        if(correcto){
                            c3.extraer(pedirValor());
                        }
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
