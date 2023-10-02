package com.example.javaoop;
import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    String breed;
    String color;
    public Cat() {
        this.name = "Capitan";
        this.age = 92;
        this.breed="Vorobei";
        this.color="yellow";
    }
    public Cat(int a, String n, String b, String c){
        this.age = a;
        this.name = n;
        this.breed = b;
        this.color = c;
    }

    public void talk(){
        Log.i("talk()", "Meow! I'm cat. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    public void talk(int age){
        Log.i("talk()", "Meow! I'm cat. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    public void talk(String name){
        Log.i("talk()", "Meow! I'm cat. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
}
