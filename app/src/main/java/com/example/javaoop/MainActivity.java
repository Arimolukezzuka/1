package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

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
        Tri.talk();
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
        bagira.talk();
    }
}