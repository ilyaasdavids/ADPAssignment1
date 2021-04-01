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
 * @author Ammaar
 */
public class Student {
    
    private Student Stu1;
    private Student Stu2;
    private Student Stu3;

    @BeforeEach
    void setup()
    {
        Stu1 = new Student();
        Stu2 = new Student();
        Stu3 = new Student();

        Stu1 = Stu3;
    }

    @Test
    void testIdentity()
    {
        assertSame(Stu1, Stu3);
    }

    @Test
    void testEquality()
    {
        assertEquals(Stu1, Stu3);

    }

    @Disabled
    @Test
    void testEqualitys()
    {
        assertEquals(Stu1, Stu3);

    }

    @Test
    void FailingTest()
    {
        assertSame(Stu2, Stu3);
    }


    @Test
   @Timeout(7)
    void timeoutCheck()
    {
        for (int i =0 ; i<20 ; i++)
            System.out.println(i);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
