package edu.macalester.comp124.hello;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Shilad Sen
 */
public class HelloTest {
    @Test
    public void testAdd() {
        HelloWorld h = new HelloWorld();
        assertEquals(4, h.add(1, 3));
    }
}
