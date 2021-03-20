/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author william
 */
public class ProductTest extends TestCase {
    
    private Product prod1;
    
    public ProductTest(String testName) {
        super(testName);
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        prod1 = new Product("POO1", "Plasma TV LG 32", "Plasma TV with TDT Decod. and high resolution Screen", 699.99);
    }
    
    @After
    public void tearDown() {
        prod1=null;
    }

    /**
     * Test of getCode method, of class Product.
     */
    @Test
    public void testGetCode() {
        System.out.println("getCode");
        String expResult = "POO1";
        String result = prod1.getCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Product.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        String expResult = "Plasma TV LG 32";
        String result = prod1.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDescription method, of class Product.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        String expResult = "Plasma TV with TDT Decod. and high resolution Screen";
        String result = prod1.getDescription();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrice method, of class Product.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        double expResult = 699.99;
        double result = prod1.getPrice();
        assertEquals(expResult, result);
    }
    
}
