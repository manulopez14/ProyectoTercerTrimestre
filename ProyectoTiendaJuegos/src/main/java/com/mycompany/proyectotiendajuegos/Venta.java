/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectotiendajuegos;

import java.time.LocalDate;

/**
 *
 * @author SI
 */
public class Venta {
    LocalDate fecha;
    String nombreCliente;
    int edadCliente;
    int unidades;

    public Venta(LocalDate fecha, String nombreCliente, int edadCliente, int unidades) {
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.edadCliente = edadCliente;
        this.unidades = unidades;
    }
    
    public double calculaImporteVentaJuego(Juego juego){
        double importe;
        if(edadCliente < juego.PEGI){
            System.out.println("El cliente no cumple con la edad recomendada");
            importe = 0;
            return importe;
        }
        return importe = juego.precio*unidades;
    }
}
