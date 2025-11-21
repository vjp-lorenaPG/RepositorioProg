/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t5e15;

/**
 *
 * @author Lorena
 */
public class Empleado {
    //Atributos de la clase
    private String nombre;
    private int salario;
    private Direccion direccion;
    
    //Constructor predeterminado
    public Empleado (){
        nombre="";
        salario=0;
        direccion=new Direccion();
    }
    //Constructor parametrizado
    public Empleado (String n,int s, Direccion d){
        nombre=n;
        salario=s;
        direccion=d;
    }
    //Set de nombre
    public void setNombre(String n){
    
        nombre=n;
    }
    //Set salario
    public void setSalario(int d){
    
        salario=d;
    }
    //Set de direccion
    public void setDireccion(Direccion d){
    
        direccion=d;
    }
    //Get de direccion
    public Direccion getDireccion(){
    
        return direccion;
    }
    //Get salario
    public int getSalario(){
    
        return salario;
    }
    //Get de nombre
    public String getNombre(){
    
        return nombre;
    }
    //Mostrar empleado
    public void mostrarEmpleado (){
        
        System.out.println("Nombre: " + nombre + "\n"
        + "\n salario "+ salario + "Direccion: "  );
        direccion.mostrarDireccion();
    }

}
