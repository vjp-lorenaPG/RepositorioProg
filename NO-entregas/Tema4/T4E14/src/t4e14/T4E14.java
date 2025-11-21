/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e14;

import java.util.Scanner;

/**Ejercicio 14.- Crea un programa en JAVA que que imprima todos los números
 * múltiplos de 3 que existen entre el número 1 y otro número introducido por el
 * usuario.
 * • Controla que el usuario te meta un número mayor que 0 y, sino,
 * avísale del error y vuélveselo al pedir las veces que hagan falta.
 * • Por último infórmale al usuario del total de números mostrados.
 * • Crea un método pedir el dato al usuario, otro para comprobar que es mayor que 0 y otro
 * para hacer los cálculos y mostrar el resultado.
 *
 * @author alumno
 */
public class T4E14 {
    public static int pedirNum (){
       int num;//Declaro variable.
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca un numero");
        num = entrada.nextInt ();//Pido numero y lo guardo.
        
        return (num);//Devuelvo valor.    
    }
    
    public static boolean comprobar (int num){
        boolean mayor;//Declaro variable para controlar.
        if (num<0){//Condición para comprobar si el número el válido.
            mayor = false;
            System.out.println("Error, el numero es menor que cero");//Imprimo error y modifico variable.
        }else{
            mayor=true;
            System.out.println("El numero es correcto");//Aviso que es correcto y modifico variable.
        }
        return (mayor);//Devuelvo boolean.
    }
    public static void contarMultiplos (int num){
        
        int contador=0;
        //Bucle para calcular los multiplos de 3.
        for (int i=0; i<num; i++){//Bucle para calcular los multiplos.
            if(i%3==0){//Condición para imprimir.
                System.out.print(i + " ");
                contador++;//Calculo multiplos.
            }
            
        }
        
        System.out.println("\n"+"La cantidad de numeros impresos es " + contador);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        boolean valido;
        //Declaro variables.
        
        do {//Bucle para pedir numero y comprobar si es correcto.
            num= pedirNum();//Método para pedir numero.
            valido =comprobar(num);//Método para comprobar si es correcto.
            
        }while (!valido);//Condición para salir.
        
        contarMultiplos(num);//Invoco al método.
    }
    
}
