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
       cat1.catchMouse(1);
       cat1.catchMouse(3);
   }
}