package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

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
        Cat Tri = new Cat(27, "Roberto", "ArmGrusArbuz","Black");
        Tri.talk();
    }
}