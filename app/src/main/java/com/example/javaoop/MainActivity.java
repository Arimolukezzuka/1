package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.util.Log;


public class MainActivity extends AppCompatActivity {
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Cat cat1 = new Cat();
       Log.i("number0Legs", "cat1 number of legs: "+cat1.number0Legs + Cat.whatCatsLike());
       Lion lion = new Lion();
       lion.talk();
   }
}