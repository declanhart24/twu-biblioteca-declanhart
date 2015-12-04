package com.twu.biblioteca;

import java.util.LinkedList;

/**
 * Created by declanhart on 30/11/2015.
 */
public class books {
    private LinkedList<book> books;

    public books () {
        books = new LinkedList<book>();
        books.add(new book(1, "Head First Java", "Kathy Sierra & Bert Bates", 2005));
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
                System.out.format("%-2d%10s%32s%20d", books.get(i).getID(), books.get(i).getTitle() ,books.get(i).getAuthor(), books.get(i).getYear_published());
                System.out.println();
            }else {
                System.err.println("No Books checked currently in");
            }
            i++;
        }

    }


    public void checkOut (int id) {
        int i = 0;
        while (i < books.size()) {
            if (books.get(i).isChecked() && books.get(i).getID() == id) {
                Boolean success = books.get(i).check(false);
                if (success) {
                    System.out.println("\nsuccessfully checked out " + books.get(i).getTitle());
                    System.out.println();
                }else
                    System.err.println("Book is currently unavailable");
            }
            i++;
        }
    }

   public void returnBook (int id) {
       int i = 0;
       while (i < books.size()) {
           if (books.get(i).getID() == id) {
               Boolean success = books.get(i).check(true);
               if (success) {
                   System.out.print("\nsuccessfully returned " + books.get(i).getTitle());
                   System.out.println();
               }else
                   System.err.println("The book was unable to be returned");
           }
           i++;
       }
   }
}
