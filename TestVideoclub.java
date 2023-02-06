/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

/**
 *
 * @author usuario
 */
public class TestVideoclub {
    public static void main(String[] args){
        Cuerpo cp = new Cuerpo();
        Cliente cl = new Cliente();
        Bono bn = new Bono(4, 2, 35);
        Alquiler al = new Alquiler();
        Cabecera cb = new Cabecera();
        Ejemplar ej = new Ejemplar();
        Reporte rp = new Reporte();
        Fecha_entrega fe = new Fecha_entrega();
    }
}
