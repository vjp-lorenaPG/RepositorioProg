/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10e15;

/**
 *
 * @author galin
 */
public class Empleado {
    // Atributos
    private String nombreEmpleado;
    private int sueldo;
    
    //Constructores
    public Empleado (){
        this.nombreEmpleado = "";
        this.sueldo = 0;
    }
    
    public Empleado(String nombreEmpleado, int sueldo) {
        this.nombreEmpleado =nombreEmpleado;
        this.sueldo =sueldo;
    }

    //Getters
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public int getSueldo() {
        return sueldo;
    }

    //ToString
    @Override
    public String toString() {
        return nombreEmpleado + " - " + sueldo;
    }
}
