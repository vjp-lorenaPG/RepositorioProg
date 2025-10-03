/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;
import java.util.Scanner;

/**
 *
 * @author Lorena
 */
public class Ejercicio21 {

    /**
     * Pedir al usuario una cifra para pasar a horas minutos y segundos e imprimirlo
     */
    public static void main(String[] args) {
        // TODO code application logic hereç
        int segundosUsuario; 
        int segundosRestantes;
        int horas;
        int minutos;
        int segundos;
        int dias;
        
        
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Introduzca el valor en segundos");
        
        segundosUsuario = entrada.nextInt();
        dias = segundosUsuario/86400;// 1 día = 86400 segundos
        segundosRestantes = segundosUsuario % 86400;//Aplico el resto
        
        horas = segundosRestantes/3600; //Segundos en una hora
        segundosRestantes = segundosRestantes % 3600;//Aplico el resto
        
        minutos =segundosRestantes/60;//Minutos en horas
        segundosRestantes= segundosRestantes%60;//Aplico el resto
        
        segundos = segundosRestantes%60;
        
        System.out.println(segundosUsuario +" segundos son un total de "+ dias + " dias " + horas +
                " horas " + minutos + " minutos " + segundos +" segundos");
        
    }
    
}
