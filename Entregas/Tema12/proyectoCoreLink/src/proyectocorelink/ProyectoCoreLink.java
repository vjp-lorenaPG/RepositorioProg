/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectocorelink;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
1) datos_empleados.txt:Crea un programa en Java que lea el fichero completo y
 * escriba en otro fichero solo los datos de los empleados ubicados en la zona
 * cero. Muestra por pantalla el número de empleados que se escriben en el
 * fichero.
 *
 * 
 * 2)04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt: 
 * Lee el fichero en Java y encuentra las 3 claves de 8 cifras que contiene. Escribe las claves en otro fichero.
 * @author alumno
 */
public class ProyectoCoreLink {
    public static void crearFicheroZonaCero (File empleadosZonaCero) throws IOException{
        System.out.println("dentro de crear archivo");
        
        if (empleadosZonaCero.createNewFile()) {
            System.out.println("Archivo creado");
        }else{
            System.out.println("Error al crear el archivo");
        }
    }
    public static void crearFicheroClaves (File claves) throws IOException{
        System.out.println("dentro de crear archivo");
        
        if (claves.createNewFile()) {
            System.out.println("Archivo creado");
        }else{
            System.out.println("Error al crear el archivo");
        }
    }
    public static void buscarZonaCero (FileReader fr, FileWriter fw, PrintWriter pw  ) throws IOException{
        System.out.println("dentro buscarZonaCero");
        
        BufferedReader br = new BufferedReader(fr);
        String linea="";
        int contadorEmpleados=0;
        while((linea = br.readLine()) != null){
            if (linea.contains("Zona C") && linea!=null) {
                pw.println(linea);
                contadorEmpleados++;
            }
        }
        System.out.println("Empleados en la Zona Cero: " + contadorEmpleados);
    }
    public static void eliminarLetras (FileReader fr ){
        int i =0;
        char c =(char)i;
        while((i=fr.read()) != null){
            if (linea.contains("Zona C") && linea!=null) {
                int i = fr.read();
                char c =(char)i;
                contadorEmpleados++;
            }
        }
    
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        File empleadosZonaCero = new File ("C:\\Users\\alumno\\Documents\\NetBeansProjects\\proyectoCoreLink\\empleadosZonaCero.txt");
        File claves = new File ("C:\\Users\\alumno\\Documents\\NetBeansProjects\\proyectoCoreLink\\claves.txt");
        FileReader fr = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            
            fr = new FileReader("C:\\Users\\alumno\\Documents\\NetBeansProjects\\proyectoCoreLink\\\\datos_empleados.txt");
            System.out.println("Paso 1");
            crearFicheroZonaCero(empleadosZonaCero);
            System.out.println("Paso 2");
            fw= new FileWriter (empleadosZonaCero);
            pw= new PrintWriter(fw);
            buscarZonaCero( fr, fw, pw );
            
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }catch ( IOException e){
            System.out.println("Error al crear el archivo");
        }
        
        
        try {
            fr = new FileReader("C:\\Users\\alumno\\Documents\\NetBeansProjects\\proyectoCoreLink\\04dedf8afeb8a4177a009f41bb78018af601e341ed4322d4073911c9ac879726.txt");
            crearFicheroClaves(claves);
            
        } catch (FileNotFoundException e) {
            System.out.println("No se ha encontrado el archivo");
        }catch ( IOException e){
            System.out.println("Error al crear el archivo");
        }
    }
    
}
