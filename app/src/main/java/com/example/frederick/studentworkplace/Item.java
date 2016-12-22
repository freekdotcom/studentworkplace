package com.example.frederick.studentworkplace;


/**
 * Created by Guus on 22-12-2016.
 */

public class Item {

    private String title;
    private String location;
    private float brightnes;
    private float loudnes;

    public Item() {}

    public Item(String title, float brightnes) {
        this.title = title;
        this.location = "0.0486790,0.07654234";//// TODO: 22-12-2016 add location
        this.brightnes = brightnes; //// TODO: 22-12-2016 add light sensor data
        this.loudnes = 0.05f; //// TODO: 22-12-2016 add microphone sensor data
    }

    public String getTitle() {
        return title;
    }

    public String getLocation(){
        return location;
    }

    public float getBrightnes(){
        return brightnes;
    }

    public float getLoudnes(){
        return loudnes;
    }


    public void setTitle(String title) {
        this.title = title;
    }
}
