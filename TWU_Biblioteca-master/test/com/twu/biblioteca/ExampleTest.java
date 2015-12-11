package com.twu.biblioteca;


import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    system system;
    library books;
    InputStream input;
    ByteArrayOutputStream output;
    users users;
    private String libraryNumber;
    private String password;

    @Before
    public void setup () throws IOException{
        system = new system();
        input = new ByteArrayInputStream(new byte[20]);
        output = new ByteArrayOutputStream(20);
        books = new library();
        users = new users();
        libraryNumber = "111-1111";
        password = "TWU";
    }

    @Test
    public void testWelcome () throws IOException{
        assertEquals("Welcome to Biblioteca", system.welcome());
    }

    /**@Test
    public void testMenu () {
        String expectedOutput = "Please Select from the following options\n\n" +
                "1 List Books\n" +
                "2 Check out a book\\n\" +\n" +
                "3 Return a book\\n\" +\n" +
                "5 Exit\n\n" +
                "Please enter the corresponding menu item number:";
        assertEquals(system.);
    }

    @Test
    public void testListBooks () {
        byte[] testInput = "1\n1\n".getBytes();
        input = new ByteArrayInputStream(testInput);
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
  **/

    @Test
    public void testCheckOut () {
        assertEquals("Head First Java", books.checkOut(1, "book"));
    }

    @Test
    public void testFailedCheckOut () {
        books.checkOut(1, "book");
        assertEquals("Book is currently unavailable", books.checkOut(1, "book"));
    }

    @Test
    public void testSuccessfulReturnBook () {
        books.checkOut(1, "book");
        assertEquals("\nsuccessfully returned Head First Java\n" , books.returnItem(1, "book"));
    }

    @Test
    public void testFailedReturnBook () {
        assertEquals("The book was unable to be returned" , books.returnItem(1, "book"));
    }

    @Test
    public void testGetBookTitle () {
        assertEquals("Head First Java\n", books.getBookTitles());
    }

    @Test
    public void testGetBooksWithDetail () {
        assertEquals("1 Head First Java      Kathy Sierra & Bert Bates                2005\n", books.getBooksCheckedWithDetail());
    }

    @Test
    public void testFailedGetBooksWithDetail () {
        books.checkOut(1, "book");
        assertEquals("No Books checked currently in", books.getBooksCheckedWithDetail());
    }

    @Test
    public void testCheckOutDVD () {
        assertEquals("\nsuccessfully checked out Finding Nemo\n", books.checkOut(1, "DVD"));
    }

    @Test
    public void testReturnDVD () {
        books.checkOut(1, "DVD");
        assertEquals("\nsuccessfully returned Finding Nemo\n" , books.returnItem(1, "DVD"));
    }

    @Test
    public void failedTestReturnDVD () {
        assertEquals("The DVD was unable to be returned" , books.returnItem(1, "DVD"));
    }

    @Test
    public void testLogin () {
        assertEquals(true, system.login("111-1111", "TWU"));
    }

    @Test
    public void testGetUserInformation () {
        system.login(libraryNumber, password);
        String expectedResult = "Name: Declan Hart\n" +
                "Email: declanhart24@gmail.com\n" +
                "Phone Number: 0434 959 654\n";
        assertEquals(expectedResult, system.getInformation());
    }

    @Test
    public void addItemToUserAccount () {
        assertEquals(true, users.checkOut("111-1111", "Head First Java"));
    }
}
