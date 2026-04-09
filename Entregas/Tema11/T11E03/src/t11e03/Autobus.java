/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11e03;

import java.util.HashMap;
import java.util.Iterator;

/**
 *De cada autobús, almacenaremos su matrícula y los conductores que tiene
 * asignados (los cuales se almacenarán en un HashMap).
 * @author alumno
 */
public class Autobus {
    //Atributos
    private String matricula;
    private HashMap <String,String> conductores;
    
    //Constructores
    public Autobus() {
        this.matricula = "";
        this.conductores = new HashMap<>();
    }
    public Autobus(String matricula) {
        this.matricula = matricula;
        this.conductores = new HashMap<>();
    }
    //Getters
    public String getMatricula() {
        return matricula;
    }

    public HashMap<String, String> getConductores() {
        return conductores;
    }
    //Setters
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setConductores(HashMap<String, String> conductores) {
        this.conductores = conductores;
    }
    //ToString
    @Override 
    public String toString() {
        String resultado = "Matrícula: " + matricula + "\nConductores:\n";
    
        for (String dni : conductores.keySet()) {
            resultado += "- " + dni + " : " + conductores.get(dni) + "\n";
        }
        return resultado;
    }
    
    //Buscar conductor para cada autobus, retorna un boolean para imprimir si se encuentra.
    public boolean buscarConductor (String nombre){
        boolean encontrado = false;
        Iterator <String> it = conductores.values().iterator(); //Con arrayList?
        
        while (it.hasNext() &&!encontrado) {            
            String nombreIt = it.next();
            if(nombreIt.equalsIgnoreCase(nombre)){
                encontrado=true;
            }
        }
        return encontrado;
    
    }
    
    //Método que cuenta los conductores asignados a un autobus, devuelve un int
    public int contarConductores (){
        
        int numConductores = conductores.size();
        return numConductores;
    }
    
    
}
