/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e18;

import java.util.Scanner;

/**
 *Realiza un programa que le pida una contraseña al usuario. Si la escribe bien
 * le dará la enhorabuena, pero si la escribe mal 3 veces le dará un mensaje de
 * error de acceso.
 *
 * 
 * @author Lorena
 */
public class T3E18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contraseña, respuesta;
        int intentos = 0;
        boolean correcto = false;
        
        contraseña = "informatica2526";
        //Declaro variables.
        Scanner entrada = new Scanner (System.in);//Declaro la entrada.
        
        do {
        System.out.println ("Introduzca su contraseña");
        respuesta = entrada.next();//Pido la contraseña y la guardo.
        
            if (respuesta.equals(contraseña)){//Declaro condición.
                System.out.println ("Enhorabuena");
                correcto = true;//Declaro si es correcta la contraseña para que finalice el bucle.
        }
            else {//En caso contrario a la primera condición imprime "contraseña incorrecta".
            System.out.println ("Contraseña incorrecta");
            intentos++;//Cuento los intentos erróneos al iontroducir la contraseña.
            correcto = false;//Declaro que la variable es falsa para que se repita el bucle.
                if (intentos ==3){//Declaro condición de los errores al ingresar la contraseña.
                System.out.println ("Error de acceso");}}//Imprimo el mensaje de error.
        }while (correcto==false&&intentos<3);//Declaro las condiciones de repetición.
    }
    
}
