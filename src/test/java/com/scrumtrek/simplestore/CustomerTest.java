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
public class CustomerTest {
    
    public CustomerTest() {
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
     * Test of getName method, of class Customer.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Customer instance = new Customer("New Customer");
        String expResult = "New Customer";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals("New Customer")) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of addRental method, of class Customer.
     */
    //@Test
    public void testAddRental() {
        System.out.println("addRental");
        Movie mv = new Movie("New Movie", PriceCodes.Regular);
        Rental arg = new Rental(mv, 5);
        Customer instance = new Customer("New Customer");
        instance.addRental(arg);
        
       
        // TODO review the generated test code and remove the default call to fail.
        
       //fail("The test case is a prototype.");
    }

    /**
     * Test of Statement method, of class Customer.
     */
    @Test
    public void testStatement() {
        System.out.println("Statement");
  	
        Movie movCinderella = new Movie("Cinderella", PriceCodes.Childrens);
	Movie movStarWars = new Movie("Star Wars", PriceCodes.Regular);
	Movie movGladiator = new Movie("Gladiator", PriceCodes.NewRelease);
        
        Rental rnt1 = new Rental(movCinderella, 5);
        Rental rnt2 = new Rental(movStarWars, 1);
        Rental rnt3 = new Rental(movGladiator, 10);
        
        Customer instance = new Customer("New Customer");
        instance.addRental(rnt1);
        instance.addRental(rnt2);
        instance.addRental(rnt3);
        
        //String expResult = "Rental record for New Customer";
        String result = instance.Statement();
        String expResult = "Rental record for New Customer\n" +
"	Cinderella	3.0\n" +
"	Star Wars	2.0\n" +
"	Gladiator	30.0\n" +
"Amount owed is 35.0\n" +
"You earned 4 frequent renter points.";
        System.out.println(result);
        if (!result.equals(expResult)) {
          fail("report not valid");
        }
        
//assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
