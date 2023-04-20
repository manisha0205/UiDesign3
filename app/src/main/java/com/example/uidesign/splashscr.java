package com.example.uidesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscr extends AppCompatActivity {
ImageView imageView ;
TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscr);
        imageView=findViewById(R.id.imagev);
        textView=findViewById(R.id.textv);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
               Intent intent = new Intent (splashscr.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        }, 2000);
    }
}