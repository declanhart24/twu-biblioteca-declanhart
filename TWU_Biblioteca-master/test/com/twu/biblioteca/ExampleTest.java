package com.twu.biblioteca;


import org.junit.Assert;
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
        String testInput = "1\n1\n";
//        testInput.toByteArray
        String expectedOutput =
        "1 Head First Java       Kathy Sierra & Bert Bates                2005\n\n" +
        "Please Select from the following options\n\n" +
        "1 List Books\n" +
        "2 Check out a book\n" +
        "3 Return a book\n" +
        "5 Exit\n\n" +
        "Please enter the corresponding menu item number:";
        assertEquals(expectedOutput, system.menu());
    }

}
