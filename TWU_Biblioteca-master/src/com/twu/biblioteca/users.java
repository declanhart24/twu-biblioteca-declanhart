package com.twu.biblioteca;

import java.util.Date;
import java.util.LinkedList;

/**
 * Created by declanhart on 10/12/2015.
 */
public class users {
    private LinkedList<user> users;

    public users () {
        this.users = new LinkedList<user>();
        users.add(new user("111-1111", "TWU", "Declan Hart", "declanhart24@gmail.com", "0434 959 654"));
    }


    public boolean checkCredentials (String id, String pwd) {
        int i = 0;
        while (i < users.size()){
            if (users.get(i).getLibraryNumber().equals(id) && users.get(i).getPassword().equals(pwd))
                return true;
            i++;
        }
        return false;
    }

    public String getUserInformation (String id) {
        String output = "";
        int i = 0;
        while (i < users.size()){
            if (users.get(i).getLibraryNumber().equals(id)) {
                output += "Name: " + users.get(i).getName() + "\n";
                output += "Email: " + users.get(i).getEmail() + "\n";
                output += "Phone Number: " + users.get(i).getPhoneNumber() + "\n";
            }
            i++;
        }
        return output;
    }
}
