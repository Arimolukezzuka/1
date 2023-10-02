package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Cat myCat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myCat = new Cat(1900,"Mishutka","Starichok","SkyBlue");
        myCat.talk();
        Cat Sanya = new Cat(5,"Sanya", "SmartBeautiful", "Pink");
        Sanya.talk();
        Sanya.breathe();
        Cat Tri = new Cat(27, "Roberto", "ArmGrusArbuz","Black");

        Tri.number0fLegs = 4;
        Log.i("number0fLegs", String.valueOf(Tri.number0fLegs));
        Puma puma = new Puma();
        puma.name = "Leo";
        puma.breathe();
        puma.talk();
        puma.isAlive=true;
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe()","My name is " + puma.name +" and " + puma.breathe());
        Tri.talk(4);
        Tri.talk("Boris");
        Puma bagira = new Puma();

        Cat puma11 = new Cat();

        Cat murzik = new Lion();

        Lion lion = new Lion();
        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(Tri);
        cats.add(bagira);
        cats.add(puma11);
        cats.add(murzik);
        cats.add(lion);
        Cat cat = cats.get(0);
        Cat cat1 = cats.get(1);
        Cat cat2 = cats.get(2);
        Cat cat3 = cats.get(3);
        Cat cat4 = cats.get(4);
        Puma puma1 = (Puma)cats.get(1);
        puma1.talk();
        Cat cat5 = cats.get(4);
        if (cat5 instanceof Puma){
            Puma puma2 = (Puma) cat5;
            puma2.talk();
        }else{
            Log.i("instanceof", "This isn'n Puma");
        }Puma puma2 = (Puma)cats.get(4);
        puma2.talk();
    }
}