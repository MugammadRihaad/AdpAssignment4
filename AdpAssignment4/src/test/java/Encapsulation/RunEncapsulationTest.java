//Q1
// Testing Encapsulation
package Encapsulation;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RunEncapsulationTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test Case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Test Case");
    }

    @Test
    public void run() {
        System.out.println("Testing Encapsulation class");
        RunEncapsulation run = new RunEncapsulation();
        run.run();
    }
}