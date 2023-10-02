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
    Cat cat1 = new Cat();
    Log.i("numberOfLegs","cat1 number of legs:`" + cat1.number0fLegs);

    cat1.number0fLegs--;
        Log.i("numberOfLegs","cat1 number of legs:`" + cat1.number0fLegs);

        Cat cat2 = new Cat();
        Log.i("numberOfLegs","cat2 number of legs:`" + cat2.number0fLegs);
    }
}