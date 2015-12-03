package com.twu.biblioteca;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by declanhart on 30/11/2015.
 */
public class books {
    private LinkedList<book> books;

    public books () {
        books = new LinkedList<book>();
        books.add(new book("Head First Java", "Kathy Sierra & Bert Bates", 2005));
    }

    public void getBooks () {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).isChecked()) {
                System.out.println(books.get(i).getAuthor());
            }
        }
    }

    public void getBooksCheckedWithDetail (){
        int i = 0;
        while (i < books.size()) {
            if(books.get(i).isChecked()) {
                System.out.format("%-2s%32s%20d", books.get(i).getTitle(), books.get(i).getAuthor(), books.get(i).getYear_published());
                i++;
            }
        }

    }
}
