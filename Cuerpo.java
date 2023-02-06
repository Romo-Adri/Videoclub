/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author usuario
 */
public class Cuerpo {
    String pelicula;
    
    public Cuerpo(){
    }

    public void insertarCuerpo(String pelicula) {
        this.pelicula = pelicula;
    }
    public void eliminarCuerpo(String pelicula) {
        this.pelicula = null;
    }
}
