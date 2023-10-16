package com.example.javaoop;

import android.util.Log;

public abstract class Animal {
    int number0fLegs;
    boolean isAlive;
    abstract public void draw();
    public void breathe(){ Log.i("breathe()","I can breathe");
    }
}
