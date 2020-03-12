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
public class PilotoTest {
    
    public PilotoTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    @org.junit.jupiter.api.BeforeEach
    public void setUp() throws Exception {
    }

    @org.junit.jupiter.api.AfterEach
    public void tearDown() throws Exception {
    }
    
    /**
     * Test of getId method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testGetId() {
        System.out.println("getId");
        Piloto instance = new Piloto();
        Integer expResult = null;
        Integer result = instance.getId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setId method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testSetId() {
        System.out.println("setId");
        Integer id = null;
        Piloto instance = new Piloto();
        instance.setId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNombres method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testGetNombres() {
        System.out.println("getNombres");
        Piloto instance = new Piloto();
        String expResult = "";
        String result = instance.getNombres();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNombres method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testSetNombres() {
        System.out.println("setNombres");
        String nombres = "";
        Piloto instance = new Piloto();
        instance.setNombres(nombres);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getApellidos method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testGetApellidos() {
        System.out.println("getApellidos");
        Piloto instance = new Piloto();
        String expResult = "";
        String result = instance.getApellidos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApellidos method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testSetApellidos() {
        System.out.println("setApellidos");
        String apellidos = "";
        Piloto instance = new Piloto();
        instance.setApellidos(apellidos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFechanac method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testGetFechanac() {
        System.out.println("getFechanac");
        Piloto instance = new Piloto();
        Date expResult = null;
        Date result = instance.getFechanac();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFechanac method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testSetFechanac() {
        System.out.println("setFechanac");
        Date fechanac = null;
        Piloto instance = new Piloto();
        instance.setFechanac(fechanac);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDireccion method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testGetDireccion() {
        System.out.println("getDireccion");
        Piloto instance = new Piloto();
        String expResult = "";
        String result = instance.getDireccion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDireccion method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testSetDireccion() {
        System.out.println("setDireccion");
        String direccion = "";
        Piloto instance = new Piloto();
        instance.setDireccion(direccion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testHashCode() {
        System.out.println("hashCode");
        Piloto instance = new Piloto();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testEquals() {
        System.out.println("equals");
        Object object = null;
        Piloto instance = new Piloto();
        boolean expResult = false;
        boolean result = instance.equals(object);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Piloto.
     */
    @org.junit.jupiter.api.Test
    public void testToString() {
        System.out.println("toString");
        Piloto instance = new Piloto();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
