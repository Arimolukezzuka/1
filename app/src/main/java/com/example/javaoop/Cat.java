package com.example.javaoop;
import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    private String breed;
    private String color;
    public Cat() {}
    public Cat(int a, String n, String b, String c){
        age = a;
        name = n;
        breed = b;
        color = c;
    }

    public void talk(){
        Log.i("talk()", "Meow! My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    public void talk(int age){
        Log.i("talk()", "Meow! My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    public void talk(String name){
        Log.i("talk()", "Meow! My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
}
