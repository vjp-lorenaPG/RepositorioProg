/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e8;

/**
 *
 * @author alumno
 */
public class Numero {
    //Declaroa tributo de la clase Número.
    private int valor;
    //Constructor predeterminado.
    public Numero (){
        valor=0;
    }
    //Constructor parametrizado
    public Numero (int valor){
    
        this.valor=valor;
    }
    //Setter de Valor.
    public void setValor(int valor){
    
        this.valor=valor;
    }
    //Getter de Valor.
    public int getValor(){
        return valor;
    }

    @Override
    //To String de la clase.
    public String toString() {
        return "Numero{" + "valor=" + valor + '}';
    }
    
}
