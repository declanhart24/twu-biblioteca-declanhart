package com.twu.biblioteca;
import java.io.*;

/**
 * Created by declanhart on 30/11/2015.
 */
public class system {
    private String [] options;
    private library library;
    private boolean active = true;
    private InputStream in;
    private OutputStream out;
    public system () throws IOException {
        library = new library();
        options = create_options();
    }

    public void run() throws IOException{
        welcome();
        while (active) {
            int result = menu();
            if (result == 0) {
                System.err.println("Select a valid option!");
                result = menu();
            } else if (result == 1) {
                listBooks();
            } else if (result == 2) {
                checkOutBook();
            } else if (result == 3) {
                returnBook();
            } else if (result ==  options.length){
                System.out.println("\n Thank you for using Bibliotca");
                active = false;
                System.exit(0);
            }

        }
    }

    public String welcome () {
        String welcome = "Welcome to Biblioteca";
        System.setOut(System.out);
        System.out.println(welcome);
        return welcome;
    }

    private String [] create_options (){
        String [] output = new String [5];
        output[0] = "List Books";
        output[1] = "Check out a book";
        output[2] = "Return a book";
        output[output.length - 1] = "Quit";
        return output;
    }

    private int menu () throws IOException{
        System.out.println("\nPlease Select from the following options\n");
        for (int i = 0; i < options.length; i++) {
            if (options[i] != null)
                System.out.println((i+1) + " " + options[i]);
        }
        System.out.print("\nPlease enter the corresponding menu item number: ");
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

    private int checkBook () {
        System.out.print("\nPlease enter the book's ID number: ");
        int i = 0;
        char c;
    //    try {
     //       while (i = in.read() != "\n");
   //     } catch (IOException e) {
    //        e.printStackTrace();
     //   }
     //   i = Character.getNumericValue(c);
        return i;
    }

    private void checkOutBook () {
        library.checkOut(checkBook());
    }

    public void returnBook () {
        library.returnBook(checkBook());
    }

}


