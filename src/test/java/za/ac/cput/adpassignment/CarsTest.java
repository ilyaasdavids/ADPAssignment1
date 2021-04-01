/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.assignment1_adp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Ilyaas Davids
 * @ studNum 219466424
 */
public class CarsTest {
    
    public ProgramTest() {
        private Cars car1;
        private Cars car2;
        private Cars car3;    
    }
    
    @BeforeAll
    public static void setUpClass() {
        
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        car1 = new Cars();
        car2 = new Cars();
        car3 = car1;
    }
    
    @AfterEach
    public void tearDown() {
       car1.delete;
        car2.delete; 
        car3.delete; 
    }

    @Test
    public void testID() {
        // TODO review the generated test code and remove the default call to fail.
        assertSame(car1,car3);
    }
    
     @Test
    public void testEq() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(car1,car3);
    }
    
     @Test
    public void testFail() {
        // TODO review the generated test code and remove the default call to fail.
        assertsEquals(car1.car2);
        fail("The test will delibearately fail.");
        System.out.println("The test will delibearately fail");
    }
    
     @Test
     @Timeout(6)
    public void testTimeout() {
        // TODO review the generated test code and remove the default call to fail.
         Thread.sleep(5000);
        System.out.println("Test passed within the time"); 
    }
    
     @Test
    @Disabled ("This is disabled for now")
    public void testDisabled() {
        // TODO review the generated test code and remove the default call to fail.
        assertEquals(car1,car3);
    }
    
}
