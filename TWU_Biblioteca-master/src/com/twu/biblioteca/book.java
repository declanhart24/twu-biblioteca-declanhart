package com.twu.biblioteca;

/**
 * Created by declanhart on 30/11/2015.
 */
public class book {


    protected String Title;
    protected String Author;
    protected int Year_published;
    protected boolean checked;

    public book(String title, String author, int year) {
        this.Title = title;
        this.Author = author;
        this.Year_published = year;
        this.checked = true;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return Author;
    }

    public int getYear_published() {
        return Year_published;
    }

    public boolean isChecked() {
        return checked;
    }
}

