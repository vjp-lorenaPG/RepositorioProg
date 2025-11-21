/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t4e9;

/**
 *
 * @author alumno
 */
public class Calcular {
    
    public static int menor (int num1, int num2, int num3){
        int menor, aux;
        for (int i = 0; i<3; i++){
            if (num1>num2) {
                aux=num1;
                num1=num2;
                num2=aux;
            }if (num2>num3) {
                aux=num2;
                num2=num3;
                num3=aux;
            }
        }
        menor = num1;
        return (menor);
    }
}
