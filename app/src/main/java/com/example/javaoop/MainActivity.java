package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);
       Button button = findViewById(R.id.button);
       button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v){

         }
       });
       Cat singingCat = new Cat(){
           @Override
           public void talk(){
               Log.i("talk()","I'm singing! la-la-la!" );
           }
       };
       singingCat.talk();

       Cat cat = new Cat();
       cat.talk();
   }
}