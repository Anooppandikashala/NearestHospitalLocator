package com.example.anoop.mymap;

/**
 * Created by anoop on 5/19/17.
 */

import android.app.Application;

public class GlobalClass extends Application{

    private String name;
    private String email;


    public String getName() {

        return name;
    }

    public void setName(String aName) {

        name = aName;

    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String aEmail) {

        email = aEmail;
    }

}