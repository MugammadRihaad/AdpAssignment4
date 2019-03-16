package Compostion;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HorseTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test Case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Test Case");
    }

    @Test
    public void get() {
        System.out.println("Testing Composition class");
        Horse horse = new Horse();
        horse.get();
    }
}