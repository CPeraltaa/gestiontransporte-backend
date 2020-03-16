/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usac.analisis2.managetransporte.model;

import java.util.Date;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author carlospecam
 */
public class VehiculoTest {
    
    public VehiculoTest() {
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
     * Test of getId method, of class Vehiculo.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Vehiculo instance = new Vehiculo();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Vehiculo.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Vehiculo instance = new Vehiculo();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTipomatricula method, of class Vehiculo.
     */
    @Test
    public void testGetTipomatricula() {
        System.out.println("getTipomatricula");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getTipomatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTipomatricula method, of class Vehiculo.
     */
    @Test
    public void testSetTipomatricula() {
        System.out.println("setTipomatricula");
        String tipomatricula = "";
        Vehiculo instance = new Vehiculo();
        instance.setTipomatricula(tipomatricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMatricula method, of class Vehiculo.
     */
    @Test
    public void testGetMatricula() {
        System.out.println("getMatricula");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMatricula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMatricula method, of class Vehiculo.
     */
    @Test
    public void testSetMatricula() {
        System.out.println("setMatricula");
        String matricula = "";
        Vehiculo instance = new Vehiculo();
        instance.setMatricula(matricula);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMarca method, of class Vehiculo.
     */
    @Test
    public void testGetMarca() {
        System.out.println("getMarca");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getMarca();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMarca method, of class Vehiculo.
     */
    @Test
    public void testSetMarca() {
        System.out.println("setMarca");
        String marca = "";
        Vehiculo instance = new Vehiculo();
        instance.setMarca(marca);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getModelo method, of class Vehiculo.
     */
    @Test
    public void testGetModelo() {
        System.out.println("getModelo");
        Vehiculo instance = new Vehiculo();
        Date expResult = null;
        Date result = instance.getModelo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setModelo method, of class Vehiculo.
     */
    @Test
    public void testSetModelo() {
        System.out.println("setModelo");
        Date modelo = null;
        Vehiculo instance = new Vehiculo();
        instance.setModelo(modelo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLinea method, of class Vehiculo.
     */
    @Test
    public void testGetLinea() {
        System.out.println("getLinea");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getLinea();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLinea method, of class Vehiculo.
     */
    @Test
    public void testSetLinea() {
        System.out.println("setLinea");
        String linea = "";
        Vehiculo instance = new Vehiculo();
        instance.setLinea(linea);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Vehiculo.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Vehiculo.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        String color = "";
        Vehiculo instance = new Vehiculo();
        instance.setColor(color);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlotillaVehiculo method, of class Vehiculo.
     */
    @Test
    public void testGetFlotillaVehiculo() {
        System.out.println("getFlotillaVehiculo");
        Vehiculo instance = new Vehiculo();
        Flotilla expResult = null;
        Flotilla result = instance.getFlotillaVehiculo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlotillaVehiculo method, of class Vehiculo.
     */
    @Test
    public void testSetFlotillaVehiculo() {
        System.out.println("setFlotillaVehiculo");
        Flotilla flotillaVehiculo = null;
        Vehiculo instance = new Vehiculo();
        instance.setFlotillaVehiculo(flotillaVehiculo);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Vehiculo.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Vehiculo instance = new Vehiculo();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Vehiculo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Vehiculo instance = new Vehiculo();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Vehiculo.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vehiculo instance = new Vehiculo();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
