/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e20;

import java.util.Scanner;

/** Ejercicio 20.- Realiza un programa que le haga un examen al usuario,
 * preguntándole cuál es la capital de España y quién descubrió América.
 * • Ledirá si ha respondido correctamente o no, cual sería la respuesta correcta, y por
 * último le dirá su nota (Un 0,un 5 o un10)
 *
 * @author Lorena
 */
public class T4E20 {
    

    /**
     * @param args the command line arguments
     */
    static final String capital="madrid";
    static final String descAmerica="colon";
    
    public static int pregunta1 (){
        String respuesta;
        int nota=0;
        //Declaro variables.
        Scanner entrada = new Scanner (System.in);
        //Inicio Scanner.
        System.out.println("EXAMEN DE CULTURA GENERAL" + "\n"
            + "Primera pregunta: Cual es la capital de Espania?");
        //Imprimo pregunta y guardo la respuesta del ususario.
        respuesta=entrada.nextLine().toLowerCase();
        //Comparación de valores.
        if(respuesta.equals(capital)){
            System.out.println("Correcto, bien hecho.");
            nota= nota +5;//Sumo 5 puntos a la nota.
        }else {
            System.out.println("No es correcto, la respuesta correcta es Madrid");
        }
        return (nota);
    }
    public static int pregunta2 (int nota){
        //Declaro variables.
        String respuesta;
        Scanner entrada = new Scanner (System.in);
        
        //Segunda pregunta.
         System.out.println("Segunda pregunta: Quien descubrio America?");
         respuesta=entrada.nextLine().toLowerCase();
         //Comparo valores.
        if(respuesta.equals(descAmerica)){
            System.out.println("Correcto, bien hecho.");
            nota= nota +5;//Añado 5 puntos si acierta.
        }else {
            System.out.println("No es correcto, la respuesta correcta es Colon");
        }//Imprimo nota del examen.
        return (nota);
    }
    public static void main(String[] args) {
        // Declaro las variables.
        int nota=0;
        
        //Invoco métodos de las preguntas.
        nota=pregunta1();
        nota=pregunta2(nota);
        //Imprimo la nota.
        System.out.println("NOTA DEL EXAMEN: "+ nota);
        
    }

        
}
    

