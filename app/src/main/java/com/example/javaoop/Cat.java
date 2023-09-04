package com.example.javaoop;
import android.util.Log;

public class Cat {
    int age;
    String name;
    String breed;
    String color;

    public Cat(int a, String n, String b, String c){
        age = a;
        name = n;
        breed = b;
        color = c;
    }

    public void talk(){
        Log.i("talk()", "Meow! My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
}
