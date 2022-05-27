/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectotiendajuegos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SI
 */
public class JuegoTest {
    
    public JuegoTest() {
    }

    @org.junit.jupiter.api.Test
    public void testCalculaPrecioIva() {
        System.out.println("calculaPrecioIva");
        Juego instance = new Juego("Borderlands","Shooter",10.00,true,"desgastado",18);
        double expResult = 12.1;
        double result = instance.calculaPrecioIva();
        assertEquals(expResult, result, 12.1);
    }

    /**
     * Test of descuentoPorEstado method, of class Juego.
     */
    @org.junit.jupiter.api.Test
    public void testDescuentoPorEstado_1() {
        System.out.println("descuentoPorEstado");
        Juego instance = new Juego("Borderlands","Shooter",10.00,true,"desgastado",18);
        double expResult = 8.0;
        double result = instance.descuentoPorEstado();
        assertEquals(expResult, result, 8.0);
    }
    
    @org.junit.jupiter.api.Test
    public void testDescuentoPorEstado_2() {
        System.out.println("descuentoPorEstado");
        Juego instance = new Juego("Kirby","Plataformas",10,false,"desgastado",6);
        double expResult = 6.0;
        double result = instance.descuentoPorEstado();
        assertEquals(expResult, result, 6.0);
    }
    
    @org.junit.jupiter.api.Test
    public void testDescuentoPorEstado_3() {
        System.out.println("descuentoPorEstado");
        Juego instance = new Juego("Mario","Plataformas",10,false,"pesimo",6);
        double expResult = 3.0;
        double result = instance.descuentoPorEstado();
        assertEquals(expResult, result, 3.0);
    }
    
}
