/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Videoclub;

import java.util.Date;

/**
 *
 * @author usuario
 */
public class Cabecera {
    Cliente cliente;
    Date Fecha_entrega;
    
    public Cabecera(){
    }

    public void insertarCabecera(Cliente cliente, Date Fecha_entrega) {
        this.cliente = cliente;
        this.Fecha_entrega = Fecha_entrega;
    }
    public void eliminarCabecera(Cliente cliente, Date Fecha_entrega) {
        this.cliente = null;
        this.Fecha_entrega = null;
    }
}
