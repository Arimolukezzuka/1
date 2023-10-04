package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal {
    int age;
    String name;
    String breed;
    String color;
    final static int number0Legs = 4;
    static int count = 0;
    String hello;
    CatMood catMood;
    class CatMood{
        int level0mood;
        CatMood(){
            if (Cat.this.age <2){
                level0mood=100;
            }else if (Cat.this.age>=2 && Cat.this.age<7){
                level0mood=50;
            }else if (Cat.this.age>=7){
                level0mood=20;
            }
        }
    }
    public Cat() {
        this.name = "Capitan";
        this.age = 92;
        this.breed="Vorobei";
        this.color="yellow";
        catMood=new CatMood();
        switch (catMood.level0mood){
            case 100:
                hello="Meow! I'm happy cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
            case 50:
                hello="Meow! I'm cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
            case 20:
                hello="Meow! I'm old cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
        }
    }
    public Cat(int a, String n, String b, String c){
        this.age = a;
        this.name = n;
        this.breed = b;
        this.color = c;
        catMood=new CatMood();
        switch (catMood.level0mood){
            case 100:
                hello="Meow! I'm happy cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
            case 50:
                hello="Meow! I'm cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
            case 20:
                hello="Meow! I'm old cat. My name is "+ name+
                        ", and I'm " + age + " years old. I'm "+breed+" and "+color;
                break;
        }
    }

    public void talk(){
        Log.i("talk()",hello );
    }

    public void talk(int age){
        Log.i("talk()", "Meow! I'm cat. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }

    public void talk(String name){
        Log.i("talk()", "Meow! I'm cat. My name is "+ name+ ", and I'm " + age + " years old. I'm "+breed+" and "+color);
    }
    public final static String whatCatsLike(){
        return "I like playing> jumping and scratching";
    }
}
