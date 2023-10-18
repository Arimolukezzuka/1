package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable {
    public void talk(){
     //   Log.i("talk()", "R-r-r-r-r-r-r! I'm puma. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    @Override
    public void draw() {
        Log.i("draw()","Draw puma");
    }

   @Override
    public void move() {
        Log.i("move()","Move overridden puma");
    }

    @Override
    public void print() {
        Log.i("print()","Print puma");
    }
}
