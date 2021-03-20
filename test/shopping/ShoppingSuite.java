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
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Suite;

/**
 *
 * @author william
 */
//@RunWith(Suite.class)
//@Suite.SuiteClasses({shopping.ProductTest.class, shopping.ShoppingTest.class, shopping.ShoppingCartTest.class})
public class ShoppingSuite extends TestCase {
    
    public ShoppingSuite(String testName){
        super(testName);
    }
    
    public static TestSuite suite(){
        TestSuite suite = new TestSuite("ShoppingSuite");
        suite.addTest(shopping.ShoppingTest.suite());
        suite.addTest(shopping.ProductTest.suite());
        suite.addTest(shopping.ShoppingCartTest.suite());
        return suite;
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
        super.setUp();
    }

    @After
    public void tearDown() throws Exception {
        super.tearDown();
    }
    
}
