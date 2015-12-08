package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    system system;
    ByteArrayInputStream input;
    ByteArrayOutputStream output;

    @Before
    public void setup () throws IOException{
        system = new system();
        input = new ByteArrayInputStream(new byte[20]);
        output = new ByteArrayOutputStream(20);


    }

    @Test
    public void testWelcome () throws IOException{
        assertEquals("Welcome to Biblioteca", system.welcome());
    }

    @Test
    public void testListBooks () {
        input.
    }

}
