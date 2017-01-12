package com.example.frederick.studentworkplace;


/**
 * Created by Guus on 22-12-2016.
 */

public class Item {

    private String title;
    private float brightnes;
    private float accelerometerX;
    private float accelerometerY;
    private float accelerometerZ;
    private double loudness;

    public Item() {}

    public Item(String title, float brightnes, float[] accelerometer, double loudness) {
        this.title = title;
        this.brightnes = brightnes;
        if(accelerometer.length > 2){
            this.accelerometerX = accelerometer[0];
            this.accelerometerY = accelerometer[1];
            this.accelerometerZ = accelerometer[2];
        }
        this.loudness = loudness;
    }

    public String getTitle() {
        return title;
    }

    public float getBrightnes(){
        return brightnes;
    }

    public float getAccelerometerX(){
        return accelerometerX;
    }

    public float getAccelerometerY(){
        return accelerometerY;
    }

    public float getAccelerometerZ(){
        return accelerometerZ;
    }

    public double getLoudness(){
        return loudness;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
