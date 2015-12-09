package com.twu.biblioteca;

/**
 * Created by declanhart on 9/12/2015.
 */
public class dvd {
    private int ID;
    private String title;
    private int year;
    private String director;
    private int rating;
    private boolean checked;

    public dvd (int ID, String dvdTitle, int year, String director, int rating) {
        this.ID = ID;
        this.title = dvdTitle;
        this.year = year;
        this.director = director;
        this.rating = rating;
        this.checked = true;
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public int getYear () {
        return year;
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
        } else
            return false;
    }


}
