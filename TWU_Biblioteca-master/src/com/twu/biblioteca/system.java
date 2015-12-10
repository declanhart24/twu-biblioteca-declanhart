package com.twu.biblioteca;
import java.io.*;
import java.util.Scanner;

/**
 * Created by declanhart on 30/11/2015.
 */
public class system {
    private String [] options;
    private library library;
    private boolean active = true;
    private InputStream in;
    private OutputStream out;
    private users users;
    private boolean loggedIn = false;
    private Scanner sc = new Scanner(System.in);

    public system () throws IOException {
        library = new library();
        options = loginMenu();
        users = new users();
    }

    public void run() throws IOException {
        welcome();
        while (active) {
            if (loggedIn) {
                createLoggedInOptions();

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
                } else if (result == options.length) {
                    System.out.println("\n Thank you for using Bibliotca");
                    active = false;
                    System.exit(0);
                }


            } else {
                int result = menu();
                if (result == 0) {
                    System.err.println("Select a valid option!");
                    result = menu();
                } else if (result == 1) {
                    //listItems("book");
                } else if (result == 2) {
                    //listItems("DVD");
                } else if (result == 3) {
                    System.out.print("Please enter your library number: ");
                    String id = sc.nextLine();
                    System.out.print("Please enter your Password");
                    String pwd = sc.nextLine();
                    if (login(id, pwd))
                        loggedIn = true;
                } else if (result == options.length) {
                    System.out.println("\n Thank you for using Bibliotca");
                    active = false;
                    System.exit(0);
                }
            }
        }
    }

    public String welcome () {
        String welcome = "Welcome to Biblioteca";
        System.setOut(System.out);
        System.out.println(welcome);
        return welcome;
    }

    private String [] loginMenu() {
        String [] output = new String [4];
        output[0] = "List Books";
        output[1] = "List DVD's";
        output[2] = "Login";
        output[output.length - 1] = "Quit";
        return output;
    }
    private String [] createLoggedInOptions (){
        String [] output = new String [7];
        output[0] = "List Books";
        output[1] = "List DVD's";
        output[2] = "Check out a book";
        output[3] = "Return a book";
        output[4] = "Check out a DVD";
        output[5] = "return a DVD";
        output[output.length - 1] = "Quit";
        return output;
    }

    public boolean login (String libraryId, String pwd) {
        return users.checkCredentials(libraryId, pwd);
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
        library.checkOut(checkBook(), "book");
    }

    public void returnBook () {
        library.returnItem(checkBook(), "book");
    }

}


