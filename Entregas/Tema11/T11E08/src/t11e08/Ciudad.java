/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t11e08;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.logging.Logger;

/**
 *De cada ciudad, almacenaremos su nombre y un conjunto de sedes (elige el tipo
 * de conjunto que prefieras).
 * @author galin
 */
public class Ciudad implements Comparable <Ciudad> {
    //Atributos
    String nombre;
    Set <Sede> sedes;
    //Constructores
    public Ciudad( ) {
        this.nombre = "";
        this.sedes = new TreeSet <>();
    }
    public Ciudad(String nombre ) {
        this.nombre = nombre;
        this.sedes = new TreeSet <>();
    }
    
    public Ciudad(String nombre, Set<Sede> sedes) {
        this.nombre = nombre;
        this.sedes = new TreeSet <>(sedes);
    }
    //Getters
    public String getNombre() {
        return nombre;
    }

    public Set<Sede> getSedes() {
        return sedes;
    }
    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setSedes(Set<Sede> sedes) {
        this.sedes = sedes;
    }
    //ToString
    @Override
    public String toString() {
        return "Ciudad{" + "nombre=" + nombre + ", sedes=" + sedes.toString() + '}';
    }
    //Método para pedir un nombre
    public static String pedirNombre() {
        String nombre;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca el nombre");
        nombre= entrada.nextLine();
        return nombre;
    }
    
    public static double pedirNum(){/*Método para pedir un número al usuario */
        boolean valido=true;//Boolean para controlar si el usuario introduce un número o no.
        double num=0;
        Scanner entrada= new Scanner (System.in);
        //Bucle para controlar la excepción InputMismatch
        do{
            valido=true;
            try{//Control de excepciones
                num=entrada.nextDouble();
            }catch(InputMismatchException e){
                entrada.nextLine();
                valido=false;
                System.out.println("Ha introducido un caracter incompatible."+
                        "Por favor, introduzca solamente numeros separados por un punto.");
            }
            
        }while(!valido);
        
        
        return num;
    }
    //Añadir sede para tener mas a mano el constructor
    public void aniadirSede(){
        this.sedes.add(new Sede(pedirNombre(),pedirNum()));
    }
    //Método para calcular los ingresos totaltes de las sedes
    public double totalIngresosSedes(){
        double total=0.0;
        
        for (Sede sede : sedes) {
            total+=sede.getIngresosAnuales();
        }
    
        return total;
    }
    
    //Método para imprimir las sedes que superen la media global
    public void imprimirSedesPorEncimaDeMediaGlobal (double mediaGlobal){
        
        for (Sede sede : sedes) {
            if(sede.getIngresosAnuales()>mediaGlobal){
            
                System.out.println(sede);
            }
        }
    }
    
    //Método para buscar una sede por su nombre
    public boolean buscarSedePorNombre (String nombre){
        boolean encontrado=false;
        Iterator <Sede> it = this.sedes.iterator();
        while(it.hasNext()){
            Sede sede = it.next();
            if(sede.getNombre().equalsIgnoreCase(nombre)){
            
                encontrado=true;
            }
        
        }
        return encontrado;
    }
    //Método de interfaz comparable para ordenar
    @Override
    public int compareTo(Ciudad otra) {
        int resultado = this.nombre.compareToIgnoreCase(otra.nombre);
        
        return resultado;
    }

    
    
    
}
