package Inheritance;

import Inheritance.Puppy;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DogTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("Before Test Case");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("after Test Case");
    }

    @Test
    public void does() {
        System.out.println("Testing inheritance class");
         Puppy puppy=new Puppy();
         puppy.does();
    }
}