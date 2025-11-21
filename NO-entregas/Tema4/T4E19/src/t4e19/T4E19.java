/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e19;

import java.util.Scanner;

/**
 *Ejercicio 19.- Escribe un programa que lea un día de la semana que introduzca
 * el usuario (Lunes, Martes, Miércoles, Jueves, Viernes, Sábado o Domingo) y,
 * según sea su valor, escriba en pantalla su posición en la semana.
 * • Ejemplo de ejecución: Por favor, introduzca un día de la semana: Miércoles
 * El Miércoles es el tercer día de la semana
 * @author Lorena
 */
public class T4E19 {
    public static boolean imprimirPosicion (String diaUsua){
        //Switch para imprimir el día correspondiente y devolver si el día era correcto.
        switch(diaUsua){
            case "lunes":{
                System.out.println("El lunes es el primer dia de la semana");
                return true;
            }case "martes":{
                System.out.println("El martes es el segundo dia de la semana");
                return true;
            }case "miercoles":{
                System.out.println("El miercoles es el tercer dia de la semana");
                return true;
            }case "jueves":{
                System.out.println("El jueves es el cuarto dia de la semana");
                return true;
            }case "viernes":{
                System.out.println("El viernes es el quinto dia de la semana");
                return true;
            }case "sabado":{
                System.out.println("El sabado es el sexto dia de la semana");
                return true;
            }case "domingo": {
                System.out.println("El domingo es el septimo dia de la semana");
                return true;
            }default:{
                System.out.println("Error al introducir el dia, intentelo de nuevo");
                return false;
            }
        }
        
    }
    public static String pedirDia (){
        //Declaro variable.
        String diaUsua;
        Scanner entrada = new Scanner (System.in);//Inicio Scanner.
        System.out.println("Escriba un dia de la semana");
        diaUsua=entrada.nextLine().toLowerCase();
        //Pido día, guardo y devuelvo.
        return (diaUsua);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaro variable
        String diaUsua;
        boolean valido;
        //Bucle para imprimir dia .
        
        do {
            diaUsua=pedirDia();//Invoco al método
            valido=imprimirPosicion (diaUsua);//Invoco al método
        }while (!valido);//Fin de bucle si el día era válido.
        
        
    }
    
}
