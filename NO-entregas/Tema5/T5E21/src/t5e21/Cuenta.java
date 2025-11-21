/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e21;

/**  Ejercicio 21.- Añade al ejercicio anterior una nueva clase llamada
 * CuentaClave. Esta clase será una subclase de Cuenta y tendrá las siguientes
 * características: • Incluirá un nuevo dato miembro llamado clave. •
 * Sobrescribirá el método extraer(), de modo que sólo permita la extracción si
 * hay saldo suficiente, sino no hará nada. • En cuanto al funcionamiento del
 * programa será igual que en el caso anterior, sólo que al elegir las opciones
 * 1 y 2 para la creación de la cuenta, se pedirá también al usuario la clave
 * que se le quiere asociar. • No se enviará ningún tipo de aviso al usuario si
 * se intenta sacar más dinero del que se dispone.
 *
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
