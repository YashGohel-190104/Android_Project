package com.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class intent_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Intent i =getIntent();
        String str = i.getStringExtra("KEY_ACTIVITY");
        Toast.makeText(this,"THIS ACTIVITY : "+str,Toast.LENGTH_LONG).show();
    }
}