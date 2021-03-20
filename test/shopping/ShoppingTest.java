/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shopping;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author william
 */
public class ShoppingTest extends TestCase {

    public static TestSuite suite() {
        TestSuite suite = new TestSuite(ShoppingTest.class);
        return suite;
    }
    
    public ShoppingTest() {
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
     * Test of main method, of class Shopping.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Shopping.main(args);
    }
    
}
