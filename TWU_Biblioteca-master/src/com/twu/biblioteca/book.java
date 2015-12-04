package com.twu.biblioteca;

/**
 * Created by declanhart on 30/11/2015.
 */
public class book {

    protected int ID;
    protected String Title;
    protected String Author;
    protected int Year_published;
    protected boolean checked;

    public book(int id, String title, String author, int year) {
        this.ID = id;
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

    public int getID () { return ID; }

    public boolean isChecked() {
        return checked;
    }

    public Boolean check (boolean inOut){
        if (inOut == checked) {
            return false;
        } else if (inOut == false) {
            checked = false;
            return true;
        } else if (inOut == true) {
            checked = true;
            return true;
        }
        return false;
    }

}

