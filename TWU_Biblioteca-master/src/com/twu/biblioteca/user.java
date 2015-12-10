package com.twu.biblioteca;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by declanhart on 10/12/2015.
 */
public class user {
    private String libraryNumber;
    private String password;
    private String name;
    private String email;
    private Date dateOfBirth;
    private LinkedList<book> borrowedBooks;
    private LinkedList<dvd> borrowedDVDs;

    public user (String number, String password, String name, String email, Date DOB) {
        this.libraryNumber = number;
        this.password = password;
        this.name = name;
        this.email = email;
        this.dateOfBirth = DOB;
        this.borrowedBooks = new LinkedList<book>();
        this.borrowedDVDs = new LinkedList<dvd>();
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public void setLibraryNumber(String libraryNumber) {
        this.libraryNumber = libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


}
