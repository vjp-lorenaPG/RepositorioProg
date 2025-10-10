/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3e8;
import java.util.Scanner;
/**Realiza un programa que dado un importe en euros nos indique número óptimo
 * de billetes de 50, 20, 10 y 5, así como la cantidad sobrante en monedas de 2 y
 *de 1 euro.
 *
 * @author Lorena
 */
public class T3E8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int euros, bi50, bi20, bi10, bi5, mon1, mon2, resto;//Declaro las variables
        
        //Pido el valor y lo guardo
        Scanner entrada = new Scanner (System.in);
        System.out.println ("Introduzca una cantidad de dinero");
        euros = entrada.nextInt ();
        //Realizo las operaciones
        resto=euros;
        bi50 = euros/50;
        resto=euros%50;
        
        bi20 = resto/20;
        resto=resto%20;
        
        bi10= resto/10;
        resto= resto%10;
        
        bi5 = resto/5;
        resto=resto%5;
        
        mon2= resto/2;
        resto=resto&2;
        
        mon1=resto/1;
        
        System.out.println(euros + " euros se descomponen en:");//Primera línea
        
        if (bi50 !=0){
            System.out.println("Billetes de 50: " + bi50);
                    }//Imprimo si el número de billetes no es cero
        if (bi20 !=0){
            System.out.println("Billetes de 20: " + bi20);
                    }//Imprimo si el número de billetes no es cero
        if (bi10 !=0){
            System.out.println("Billetes de 10: " + bi10);
                    }//Imprimo si el número de billetes no es cero
        if (bi5 !=0){
            System.out.println("Billetes de 5: " + bi5);
                    }//Imprimo si el número de billetes no es cero
        if (mon2 !=0){
            System.out.println("Monedas de 2: " + mon2);
                    }//Imprimo si el número de monedas no es cero
        if (mon1 !=0){
            System.out.println("Monedas de 2: " + mon1);
                    }//Imprimo si el número de monedas no es cero
    }
    
}
