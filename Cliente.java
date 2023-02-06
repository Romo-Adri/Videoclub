/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author usuario
 */
public class Cliente {
    int codigo;
    String nombre;
    Bono bono;
    
    public Cliente(){
    }
   
    public void registrarCliente(int codigo, String nombre, Bono bono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono = bono;
    }
    public void registrar(){
        
    }
    public void modificarCliente(int codigo, String nombre, Bono bono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono = bono;
    }
    public void eliminarCliente(int codigo, String nombre, Bono bono){
        this.codigo = 0;
        this.nombre = null;
        this.bono = null;
    }
    public void eliminar(){
        
    }
    public void insertarCliente(int codigo, String nombre, Bono bono){
        this.codigo = codigo;
        this.nombre = nombre;
        this.bono = bono;
    }
}

