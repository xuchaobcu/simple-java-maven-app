package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        //System.setOut(new PrintStream(outContent));
        System.out.println("===  Befoe   ===");
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
            System.out.println("===  Test Case 01 ===");
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        App.main(null);
        try {
            assertEquals("Hello Devops!" + System.getProperty("line.separator"), outContent.toString());
            System.out.println("===  Test Case 02 ===");
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello Devops!\"");
        }
    }

    @After
    public void cleanUpStreams() {
        //System.setOut(null); 
        System.out.println("===  After ===");
    }

}
