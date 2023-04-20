/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.trabajointegradorjava;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author aleai
 */
public class PronosticoTest {
    
    public PronosticoTest() {
    }

    /**
     * Test of getPartido method, of class Pronostico.
     */
    @Test
    public void testGetPartido() {
        System.out.println("getPartido");
        Pronostico instance = null;
        Partido expResult = null;
        Partido result = instance.getPartido();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of getResultado method, of class Pronostico.
     */
    @Test
    public void testGetResultado() {
        System.out.println("getResultado");
        Pronostico instance = null;
        ResultadoEnum expResult = null;
        ResultadoEnum result = instance.getResultado();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of setResultado method, of class Pronostico.
     */
    @Test
    public void testSetResultado() {
        System.out.println("setResultado");
        ResultadoEnum resultado = null;
        Pronostico instance = null;
        instance.setResultado(resultado);
        fail("The test case is a prototype.");
    }

    /**
     * Test of decirPuntajeDelPronostico method, of class Pronostico.
     */
    @Test
    public void testDecirPuntajeDelPronostico() {
        System.out.println("decirPuntajeDelPronostico");
        Pronostico instance = null;
        int expResult = 0;
        int result = instance.decirPuntajeDelPronostico();
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of formatoDeCSV method, of class Pronostico.
     */
    @Test
    public void testFormatoDeCSV() {
        System.out.println("formatoDeCSV");
        ResultadoEnum resultado = null;
        Pronostico instance = null;
        String[] expResult = null;
        String[] result = instance.formatoDeCSV(resultado);
        assertArrayEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
