/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e6;

/**
 *
 * @author galin
 */
public class Persona {
    
    private String nombre;
    private String apellidos;
    private String alias;

    public Persona (){
    
        nombre= "";
        apellidos= "";
        alias= "";
    
    }
    public Persona (String nombre, String apellidos, String alias){
    
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.alias = alias;
    
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAlias() {
        return alias;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public void mostrarPersona (){
        System.out.println("*-- ------------ --*");
        System.out.println("Mostrando datos: \n" + "Nombre: " + nombre
            + "\n Apellidos: " + apellidos + "\n Alias: " + alias);
        System.out.println("*-- ------------ --*");
    }
    
    public String concatenarTodo();
    public String obtenerIniciales();
    public String contarVocales();
    public String obtenerCadenaMasLarga();
    public String buscarCadena();








}
