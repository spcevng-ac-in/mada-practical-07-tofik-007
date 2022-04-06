package com.example.prectical7;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.ImageButton;

import android.view.View;

import com.google.android.material.internal.CheckableImageButton;


public class MainActivity extends AppCompatActivity {

    ImageButton jaguar,maclaren;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jaguar= findViewById(R.id.jaguar);
        maclaren=findViewById(R.id.maclaren);


        jaguar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity .class);
                intent.putExtra("id", R.id.jaguar);

                startActivity(intent);
            }
    });



        maclaren.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,Main2Activity .class);
                intent.putExtra("id", R.id.maclaren);

                startActivity(intent);
            }
        });


        }


    }

