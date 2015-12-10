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
        users.add(new user("111-1111", "TWU", "Declan Hart", "declanhart24@gmail.com", new Date(1992, 10, 9)));
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
}
