/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author usuario
 */
public class Ejemplar {
    int codigo;
    String nombre;
    double precio;

    public Ejemplar() {
    }
    public void registrarEjemplar(int codigo, String nombre, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public void registrar(){
        
    }
    public void modificarEjemplar(int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    public void eliminarEjemplar(int codigo, String nombre, double precio){
        this.codigo = 0;
        this.nombre = null;
        this.precio = 0;
    }
    public void eliminar(){
        
    }
    public void insertarEjemplar(int codigo, String nombre, double precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
}
