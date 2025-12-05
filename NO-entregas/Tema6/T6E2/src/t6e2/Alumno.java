/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e2;

/**
 *
 * @author galin
 */
public  class Alumno extends Persona{
    private String grupo;
    
    public Alumno (){
        super();
        grupo="";
    }
    
    public Alumno (String nombre, String grupo){
        super(nombre);
        this.grupo=grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    @Override
    public void mostrar (){
    
        super.mostrar();
        System.out.println("Grupo: " + grupo);
    }
    
    @Override
    public void saludar(){
        System.out.println("Hola, soy el alumno " + super.getNombre() + "\n"
            + "Soy del grupo de " + grupo + "\n"
            + "*----------------------------------------------------*");
    
    }
    
    
}
