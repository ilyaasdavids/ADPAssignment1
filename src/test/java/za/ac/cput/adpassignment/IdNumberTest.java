/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.adpassignment;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import junit.framework.TestCase;
/**
 *
 * @author CPUT
 */
public class IdNumberTest extends TestCase{

	IdNumber testObject;
	
	@BeforeEach
	public void setUp() {
		testObject = new IdNumber();
	}
	
	@AfterEach
	public void tearDown() {
		testObject = null;
	}
	
	@Test
	public void testCreateIdentityNumberTestObject() throws Exception{
		assertNotNull(testObject);
	}
	
	@Test
	public void TestEquality() throws Exception{	
		assertEquals(true, testObject.isIdNumber("0012125508083"));
		assertNotEquals(true, testObject.isIdNumber("001244015508083"));
	}
	
	@Test
	public void TestIdentity() throws Exception{	
		assertSame(true, testObject.isIdNumber("0012012108083"));
		assertNotSame(true, testObject.isIdNumber("654qw5645645qwe64654"));
	}
	
	@Test
	public void testFail() {
		assertEquals(true, testObject.isIdNumber("0012235508083"));
		fail("This test will intentionally fail.");
	}
	
    @Test
    @Timeout(2)
    public void testTimeout() throws InterruptedException {
      // Time exceeds timeout value so the test fails
    	assertSame(true, testObject.isIdNumber("0012125508083"));
    	
    	Thread.sleep(3000);
    	System.out.println("Method is taking to long to complete.");
    }
    
    @Test
    @Timeout(4)
	public void testTimeoutPass() throws InterruptedException {
      // Time does not exceed timeout value so the test passes
    	assertSame(true, testObject.isIdNumber("0011215508083"));
              
    	Thread.sleep(3000);
	}
    
    @Test
    @Disabled("This is disabled for now.")
	public void testDisability() {
       // Disables the test.
		assertEquals(true, testObject.isIdNumber("0012125508083"));            
   }
	
}

