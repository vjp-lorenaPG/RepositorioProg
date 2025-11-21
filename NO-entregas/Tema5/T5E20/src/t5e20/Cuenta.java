/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e20;

/**Ejercicio 20.- Se pretende desarrollar una aplicación que simule el
 * funcionamiento de un cajero automático. Primeramente, se debe crear una clase
 * llamada Cuenta, que gestione las operaciones sobre la cuenta. Además de los
 * constructores y campos que se estimen necesarios, la clase contará con los
 * métodos: void ingresar (float c) //Agrega alsaldo de la cuesta la cantidad
 * recibida. void extraer(float c) //Descuenta del saldo la cantidad recibida.
 * Tras la llamada a este método, elsaldo podrá quedar en negativo. float
 * getSaldo() //Devuelve elsaldo actual • Por otro lado, existirá una clase con
 * el método main encargada de la captura y presentación de datos, y de la
 * gestión de la cuenta. Al iniciarse la aplicación se mostrará el siguiente
 * menú:
 *
 * @author alumno
 */
public class Cuenta {
    private float saldo;
    private int numCuenta;
    private boolean activa = false;
    public static int contador=01;
    //Constructor predeterminado
    public Cuenta(){
        saldo=0;
        numCuenta=contador;
        aumentarContador();
    }
    //Constructor parametrizado
    public Cuenta (float c){
    
        saldo=c;
        numCuenta=contador;
        aumentarContador();
    }
    //Settter del saldo
    public void setSaldo(float s){
    
        saldo=s;
    }
    //Gettter del saldo
    public float getSaldo(){
        
        
        return saldo;
    }
    //Activar la cuenta
    public void activar() {
        activa = true;
    }
    //Gettter de activa
    public boolean getActiva() {
        return activa;
    }
    //Settter del numero de la cuenta
    public void setNumCuenta(int numCuenta){
    
        this.numCuenta=numCuenta;
    }
    //Gettter del número de la cuenta
    public int getNumCuenta(){
        
        
        return numCuenta;
    }
    //Mostrar
    public void mostrarSaldo(){
        System.out.println("Su saldo es:" + saldo);
    }
    //Mostrar cuenta
    public void mostrarCuenta(){
        System.out.println("Mostrando sus datos: \n"
                + "Numero de cuenta: " + numCuenta
                +"\n Saldo: "+ saldo);
    }
    //Ingresar saldo
    public void ingresar (float c){
    
        saldo=saldo+c;
    }
    //Restirar saldo
    public void extraer (float c){
    
        saldo=saldo-c;
    }
    //Aumentar contador.
    public static void aumentarContador (){
    
        contador++;
    }    
}
