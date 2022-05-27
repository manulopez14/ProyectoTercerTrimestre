/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.proyectotiendajuegos;

import java.time.LocalDate;
import java.time.Month;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author SI
 */
public class VentaTest {
    
    public VentaTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of calculaImporteVentaJuego method, of class Venta.
     */
    @Test
    public void testCalculaImporteVentaJuego_1() {
        System.out.println("calculaImporteVentaJuego");
        Juego juego = new Juego("Sonic", "Plataformas", 10.00, true, "bueno", 6);
        Venta instance = new Venta(LocalDate.of(2022, Month.MARCH, 1) , "Paco", 18, 1);
        double expResult = 10.0;
        double result = instance.calculaImporteVentaJuego(juego);
        assertEquals(expResult, result, 10.0);
    }
    
    @Test
    public void testCalculaImporteVentaJuego_2() {
        System.out.println("calculaImporteVentaJuego");
        Juego juego = new Juego("Borderlands", "Shooter", 10.00, true, "bueno", 18);
        Venta instance = new Venta(LocalDate.of(2022, Month.MARCH, 1) , "Lolo", 10, 1);
        double expResult = 0;
        double result = instance.calculaImporteVentaJuego(juego);
        assertEquals(expResult, result, 0);
    }
    
}
