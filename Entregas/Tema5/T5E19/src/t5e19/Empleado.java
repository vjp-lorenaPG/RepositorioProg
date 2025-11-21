/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e19;

/**Ejercicio 19.- Desarrolle una aplicación en Java que determine el sueldo
 * bruto para cada uno de los tres empleados de una empresa. La empresa paga la
 * tarifa normal en las primeras 40 horas de trabajo de cada empleado, y paga
 * tarifa y media en todas las horas trabajadas que excedan de 40. • El programa
 * creará 3 objetos (uno para cada empleado) y se le pedirá al usuario que
 * rellene la información para cada empleado en el constructor. • Por cada
 * empleado se almacenará su nombre, el número de horas que trabajó, y la tarifa
 * que cobra por una hora de trabajo. • Para probar la clase Empleado, crea una
 * clase Test con un método que determine y muestre el sueldo bruto de cada
 * empleado.
 *
 * @author galin
 */
public class Empleado {
    //Atributos comunes a la clase.
    private String nombre;
    private int numHoras;
    private int tarifaHora;
    
    
    //Constructor predeterminado
    public Empleado (){
        nombre="";
        numHoras=0;
        tarifaHora=0;
    }
    //Constructor parametrizado
    public Empleado (String n,int numHoras, int t){
        nombre=n;
        numHoras=numHoras;
        tarifaHora=t;
    }
    //Set de nombre
    public void setNombre(String n){
    
        nombre=n;
    }
    //Set numero de horas
    public void setNumHoras(int numHoras){
    
        this.numHoras=numHoras;
    }
    //Set de tarifa de las horas
    public void setTarifaHoras(int t){
    
        tarifaHora=t;
    }
    //Get de número de las horas
    public int getNumHoras(){
    
        return numHoras;
    }
    //Get de la tarifa de la hora
    public int getTarifaHora(){
    
        return tarifaHora;
    }
    //Get de nombre
    public String getNombre(){
    
        return nombre;
    }
    //Mostrar empleado
    public void mostrarEmpleado (int salario){
        
        System.out.println("Nombre: " + nombre + "\n"
        + "\n salario "+ numHoras + "\ntarifa: "+ tarifaHora + salario );
        
    }
    
    
}
