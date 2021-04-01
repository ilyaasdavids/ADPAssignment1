/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author CPUT
 */
public class TriangleTest {
    
    public TriangleTest() {
        
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
    
      @Test
    public void testEquality() {
        // This method tests object equality
        Triangle triangle = new Triangle();
		assertEquals("Isosceles", triangle.geType(5,4,4));
                    assertNotEquals("Scalene", triangle.geType(5,4,4));
                
    }
   @Test
    public void testIdentity() {
        // This method tests object identity
        Triangle triangle = new Triangle();
		assertNotSame("Scalene", triangle.geType(3,3,3));
                    assertSame("Isosceles", triangle.geType(5,4,4));
    }
    
      @Test
    public void testFail() {
        // This test makes the method fail deliberately 
        Triangle triangle = new Triangle();
		assertEquals("Equilateral", triangle.geType(3,3,3));
                    fail("This test will deliberately fail");
    }
    
      @Test
      @Timeout(2)
    public void testTimeout() throws InterruptedException {
        // Time exceeds timeout value so the test fails
        Triangle triangle = new Triangle();
		assertSame("Isosceles", triangle.geType(4,5,5));
                
        Thread.sleep(3000); // 3000 miliseconds = 3 seconds
          System.out.println("Method taking too long to complete");
    }
    
     @Test
      @Timeout(4) 
    public void testTimeoutPass() throws InterruptedException {
        // Time does not exceed timeout value so the test passes
        Triangle triangle = new Triangle();
		assertSame("Isosceles", triangle.geType(4,5,5));
                
        Thread.sleep(3000);
    }
    
     @Test
     @Disabled("this is disabled for now")
    public void testDisability() {
        // Disables the test
        Triangle triangle = new Triangle();
		assertEquals("Scalene", triangle.geType(3,4,5));
                   
    }
}

