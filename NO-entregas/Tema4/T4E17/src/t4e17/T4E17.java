/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4e17;

/**Ejercicio 17.- Escribe un programa que juegue con el usuario a adivinar una
 * letra minúscula. El ordenador debe generar una letra aleatoria entre a y z, y
 * el usuario tiene que intentar adivinarla.
 * • Para ello, cada vez que el usuario introduce un valor el ordenador debe decirle al usuario si la letra
 * que tiene que adivinar está antes o después en el alfabeto.
 * • Cuando consiga adivinarlo debe indicárselo e imprimir en pantalla el número de intentos que
 * el usuario ha necesitado para adivinar el número. Recuerda utilizar
 * subprogramas.
 *
 * @author Lorena
 */
public class T4E17 {

    public static char letraAleatoria (){/*Método para aplicar math.random dentro de los valores 
        97 y 122 ya que en el código ASCII coinciden con los carácteres alfabéticos. */
        char letra = (char) (Math.floor(Math.random()*(122-97+1)+97));
    
    return (letra);//Devuelvo.
    }
    public static void intentos (int contador){//Contador de intentos, imprimo el valor.
        System.out.println("Has necesitado "+ contador +" intentos");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char letra= letraAleatoria();
        char letraUsua;
        int contador =0;
        //Declaro variables.
        
        do{//Bucle del juego donde invoco los métodos necesarios.
            letraUsua=JuegoAdivinar.pedirLetra();
            JuegoAdivinar.ComprobarMayorMenor(letraUsua, letra);
            contador++;
        }while (letra!=letraUsua);
        
        intentos (contador);
    }
    
}
