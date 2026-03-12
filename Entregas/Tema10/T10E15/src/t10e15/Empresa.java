/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t10e15;

import java.util.ArrayList;

/**
 *
 * @author galin
 */
public class Empresa {
    // Atributos
    private String nombreEmpresa;
    private ArrayList<Empleado> empleados;

    // Constructor
    public Empresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.empleados = new ArrayList<>();
    }

    // Getter
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    // Método para añadir empleados
    public void añadirEmpleado(Empleado e) {
        empleados.add(e);
    }

    @Override
    public String toString() {
        return "Empresa{" + "nombreEmpresa=" + nombreEmpresa + ", empleados=" + empleados.toString() + '}';
    }
    
}
