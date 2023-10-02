package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat {
    public void talk(){
        Log.i("talk()", "R-r-r-r-r-r-r! I'm Lion, my name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
}
