/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.scrumtrek.simplestore;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Алексей
 */
public class RentalTest {
    
    public RentalTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getDaysRented method, of class Rental.
     */
    @Test
    public void testGetDaysRented() {
        System.out.println("getDaysRented");
        Movie mv = new Movie("New Movie", PriceCodes.Regular);
        Rental instance = new Rental(mv, 5);

        int expResult = 5;
        int result = instance.getDaysRented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (result != expResult) 
        {
          fail("The test case is a prototype.");
        }
    }

    /**
     * Test of getMovie method, of class Rental.
     */
    @Test
    public void testGetMovie() {
        System.out.println("getMovie");
        Rental instance = null;
        Movie expResult = null;
        Movie result = instance.getMovie();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
