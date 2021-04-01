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
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Timeout;

/**
 *
 * @author CPUT
 */
public class BookTest {
    private Book book1;
    private Book book2;
    private Book book3;
    
    public BookTest() {
    }
    
    @BeforeEach
    public void setUp() {
        Book book1 = new Book();
        Book book2 = new Book();
        book3 = book1;
    }
    
//    Object Identity
    @Test
    void testIdentity(){
        assertNotSame(book1, book3);
    }
    
//    Object Equality
    @Test
    void testEquality(){
        assertEquals(book1, book1);
    }

    @Test
    @Timeout(value = 100, unit = TimeUnit.MILLISECONDS)
        public void testTimeout() {
            for (int i = 0; i <= 10; i++){
                System.out.println("Timeout Successed");
            }
        }
    
    @Test
    @Disabled("Do not run ")
    public void disabled() {
        System.setProperty("book1", "book2");
    }
    
    @Test 
    public void failTest() {
        fail("The Test Must Fail");
        assertSame(book1, book3);
    }
   
}
