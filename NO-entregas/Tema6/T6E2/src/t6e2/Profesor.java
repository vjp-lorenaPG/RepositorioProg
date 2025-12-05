/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e2;

/**
 *
 * @author galin
 */
public class Profesor extends Persona{
    
    private String especialidad;
    
    public Profesor (){
        super();
        especialidad="";
    }
    public Profesor (String nombre,String especialidad){
        super(nombre);
        this.especialidad=especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    @Override
    public void mostrar (){
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }
    @Override
    public void saludar(){
        System.out.println("Hola, soy el profesor " + super.getNombre() + "\n"
            + "Soy de la especialidad de " + especialidad + "\n"
            + "*----------------------------------------------------*");
    
    }
    
    
    
    
    
    
}
