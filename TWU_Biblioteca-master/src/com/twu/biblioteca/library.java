package com.twu.biblioteca;

import java.util.LinkedList;

/**
 * Created by declanhart on 30/11/2015.
 */
public class library{
    private LinkedList<book> books;
    private LinkedList<dvd> dvds;

    public library () {
        books = new LinkedList<book>();
        dvds = new LinkedList<dvd>();
        books.add(new book(1, "Head First Java", "Kathy Sierra & Bert Bates", 2005));
        dvds.add(new dvd(1, "Finding Nemo", 2003, " Andrew Stanton, Lee Unkrich", 8));
    }

    public String getBookTitles () {
        int i = 0;
        String output = "";
        while (i < books.size()) {
            if (books.get(i).isChecked()) {
                output += books.get(i).getTitle() + "\n";
            }
            i++;
        }
        return output;
    }
    public String getBooksCheckedWithDetail (){
        int i = 0;
        String output = "";
        while (i < books.size()) {
            if(books.get(i).isChecked()) {
                output += String.format("%1$1s %2$2s %3$30s %4$20s", books.get(i).getID(), books.get(i).getTitle(), books.get(i).getAuthor(), books.get(i).getYear_published() + "\n");
            }
            i++;
        }
        if (output.equals(""))
            output = "No Books checked currently in";
        return output;
    }

    public String getDVDsCheckedWithDetail (){
        int i = 0;
        String output = "";
        while (i < dvds.size()) {
            if(dvds.get(i).isChecked()) {
                output += String.format("%1$1s %2$2s %3$30s %4$20s", dvds.get(i).getID(), dvds.get(i).getTitle(), dvds.get(i).getDirector(), dvds.get(i).getYear() + "\n");
            }
            i++;
        }
        if (output.equals(""))
            output = "No DVDs checked currently in";
        return output;
    }


    public String checkOut (int id, String type) {
        if (type == "book")
            return checkOutBook(id);
        else
            return checkOutDVD(id);
    }

    private String checkOutBook (int id) {
        int i = 0;
        String output = "";
        while (i < books.size()) {
            if (books.get(i).isChecked() && books.get(i).getID() == id) {
                Boolean success = books.get(i).check(false);
                if (success) {
                    output = books.get(i).getTitle().toString();
                }
            } else
                output = "Book is currently unavailable";
            i++;
        }
        return output;
    }

    private String checkOutDVD (int id) {
        int i = 0;
        String output = "";
        while (i < dvds.size()) {
            if (dvds.get(i).isChecked() && dvds.get(i).getID() == id) {
                Boolean success = dvds.get(i).check(false);
                if (success) {
                    output = "\nsuccessfully checked out " + dvds.get(i).getTitle() + "\n";
                }
            } else
                output = "DVD is currently unavailable";
            i++;
        }
        return output;
    }

   public String returnItem (int id, String type) {
       if (type == "book")
           return returnBook(id);
       else
           return returnDVD(id);
   }

    private String returnBook (int id){
       int i = 0;
       String output = "";
       while (i < books.size()) {
           if (books.get(i).getID() == id) {
               Boolean success = books.get(i).check(true);
               if (success) {
                   output = "\nsuccessfully returned " + books.get(i).getTitle() + "\n";

               }else
                   output = "The book was unable to be returned";
           }
           i++;
       }
       return output;
   }

    private String returnDVD (int id) {
        int i = 0;
        String output = "";
        while (i < dvds.size()) {
            if (dvds.get(i).getID() == id) {
                Boolean success = dvds.get(i).check(true);
                if (success) {
                    output = "\nsuccessfully returned " + dvds.get(i).getTitle() + "\n";

                }else
                    output = "The DVD was unable to be returned";
            }
            i++;
        }
        return output;
    }

}
