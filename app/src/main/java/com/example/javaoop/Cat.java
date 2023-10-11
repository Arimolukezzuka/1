package com.example.javaoop;

import android.media.audiofx.PresetReverb;
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
    static class CountResetter{
        boolean moreThan100;
        CountResetter(){
            if(Cat.count>5){
                moreThan100=true;
            }
            if (moreThan100){
                resetCounter(0);
            }
        }
        void resetCounter(int value){
            Cat.count=value;
        }
    }
    private class CatMood{
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
        count++;
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
    public static String whatCatsLike(){
        return "I like playing> jumping and scratching";
    }

    public void catchMouse(int mouseWeight){
        class Mouse {
            String color;
            int weight;
            public Mouse(String color, int weight){
                this.color = color;
                this.weight=weight;
            }
            String mouseVoice(){
                return "Pi-pi-pi";
            }
        }
        Mouse mouse = new Mouse("White",mouseWeight);
                if(mouse.weight<2){
                    Log.i("cat say","I will eat you!" + mouse.mouseVoice());
                } else{
                    Log.i("cat say","I afraid you!");
                }
    }
}
