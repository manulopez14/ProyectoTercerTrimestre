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
    
    int PEGI;

    public Juego(String titulo, String genero, double precio, int PEGI) {
        this.titulo = titulo;
        this.genero = genero;
        this.precio = precio;
        this.PEGI = PEGI;
    }
    
    public double calculaPrecioIva(){
        double precioIva = precio*1.21;
        return precioIva;
    }
    
    public descuentoEstado(){
        
    }
    
}
