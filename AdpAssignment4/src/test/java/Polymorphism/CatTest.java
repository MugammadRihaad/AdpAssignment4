//Q1
//Testing Polymorphism

package Polymorphism;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CatTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test Case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Test Case");
    }

    @Test
    public void generateSound() {
        System.out.println("Testing Polymorphism");
        Cat cat = new Cat();
        cat.generateSound();

    }
}