package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {
   public Lion(){
       Log.i("constructor","Constructor Lion()");
   }
    public static String whatLionsLike(){
        return "I am Lion and I like playing> jumping and scratching";
    }

    @Override
    public void draw() {

    }
}
