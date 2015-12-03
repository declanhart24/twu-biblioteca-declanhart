package com.twu.biblioteca;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by declanhart on 30/11/2015.
 */
public class system {
    private String [] options;
    private books library;
    private boolean active = true;
    public system () throws IOException{
        library = new books();
        create_options();
        System.out.println("Welcome to Biblioteca");
        while (active) {
            int result = menu();
            if (result == 0) {
                System.err.println("Select a valid option!");
                result = menu();
            } else if (result == 1) {
                listBooks();
            } else if (result ==  options.length){
                active = false;
                System.exit(0);
            }

        }
    }

    private void create_options (){
        options = new String [5];
        options[0] = "List Books";
        options[1] = "Check out a book";
        options[options.length - 1] = "Exit";
    }

    private int menu () throws IOException{
        System.out.println("Please Select from the following options");
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null)
                System.out.println((i+1) + " " + options[i]);
        }
        System.out.print("Please enter the corresponding menu item number: ");
        int i = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            i = Integer.parseInt(br.readLine());
        }catch(NumberFormatException nfe){

            return i;
        }
        return i;
    }

    private void listBooks () {
        library.getBooksCheckedWithDetail();
    }
}


