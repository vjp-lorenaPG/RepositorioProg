/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t6e2;

/**
 *
 * @author galin
 */
public class T6E2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Profesor p1 = new Profesor("Enrique", "Matematicas");
        Alumno a1 = new Alumno("Belen", "1 DAM");
       
        p1.saludar();
        a1.saludar();
    
        Persona persona1 = new Profesor ("Enrique", "Matematicas");
        Persona persona2 = new Alumno ("Belen", "1 DAM");
        
        persona1.saludar();
        persona2.saludar();
    }
    
}
