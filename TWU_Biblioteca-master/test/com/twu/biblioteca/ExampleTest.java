package com.twu.biblioteca;


import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ExampleTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void testWelcome () throws IOException{
        assertEquals("Welcome to Biblioteca", new system().welcome());
    }

}
