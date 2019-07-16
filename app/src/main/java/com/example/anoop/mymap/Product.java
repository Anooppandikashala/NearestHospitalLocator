package com.example.anoop.mymap;

/**
 * Created by anoop on 5/19/17.
 */

public class Product {
    private int id;
    private String name;
    private String distance;

    //constructor


    public Product(int id, String name, String time) {
        this.id = id;
        this.name = name;
        this.distance = time;
    }

    //setter,getter


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDistance() {
        return distance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDistance(String time) {
        this.distance= time;
    }
}

