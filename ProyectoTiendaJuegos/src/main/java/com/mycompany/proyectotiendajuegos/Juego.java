/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectotiendajuegos;

/**
 *
 * @author SI
 */
public class Juego {
    String titulo;
    String genero;
    double precio;
    boolean manual;
    String estado;
    int PEGI;

    public Juego(String titulo, String genero, double precio, boolean manual, String estado, int PEGI) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.manual = manual;
        this.estado = estado;
        this.PEGI = PEGI;
    }
    
    public double calculaPrecioIva(){
        double precioIva = precio*1.21;
        return precioIva;
    }
    
    public double descuentoPorEstado(){
        double descuento;
        if(manual==true){
            descuento = 1.00;
        }else{
            descuento = 0.80;
        }
        if(estado == "desgastado"){
            descuento = descuento-0.20;
        }else if(estado == "pesimo"){
            descuento = descuento-0.50;
        }
        return precio*descuento;
    }
    
}
