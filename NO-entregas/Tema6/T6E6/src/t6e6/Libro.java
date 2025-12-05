/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package t6e6;

/**
 *
 * @author galin
 */
public class Libro implements Transformable {
    
    private String titulo;
    private String autor;
    private String genero;
    
    public Libro (){
        titulo="";
        autor="";
        genero="";
    }
    public Libro (String titulo, String autor, String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.genero=genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void mostrarLibro (){
        System.out.println("*-- ------------ --*");
        System.out.println("Mostrando libro: \n" + "Titulo: " + titulo
            + "\n Autor: " + autor + "\n Genero: " + genero);
        System.out.println("*-- ------------ --*");
    }
    
    public String concatenarTodo(){
        StringBuilder cadena = new StringBuilder();
        String titulo=getTitulo();
        String autor=getAutor();
        String genero=getGenero();
        if(titulo !=null && !titulo.isEmpty()){
            cadena.append(titulo);
        }if(autor !=null && !autor.isEmpty()){
            if(cadena.length()>0){
                cadena.append("#");
            }cadena.append(autor);
        }if(genero !=null && !genero.isEmpty()){
            if(cadena.length()>0){
                cadena.append("#");
            cadena.append(genero);
        }
        return cadena.toString();
    }
    public String obtenerIniciales();
    public String contarVocales();
    public String obtenerCadenaMasLarga();
    public String buscarCadena();
}




}
