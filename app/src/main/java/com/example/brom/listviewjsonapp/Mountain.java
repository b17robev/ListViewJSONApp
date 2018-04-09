package com.example.brom.listviewjsonapp;

/**
 * Created by Roberth on 4/9/2018.
 */

public class Mountain {

    private String name;
    private int height;
    private String url;
    private String location;

    public Mountain(String name, int height, String location, String url){
        this.name = name;
        this.height = height;
        this.location = location;
        this.url = url;
    }

    public String getName(){
        return name;
    }

    public int getHeight(){
        return height;
    }

    public String getLocation(){
        return location;
    }

    public String getImage(){
        return url;
    }
}
